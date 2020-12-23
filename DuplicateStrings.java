import java.util.*;
import java.util.stream.Collectors;

public class DuplicateStrings {

    public static void main(String [] args) {
        List<String> findduplicates = new ArrayList<>();
        findduplicates.add("a");
        findduplicates.add("b");
        findduplicates.add("c");
        findduplicates.add("c");
        findduplicates.add("a");
        findduplicates.add("d");

        findduplicates.stream().forEach(System.out :: println);

        //this prints duplicate ones in list  (streams)
        Set<String> data = new HashSet<>();
                 findduplicates.stream()
                        .filter(n -> !data.add(n))
                        .forEach(System.out :: println);


       //this prints distinct strings in list (stream)
         findduplicates.stream()
                .distinct()
                .collect(Collectors.toList())
                 .forEach(System.out::println);



    }
}
