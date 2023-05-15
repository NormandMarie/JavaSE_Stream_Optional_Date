package exercices.date;


import java.time.Clock;
import java.time.Instant;
/*
 ** Consigne **
 *
 * Au sein d'un projet complexe, nous souhaitons récupérer le timestamp actuel du système, basé sur la zone UTC.
 * Nous souhaiterons afficher celui-ci, avec également, le timestamp par défault sans sa zone UTC
 *
 * ASTUCE : Vous devez utiliser la classe Clock et Instant
 *
 *************
 *
 * Resultat attendu :
 */
class Exo9 {

    public static void main(String[] args) {

        Clock utcClock = Clock.systemUTC();
        Instant utcTimestamp = Instant.now(utcClock);

        Instant defaultTimestamp = Instant.now();
        // sans fuseau horaire pris en compte
        System.out.println("Timestamp UTC : " + utcTimestamp);
        // avec fuseau horaire
        System.out.println("Timestamp basé sur la zone du Système : " +defaultTimestamp);
    }

}
