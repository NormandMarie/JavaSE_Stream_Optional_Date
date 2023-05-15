package exercices.date;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/*
 ** Consigne **
 *
 * Afficher l'année, le mois et le jour de l'année du jour
 *
 *************
 *
 */
class Exo2 {

    public static void main(String[] args) {
        Date today = getToday();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Les mois sont indexés à partir de 0, donc on ajoute 1
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("année:" + year);
        System.out.println("mois:" + month);
        System.out.println("jour:" + day);
    }

    // TODO : (Vous devez remplacer Object par le bon type de retour)
    private static Date getToday() {
        return new Date();
    }

}
