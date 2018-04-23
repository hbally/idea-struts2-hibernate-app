package com.ttg.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

public class WelcomeAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    //get log4j
    private static final Logger logger = Logger.getLogger(WelcomeAction.class);

    public String execute() throws Exception {

        // logs debug message
        if (logger.isDebugEnabled()) {
            logger.debug("execute()!");
        }
        // logs exception
        logger.error("This is Error message", new Exception("Testing"));
        return SUCCESS;

    }
}
