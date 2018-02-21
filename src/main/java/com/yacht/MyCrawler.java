package com.yacht;

import com.salesforce.webdev.sitecrawler.SiteCrawler;
import com.salesforce.webdev.sitecrawler.SiteCrawlerAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class MyCrawler {
    public static void main(String[] args) {
        System.out.println("This is my crawler");
        Logger logger = LoggerFactory.getLogger(MyCrawler.class);
        logger.info("Hello this in My CrawlerLogging");

        basic();

//        mvn clean compile exec:java -Dexec.mainClass="com.yacht.MyCrawler" -Dorg.slf4j.simpleLogger.defaultLogLevel=INFO
    }
    private static void basic() {
        List<? extends SiteCrawlerAction> siteCrawlerActions = new LinkedList<>();
        SiteCrawler siteCrawler = new SiteCrawler("www.ziggo.nl", "https://www.ziggo.nl", siteCrawlerActions);
        siteCrawler.getAllowedSuffixes().add("");
        siteCrawler.navigate();
        siteCrawler.disableCrawling();

    }
}
