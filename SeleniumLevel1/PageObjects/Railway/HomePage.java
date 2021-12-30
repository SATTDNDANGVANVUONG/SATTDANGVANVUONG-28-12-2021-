package Railway;

import Constant.Constant;

public class HomePage extends GerneralPage {


    public void open() {
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);

    }

}
