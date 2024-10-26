package dz13;

public class ForLoop {
    public static void time() {
        for (int hours = 0; hours < 6; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                if (hours > 1 && (minutes % 10 == 0)) {
                    return;
                }
                for (int seconds = 0; seconds < 60; seconds++) {
                    if (seconds * hours > minutes) {
                        continue;
                    }
                    System.out.println(hours + ":" + minutes + ":" + seconds + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}