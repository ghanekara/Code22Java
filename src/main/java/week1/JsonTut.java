package week1;

import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.json.*;
import javax.json.stream.*;

public class JsonTut {

    public static void main(String [] args){
        String jsonString = "{\"name\":\"Raja Ramesh\",\"age\":\"35\",\"salary\":\"40000\"}";
        StringWriter sw = new StringWriter(); // object similar to string.
        try {
            JsonReader jsonReader = Json.createReader(new StringReader(jsonString)); // a json reader object is created
            JsonObject jsonObj = jsonReader.readObject(); //
            Map<String, Object> map = new HashMap<>(); // a map of Sting and boolean
            map.put(JsonGenerator.PRETTY_PRINTING, true); //
            JsonWriterFactory writerFactory = Json.createWriterFactory(map);
            JsonWriter jsonWriter = writerFactory.createWriter(sw);
            jsonWriter.writeObject(jsonObj);
            jsonWriter.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        String prettyPrint = sw.toString();
        System.out.println(prettyPrint); // pretty print JSON
    }
}
