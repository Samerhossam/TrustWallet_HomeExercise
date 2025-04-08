package tests;

import java.net.URISyntaxException;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import utils.DriverUtils;

public class BaseTest {

    @BeforeSuite
    public void setUp() throws URISyntaxException {
        DriverUtils.initializeDriver();
    }

    @AfterSuite
    public void tearDown() {
        DriverUtils.quitDriver();
    }

}
