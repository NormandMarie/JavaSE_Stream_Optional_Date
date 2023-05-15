package exercices.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/*
 ** Consigne **
 *
 * 1) Une grande période s'est écoulée depuis la date de sortie de java 8 le 1er mars 2014.
 * Affichez le nombre d'année, de mois et de jours écoulés (avec la classe Period)
 *
 * 2) La date Java 8 se précise avec une date + une heure : le 1er mars 2014 à 19h30 et 50 secondes
 * Affichez le nombre d'année, de mois et jours  ainsi que le nombre total d'heures, minutes et secondes écoulés (avec la classe Duration)
 *
 * 3) : Vous pourrez utilisez ChronoUnit pour obtenir les données d'heures et de secondes par exemple
 *
 *************
 *
 * Resultat attendu :
 */
class Exo12 {

    public static void main(String[] args) {

        LocalDate date2 = LocalDate.of(2014, 3, 1);


        LocalDate now = LocalDate.now();

        Period period = Period.between(date2,now);

       int years = period.getYears();
       int months = period.getMonths();


        System.out.println("il s'est écoulé " + years + " années et " + months + " mois");


        LocalDateTime dateSec =LocalDateTime.of(2014, 3, 1,19,30,50);

        LocalDateTime now2 = LocalDateTime.now();

        Duration duration = Duration.between(dateSec, now2);
        long totalSeconds = duration.getSeconds();
        long totalHours = duration.toHours();

        System.out.println("il s'est écoulé au total " + totalSeconds + " secondes, ou bien encore, " + totalHours + " heures");

//        3)
        LocalDateTime date1 = LocalDateTime.of(1998, 2, 1, 16, 15, 0);
        LocalDateTime now3 = LocalDateTime.now();

        long hours = ChronoUnit.HOURS.between(date1,  now3);
        long minutes = ChronoUnit.MINUTES.between(date1,  now3);
        long seconds = ChronoUnit.SECONDS.between(date1,  now3);

        System.out.println("il s'est écoulé " + hours + " heures, " + minutes + " minutes et " + seconds + " secondes");

    }
}

