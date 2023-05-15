package exercices.date;

import java.time.LocalDate;

/*
 ** Consigne **
 *
 * Nous essayons de savoir programmatiquement si une date est avant ou après une autre. Affichez un message pour
 * indiquer les cas.
 *
 * date 1 : aujourd'hui
 * date 2 : 22 02 2022
 *
 *
 * ASTUCE : Vous devez utiliser isAfter ou isBefore
 *
 *************
 *
 * Resultat attendu :
 */
class Exo10 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2023, 3, 6);

        if (date1.isAfter(date2)) {
            System.out.println("La date 1 est après la date 2.");
        } else if (date1.isBefore(date2)) {
            System.out.println("La date 1 est avant la date 2.");
        } else {
            System.out.println("Les deux dates sont identiques.");
        }
    }
    }


