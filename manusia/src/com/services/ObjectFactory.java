package com.services;

import java.util.ArrayList;
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
                            name, 28, "Bogor", true, "Laki-laki",
                            "Main Game", 2, "Mobil"));
                    break;
                case "ghifari":
                    listItems.add(new AyahPekerja(
                            name, 22, "Bogor", true, "Laki-laki",
                            "Main Game", 2, "Mobil", "PT. XYZ", "Manager"
                    ));
                    break;
                case "agis":
                    listItems.add(new AyahWirausaha(
                            name, 45, "Bogor", true, "Laki-laki",
                            "Main Game", 2, "Mobil", "PT. ABC", "Retail"
                    ));
                    break;
                case "belva":
                    listItems.add(new Ibu(
                            name, 27, "Bogor", false, "Perempuan",
                            "Nasi Goreng", "SMA"));
                    break;
                case "bunga":
                    listItems.add(new IbuKarir(
                            name, 27, "Bogor", false, "Perempuan",
                            "Nasi Goreng", "S1", "PT. Anggur", "CEO"
                    ));
                    break;
                case "lilis":
                    listItems.add(new IbuRumahTangga(
                            name, 27, "Bogor", false, "Perempuan",
                            "Nasi Goreng", "S1", 2, "Mengajar anak"
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
