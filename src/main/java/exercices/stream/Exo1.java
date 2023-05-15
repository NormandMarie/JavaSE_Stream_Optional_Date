package exercices.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
 ** Consigne **
 *
 * Avec les Streams, codez la méthode mapToUppercaseWithStream afin d'avoir
 * le même comportement que mapToUppercase
 *************
 *
 * Resultat attendu : [AARON, FRANK, WILLIAM, GILLIAM]
 */
class Exo1 {

    public static void main(String[] args) {
        Collection<String> result = mapToUppercase("aaron", "frank", "william", "gilliam");
        System.out.println(result);
//        List<String> result2 = Arrays.asList("aaron", "frank", "william", "gilliam");

        System.out.println(mapToUppercaseWithStream("aaron", "frank", "william", "gilliam"));
    }

    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    public static List<String> mapToUppercaseWithStream(String... names) {
        //Utilisation de Arrays pour remplacer les string
        return  Arrays.stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

}
