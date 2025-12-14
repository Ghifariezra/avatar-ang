package com.services;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

import com.polymorphism.Manusia;

public class PrinterService extends BaseService {

    @Override
    public ArrayList<Object> createObjects(String[] names) {
        return null;
    }

    @Override
    public void printOut(String pilihan, ArrayList<Object> listItems, Scanner input) {
        for (Object obj : listItems) {
            if (!(obj instanceof Manusia manusia))
                continue;

            if (!manusia.getNama().equalsIgnoreCase(pilihan))
                continue;

            playAnimation(pilihan);

            System.out.println("Pilih aksi untuk " + "(" + manusia.getClass().getSimpleName() + ") " + manusia.getNama() + ":");
            printMethodChoices(obj, input);

            System.out.println("=================================");
        }
    }

    private void printMethodChoices(Object obj, Scanner input) {
        Method[] methods = obj.getClass().getDeclaredMethods();

        // Filter method yang ingin ditampilkan (misal abaikan method private dan
        // synthetic)
        ArrayList<Method> methodList = new ArrayList<>();
        for (Method m : methods) {
            if (!m.isSynthetic() && m.getParameterCount() == 0) { // hanya method tanpa parameter
                methodList.add(m);
            }
        }

        // Cetak menu pilihan
        for (int i = 0; i < methodList.size(); i++) {
            System.out.println((i + 1) + ". " + methodList.get(i).getName());
        }
        System.out.println("0. Lewati");

        System.out.print("Masukkan pilihan: ");
        int pilihanMethod = -1;
        try {
            pilihanMethod = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            pilihanMethod = -1;
        }

        if (pilihanMethod == 0) {
            System.out.println("Lewati aksi.");
            return;
        }

        if (pilihanMethod > 0 && pilihanMethod <= methodList.size()) {
            Method methodToInvoke = methodList.get(pilihanMethod - 1);
            try {
                methodToInvoke.setAccessible(true);
                methodToInvoke.invoke(obj);
            } catch (Exception e) {
                System.out.println("Gagal menjalankan metode: " + e.getMessage());
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++)
                System.out.println();
        }
    }

    private void playAnimation(String pilihan) {
        clearConsole();

        String[] frames;

        switch (pilihan.toLowerCase()) {
            case "dheka", "ghifari", "agis" -> frames = priaFrames;
            case "belva", "bunga", "lilis" -> frames = wanitaFrames;
            default -> {
                System.out.println("No animation available.");
                return;
            }
        }

        try {
            for (int i = 0; i < 6; i++) {
                clearConsole();
                System.out.println(frames[i % frames.length]);
                Thread.sleep(180);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        clearConsole();
    }

    // Custom Animation
    private final String[] priaFrames = {
            """
                      ( ^_^ )
                       |   |
                      /|___|\\
                       /   \\
                    """,
            """
                      ( ^o^ )
                       |   |
                      /|___|\\
                       /   \\
                    """,
            """
                      ( ^_^ )
                       |   |
                      /|___|\\
                       /   \\
                    """
    };

    private final String[] wanitaFrames = {
            """
                      ( ◕‿◕ )
                       |   |
                     --|___|--
                       /   \\
                    """,
            """
                      ( ✿◠‿◠ )
                       |   |
                     --|___|--
                       /   \\
                    """,
            """
                      ( ◕‿◕ )
                       |   |
                     --|___|--
                       /   \\
                    """
    };
}