
import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;
public class SortMap {

    public static void main(String[] args) {

        Map<String, Integer> unsorted = new HashMap<>();
        unsorted.put("a", 2);
        unsorted.put("b", 1);
        unsorted.put("c", 4);
        unsorted.put("d", 3);

        System.out.println(unsorted);

        //sort hashMap
        unsorted.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .entrySet().forEach(System.out::println);

        //filter list and print elements great than 2 ( use of filter in streams -> predicate)
        System.out.println( "getting elements greater than 2");
        unsorted.entrySet()
                .stream()
                .filter(p->p.getValue()> 2)
                .collect(Collectors.toMap(Map.Entry ::getKey,Map.Entry::getValue))
                .entrySet()
                .forEach(System.out :: println);


    }

}
