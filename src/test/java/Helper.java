import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

    public static ChromeDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static final String EGGEDURL = "https://www.egged.co.il/";
    public static final String PTURL = "https://www.petah-tikva.muni.il/Pages/default.aspx";

    public static final String YOMKIPUR ="https://en.wikipedia.org/wiki/Yom_Kippur";
    public static final String AVODAHID ="Avodah:_remembering_the_Temple_service";

    public static final String FOLDER = "C:\\Users\\97252\\Desktop\\Screenshots\\";

    public static final String PICTURE = ".jpg";
    public static final String TXT = ".txt";

    public static final String MICHLALOTURL = "https://www.egged.co.il/%D7%94%D7%9E%D7%9B%D7%9C%D7%9C%D7%95%D7%AA-%D7%9C%D7%AA%D7%97%D7%91%D7%95%D7%A8%D7%94.aspx";

    public static final String MI_ANACHNU = "https://www.egged.co.il/%D7%9E%D7%90%D7%9E%D7%A8-830-%D7%9E%D7%99-%D7%90%D7%A0%D7%97%D7%A0%D7%95.aspx";

    public static final String KSHARIMPLUS = "https://www.ksharimplus.com/index.aspx";

    public static final String BANKJERUSALEM ="https://www.bankjerusalem.co.il/";
    public static final String ROTTERSCOOPS = "https://rotter.net/scoopscache.html";
    public static final String LANGUAGE = "form-control";
    public static final String ENGLISH = "//*[@id=\"headbar\"]/div/div[1]/div[1]/div/ul/li[1]/a";
    public static final String ENGLISH2 = "//*[@id=\"headbar\"]/div/div[1]/div[1]/div/ul/li[1]/a";
    public static final String ENGLISH1 = "/html/body/form/div[3]/header/div/div[1]/div[1]/div/ul/li[1]/a";
    public static final String SEARCH_BY_LINE1 ="//*[@id=\"aspnetForm\"]/div[3]/section[2]/div/div/div/div/div[1]/ul/li[3]/a";
    public static final String SEARCH_BY_LINE ="/html/body/form/div[3]/section[2]/div/div/div/div/div[1]/ul/li[3]/a";
    public static final String PETKHTIKVA = "/html/body/div[2]/div[2]/div[1]/div[1]/table/tbody/tr[2]/td/div/div/div/fieldset/div[2]/div/div[1]/div[1]/div/div[1]/div/ul/li[3]/div";
    public static final String ORIGINCITY1 = "/html/body/div[2]/div[3]/div[1]/div[1]/table/tbody/tr[2]/td/div/div/div/fieldset/div[2]/div/div[1]/div[1]/div/div[1]/input";
    public static final String ORIGINALCITYID = "bylineFromCityCombo";

    public static final String LANGUAGEDROPDOWNXPATH = "//*[@id=\":0.targetLanguage\"]/select";
    public static final String ENGLISHVALUE = "en";
    public static final String ORIGINCITY = "/html/body/div[2]/div[2]/div[1]/div[1]/table/tbody/tr[2]/td/div/div/div/fieldset/div[2]/div/div[1]/div[1]/div/div[1]/input";


}
