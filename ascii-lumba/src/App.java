public class App {
    public static void main(String[] args) throws Exception {

        // Bagian kepala (static, tidak berubah)
        String[] head = {
                "             ,-._",
                "           _.-'  '--.",
                "         .'      _  -`\\_",
                "        / .----.`_.'----'",
                "        ;/     `",
                "       /_;"
        };

        // Frame animasi gelombang
        String[][] waveFrames = {
                {
                        "    ._      ._      ._      ._",
                        "_.-._)`\\_.-._)`\\_.-._)`\\_.-._)`\\_.-._."
                },
                {
                        "      ._      ._      ._      ._",
                        "  _.-._)`\\_.-._)`\\_.-._)`\\_.-._)`\\_.-._."
                }
        };

        int delay = 120; // kecepatan animasi
        int steps = 40*2; // bergerak sejauh apa

        for (int step = 0; step < steps; step++) {
            // Clear screen
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // --- Cetak kepala ---
            for (String h : head) {
                System.out.println(" ".repeat(step) + h);
            }

            System.out.println(); // jarak sedikit

            // --- Cetak frame gelombang ---
            int currentFrame = step % waveFrames.length;

            for (String line : waveFrames[currentFrame]) {
                System.out.println(" ".repeat(step) + line);
            }

            Thread.sleep(delay);
        }
    }
}
