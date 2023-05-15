package exercices.date;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Vérifier si la date de l'événement périodique est arrivé
 * Date 1 : la date de votre anniversaire
 * Date 2 : la date du jour
 *
 * Affichez un message pour indiquer si c'est votre anniversaire ou non.
 *
 * ASTUCE : Vous pouvez utiliser L'objet MonthDay
 *
 *************
 *
 * Resultat attendu :
 */
class Exo5 {

    // TODO : Les types Object peuvent doivent être remplacé par les bon types.
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1998, 2, 1);
        LocalDate today = LocalDate.now();

        MonthDay currentMonthDay = MonthDay.from(today);
        MonthDay birthdayMonthDay = MonthDay.from(birthday);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Date de votre anniversaire : " + birthday.format(formatter));
        System.out.println("Date du jour : " + today.format(formatter));

        if (currentMonthDay.equals(birthdayMonthDay)) {
            System.out.println("C'est votre anniversaire !");
        } else {
            System.out.println("Votre anniversaire n'est pas encore arrivé.");
        }
    }


}
