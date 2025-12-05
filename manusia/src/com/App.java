package com;

import com.services.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        BaseService objectFactory = new ObjectFactory();
        BaseService printerService = new PrinterService();

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
            for (String name : names) {
                System.out.println("- " + name);
            }
            System.out.println("- exit (keluar program)");

            System.out.print("\nMasukan pilihan: ");
            String pilihan = input.nextLine().trim();

            // cek exit
            if (pilihan.equalsIgnoreCase("exit")) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            // validasi input
            if (!isValidName(pilihan, names)) {
                System.out.println("❌ Nama tidak ditemukan! Silakan ulangi.\n");
                continue; // kembali ke awal while
            }

            // jalankan printOut
            printerService.printOut(pilihan, listItems);
        }

        input.close();
    }

    private static boolean isValidName(String input, String[] names) {
        for (String name : names) {
            if (name.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }
}
