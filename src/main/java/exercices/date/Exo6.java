package exercices.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Exo6 {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Heure actuelle sans la date : " + formattedTime);
    }
}
