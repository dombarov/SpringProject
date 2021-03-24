package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import project.models.entity.Transfers;
import project.repository.TransferRepository;
import project.service.TransferService;
import project.view.TransferViewModel;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransferServiceImpl implements TransferService {
    private final TransferRepository transferRepository;
    private final ModelMapper modelMapper;

    public TransferServiceImpl(TransferRepository transferRepository, ModelMapper modelMapper) {
        this.transferRepository = transferRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<TransferViewModel> findAll() {
        return this.transferRepository.findAll()
                .stream()
                .map(transfers -> this.modelMapper.map(transfers, TransferViewModel.class))
                .collect(Collectors.toList());
    }
}
