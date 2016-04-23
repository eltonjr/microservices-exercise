package ws.demographics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.demographics.dao.DemographicsDao;
import ws.demographics.exceptions.EntityNotFoundException;
import ws.demographics.model.Demographics;

import java.util.ArrayList;
import java.util.Map;

@Service
public class DemographicsService {

    @Autowired
    private DemographicsDao demographicsDao;

    public Demographics getDemographicsById(Integer id) throws EntityNotFoundException {
        return demographicsDao.getById(id);
    }

    public ArrayList<Map<String, String>> getCityIndex() {
        return demographicsDao.getCityIndex();
    }
}
