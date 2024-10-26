package dz14;

public class WhileLoop {
    public static void time() {
        int hours = 0;
        while (hours < 6) {
            int minutes = 0;
            do {
                if (hours > 1 && (minutes % 10 == 0)) {
                    return;
                }
                int seconds = -1;
                while (seconds < 59) {
                    seconds++;
                    if (seconds * hours > minutes) {
                        continue;
                    }
                    System.out.println(hours + ":" + minutes + ":" + seconds + " ");
                }
                minutes++;
            } while (minutes < 60);
            hours++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}