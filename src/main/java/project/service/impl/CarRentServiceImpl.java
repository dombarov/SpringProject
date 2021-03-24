package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import project.models.entity.CarRentEntity;
import project.models.entity.enums.CarModelEnum;
import project.repository.CarRentRepository;
import project.service.CarRentService;

import java.util.Arrays;

@Service
public class CarRentServiceImpl implements CarRentService {
    private final ModelMapper modelMapper;
    private final CarRentRepository carRentRepository;

    public CarRentServiceImpl(ModelMapper modelMapper, CarRentRepository carRentRepository) {
        this.modelMapper = modelMapper;
        this.carRentRepository = carRentRepository;
    }


    @Override
    public void initCars() {
        if (this.carRentRepository.count()==0){
            Arrays.stream(CarModelEnum.values())
                    .forEach(carModel -> {
                     this.carRentRepository.save(new CarRentEntity(carModel,
                             String.format("Description for %s", carModel.name())));
                    });

        }
    }

    @Override
    public CarRentEntity findByModel(CarModelEnum carModelEnum) {
      return   this.carRentRepository.findByModel(carModelEnum).orElse(null);
    }
}
