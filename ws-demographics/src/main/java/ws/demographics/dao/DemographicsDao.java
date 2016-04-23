package ws.demographics.dao;

import org.springframework.stereotype.Service;
import ws.demographics.model.Demographics;

import java.util.ArrayList;

@Service
public class DemographicsDao {

    private ArrayList<Demographics> data = new ArrayList<Demographics>();

    public ArrayList<Demographics> getData() {
        return data;
    }
}
