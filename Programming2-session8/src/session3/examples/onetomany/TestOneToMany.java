package session3.examples.onetomany;

public class TestOneToMany {
    public static void main(String[] args) {
        City[] cities = new City[3];
        cities[0] = new City("Montreal", 100000);
        cities[1] = new City("Quebec city", 40000);
        cities[2] = new City("Longueuil", 30000);


        Province province1= new Province("Quebec", cities);

        System.out.println(province1);
    }
}
