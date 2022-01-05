package Constant;

import com.google.gson.JsonObject;
import org.testng.annotations.DataProvider;

public class DataUtils {



    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider() {
        String filePath = Utilities.getProjectPath() + "/DataObjects/data.json";
        JsonObject jsonObject = JsonHelper.getJsonObject(filePath);
         JsonObject dataTC14 = jsonObject.getAsJsonObject("TC14");
        String departStation1 = dataTC14.get("departStation").getAsString();
        String arriveStation1 = dataTC14.get("arriveStation").getAsString();
        String seatType1 = dataTC14.get("seatType").getAsString();
        String amount1 = dataTC14.get("amount").getAsString();


        Object[][] object = new Object[][]{
                {departStation1, arriveStation1,seatType1,amount1 }
        };

        return object;
    }
    @DataProvider(name = "dataProvider1")
    public Object[][] dataProvider1() {
        String filePath = Utilities.getProjectPath() + "/DataObjects/data.json";
        JsonObject jsonObject = JsonHelper.getJsonObject(filePath);
        JsonObject dataTC16 = jsonObject.getAsJsonObject("TC16");
        String departStation1 = dataTC16.get("departStation").getAsString();
        String arriveStation1 = dataTC16.get("arriveStation").getAsString();
        String seatType1 = dataTC16.get("seatType").getAsString();
        String amount1 = dataTC16.get("amount").getAsString();


        Object[][] object1 = new Object[][]{
                {departStation1, arriveStation1,seatType1,amount1 }
        };

        return object1;
    }
    @DataProvider(name = "dataProvider2")
    public Object[][] dataProvider2() {
        String filePath = Utilities.getProjectPath() + "/DataObjects/data.json";
        JsonObject jsonObject = JsonHelper.getJsonObject(filePath);
        JsonObject dataTC17 = jsonObject.getAsJsonObject("TC17");
        String departStation1 = dataTC17.get("departStation").getAsString();
        String arriveStation1 = dataTC17.get("arriveStation").getAsString();
        String seatType1 = dataTC17.get("seatType").getAsString();
        String amount1 = dataTC17.get("amount1").getAsString();
        String amount2 = dataTC17.get("amount2").getAsString();



        Object[][] object2 = new Object[][]{
                {departStation1, arriveStation1,seatType1,amount1,amount2 }
        };

        return object2;
    }


}
