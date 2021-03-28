package project.service.impl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import project.models.entity.Car;
import project.repository.CarRepository;
import project.service.CarService;
import project.view.CarForBuyViewModel;
import project.view.CarViewModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final ModelMapper modelMapper;
    private final CarRepository carRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(CarServiceImpl.class);


    public CarServiceImpl(ModelMapper modelMapper, CarRepository carRepository) {
        this.modelMapper = modelMapper;
        this.carRepository = carRepository;
    }

    @Override
    public void initCarSpecific() {

    }



//    @Override
//    public CarViewModel findById(String id) {
//        return this.carRepository.findById(id)
//                .map(car -> {
//                    CarViewModel carViewModel = this.modelMapper.map(Car.class, CarViewModel.class);
//                    carViewModel.setImageUrl(String.format("/img/%s%s%s%d%d%d", car.getImageUrl(), car.getBrand(),
//                            car.getCategory(), car.getEuroStandard(), car.getFuelConsumption(), car.getHorsePower()));
//                    return carViewModel;
//                }).orElse(null);
//    }

    @Override
    public List<CarViewModel> findAllItems() {
        return this.carRepository.findAll()
                .stream()
                .filter(c -> c.getCriteria().equals("sport"))
                .map(car -> modelMapper.map(car, CarViewModel.class)

                ).collect(Collectors.toList());


    }



    @Override
    public BigDecimal getTotalSum() {
        return carRepository.findTotalCarSum();
    }

    @Override
    public List<CarForBuyViewModel> findAllCarSport() {
        return this.carRepository.findAll()
                .stream()
                .filter(c -> c.getCriteria().equals("sport"))
                .map(car -> modelMapper.map(car, CarForBuyViewModel.class)).collect(Collectors.toList());
    }

    @Override
    public CarForBuyViewModel findById(String id) {
        return this.carRepository.findById(id)
                .map(car -> {

                    return this.modelMapper.map(car, CarForBuyViewModel.class);
                }).orElse(null);
    }

    @Override
    public void buyById(String id) {
        this.carRepository.deleteById(id);
    }

    @Override
    public List<CarForBuyViewModel> findAllCarEconomy() {
        return this.carRepository.findAll()
                .stream()
                .filter(c -> c.getCriteria().equals("economy"))
                .map(car -> modelMapper.map(car, CarForBuyViewModel.class)).collect(Collectors.toList());
    }

    @Override
    public List<CarForBuyViewModel> findAllCarTravell() {
        return this.carRepository.findAll()
                .stream()
                .filter(c -> c.getCriteria().equals("travell"))
                .map(car -> modelMapper.map(car, CarForBuyViewModel.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(String id) {
        this.carRepository.deleteById(id);
    }


}
