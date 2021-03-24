package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import project.models.entity.Car;
import project.repository.PriceRepository;
import project.service.PriceService;
import project.view.PriceViewModel;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriceServiceImpl implements PriceService {
    private final PriceRepository priceRepository;
    private final ModelMapper modelMapper;

    public PriceServiceImpl(PriceRepository priceRepository, ModelMapper modelMapper) {
        this.priceRepository = priceRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PriceViewModel> findAllPrices() {
        return this.priceRepository.findAll()
                .stream()
                .map(price -> modelMapper.map(price, PriceViewModel.class)).collect(Collectors.toList());
//
//        .stream().map(price -> {
//            PriceViewModel priceViewModel = this.modelMapper.map(price, PriceViewModel.class);
//            Car car;
//
//            priceViewModel.setCar(String.format("%s", price.setCar()))
//                }).collect(Collectors.toList());

    }
}
