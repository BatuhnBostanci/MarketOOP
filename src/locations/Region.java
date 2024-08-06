package locations;

import java.util.ArrayList;
import java.util.List;

public class Region {
    public String name;
    public List<City> cities;

    public static Region createRegion(String name){
        Region region = new Region();
        region.name=name;
        region.cities=new ArrayList<>();
        return region;
    }
}
