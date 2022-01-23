package week1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// about list streams and predicate.
public class JavaChallengers001 {
    public static void main(String[] args) {
//        JavaChallengers001 jc1 = new JavaChallengers001();
        JavaChallengers001 jc2 = new JavaChallengers001();
//        jc1.predicateNegate();
//        jc1.filework();
//        jc1.predicate04();
//        jc1.findingNeo();
//        jc1.findingNeo();
//        jc1.findingNeo2();
//        jc1.predicate01();
//        jc1.predicate05();
//        jc1.predicate06();
//        jc1.predicate051();
//        jc1.predicate031();
//        jc1.predicate02();
//        jc2.prdicateStringAnd();
        jc2.predicateBetter();
    }

    // 9Jan22
    public void findingNeo2() {
        List<String> ls = List.of("Neo", "Morpheus", "Oracle", "Trinity", "Neo");
        Predicate<String> neoSearch = str -> {
            System.out.println("Agent smith is looking for Neo");
            return str.contains("Neo");
        };
        boolean neoFound = ls.stream().allMatch(neoSearch);
        System.out.println("NeoFound" + neoFound);
    }

    //10Jan22
    public void filework() {
        File fil = new File("abc.txt");
        System.out.println("here " + fil.isFile());
        try {
            Boolean theFlag = fil.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("here " + fil.exists());
    }

    //11Jan22
    public void findingNeo() {
        List<String> ls = List.of("Neo", "Morpheus", "Oracle", "Trinity", "Neo");
        Predicate<String> neoSearch = str -> {
            System.out.println("Agent smith is looking for Neo");
            return str.contains("Neo");
        };
        boolean neoFound = ls.stream().filter(str -> str.length() >= 1).allMatch(neoSearch);
        System.out.println("NeoFound" + neoFound);
    }

    //12Jan22
    public void predicate01() {
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate
        System.out.println(pr.test(10));    // Calling Predicate method
        System.out.println(pr.test(18));    // Calling Predicate method
        System.out.println(pr.test(19));    // Calling Predicate method
    }

    //13Jan22
    static Boolean checkAge(int age) {
        return age > 18;
    }

    //13Jan22
    public void predicate02() {
        // Using Predicate interface
        Predicate<Integer> predicate = JavaChallengers001::checkAge;
        // Calling Predicate method
        boolean result = predicate.test(25);
        System.out.println(result);
    }

    //14Jan22
    // The idea is to use negate
    public void predicateNegate() {
        // Using Predicate interface
        Predicate<Integer> predicate = JavaChallengers001::checkAge;
        // Calling Predicate method
        System.out.println(predicate.test(10));
    }

    //15Jan22
    public void predicate04() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(collect);
    }

    //Predicate is  kind of filter. which can be used on lists to apply.
    //16Jan22
    public void predicate051() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> noGreaterThan5 = x -> (x > 5);
        List<Integer> collect = list.stream().filter(noGreaterThan5).
                collect(Collectors.toList());
        System.out.println(collect);
    }

    //17Jan22
    public void predicate06() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> noGreaterThan5 = x -> (x > 5);
        List<Integer> collect = list.stream().filter(noGreaterThan5).
                collect(Collectors.toList());
        System.out.println(collect);
    }

    //18Jan22
    // The idea is to use method which returns boolean as a filter.
    public void predicate031() {
        // Using Predicate interface
        Predicate<Integer> predicate = JavaChallengers001::checkAge;
        // Calling Predicate method
        System.out.println(predicate.test(10));
        List<Integer> listOfPersonAge = Arrays.asList(10, 20, 32, 44, 54, 2, 5, 23);
        List<Integer> listOfPersonAge2 = listOfPersonAge.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(listOfPersonAge2);
    }

    //19Jan22
    public void predicate05() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> noGreaterThan5 = x -> (x > 5);
        List<Integer> collect = list.stream().filter(noGreaterThan5).
                collect(Collectors.toList());
        System.out.println(collect);
    }

    //20Jan22
    public void prdicateStringAnd(){
    List<String> myString = Arrays.asList("ani","money","bunny","sunny","winny","buy","corporate","Ankur","wariku");
    List<String> identified = myString.stream().filter(x-> x.length()>4 && x.length()<7).collect(Collectors.toList());
    System.out.println(identified);
    }

    //21Jan22
    public void predicateBetter(){
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 9;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());
        System.out.println(collect);
    }



}