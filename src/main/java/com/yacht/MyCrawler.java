package com.yacht;

import com.salesforce.webdev.sitecrawler.SiteCrawler;
import com.salesforce.webdev.sitecrawler.SiteCrawlerAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class MyCrawler {
    
    private static Logger logger = LoggerFactory.getLogger(MyCrawler.class);

    public static void main(String[] args) {

        System.out.println("This is my crawler");

            logger.trace("Trace Message!");
            logger.debug("Debug Message!");
            logger.info("Info Message!");
            logger.warn("Warn Message!");
            logger.error("Error Message!");

        basic();

    }

//        mvn clean compile exec:java -Dexec.mainClass="com.yacht.MyCrawler" -Dorg.slf4j.simpleLogger.defaultLogLevel=INFO


    private static void basic() {
        List<? extends SiteCrawlerAction> siteCrawlerActions = new LinkedList<>();
        SiteCrawler siteCrawler = new SiteCrawler("http://www.yacht.nl", "https://www.yacht.nl", siteCrawlerActions);
        siteCrawler.getAllowedSuffixes().add("");
        siteCrawler.navigate();
        siteCrawler.disableCrawling();

    }
}
