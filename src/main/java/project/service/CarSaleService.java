package project.service;

import project.models.service.CarSaleServiceModel;
import project.view.SaleViewModel;

import java.util.List;

public interface CarSaleService {
    void addMyCarForSale(CarSaleServiceModel carSaleServiceModel);

    List<SaleViewModel> findAll();
}
