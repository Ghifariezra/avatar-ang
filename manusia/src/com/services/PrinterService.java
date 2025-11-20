package com.services;

import java.util.ArrayList;
import com.polymorphism.*;

public class PrinterService extends BaseService {
    @Override
    public ArrayList<Object> createObjects(String[] names) {
        return null;
    }

    @Override
    public void printOut(String pilihan, ArrayList<Object> listItems) {
        for (Object obj : listItems) {
            if (obj instanceof Manusia manusia && manusia.getName().equalsIgnoreCase(pilihan)) {
                if (pilihan.equals("dheka")) {
                    manusia.memilikiAnak();
                    manusia.bekerja();
                    manusia.bermain();
                    manusia.berbicara();
                    manusia.memperbaikiKendaraan();

                    if (manusia instanceof Ayah ayah) {
                        ayah.perkenalan("Calo akun game", "bryan");
                    }
                } else if (pilihan.equals("belva")) {
                    manusia.mengurusRumah();
                    manusia.memasak();
                    manusia.berbicara();
                    manusia.memberiNasihat();

                    if (manusia instanceof Ibu ibu) {
                        ibu.perkenalan("Nasi Goreng", "Ibu Rumah Tangga");
                    }
                } else if (pilihan.equals("bryan")){
                    manusia.berbicara();
                    manusia.bermain();
                    manusia.berolahraga();
                    if (manusia instanceof Anak anak) {
                        anak.belajar();
                        anak.perkenalan("PBO");
                    }
                } else if (pilihan.equals("agis")){
                    manusia.berbicara();
                    if (manusia instanceof Kakek kakek) {
                        kakek.marah();
                        kakek.bercerita();
                    }
                } else if (pilihan.equals("andiani")) {
                    manusia.berbicara();
                    if (manusia instanceof Nenek nenek) {
                        nenek.membuatKue();
                    }
                } else if (pilihan.equals("yayi")) {
                    manusia.berbicara();
                    if (manusia instanceof PembantuRumahTangga art) {
                        art.bekerja();
                    }
                }
            }
        }
    }
}
