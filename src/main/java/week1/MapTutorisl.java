package week1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//1-1-22
public class MapTutorisl {
    public static void main(String args[]){
        MapTutorisl obj = new MapTutorisl();
        obj.mapDemo();

        }

        public void mapDemo(){
            Map<String, Integer > myMap = new HashMap<String, Integer>();
            myMap.put("one",1 );
            myMap.put("two",2);
            myMap.put("three",3 );
            myMap.put("four",4);
            for (Map.Entry<String, Integer> me : myMap.entrySet()) {
                System.out.print(me.getKey() + ":");
                System.out.println(me.getValue());
            }
        }
}
