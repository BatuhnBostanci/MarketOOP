package persons;

import java.util.ArrayList;

import products.*;
import market.*;

import java.util.List;

public class Customer extends Person {
    public double budget;
    public List<Edibles> edibles;
    public List<Drinks> drinks;
    public List<PersonalCare> personalCareList;
    public List<Cleanings> cleaningsList;

    public static Customer createCustomer(String name, String surname, int age, String mailAdress, String phoneNumber, double budget) {
        Customer customer = new Customer();
        customer.name = name;
        customer.surname = surname;
        customer.age = age;
        customer.mailAdress = mailAdress;
        customer.phoneNumber = phoneNumber;
        customer.budget = budget;
        customer.edibles = new ArrayList<>();
        customer.drinks = new ArrayList<>();
        customer.personalCareList = new ArrayList<>();
        customer.cleaningsList = new ArrayList<>();
        return customer;
    }

    public static void buyEdible(Customer customer, Market market, Edibles edible, double buyAmount) {
        if (Market.isEdibleExistInThisMarket(market, edible)) {
            if (Market.isThereEnoughAmountOfEdible(edible, buyAmount)) {
                double total = edible.getPrice() * buyAmount;

                if (customer.budget >= total) {
                    double remainKilosInMarket = edible.getKilos() - buyAmount;
                    customer.budget -= total;

                    if (doesCustomerHaveThisEdible(customer, edible)) {
                        changeCustomersEdibleKilos(customer, edible, buyAmount);
                    } else {
                        addEdibleToCustomer(customer, edible.getName(), buyAmount, edible.getPrice());
                    }

                    Market.setKilosAnEdible(market, edible, remainKilosInMarket);
                } else {
                    System.out.println("Müşterinin yeterli bütçesi yoktur");
                }
            } else {
                System.out.println("İlgili üründen yeterli miktarda stok yoktur");
            }
        } else {
            System.out.println("İlgili ürün bulunamamıştır");
        }
    }

    public static boolean doesCustomerHaveThisEdible(Customer customer, Edibles edible) {
        for (Edibles i : customer.edibles) {
            if (i.getName().equals(edible.getName())) {
                return true;
            }
        }
        return false;
    }

    public static void changeCustomersEdibleKilos(Customer customer, Edibles edible, double buyAmount) {
        for (Edibles i : customer.edibles) {
            if (i.getName().equals(edible.getName())) {
                i.plusKilos(buyAmount);
            }
        }
    }

    public static void customersEdibles(Customer customer) {
        for (Edibles i : customer.edibles) {
            System.out.println(customer.name + " " + customer.surname + " isimli müşterinin elinde " + i.getName() + " isimli üründen " + i.getKilos() + " kilo kadar ürün vardır");
        }
    }

    public static void addEdibleToCustomer(Customer customer, String name, double kilos, double price) {
        Edibles edible = new Edibles();
        edible.setName(name);
        edible.setKilos(kilos);
        edible.setPrice(price);
        customer.edibles.add(edible);
    }
}
