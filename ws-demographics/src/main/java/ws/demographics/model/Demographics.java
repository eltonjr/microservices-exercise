package ws.demographics.model;

public class Demographics {

    private String name;

    private String state;

    private Long population;

    private Integer numOfCars;

    private Long size;

    private Long bikeLaneExtension;

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

    public Integer getNumOfCars() {
        return numOfCars;
    }

    public void setNumOfCars(Integer numOfCars) {
        this.numOfCars = numOfCars;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getBikeLaneExtension() {
        return bikeLaneExtension;
    }

    public void setBikeLaneExtension(Long bikeLaneExtension) {
        this.bikeLaneExtension = bikeLaneExtension;
    }
}
