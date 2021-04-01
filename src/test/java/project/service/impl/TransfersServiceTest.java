package project.service.impl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.repository.TransferRepository;
import project.service.impl.TransferServiceImpl;
import project.view.TransferViewModel;

import java.util.List;

import static org.mockito.Mockito.when;



@ExtendWith(MockitoExtension.class)
public class TransfersServiceTest {

    @Mock
    private TransferRepository transferRepository;
    @InjectMocks
    private TransferServiceImpl transferService;
    @Autowired
    private ModelMapper modelMapper;

    private TransferViewModel transferViewModel;

    @BeforeEach
    public void setUp(){
        this.transferService = new TransferServiceImpl(transferRepository, modelMapper);
    }

   @Test
    void testAllTransfers(){
        when(transferService.findAll()).thenReturn(List.of(transferViewModel));

        List<TransferViewModel> trView = transferService.findAll();
        TransferViewModel actualTr = trView.get(0);

        Assertions.assertEquals(transferViewModel.getCarWith5seats(), actualTr.getCarWith5seats());
        Assertions.assertEquals(transferViewModel.getMinibusWith9seats(), actualTr.getMinibusWith9seats());
    }

}
