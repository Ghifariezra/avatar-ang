package com;

import com.services.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        BaseService objectFactory = new ObjectFactory();
        PrinterService printerService = new PrinterService();

        String[] names = {
                "Dheka",
                "Ghifari",
                "Agis",
                "Belva",
                "Bunga",
                "Lilis"
        };

        Scanner input = new Scanner(System.in);
        ArrayList<Object> listItems = objectFactory.createObjects(names);

        while (true) {
            System.out.println("\n=== Daftar Nama ===");
            for (int i = 0; i < names.length; i++) {
                System.out.println((i + 1) + ". " + names[i]);
            }
            System.out.println("0. exit (keluar program)");

            System.out.print("\nMasukan pilihan (nomor): ");
            String pilihan = input.nextLine().trim();

            if (pilihan.equals("0")) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            if (!isValidIndex(pilihan, names.length)) {
                System.out.println("❌ Pilihan tidak valid! Silakan ulangi.\n");
                continue;
            }

            int index = Integer.parseInt(pilihan) - 1;
            String namaTerpilih = names[index];

            printerService.printOut(namaTerpilih, listItems, input);
        }

        input.close();
    }

    private static boolean isValidIndex(String input, int max) {
        try {
            int num = Integer.parseInt(input);
            return num >= 0 && num <= max;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
