package exercices.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Votre avion décolle dans 3 jours et 5h. Affichez la date et l'horaire de décollage
 *
 *************
 *
 * Resultat attendu :
 */
class Exo7 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime departureDateTime = now.plusDays(3).plusHours(5);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = departureDateTime.format(formatter);

        System.out.println("Date et heure exacte du décollage : " + formattedDateTime);
    }

}
