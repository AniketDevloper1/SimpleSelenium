package com.github.AniketDevloper1;

import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class Simple {
    WebDriver driver;
    Logger log= Logger.getLogger("SimpleSelenium");


    public void test(){
        log.info("This should print out ");
        log.warning("WARNING ");

    }

    public static void main(String[] args) {
        new Simple().test();
    }
}
