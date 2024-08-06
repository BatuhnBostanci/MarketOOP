import market.*;
import persons.*;
import products.*;
import locations.*;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        Country turkiye = Country.createCountry("Türkiye Cumhuriyeti");

//        turkiye = initalizeCountry(turkiye);
        writeOutput(turkiye);
    }

    private static void writeOutput(Country turkiye) {
        System.out.println("***********************");

        for (Region region : turkiye.regions) {
            System.out.println(region.name);
            for (City city : region.cities) {
                System.out.println(city);
                for (Province province : city.provinces) {
                    System.out.println(province);
                    for (Market market : province.markets) {
                        System.out.println("Marketler :" + market.nameWithPlace);
                        for (Employee employee : market.employees) {
                            System.out.println(employee.name);
                        }
                    }
                }
            }
        }
    }

//    private static Country initalizeCountry(Country turkiye) {
//
//        turkiye = createCountryRegions(turkiye);
//
//
//        Province beykoz = Province.createProvince("Beykoz");
//        Province uskudar = Province.createProvince("Üsküdar");
//        provinceAdder(istanbul, beykoz, uskudar);
//
//        Market yavuzBeykoz = Market.openMarket("Yavuz Market", beykoz);
//        Market yavuzUskudar = Market.openMarket("Yavuz Market", uskudar);
//
//        marketAdder(beykoz, yavuzBeykoz);
//        marketAdder(uskudar, yavuzUskudar);
//
//
//        // Ege Bölgesi
//        City izmir = City.createCity("İzmir");
//        City manisa = City.createCity("Manisa");
//        City mugla = City.createCity("Muğla");
//        cityAdder(ege, izmir, manisa, mugla);
//
//        Province bornova = Province.createProvince("Bornova");
//        Province konak = Province.createProvince("Konak");
//        provinceAdder(izmir, bornova, konak);
//        Market yavuzBornova = Market.openMarket("Yavuz Market", bornova);
//        Market yavuzKonak = Market.openMarket("Yavuz Market", konak);
//        marketAdder(bornova, yavuzBornova);
//        marketAdder(konak, yavuzKonak);
//
//
//        // İç Anadolu Bölgesi
//        City ankara = City.createCity("Ankara");
//        City konya = City.createCity("Konya");
//        City kayseri = City.createCity("Kayseri");
//        cityAdder(icAnadolu, ankara, konya, kayseri);
//
//        Province kecioren = Province.createProvince("Keçiören");
//        Province yenimahalle = Province.createProvince("Yenimahalle");
//        provinceAdder(ankara, kecioren, yenimahalle);
//        Market yavuzKecioren = Market.openMarket("Yavuz Market", kecioren);
//        Market yavuzYenimahalle = Market.openMarket("Yavuz Market", yenimahalle);
//        marketAdder(kecioren, yavuzKecioren);
//        marketAdder(yenimahalle, yavuzYenimahalle);
//
//
//        // Karadeniz Bölgesi
//        City trabzon = City.createCity("Trabzon");
//        City samsun = City.createCity("Samsun");
//        City rize = City.createCity("Rize");
//        cityAdder(karadeniz, trabzon, samsun, rize);
//
//        Province arev = Province.createProvince("Arev");
//        Province karadere = Province.createProvince("Karadere");
//        Province ikizdere = Province.createProvince("İkizdere");
//        Province iyidere = Province.createProvince("İyidere");
//        provinceAdder(rize, arev, karadere, ikizdere, iyidere);
//        Market yavuzArev = Market.openMarket("Yavuz Market", arev);
//        Market yavuzKaradere = Market.openMarket("Yavuz Market", karadere);
//        Market yavuzIkizdere = Market.openMarket("Yavuz Market", ikizdere);
//        Market yavuzIyidere = Market.openMarket("Yavuz Market", iyidere);
//        marketAdder(arev, yavuzArev);
//        marketAdder(karadere, yavuzKaradere);
//        marketAdder(ikizdere, yavuzIkizdere);
//        marketAdder(iyidere, yavuzIyidere);
//
//
//        // Doğu Anadolu Bölgesi
//        City erzurum = City.createCity("Erzurum");
//        City malatya = City.createCity("Malatya");
//        City van = City.createCity("Van");
//        cityAdder(doguAnadolu, erzurum, malatya, van);
//
//        Province palandoken = Province.createProvince("Palandöken");
//        Province yakutiye = Province.createProvince("Yakutiye");
//        Province battalgazi = Province.createProvince("Battalgazi");
//        provinceAdder(erzurum, palandoken, yakutiye);
//        provinceAdder(malatya, battalgazi);
//        Market yavuzPalandoken = Market.openMarket("Yavuz Market", palandoken);
//        Market yavuzYakutiye = Market.openMarket("Yavuz Market", yakutiye);
//        Market yavuzBattal = Market.openMarket("Yavuz Market", battalgazi);
//        marketAdder(palandoken, yavuzPalandoken);
//        marketAdder(yakutiye, yavuzYakutiye);
//        marketAdder(battalgazi, yavuzBattal);
//
//
//        // Güneydoğu Anadolu Bölgesi
//        City gaziantep = City.createCity("Gaziantep");
//        City diyarbakir = City.createCity("Diyarbakır");
//        City sanliurfa = City.createCity("Şanlıurfa");
//        cityAdder(guneyDogu, gaziantep, diyarbakir, sanliurfa);
//
//        Province sahinbey = Province.createProvince("Şahinbey");
//        Province sehitkamil = Province.createProvince("Şehitkamil");
//        Province harran = Province.createProvince("Harran");
//        provinceAdder(sanliurfa, harran);
//        provinceAdder(gaziantep, sahinbey, sehitkamil);
//        Market yavuzSahinbey = Market.openMarket("Yavuz Market", sahinbey);
//        Market yavuzSehitkamil = Market.openMarket("Yavuz Market", sehitkamil);
//        Market yavuzHarran = Market.openMarket("Yavuz Market", harran);
//        marketAdder(sahinbey, yavuzSahinbey);
//        marketAdder(sehitkamil, yavuzSehitkamil);
//        marketAdder(harran, yavuzHarran);
//
//
//        // Akdeniz Bölgesi
//        City antalya = City.createCity("Antalya");
//        City adana = City.createCity("Adana");
//        City mersin = City.createCity("Mersin");
//        cityAdder(akdeniz, antalya, adana, mersin);
//
//        Province muratpasa = Province.createProvince("Muratpaşa");
//        Province kepez = Province.createProvince("Kepez");
//        provinceAdder(antalya, muratpasa, kepez);
//        Market yavuzMuratpasa = Market.openMarket("Yavuz Market", muratpasa);
//        Market yavuzKepez = Market.openMarket("Yavuz Market", kepez);
//        marketAdder(muratpasa, yavuzMuratpasa);
//        marketAdder(kepez, yavuzKepez);
//        return turkiye;
//    }

    private static Country createCountryRegions(Country turkiye) {
        Region marmara = Region.createRegion("Marmara Bölgesi");
        marmara = addRegionCities(marmara);
        Region ege = Region.createRegion("Ege Bölgesi");
        Region icAnadolu = Region.createRegion("İç Anadolu Bölgesi");
        Region karadeniz = Region.createRegion("Karadeniz Bölgesi");
        Region doguAnadolu = Region.createRegion("Doğu Anadolu Bölgesi");
        Region guneyDogu = Region.createRegion("Güneydoğu Anadolu Bölgesi");
        Region akdeniz = Region.createRegion("Akdeniz Bölgesi");
        turkiye.regions.add(marmara);
        turkiye.regions.add(ege);
        turkiye.regions.add(icAnadolu);
        turkiye.regions.add(karadeniz);
        turkiye.regions.add(doguAnadolu);
        turkiye.regions.add(guneyDogu);
        turkiye.regions.add(akdeniz);
        return turkiye;
    }

    private static Region addRegionCities(Region marmara) {
        City istanbul = City.createCity("İstanbul");

        City kocaeli = City.createCity("Kocaeli");
        City edirne = City.createCity("Edirne");
        marmara.cities.add(istanbul);
        marmara.cities.add(kocaeli);
        marmara.cities.add(edirne);
        return marmara;
    }
}