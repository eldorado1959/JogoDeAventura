

import java.util.Random;

public class Dados {
    private static final Random random = new Random();

    public static int rolar(int faces) {
        return random.nextInt(faces) + 1;
    }

    public static int rolarVarios(int quantidade, int faces) {
        int total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += rolar(faces);
        }
        return total;
    }
}


