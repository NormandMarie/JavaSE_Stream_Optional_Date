package exercices.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Convertissez la date du jour en chaine de caractère et affichez la comme : 2020/11/25 10:30:57
 * Puis, reconvertissez cette chaine en date du jour, et affichez la comme : 2020-11-25
 *
 * ASTUCE : Vous devez utiliser le pattern suivant : yyyy/MM/dd HH:mm:ss
 *
 *************
 *
 * Resultat attendu :
 */
class Exo13 {

    public static void main(String[] args) {
        // Conversion de la date en chaîne de caractères
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String dateString = now.format(formatter);
        System.out.println("Date du jour en chaîne de caractères : " + dateString);

        // Reconversion de la chaîne en date
        LocalDateTime parsedDate = LocalDateTime.parse(dateString, formatter);
        System.out.println("Date reconvertie : " + parsedDate);

    }
}

