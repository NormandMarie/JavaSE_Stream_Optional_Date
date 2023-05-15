package exercices.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez getStringWithStream
 * Elle devra avoir le même comportement que getString
 *
 *************
 *
 * Resultat attendu :
 * i3,p44
 * i3
 */
public class Exo10 {

    public static void main(String[] args) {
        List<Integer> values1 = asList(3, 44);
        List<Integer> values2 = asList(78, 3,21,22);

        String result1 = getString(values1);
        System.out.println(result1);

        String result2 = getString(values2);
        System.out.println(result2);
        System.out.println(getStringWithStream(values1));
        System.out.println(getStringWithStream(values2));
    }

    public static String getString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element % 2 == 0) {
                sb.append('p').append(element);
            } else {
                sb.append('i').append(element);
            }
            if (i < list.size() - 1) sb.append(',');
        }
        return sb.toString();
    }

    //TODO
    public static String getStringWithStream(List<Integer> list) {
          return list.stream()
                  .map(number -> number % 2 == 0 ? "p" + number : "i" + number)
                .collect(Collectors.joining(" ,"));
    }

}

