package exercices.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 ** Consigne **
 *
 * Coder getTodayWithJava8 pour obtenir la date du jour en Java 8, avec le temps.
 *
 *************
 *
 * Resultat attendu : Date d'aujourd'hui :Thu Nov 25 10:46:20 CET 2021
 */
class Exo1 {

    public static void main(String[] args) {
        Date today = getToday();
        System.out.println("Date d'aujourd'hui : " + today);

        String todayWithJava8 = getTodayWithJava8();
        System.out.println("Date d'aujourd'hui avec Java 8 : " + todayWithJava8);
    }

    public static Date getToday() {
        return new Date();
    }

    public static String getTodayWithJava8() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MMM d HH:mm:ss yyyy");
        String formattedDate = today.format(formatter);
        return formattedDate;
    }
}
