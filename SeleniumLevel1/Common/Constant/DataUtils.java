package Constant;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import Constant.Utilities;
public class DataUtils {

    @DataProvider
    public Object[] dataProvider1() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;

        // Read JSON file
        try {
            Object obj = parser.parse(new FileReader(Utilities.getProjectPath()+"/DataObjects/data.json"));
            jsonObject = (JSONObject) obj;
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }

        // Array to store JSON data
        Object[] data = new Object[1];

        // Store JSON data as key/value pairs in a hashMap
        HashMap<String, String> hashMap = new LinkedHashMap<>();
        Set<String> jsonObjKeys = jsonObject.keySet();
        for (String jsonObjKey : jsonObjKeys) {
            hashMap.put(jsonObjKey, (String) jsonObject.get(jsonObjKey));
        }
        // Store HashMap in an array and return array
        data[0] = hashMap;
        return data;
    }
    @DataProvider
    public Object[] dataProvider2() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;

        // Read JSON file
        try {
            Object obj = parser.parse(new FileReader(Utilities.getProjectPath()+"/DataObjects/data1.json"));
            jsonObject = (JSONObject) obj;
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }

        // Array to store JSON data
        Object[] data = new Object[1];

        // Store JSON data as key/value pairs in a hashMap
        HashMap<String, String> hashMap = new LinkedHashMap<>();
        Set<String> jsonObjKeys = jsonObject.keySet();
        for (String jsonObjKey : jsonObjKeys) {
            hashMap.put(jsonObjKey, (String) jsonObject.get(jsonObjKey));
        }
        // Store HashMap in an array and return array
        data[0] = hashMap;
        return data;
    }


}
