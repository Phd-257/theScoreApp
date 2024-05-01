package utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JasonReader {

    public static JSONObject getTestData(String testCaseName) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject data = (JSONObject) parser.parse(new FileReader("src/test/resources/dataList.json"));
            return (JSONObject) data.get(testCaseName);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
