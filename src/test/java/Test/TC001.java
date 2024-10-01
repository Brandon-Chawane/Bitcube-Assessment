package Test;

import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static PageObjects.HomePage.expectedPrivacyURL;
import static PageObjects.HomePage.expectedTermsURL;

public class TC001 extends BaseClass {



    @Test
    public void titleValidationTest() throws Exception {
        try{
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "Factorial");
        }catch (Exception e){
            Assert.fail();
            throw  new Exception(e.getMessage());
        }
    }

        @Test
        public void privacyURLTest() throws Exception {
            HomePage hp = new HomePage(driver);
            try {
                hp.clickPrivacyLink();
                String privacyTitle = driver.getCurrentUrl();
                Assert.assertEquals(privacyTitle, expectedPrivacyURL);
            } catch (Exception e) {
                Assert.fail();
                throw  new Exception(e.getMessage());
            }
        }

        @Test
        public void termsURLTest () throws Exception {
            HomePage hp = new HomePage(driver);
            try {
                hp.clickTermsLink();
                String termsURL = driver.getCurrentUrl();
                Assert.assertEquals(termsURL, expectedTermsURL);
            } catch (Exception e) {
                Assert.fail();
                throw  new Exception(e.getMessage());
            }
        }


    }

