package project.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project.models.entity.Car;
import project.models.entity.Price;
import project.repository.CarRepository;

import java.math.BigDecimal;

@Component
public class InitCarsSpecific implements CommandLineRunner {
    private final CarRepository carRepository;

    public InitCarsSpecific(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) {
        if (carRepository.count()==0){

            Price price = new Price();
            price.setPrice2_4Days(BigDecimal.valueOf(28));
            price.setPrice5_7days(BigDecimal.valueOf(26));
            price.setPrice8_14days(BigDecimal.valueOf(24));
            price.setPrice15_29days(BigDecimal.valueOf(22));
            price.setPrice30Moredays(BigDecimal.valueOf(19));
            price.setDeposit(BigDecimal.valueOf(200));


            Car car1 = new Car();
            car1.setImageUrl("https://content.lkq.cz/File//AKXX/988F0025-E16B-2CB4-B85F-FAE4DA7A9EA1_L.JPG")
            .setBrand("Honda Accord")
            .setCategory("Sedan")
            .setHorsePower(140)
            .setYear(2010).setEuroStandard(5).setSeats(5).setFuelConsumption(8).setPrice(price).setPricePerDay(BigDecimal.valueOf(30)).setCriteria("economy");

            Price price1 = new Price();
            price1.setPrice2_4Days(BigDecimal.valueOf(23));
            price1.setPrice5_7days(BigDecimal.valueOf(21));
            price1.setPrice8_14days(BigDecimal.valueOf(19));
            price1.setPrice15_29days(BigDecimal.valueOf(14));
            price1.setPrice30Moredays(BigDecimal.valueOf(14));
            price1.setDeposit(BigDecimal.valueOf(200));
            Car car2 = new Car();
            car2.setImageUrl("https://i.ebayimg.com/00/s/MzU1WDUzNg==/z/ztkAAOSw3uteYm4W/$_57.JPG")
                    .setBrand("Opel Astra")
                    .setCategory("Hatchbag")
                    .setHorsePower(101)
                    .setYear(2008).setEuroStandard(3).setSeats(5).setFuelConsumption(6).setPrice(price1).setPricePerDay(BigDecimal.valueOf(25)).setCriteria("economy");




            Price price2 = new Price();
            price2.setPrice2_4Days(BigDecimal.valueOf(25));
            price2.setPrice5_7days(BigDecimal.valueOf(23));
            price2.setPrice8_14days(BigDecimal.valueOf(21));
            price2.setPrice15_29days(BigDecimal.valueOf(19));
            price2.setPrice30Moredays(BigDecimal.valueOf(17));
            price2.setDeposit(BigDecimal.valueOf(200));
            Car car3 = new Car();
            car3.setImageUrl("https://s.aolcdn.com/commerce/autodata/images/USC80FOC301A021001.jpg")
                    .setBrand("Ford Focus")
                    .setCategory("Hatchbag")
                    .setHorsePower(101)
                    .setYear(2018).setEuroStandard(5).setSeats(5).setFuelConsumption(6).setPrice(price2).setPricePerDay(BigDecimal.valueOf(27)).setCriteria("economy");



            Price price3 = new Price();
            price3.setPrice2_4Days(BigDecimal.valueOf(36));
            price3.setPrice5_7days(BigDecimal.valueOf(34));
            price3.setPrice8_14days(BigDecimal.valueOf(32));
            price3.setPrice15_29days(BigDecimal.valueOf(30));
            price3.setPrice30Moredays(BigDecimal.valueOf(28));
            price3.setDeposit(BigDecimal.valueOf(250));
            Car car4 = new Car();
            car4.setImageUrl("https://m.media-amazon.com/images/I/61HRy9P-keL._UY560_.jpg")
                    .setBrand("Nissan 350Z")
                    .setCategory("Coupe")
                    .setHorsePower(340)
                    .setYear(2012).setEuroStandard(4).setSeats(2).setFuelConsumption(25).setPrice(price3).setPricePerDay(BigDecimal.valueOf(40)).setCriteria("sport");



            Price price4 = new Price();
            price4.setPrice2_4Days(BigDecimal.valueOf(35));
            price4.setPrice5_7days(BigDecimal.valueOf(33));
            price4.setPrice8_14days(BigDecimal.valueOf(31));
            price4.setPrice15_29days(BigDecimal.valueOf(29));
            price4.setPrice30Moredays(BigDecimal.valueOf(27));
            price4.setDeposit(BigDecimal.valueOf(250));
            Car car5 = new Car();
            car5.setImageUrl("https://s.aolcdn.com/commerce/autodata/images/CAC30MIC111A021001.jpg")
                    .setBrand("Mitsubishi Lancer")
                    .setCategory("Sedan")
                    .setHorsePower(300)
                    .setYear(2013).setEuroStandard(4).setSeats(5).setFuelConsumption(20).setPrice(price4).setPricePerDay(BigDecimal.valueOf(37)).setCriteria("sport");


            Price price5 = new Price();
            price5.setPrice2_4Days(BigDecimal.valueOf(37));
            price5.setPrice5_7days(BigDecimal.valueOf(35));
            price5.setPrice8_14days(BigDecimal.valueOf(33));
            price5.setPrice15_29days(BigDecimal.valueOf(31));
            price5.setPrice30Moredays(BigDecimal.valueOf(29));
            price5.setDeposit(BigDecimal.valueOf(300));
            Car car6 = new Car();
            car6.setImageUrl("https://s.aolcdn.com/commerce/autodata/images/USC70MBCBO1A021001.jpg")
                    .setBrand("Mercedes CLS63")
                    .setCategory("Sedan")
                    .setHorsePower(450)
                    .setYear(2017).setEuroStandard(5).setSeats(5).setFuelConsumption(26).setPrice(price5).setPricePerDay(BigDecimal.valueOf(40)).setCriteria("sport");

            Price price6 = new Price();
            price6.setPrice2_4Days(BigDecimal.valueOf(35));
            price6.setPrice5_7days(BigDecimal.valueOf(33));
            price6.setPrice8_14days(BigDecimal.valueOf(31));
            price6.setPrice15_29days(BigDecimal.valueOf(29));
            price6.setPrice30Moredays(BigDecimal.valueOf(27));
            price6.setDeposit(BigDecimal.valueOf(250));

            Car car7 = new Car();
            car7.setImageUrl("https://carbgrent.com/wp-content/uploads/2019/04/Transporter1.jpg")
                    .setBrand("Volkswagen Transporter")
                    .setCategory("Minivan")
                    .setHorsePower(190)
                    .setYear(2017).setEuroStandard(5).setSeats(8).setFuelConsumption(9).setPrice(price6).setPricePerDay(BigDecimal.valueOf(36)).setCriteria("travell");


            Price price7 = new Price();
            price7.setPrice2_4Days(BigDecimal.valueOf(29));
            price7.setPrice5_7days(BigDecimal.valueOf(27));
            price7.setPrice8_14days(BigDecimal.valueOf(25));
            price7.setPrice15_29days(BigDecimal.valueOf(23));
            price7.setPrice30Moredays(BigDecimal.valueOf(21));
            price7.setDeposit(BigDecimal.valueOf(250));
            Car car8 = new Car();
            car8.setImageUrl("https://s3.amazonaws.com/cdn.ancap.com.au/app/public/assets/713ee37a9238dec419f7c4da4d6ecfd0d66a948a/large.png?1575248581")
                    .setBrand("Peugeot Partner")
                    .setCategory("Minivan")
                    .setHorsePower(150)
                    .setYear(2020).setEuroStandard(6).setSeats(8).setFuelConsumption(6).setPrice(price7).setPricePerDay(BigDecimal.valueOf(31)).setCriteria("travell");

            Price price9 = new Price();
            price9.setPrice2_4Days(BigDecimal.valueOf(26));
            price9.setPrice5_7days(BigDecimal.valueOf(25));
            price9.setPrice8_14days(BigDecimal.valueOf(24));
            price9.setPrice15_29days(BigDecimal.valueOf(23));
            price9.setPrice30Moredays(BigDecimal.valueOf(22));
            price9.setDeposit(BigDecimal.valueOf(250));
            Car car9 = new Car();
            car9.setImageUrl("https://kia-ceed.net/attachment.php?attachmentid=20062&d=1536881292")
                    .setBrand("Kia Ceed")
                    .setCategory("Wagon")
                    .setHorsePower(140)
                    .setYear(2020).setEuroStandard(6).setSeats(5).setFuelConsumption(5).setPrice(price9).setPricePerDay(BigDecimal.valueOf(30)).setCriteria("economy");


            carRepository.saveAndFlush(car1);
            carRepository.save(car2);
            carRepository.save(car3);
            carRepository.save(car4);
            carRepository.save(car5);
            carRepository.save(car6);
            carRepository.save(car7);
            carRepository.save(car8);
            carRepository.save(car9);

        }
    }
}
