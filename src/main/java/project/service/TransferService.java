package project.service;

import project.models.entity.Transfers;
import project.view.TransferViewModel;

import java.util.List;

public interface TransferService {
    List<TransferViewModel> findAll();
}
