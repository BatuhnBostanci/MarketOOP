package locations;

import java.util.ArrayList;
import java.util.List;

public class City {
    public String name;
    public List<Province> provinces;

    public static City createCity(String name){
        City city = new City();
        city.name=name;
        city.provinces=new ArrayList<>();
        return city;
    }
}
