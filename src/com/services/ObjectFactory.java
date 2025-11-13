package com.services;

import java.util.ArrayList;
import com.polymorphism.*;

public class ObjectFactory extends BaseService {
    @Override
    public ArrayList<Object> createObjects(String[] names) {
        ArrayList<Object> listItems = new ArrayList<>();

        for (String name : names) {
            String lower = name.toLowerCase();
            switch (lower) {
                case "dheka":
                    listItems.add(new Ayah(
                            name, 28, "Bogor", true, "Laki-laki",
                            "Main Game", 2, "Mobil"));
                    break;
                case "belva":
                    listItems.add(new Ibu(
                            name, 27, "Bogor", false, "Perempuan",
                            "Nasi Goreng", "SMA"));
                    break;
                case "bryan":
                    listItems.add(new Anak(
                            name, 18, "Bogor", false, "Laki-laki",
                            "SMA", "Main Game"));
                    break;
                case "agis":
                    listItems.add(new Kakek(
                            name, 80, "Bogor", false, "Laki-laki",
                            "Tentang pertama kali ketemu Nenek."));
                    break;
                case "andiani":
                    listItems.add(new Nenek(
                            name, 60, "Bogor", false, "Perempuan",
                            "Tentang pertama kali ketemu nenek."));
                    break;
                case "yayi":
                    listItems.add(new PembantuRumahTangga(
                        name, 37, "Bogor", true, "Perempuan",
                        "Melakukan tugas rumah tangga."
                    ));
                    break;
            }
        }

        return listItems;
    }

    @Override
    public void printOut(String pilihan, ArrayList<Object> listItems) {
    }
}
