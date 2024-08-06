package market;

import persons.Employee;
import products.Cleanings;
import products.Drinks;
import products.Edibles;
import products.PersonalCare;

public class MarketManager {
    public static void assignEmployee(Employee employee, Market market) {
        market.employees.add(employee);
        System.out.println(employee.name + " " + employee.surname + " isimli kişi " + market.nameWithPlace + " isimli markette çalışan olmuştur");
    }

    public static void doManagerAnEmployee(Employee employee, Market market) throws Exception {
        if (employee.workExperience > 5) {
            market.manager = employee;
            employee.salary *= 1.5;
            System.out.println(employee.name + " " + employee.surname + " isimli kişi " + market.nameWithPlace + " isimli marketin müdürü olmuştur");
        } else {
            throw new Exception(employee.name + " " + employee.surname + " isimli bu çalışan müdürlük için gerekli tecrübeye sahip değil");
        }
    }

    public static void raiseSalary(Employee employee, int raiseAmount) {
        employee.salary += raiseAmount;
    }

    public static Edibles addEdiblesProductToMarket(String productName, double kilos, String productId, double price, String expirationDate) {
        Edibles edibles = new Edibles();
        edibles.productId = productId;
        edibles.productName = productName;
        edibles.price = price;
        edibles.expirationDate = expirationDate;
        edibles.setKilos(kilos);
        return edibles;
    }

    public static Drinks addDrinksProductToMarket(String productName, double liters, String productId, double price, String expirationDate) {
        Drinks drinks = new Drinks();
        drinks.productId = productId;
        drinks.productName = productName;
        drinks.price = price;
        drinks.expirationDate = expirationDate;
        drinks.liters = liters;
        return drinks;
    }

    public static PersonalCare addPersonalCareProductToMarket(String productName, int amount, String whereToUse, String productId, double price, String expirationDate) {
        PersonalCare personalCare = new PersonalCare();
        personalCare.productId = productId;
        personalCare.productName = productName;
        personalCare.amount = amount;
        personalCare.price = price;
        personalCare.expirationDate = expirationDate;
        personalCare.whereToUse = whereToUse;
        return personalCare;
    }

    public static Cleanings addCleaningsProductToMarket(String productName, int amount, String forWhichPlace, String productId, double price, String expirationDate) {
        Cleanings cleanings = new Cleanings();
        cleanings.productId = productId;
        cleanings.productName = productName;
        cleanings.amount = amount;
        cleanings.price = price;
        cleanings.expirationDate = expirationDate;
        cleanings.forWhichPlace = forWhichPlace;
        return cleanings;
    }
}
