package ws.demographics.dao;

import org.springframework.stereotype.Repository;
import ws.demographics.exceptions.EntityNotFoundException;
import ws.demographics.model.Demographics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DemographicsDao {

    private ArrayList<Demographics> data = new ArrayList<Demographics>();

    public DemographicsDao() {
        initData();
    }

    public void initData() {
        data.add(new Demographics(530010, "Brasilia", "DF", 2914830L, 1586169L, 5780L, 440));
        data.add(new Demographics(330455, "Rio de Janeiro", "RJ", 6476631L, 2576947L, 1200L, 374));
        data.add(new Demographics(355030, "São Paulo", "SP", 11967825L, 7323775L, 1521L, 265));
        data.add(new Demographics(410690, "Curitiba", "PR", 1879355L, 1496240L, 435036L, 181));
        data.add(new Demographics(230440, "Fortaleza", "CE", 2591188L, 964724L, 315L, 116));
        data.add(new Demographics(500270, "Campo Grande", "MS", 853622L, 510255L, 8093L, 90));
        data.add(new Demographics(221100, "Teresina", "PI", 844245L, 409770L, 1392L, 75));
        data.add(new Demographics(120040, "Rio Branco", "AC", 370550L, 149488L, 8836L, 74));
        data.add(new Demographics(150140, "Belém", "PA", 1439561L, 396759L, 1059458L, 72));
        data.add(new Demographics(310620, "Belo Horizonte", "MG", 2502557L, 1664487L, 331L, 70));
        data.add(new Demographics(420540, "Florianópolis", "SC", 469690L, 317199L, 675L, 57));
        data.add(new Demographics(280030, "Aracaju", "SE", 632744L, 271156L, 182L, 56));
        data.add(new Demographics(250750, "João Pessoa", "PB", 791438L, 317343L, 211L, 50));
        data.add(new Demographics(320530, "Vitória", "ES", 355875L, 191413L, 97L, 47));
        data.add(new Demographics(510340, "Cuiabá", "MT", 580489L, 510255L, 3292L, 37));
        data.add(new Demographics(261160, "Recife", "PE", 1617183L, 635686L, 218L, 31));
        data.add(new Demographics(292740, "Salvador", "BA", 2921087L, 819237L, 693L, 27));
        data.add(new Demographics(431490, "Porto Alegre", "RS", 1476867L, 832115L, 497L, 21));
        data.add(new Demographics(130260, "Manaus", "AM", 2057711L, 622675L, 11401L, 6));
        data.add(new Demographics(211130, "São Luis", "MA", 1073893L, 347584L, 835L, 0));
    }

    public Demographics getById(Integer id) throws EntityNotFoundException {
        for (Demographics d : data) {
            if(id.equals(d.getId())) {
                return d;
            }
        }
        throw new EntityNotFoundException(String.format("No Demographics found for city with Id %d", id));
    }

    public ArrayList<Map<String, String>> getCityIndex() {
        ArrayList<Map<String, String>> index = new ArrayList<Map<String, String>>();
        for (Demographics d : data) {
            Map<String, String> entry = new HashMap<String, String>();
            entry.put("id", d.getId().toString());
            entry.put("name", d.getName());
            index.add(entry);
        }
        return index;
    }
}
