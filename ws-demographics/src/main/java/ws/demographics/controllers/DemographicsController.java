package ws.demographics.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemographicsController {

    private Logger logger = Logger.getLogger(DemographicsController.class);

    @RequestMapping(path = "/v1", method = RequestMethod.GET, produces = "plain/text")
    public String index() {
        return "Demographics Service is online!";
    }
}