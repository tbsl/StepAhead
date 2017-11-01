package RND;

import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class FindBrokenLinks {
 
    WebDriver driver;
	public String STG_url="https://staging.pocketjobs.com/jobs/index.html,https://staging.pocketjobs.com/jobs/search-result.html,https://staging.pocketjobs.com/jobs/job-details.html?encJobId=R9I4LmTprSk=&source=,https://staging.pocketjobs.com/jobs/forgot-password.html,https://staging.pocketjobs.com/jobs/register.html,https://staging.pocketjobs.com/jobs/login.html,https://staging.pocketjobs.com/jobs/preview-resume.html,https://staging.pocketjobs.com/jobs/applied-job-list.html,https://staging.pocketjobs.com/jobs/shortlist-job-list.html,https://staging.pocketjobs.com/jobs/about-us.html,https://staging.pocketjobs.com/jobs/profileview.html,https://staging.pocketjobs.com/jobs/personal-info-edit.html,https://staging.pocketjobs.com/jobs/profile-details-edit.html";
	public String url="https://www.pocketjobs.com/jobs/index.html,https://www.pocketjobs.com/jobs/search-result.html,https://www.pocketjobs.com/jobs/job-details.html?encJobId=xoT__SLASH__Hk13xLs=&source=Map,https://www.pocketjobs.com/jobs/forgot-password.html,https://www.pocketjobs.com/jobs/register.html,https://www.pocketjobs.com/jobs/login.html,https://www.pocketjobs.com/jobs/preview-resume.html,https://www.pocketjobs.com/jobs/applied-job-list.html,https://www.pocketjobs.com/jobs/shortlist-job-list.html,https://www.pocketjobs.com/jobs/about-us.html,https://www.pocketjobs.com/jobs/profileview.html,https://www.pocketjobs.com/jobs/personal-info-edit.html,https://www.pocketjobs.com/jobs/profile-details-edit.html";


	
    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://google.co.in/");

    }
 
    @Test
    public void testLinks() throws Exception {
    	System.out.println();
    	String[] purl=url.split(",");
    	for(String parentURL:purl)
    	{
    		System.out.println("PARENT URL IS-------------------------------"+parentURL);
    		System.out.println("");
    		if(parentURL.equals("https://www.pocketjobs.com/jobs/search-result.html"))
    		{
    			driver.get(parentURL);
    			System.out.println("search result");
    			driver.findElement(By.id("cat-icon-11")).click();
    			Thread.sleep(2000);
    			driver.findElement(By.xpath(".//*[@id='locationCluster']/a[6]")).click();
    		}
    		
    		if(parentURL.equals("https://www.pocketjobs.com/jobs/login.html"))
    		{
    			
    			driver.get(parentURL);

    			Thread.sleep(3000);

    			driver.findElement(By.id("mobileNumber")).sendKeys("8383000651");
    			driver.findElement(By.id("password")).sendKeys("123456");
    			driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div[1]/form/ul/li[3]/button")).click();
    			Thread.sleep(3000);
    			
    		}
    		
            //Fetch all hyper links those contains HREF attributes

    		driver.get(parentURL);
    		List<WebElement> links = fetchAllLinks(driver);

            System.out.println("Total number of hyper links on webpage : "+parentURL+ " Count is " + links.size());
            

            // Validate all URLS one by one using For loop
            for(int i = 0 ; i < links.size(); i++) {
                try {
                	
                	//System.out.println(links.get(i).getAttribute("href"));
                	//System.out.println("URL WE ARE GOING TO HIT---->>>>>>>>>>>>>"+links.get(i).getAttribute("href"));

                   // System.out.println("URL: " + links.get(i).getAttribute("href") + " - Result : " + isLinkBroken(new URL(links.get(i).getAttribute("href"))));
     
                    } catch(Exception e) {
     
                        System.out.println("Error at " + links.get(i).getAttribute("innerHTML") + " Exception occured : " + e.getMessage());
                    }
                }

            
    		
    	}
    	
    	 
        //Fetch all hyper links those contains HREF attributes
        List<WebElement> links = fetchAllLinks(driver);
 
        System.out.println("Total number of hyper links on webpage : " + links.size());
 
        // Validate all URLS one by one using For loop
        for(int i = 0 ; i < links.size(); i++) {
            try {
            	
            	System.out.println("URL WE ARE GOING TO HIT---->>>>>>>>>>>>>"+links.get(i).getAttribute("href"));
                System.out.println("URL: " + links.get(i).getAttribute("href") + " - Result : " + isLinkBroken(new URL(links.get(i).getAttribute("href"))));
 
                } catch(Exception e) {
 
                    System.out.println("Error at " + links.get(i).getAttribute("innerHTML") + " Exception occured : " + e.getMessage());
                }
            }
        }
 
    @AfterClass
    public void tearDown() {
       // driver.quit();
    }
 
      public List<WebElement> fetchAllLinks(WebDriver driver) {
 
          List<WebElement> list = new ArrayList<WebElement>();
 
          //Find all elements with anchor tag and store it into a list
          list = driver.findElements(By.tagName("a"));
 
          List<WebElement> finalList = new ArrayList<WebElement>(); ;
 
          //Now scan all hyper links in order to filter the ones those are without href attribute and save elements into FinalList
          for (int i = 0 ; i<list.size(); i++) {
 
              if(list.get(i).getAttribute("href") != null) {
 
                  finalList.add(list.get(i));
              }
          }
 
          return finalList;
 
      }
 
        public String isLinkBroken(URL url) throws Exception {
 
            String response = " ";
 
            //Create an instance of HTTP URL connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

          //  HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            //connect to the URL
            connection.connect();
 
            // get the response
            response = connection.getResponseMessage();
 
            // Disconnect the connection
            connection.disconnect();
 
            return response;
 
            }
 
    }