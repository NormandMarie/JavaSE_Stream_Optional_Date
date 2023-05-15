package exercices.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Définir une date spécifique avec l'API Date Java 8 et l'afficher
 * Exemple : la date du premier jour de votre formation Java 8
 *
 *************
 *
 * Resultat attendu :
 */
class Exo3 {

    public static void main(String[] args) {
        LocalDate dateFormation = LocalDate.of(2023, 3, 6);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateFormation.format(formatter);

        System.out.println("Date du premier jour de la formation Java 8 : " + formattedDate);
    }
}

