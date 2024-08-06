package market;

import locations.Province;
import persons.Employee;
import products.Cleanings;
import products.Drinks;
import products.Edibles;
import products.PersonalCare;

import java.util.ArrayList;
import java.util.List;

public class Market {
    public String name;
    public String nameWithPlace;
    public Employee manager;
    public List<Employee> employees;
    public List<Edibles> edibles;
    public List<Drinks> drinks;
    public List<PersonalCare> personalCareProducts;
    public List<Cleanings> cleaningProducts;

    public static Market openMarket(String name, Province province) {
        Market market = new Market();
        market.name = name;
        market.nameWithPlace = name + " " + province.name + " şubesi";
        market.manager=null;
        market.employees=new ArrayList<>();
        market.edibles = new ArrayList<>();
        market.drinks = new ArrayList<>();
        market.personalCareProducts = new ArrayList<>();
        market.cleaningProducts = new ArrayList<>();
        return market;
    }
    public static void setKilosAnEdible(Market market, Edibles edible, double newKilos) {
        for (Edibles i : market.edibles) {
            if (i.equals(edible)) {
                i.setKilos(newKilos);
            }
        }
    }
    public static boolean isEdibleExistInThisMarket(Market market, Edibles edibles){
        for(Edibles i: market.edibles){
            if (market.edibles.contains(edibles)) return true;
        }
        return false;
    }
    public static boolean isThereEnoughAmountOfEdible(Edibles edibles,double amount){
        if (edibles.amount<amount) return true;
        return false;
    }
    public static void howMuchEdibleTheMarketHave(Market market,Edibles edible){
        for(Edibles i:market.edibles){
            if(i==edible){
                System.out.println(market.nameWithPlace+" marketinde "+edible.productName+" ürününden "+edible.getKilos()+" kilo miktarında ürün kalmıştır");
            }
        }
    }

}
