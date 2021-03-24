package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import project.models.entity.CarForSale;
import project.models.service.CarSaleServiceModel;
import project.repository.CarForSaleRepository;
import project.service.CarSaleService;
import project.service.UserService;
import project.view.SaleViewModel;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarSaleServiceImpl implements CarSaleService {
    private final ModelMapper modelMapper;
    private final CarForSaleRepository carForSaleRepository;
    private final UserService userService;

    public CarSaleServiceImpl(ModelMapper modelMapper, CarForSaleRepository carForSaleRepository, UserService userService) {
        this.modelMapper = modelMapper;
        this.carForSaleRepository = carForSaleRepository;
        this.userService = userService;
    }

    @Override
    public void addMyCarForSale(CarSaleServiceModel carSaleServiceModel) {
        CarForSale carForSale = this.modelMapper.map(carSaleServiceModel, CarForSale.class);

        String username = this.userService.getUsername();

        carForSale.setUser(this.userService.findByUserName(username));

        carForSaleRepository.save(carForSale);
    }

    @Override
    public List<SaleViewModel> findAll() {
        return this.carForSaleRepository.findAll()
                .stream()
                .map(carForSale -> modelMapper.map(carForSale, SaleViewModel.class))
                .collect(Collectors.toList());
    }
}
