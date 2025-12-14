package com.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.polymorphism.ayah.*;
import com.polymorphism.ibu.*;

public class ObjectFactory extends BaseService {
    @Override
    public ArrayList<Object> createObjects(String[] names) {
        ArrayList<Object> listItems = new ArrayList<>();

        for (String name : names) {
            String lower = name.toLowerCase();
            switch (lower) {
                case "dheka":
                    listItems.add(new Ayah(
                            "Dheka", 28, "Bogor", "Laki-laki",
                            2, "Mobil"));
                    break;
                case "ghifari":
                    listItems.add(new AyahPekerja(
                            "Ghifari", 22, "Bogor", "Laki-laki",
                            2, "Mobil", "PT. XYZ", "Manager"));
                    break;
                case "agis":
                    listItems.add(new AyahWirausaha(
                            "Agis", 45, "Bogor", "Laki-laki",
                            2, "Mobil", "PT. ABC", "Retail"));
                    break;
                case "belva":
                    listItems.add(new Ibu(
                            "Belva", 27, "Bogor", "Perempuan",
                            "Nasi Goreng"));
                    break;
                case "bunga":
                    listItems.add(new IbuKarir(
                            "Bunga", 27, "Bogor", "Perempuan",
                            "Nasi Goreng", "PT. Anggur", "CEO"));
                    break;
                case "lilis":
                    listItems.add(new IbuRumahTangga(
                            "Lilis", 27, "Bogor", "Perempuan",
                            "Nasi Goreng", 2));
                    break;
            }
        }

        return listItems;
    }

    @Override
    public void printOut(String pilihan, ArrayList<Object> listItems, Scanner input) {
    }
}
