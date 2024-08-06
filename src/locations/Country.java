package locations;

import java.util.ArrayList;
import java.util.List;

public class Country {
    public String name;
    public List<Region> regions;

    public static Country createCountry(String name){
        Country country = new Country();
        country.name=name;
        country.regions=new ArrayList<>();
        return country;
    }
}
