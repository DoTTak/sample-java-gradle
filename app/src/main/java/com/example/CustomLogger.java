package com.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CustomLogger {
    
    static final Logger logger = LogManager.getLogger(CustomLogger.class.getName());
 
    public void doIt() {
        logger.error("Did it again!");
    }
}