package chp3annotations;

import org.testng.annotations.*;

public class ConfigurationAnnotations {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Chrome - Set Up System Property");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Open Chrome");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Test Application");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Sign In");
    }

    @Test
    public void searchCustomer() {
        System.out.println("Search for Customer");
    }

    @Test
    public void searchProduct() {
        System.out.println("Search for Product");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Sign Out");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Close Chrome");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Close Test Application");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Chrome - Clean Up All Cookies");
    }
}
