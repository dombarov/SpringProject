package project.service;

import project.view.PriceViewModel;

import java.util.List;

public interface PriceService {
    List<PriceViewModel> findAllPrices();
}
