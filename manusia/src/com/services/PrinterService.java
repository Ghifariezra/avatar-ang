package com.services;

import java.util.ArrayList;
import com.polymorphism.Manusia;
import com.polymorphism.ayah.Ayah;
import com.polymorphism.ayah.AyahPekerja;
import com.polymorphism.ayah.AyahWirausaha;
import com.polymorphism.ibu.Ibu;
import com.polymorphism.ibu.IbuKarir;
import com.polymorphism.ibu.IbuRumahTangga;

public class PrinterService extends BaseService {
    @Override
    public ArrayList<Object> createObjects(String[] names) {
        return null;
    }

    @Override
    public void printOut(String pilihan, ArrayList<Object> listItems) {
        for (Object obj : listItems) {

            if (obj instanceof Manusia manusia &&
                    manusia.getName().equalsIgnoreCase(pilihan)) {

                switch (pilihan.toLowerCase()) {
                    case "dheka" -> {
                        playAnimation(pilihan);
                        // aksiAyah(manusia);
                        if (manusia instanceof Ayah ayah) {
                            System.out.println("=========");
                            System.out.println(ayah.getClass() + " -> " + ayah.getClass());
                            ayah.perkenalan("Calo akun game", "Bryan");
                        }
                    }

                    case "ghifari" -> {
                        playAnimation(pilihan);
                        // aksiAyah(manusia);
                        if (manusia instanceof AyahPekerja ayah) {
                            System.out.println("=========");
                            System.out.println(ayah.getClass() + " -> " + ayah.getClass());
                            ayah.perkenalan("Manager", "Deon", "Project A");
                        }
                    }

                    case "agis" -> {
                        playAnimation(pilihan);
                        // aksiAyah(manusia);
                        if (manusia instanceof AyahWirausaha ayah) {
                            System.out.println("=========");
                            System.out.println(ayah.getClass() + " -> " + ayah.getClass());
                            ayah.perkenalan("Wirausaha", "Diki", 8);
                        }
                    }

                    case "belva" -> {
                        playAnimation(pilihan);
                        // aksiIbu(manusia);
                        if (manusia instanceof Ibu ibu) {
                            System.out.println("=========");
                            System.out.println(ibu.getClass() + " -> " + ibu.getClass());
                            ibu.perkenalan("Nasi Goreng", "Ibu Rumah Tangga");
                        }
                    }

                    case "bunga" -> {
                        playAnimation(pilihan);
                        // aksiIbu(manusia);
                        if (manusia instanceof IbuKarir ibu) {
                            System.out.println(ibu.getClass() + " -> " + ibu.getClass());

                            ibu.perkenalan("Nasi Goreng", "CEO", 5);
                        }
                    }

                    case "lilis" -> {
                        playAnimation(pilihan);
                        // aksiIbu(manusia);
                        if (manusia instanceof IbuRumahTangga ibu) {
                            System.out.println(ibu.getClass() + " -> " + ibu.getClass());

                            ibu.perkenalan("Nasi Kucing", "Ibu Rumah Tangga", "Mommie Sharing");
                        }
                    }
                }
            }
        }
    }

    protected void aksiAyah(Manusia manusia) {
        manusia.memilikiAnak();
        manusia.bekerja();
        manusia.bermain();
        manusia.berbicara();
        manusia.memperbaikiKendaraan();
    }

    protected void aksiIbu(Manusia manusia) {
        manusia.mengurusRumah();
        manusia.memasak();
        manusia.berbicara();
        manusia.memberiNasihat();
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
            case "dheka", "ghifari", "agis" -> {
                frames = priaFrames;
            }
            case "belva", "bunga", "lilis" -> {
                frames = wanitaFrames;
            }
            default -> {
                System.out.println("No animation available.");
                return;
            }
        }

        try {
            for (int i = 0; i < 6; i++) {
                clearConsole();
                System.out.println(frames[i % frames.length]); // tampilkan frame
                Thread.sleep(180);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        clearConsole();
    }

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
