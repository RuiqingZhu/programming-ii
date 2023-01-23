package session3.examples.onetomany;

import java.util.Arrays;

public class Province {
    private String name;
    private City[] cities;

    public Province(String name, City[] cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
