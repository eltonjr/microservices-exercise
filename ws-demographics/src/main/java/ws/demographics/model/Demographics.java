package ws.demographics.model;

public class Demographics {

    private Integer id;

    private String name;

    private String state;

    private Long population;

    private Long numOfCars;

    private Long size;

    private Integer bikeLaneExtension;

    public Demographics(Integer id, String name, String state, Long population, Long numOfCars, Long size, Integer bikeLaneExtension) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.population = population;
        this.numOfCars = numOfCars;
        this.size = size;
        this.bikeLaneExtension = bikeLaneExtension;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getNumOfCars() {
        return numOfCars;
    }

    public void setNumOfCars(Long numOfCars) {
        this.numOfCars = numOfCars;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getBikeLaneExtension() {
        return bikeLaneExtension;
    }

    public void setBikeLaneExtension(Integer bikeLaneExtension) {
        this.bikeLaneExtension = bikeLaneExtension;
    }
}
