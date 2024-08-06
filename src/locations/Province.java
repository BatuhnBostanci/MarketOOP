package locations;

import java.util.ArrayList;
import java.util.List;

import market.*;

public class Province {
    public String name;
    public List<Market> markets;

    public static Province createProvince(String name){
        Province province = new Province();
        province.name = name;
        province.markets=new ArrayList<>();
        return province;
    }
}
