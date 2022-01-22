package week1;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

//1-1-22
public class MapTutorisl {
    String test="";
    static String  textMyMsp="Test";
    public static void main(String args[]) {
        MapTutorisl obj = new MapTutorisl();
       //List<List<String>> ls =  obj.listOfList();
       //obj.printListOfList(ls);
       obj.mapOfBooks();
    }

    public void mapDemo() {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("four", 4);
        for (Map.Entry<String, Integer> me : myMap.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }

    // 2nd Jan 2022
    public void mapDemo2() {
        Map<String, String> myMap = new HashMap<>();
        Map<String, String> myMap1 = new HashMap<>();
        myMap.put("QAGP-120", "Pass");
        myMap.put("QAGP-121", "Pass");
        myMap.put("QAGP-127", "Pass");
        myMap.put("QAGP-128", "Fail");
        myMap1.put("QAGP-122", "Fail");
        myMap1.put("QAGP-123", "Fail");
        myMap.put("QAGP-124", "Skip");
        myMap.put("QAGP-124", "Pass");
        myMap1.put("QAGP-126", "Pass");
        myMap1.put("QAGP-129", "Fail");
        myMap.putAll(myMap1);

        for (Map.Entry<String, String> elmSet : myMap.entrySet()) {
            System.out.println(elmSet.getKey());
            System.out.println(elmSet.getValue());
        }
    }
    //3rd Jan 22
    public void map2Method(){
                HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(1,"Mango");  //Put elements in Map
                map.put(2,"Apple");
                System.out.println("Iterating Hashmap...");
                for(Map.Entry m : map.entrySet()){
                    System.out.println(m.getKey()+" "+m.getValue());
                }
            }

      //4th Jan
    public void reflectionDemo()  {
        Class s= getClass().getClassLoader().getClass();

        Class s1= null;
        try {
            s1 = getClass().getClassLoader().getClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("test"+s.getName().toString());
    }

    // 5th Jan

    public List<String> tryList(){
        List<String> newList = new ArrayList<String>();
        newList.add("one");
        newList.add("two");
        newList.add("three");
        newList.add("four");
       // for(int i=0; i< newList.size();i++){
            //System.out.println(newList);
        //}
        return newList;
    }

    //6th Jan
    public List<List<String>> listOfList(){
        List<List<String>> listOfList = new ArrayList<List<String>>();
        MapTutorisl obj2 = new MapTutorisl();
        listOfList.add(obj2.tryList());
        listOfList.add(obj2.tryList());
        return listOfList;
    }

    // 7th Jan
    public void printListOfList(List<List<String>> localList){
        for(List<String> s: localList){
                for(int i=0;i<s.size();i++){
                    System.out.println(s.get(i));
          }
        }
    }

   // 8th Jan 22
    public void mapOfBooks(){ // example of keyset
        Map<String, String> books = new HashMap<>();
        books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");
        books.put("978-0134685987", "Java Certification");
        Set<String>isbn=  books.keySet();
        System.out.println(isbn);
        Collection<String> names =  books.values();
        Object []bookNames = names.toArray();
        System.out.println(Arrays.stream(bookNames).findFirst());
    }

    //9th Jan


}
