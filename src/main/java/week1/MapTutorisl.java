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
obj.mapDemo2();
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
// 2nd Jan 2022
        public void mapDemo2(){
        Map<String, String> myMap = new HashMap<>();
        myMap.put("QAGP-120","Pass");
        myMap.put("QAGP-121","Pass");
        myMap.put("QAGP-122","Fail");
        myMap.put("QAGP-123","Fail");
        myMap.put("QAGP-124","Skip");
        for(Map.Entry<String, String> elmSet : myMap.entrySet()){
            System.out.println(elmSet.getKey());
            System.out.println(elmSet.getValue());
        }

        }
}
