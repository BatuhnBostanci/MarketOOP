import market.*;
import persons.*;
import products.*;
import locations.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {
        Country turkiye = Country.createCountry("Türkiye Cumhuriyeti");
        turkiye = initalizeCountry(turkiye);
        writeOutput(turkiye);
    }

    private static void writeOutput(Country turkiye) {
        System.out.println("Ülkenin ismi :" + turkiye.name);
        for (Region region : turkiye.regions) {
            System.out.println("BÖLGE :"+region.name+"--------");
            System.out.println("//////////////////////");
            for (City city : region.cities) {
                System.out.println("Şehir :"+city.name+"--------");
                for (Province province : city.provinces) {
                    System.out.println("İlçeleri :"+province.name+"--------");
                    for (Market market : province.markets) {
                        System.out.println("Marketler :" + market.nameWithPlace+"--------");
                        for (Employee employee : market.employees) {
                            System.out.println("Çalışanlar "+employee.name);
                        }
                    }
                }
            }
        }
    }

    private static Country initalizeCountry(Country turkiye) {
        turkiye = createCountryRegions(turkiye);
        return turkiye;
    }

    private static Country createCountryRegions(Country turkiye) {

        Region marmara = Region.createRegion("Marmara Bölgesi");
        addRegionCitiesForMarmara(marmara);

        Region ege = Region.createRegion("Ege Bölgesi");
        addRegionCitiesForEge(ege);

        Region icAnadolu = Region.createRegion("İç Anadolu Bölgesi");
        addRegionCitiesForIcAnadolu(icAnadolu);

        Region karadeniz = Region.createRegion("Karadeniz Bölgesi");
        addRegionCitiesForKarandeiz(karadeniz);

        Region doguAnadolu = Region.createRegion("Doğu Anadolu Bölgesi");
        addRegionCitiesForDoguAnadolu(doguAnadolu);

        Region guneyDogu = Region.createRegion("Güneydoğu Anadolu Bölgesi");
        addRegionCitiesForGuneyDogu(guneyDogu);

        Region akdeniz = Region.createRegion("Akdeniz Bölgesi");
        addRegionCitiesForAkdeniz(akdeniz);


        turkiye.regions.add(marmara);
        turkiye.regions.add(ege);
        turkiye.regions.add(icAnadolu);
        turkiye.regions.add(karadeniz);
        turkiye.regions.add(doguAnadolu);
        turkiye.regions.add(guneyDogu);
        turkiye.regions.add(akdeniz);
        return turkiye;
    }

    private static Region addRegionCitiesForAkdeniz(Region akdeniz) {
        City antalya = City.createCity("Antalya");
        addProvinceForAntalya(antalya);
        City adana = City.createCity("Adana");
        City mersin = City.createCity("Mersin");
        akdeniz.cities.add(antalya);
        akdeniz.cities.add(adana);
        akdeniz.cities.add(mersin);
        return akdeniz;
    }

    private static City addProvinceForAntalya(City antalya) {
        Province muratpasa = Province.createProvince("Muratpaşa");
        addMarketForMuratpasa(muratpasa);
        Province kepez = Province.createProvince("Kepez");
        addMarketForKepez(kepez);
        antalya.provinces.add(muratpasa);
        antalya.provinces.add(kepez);
        return antalya;
    }

    private static Province addMarketForKepez(Province kepez) {
        Market yavuzKepez = Market.openMarket("Yavuz Market", kepez);
        kepez.markets.add(yavuzKepez);
        return kepez;
    }

    private static Province addMarketForMuratpasa(Province muratpasa) {
        Market yavuzMuratpasa = Market.openMarket("Yavuz Market", muratpasa);
        muratpasa.markets.add(yavuzMuratpasa);
        return muratpasa;
    }

    private static Region addRegionCitiesForGuneyDogu(Region guneyDogu) {
        City gaziantep = City.createCity("Gaziantep");
        addProvinceForGaziantep(gaziantep);
        City diyarbakir = City.createCity("Diyarbakır");
        City sanliurfa = City.createCity("Şanlıurfa");
        addProvinceForSanliurfa(sanliurfa);
        guneyDogu.cities.add(gaziantep);
        guneyDogu.cities.add(diyarbakir);
        guneyDogu.cities.add(sanliurfa);
        return guneyDogu;
    }

    private static City addProvinceForSanliurfa(City sanliurfa) {
        Province harran = Province.createProvince("Harran");
        addMarketForHarran(harran);
        sanliurfa.provinces.add(harran);
        return sanliurfa;
    }

    private static Province addMarketForHarran(Province harran) {
        Market yavuzHarran = Market.openMarket("Yavuz Market", harran);
        harran.markets.add(yavuzHarran);
        return harran;
    }

    private static City addProvinceForGaziantep(City gaziantep) {
        Province sahinbey = Province.createProvince("Şahinbey");
        addMarketForSahinbey(sahinbey);
        Province sehitkamil = Province.createProvince("Şehitkamil");
        addMarketForSehitkamil(sehitkamil);
        gaziantep.provinces.add(sahinbey);
        gaziantep.provinces.add(sehitkamil);
        return gaziantep;
    }

    private static Province addMarketForSehitkamil(Province sehitkamil) {
        Market yavuzSehitkamil = Market.openMarket("Yavuz Market", sehitkamil);
        sehitkamil.markets.add(yavuzSehitkamil);
        return sehitkamil;
    }

    private static Province addMarketForSahinbey(Province sahinbey) {
        Market yavuzSahinbey = Market.openMarket("Yavuz Market", sahinbey);
        sahinbey.markets.add(yavuzSahinbey);
        return sahinbey;
    }

    private static Region addRegionCitiesForDoguAnadolu(Region doguAnadolu) {
        City erzurum = City.createCity("Erzurum");
        addProvinceForErzurum(erzurum);
        City malatya = City.createCity("Malatya");
        addProvinceForMalatya(malatya);
        City van = City.createCity("Van");
        doguAnadolu.cities.add(erzurum);
        doguAnadolu.cities.add(malatya);
        doguAnadolu.cities.add(van);
        return doguAnadolu;
    }

    private static City addProvinceForMalatya(City malatya) {
        Province battalgazi = Province.createProvince("Battalgazi");
        addMarketForBattalgazi(battalgazi);
        malatya.provinces.add(battalgazi);
        return malatya;
    }

    private static Province addMarketForBattalgazi(Province battalgazi) {
        Market yavuzBattal = Market.openMarket("Yavuz Market", battalgazi);
        battalgazi.markets.add(yavuzBattal);
        return battalgazi;
    }

    private static City addProvinceForErzurum(City erzurum) {
        Province palandoken = Province.createProvince("Palandöken");
        addMarketForPaladoken(palandoken);
        Province yakutiye = Province.createProvince("Yakutiye");
        addMarketForYakutiye(yakutiye);
        erzurum.provinces.add(palandoken);
        erzurum.provinces.add(yakutiye);
        return erzurum;
    }

    private static Province addMarketForYakutiye(Province yakutiye) {
        Market yavuzYakutiye = Market.openMarket("Yavuz Market", yakutiye);
        yakutiye.markets.add(yavuzYakutiye);
        return yakutiye;
    }

    private static Province addMarketForPaladoken(Province palandoken) {
        Market yavuzPalandoken = Market.openMarket("Yavuz Market", palandoken);
        palandoken.markets.add(yavuzPalandoken);
        return palandoken;
    }

    private static Region addRegionCitiesForKarandeiz(Region karadeniz) {
        City trabzon = City.createCity("Trabzon");
        City samsun = City.createCity("Samsun");
        City rize = City.createCity("Rize");
        addProvinceForRize(rize);
        karadeniz.cities.add(trabzon);
        karadeniz.cities.add(samsun);
        karadeniz.cities.add(rize);
        return karadeniz;
    }

    private static City addProvinceForRize(City rize) {
        Province arev = Province.createProvince("Arev");
        addMarketForArev(arev);
        Province karadere = Province.createProvince("Karadere");
        addMarketForKaradere(karadere);
        Province ikizdere = Province.createProvince("İkizdere");
        addMarketForIkizdere(ikizdere);
        Province iyidere = Province.createProvince("İyidere");
        addMarketForIyidere(iyidere);
        rize.provinces.add(arev);
        rize.provinces.add(karadere);
        rize.provinces.add(ikizdere);
        rize.provinces.add(iyidere);
        return rize;
    }

    private static Province addMarketForIyidere(Province iyidere) {
        Market yavuzIyidere = Market.openMarket("Yavuz Market", iyidere);
        iyidere.markets.add(yavuzIyidere);
        return iyidere;
    }

    private static Province addMarketForIkizdere(Province ikizdere) {
        Market yavuzIkizdere = Market.openMarket("Yavuz Market", ikizdere);
        ikizdere.markets.add(yavuzIkizdere);
        return ikizdere;
    }

    private static Province addMarketForKaradere(Province karadere) {
        Market yavuzKaradere = Market.openMarket("Yavuz Market", karadere);
        karadere.markets.add(yavuzKaradere);
        return karadere;
    }

    private static Province addMarketForArev(Province arev) {
        Market yavuzArev = Market.openMarket("Yavuz Market", arev);
        arev.markets.add(yavuzArev);
        return arev;
    }

    private static Region addRegionCitiesForIcAnadolu(Region icAnadolu) {
        City ankara = City.createCity("Ankara");
        addProvinceForAnkara(ankara);
        City konya = City.createCity("Konya");
        City kayseri = City.createCity("Kayseri");
        icAnadolu.cities.add(ankara);
        icAnadolu.cities.add(konya);
        icAnadolu.cities.add(kayseri);
        return icAnadolu;
    }

    private static City addProvinceForAnkara(City ankara) {
        Province kecioren = Province.createProvince("Keçiören");
        addMarketForKecioren(kecioren);
        Province yenimahalle = Province.createProvince("Yenimahalle");
        addMarketForYenimahalle(yenimahalle);
        ankara.provinces.add(kecioren);
        ankara.provinces.add(yenimahalle);
        return ankara;
    }

    private static Province addMarketForYenimahalle(Province yenimahalle) {
        Market yavuzYenimahalle = Market.openMarket("Yavuz Market", yenimahalle);
        yenimahalle.markets.add(yavuzYenimahalle);
        return yenimahalle;
    }

    private static Province addMarketForKecioren(Province kecioren) {
        Market yavuzKecioren = Market.openMarket("Yavuz Market", kecioren);
        kecioren.markets.add(yavuzKecioren);
        return kecioren;
    }

    private static Region addRegionCitiesForEge(Region ege) {
        City izmir = City.createCity("İzmir");
        addProvinceForIzmir(izmir);
        City manisa = City.createCity("Manisa");
        City mugla = City.createCity("Muğla");
        ege.cities.add(izmir);
        ege.cities.add(manisa);
        ege.cities.add(mugla);
        return ege;
    }

    private static City addProvinceForIzmir(City izmir) {
        Province bornova = Province.createProvince("Bornova");
        addMarketForBornova(bornova);
        Province konak = Province.createProvince("Konak");
        addMarketForKonak(konak);
        izmir.provinces.add(bornova);
        izmir.provinces.add(konak);
        return izmir;
    }

    private static Province addMarketForKonak(Province konak) {
        Market yavuzKonak = Market.openMarket("Yavuz Market", konak);
        konak.markets.add(yavuzKonak);
        return konak;
    }

    private static Province addMarketForBornova(Province bornova) {
        Market yavuzBornova = Market.openMarket("Yavuz Market", bornova);
        bornova.markets.add(yavuzBornova);
        return bornova;
    }

    private static Region addRegionCitiesForMarmara(Region marmara) {
        City istanbul = City.createCity("İstanbul");
        addProvinceForIstanbul(istanbul);
        City kocaeli = City.createCity("Kocaeli");
        City edirne = City.createCity("Edirne");
        marmara.cities.add(istanbul);
        marmara.cities.add(kocaeli);
        marmara.cities.add(edirne);
        return marmara;
    }

    private static City addProvinceForIstanbul(City istanbul) {
        Province beykoz = Province.createProvince("Beykoz");
        addMarketForBeykoz(beykoz);
        Province uskudar = Province.createProvince("Üsküdar");
        addMarketForUskudar(uskudar);
        istanbul.provinces.add(beykoz);
        istanbul.provinces.add(uskudar);
        return istanbul;
    }

    private static Province addMarketForUskudar(Province uskudar) {
        Market yavuzUskudar = Market.openMarket("Yavuz Market",uskudar);
        uskudar.markets.add(yavuzUskudar);
        return uskudar;
    }
    private static Province addMarketForBeykoz(Province beykoz) {
        Market yavuzBeykoz = Market.openMarket("Yavuz Market", beykoz);
        addEmployeeForYavuzBeykoz(yavuzBeykoz);
        beykoz.markets.add(yavuzBeykoz);
        return beykoz;
    }

    private static Market addEmployeeForYavuzBeykoz(Market yavuzBeykoz) {
        Employee omer = Employee.createEmployee("Ömer","Yavuz",24,"omer@gmail.com","0505056064",10000,5);
        yavuzBeykoz.employees.add(omer);
        return yavuzBeykoz;
    }
}

