package ws.demographics;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ws.demographics.controllers.Demographics;

@SpringBootApplication
public class Application {

    private static Logger logger = Logger.getLogger(Demographics.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("Demographics service is online!");
    }

}