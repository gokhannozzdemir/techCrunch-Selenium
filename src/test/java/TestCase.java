import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestCase {

    WebDriver driver = new ChromeDriver();

    @Test
    public void BrowserSetup() {

        System.setProperty("webriver.chrome.driver", "C:\\Users\\EXT02D26039\\Desktop\\techcrunch\\Drivers\\chromedriver.exe");
        driver.navigate().to("https://techcrunch.com/");

    }

    @Test
    public void AuthorControl1() {

        WebElement Article1 = driver.findElement(By.cssSelector("article>header>div>div>span>span>a"));
        System.out.println(Article1.getText());

        Assert.assertNull(Article1.getText());

    }

    @Test
    public void ImageControl1(){
        WebElement Image = driver.findElement(By.cssSelector("article>footer>figure>picture>img"));
        System.out.println(Image.getText());

        Assert.assertNotNull(Image.getText());

    }

    @Test
    public void LatestNews(){

        WebElement GoNews = driver.findElement(By.cssSelector("article>header>h2>a.post-block__title__link"));
        GoNews.click();
    }

    @Test
    public void PageTitle(){

        String actualTitle = driver.getTitle();
        String expectedTitle = "techcrunch.com";
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Test
    public void LinkVerify(){
        WebElement Link = driver.findElement(By.xpath("//a[@href ='http://instagram.com/techcrunch']"));
        Link.click();


    }
    @Test
    public void instagram(){

        String actualTitle = driver.getTitle();
        String expectedTitle = "Giriş Yap • Instagram";
        Assert.assertEquals(expectedTitle, actualTitle);
    }




}

















