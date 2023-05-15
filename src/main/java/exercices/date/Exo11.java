package exercices.date;

import java.time.LocalDate;

/*
 ** Consigne **
 *
 * Vous souhaitez partir fin février de l'année prochaine, mais vous avez besoin de savoir si l'année prochaine
 *  est bissextile.
 *
 * Affichez le résultat
 *
 *************
 *
 * Resultat attendu :
 */
class Exo11 {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        int nextYear = currentYear + 5;

        boolean isLeapYear = LocalDate.of(nextYear, 1, 1).isLeapYear();

        if (isLeapYear) {
            System.out.println("L'année "+nextYear+" est bissextile.");
        } else {
            System.out.println("L'année "+nextYear+" n'est pas bissextile.");
        }
    }
}

