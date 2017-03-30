package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import maps.Point;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by RENT on 2017-03-22.
 */
public class Jackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        //zamiana obiektu na json
        Place place = new Place("Dom", "Warszawa", Arrays.asList(new Point(100, 200)));
        String placeJson = objectMapper.writeValueAsString(place);
        System.out.println(placeJson);

        //zapis jsona do pliku

        objectMapper.writeValue(new File("placeJackson.json"), place);


        //zapis do stringa
        String placeAsJson = "{\"name\":\"Dom\",\"city\":\"Warszawa\",\"points\":[{\"x\":100,\"y\":200}]}";


// zapis jasona na obiekt
       Place placeReader = objectMapper.readValue(placeAsJson, Place.class);

       //zamiana jasona z pliku na obiekt
        Place placeReaded = objectMapper.readValue(new File("placeJackson.json"),Place.class);

        //zadanie
        String jsonString = "{\"firstName\":\"Adam\",\"lastName\":\"Kowalski\",\"birthYear\":1980,\"idNumber\":\"ABC\"}";
        System.out.println(jsonString);

        //zadanie2

        String jsonString2 = "{\n" +
                "\"coord\": {\n" +
                "\"lon\": 139,\n" +
                "\"lat\": 35\n" +
                "},\n" +
                "\"weather\": [\n" +
                "{\n" +
                "\"id\": 800,\n" +
                "\"main\": \"Clear\",\n" +
                "\"description\": \"clear sky\",\n" +
                "\"icon\": \"01n\"\n" +
                "}\n" +
                "]}";

        System.out.println(jsonString2);



    }
}
