package exercices.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Evaluez si deux dates sont égales
 * Date 1 : la date du premier jour de votre formation Java 8
 * Date 2 : la date du jour
 *
 * Affichez un message pour indiquer si elles sont égales ou non
 *
 *************
 *
 * Resultat attendu :
 */
class Exo4 {

    public static void main(String[] args) {
        LocalDate dateFormation = LocalDate.of(2023, 3, 6);
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Date du premier jour de la formation Java 8 : " + dateFormation.format(formatter));
        System.out.println("Date du jour : " + today.format(formatter));

        if (dateFormation.equals(today)) {
            System.out.println("Les deux dates sont égales.");
        } else {
            System.out.println("Les deux dates sont différentes.");
        }

    }


}
