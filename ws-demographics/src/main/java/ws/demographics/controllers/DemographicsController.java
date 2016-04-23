package ws.demographics.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ws.demographics.exceptions.EntityNotFoundException;
import ws.demographics.model.Demographics;
import ws.demographics.services.DemographicsService;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class DemographicsController {

    private Logger logger = Logger.getLogger(DemographicsController.class);

    @Autowired private DemographicsService demographicsService;

    /**
     * Simple entrypoint to check the service health.
     * @return text telling that the service is online
     */
    @RequestMapping(path = "/v1", method = RequestMethod.GET, produces = "plain/text")
    public String index() {
        return "Demographics Service is online!";
    }

    /**
     * Exposes demographic infos about a single city (queried by id).
     * If you don't know city's id, use /v1/cities to get an index.
     * @param id Integer. The code of the city that is required
     * @return Demographics about a single city
     */
    @RequestMapping(path = "/v1/cities/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Demographics> getCity(@PathVariable("id") Integer id) {

        ResponseEntity<Demographics> response;

        if (id == null) {
            return new ResponseEntity<Demographics>(HttpStatus.BAD_REQUEST);
        }

        try {
            Demographics byId = demographicsService.getDemographicsById(id);
            response = new ResponseEntity<Demographics>(byId, HttpStatus.OK);
        } catch (EntityNotFoundException enf) {
            logger.error(enf.getMessage());
            response = new ResponseEntity<Demographics>(HttpStatus.NO_CONTENT);
        }

        return response;
    }

    /**
     * Tells the API user the city code together with the city's name.
     * Helps people to find the correct id for a given city.
     * @return JSON like that: [{id:001, name: "Sao Paulo"}, {id:002, name: "Rio de Janeiro"}, ...]
     */
    @RequestMapping(path = "/v1/cities", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<ArrayList<Map<String, String>>> getCityIndex() {
        return new ResponseEntity<ArrayList<Map<String, String>>>(demographicsService.getCityIndex(), HttpStatus.OK);
    }
}
