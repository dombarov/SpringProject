package project.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project.models.entity.Transfers;
import project.repository.TransferRepository;
import project.service.TransferService;

import java.math.BigDecimal;

@Component
public class InitTransfers implements CommandLineRunner {
    private final TransferService transferService;
    private final TransferRepository transferRepository;

    public InitTransfers(TransferService transferService, TransferRepository transferRepository) {
        this.transferService = transferService;
        this.transferRepository = transferRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (transferRepository.count()== 0){
            Transfers transfer1 = new Transfers();

            transfer1.setRoute("Sofia - Bansko")
                    .setCarWith5seats(BigDecimal.valueOf(100))
                    .setMinivanWith7seats(BigDecimal.valueOf(120))
                    .setMinibusWith9seats(BigDecimal.valueOf(150));

            Transfers transfer2 = new Transfers();

            transfer2.setRoute("Sofia - Borovets")
                    .setCarWith5seats(BigDecimal.valueOf(100))
                    .setMinivanWith7seats(BigDecimal.valueOf(120))
                    .setMinibusWith9seats(BigDecimal.valueOf(150));

            Transfers transfer3 = new Transfers();

            transfer3.setRoute("Sofia - Pamporovo")
                    .setCarWith5seats(BigDecimal.valueOf(90))
                    .setMinivanWith7seats(BigDecimal.valueOf(130))
                    .setMinibusWith9seats(BigDecimal.valueOf(150));

            Transfers transfer4 = new Transfers();

            transfer4.setRoute("Sofia - Plovdiv")
                    .setCarWith5seats(BigDecimal.valueOf(70))
                    .setMinivanWith7seats(BigDecimal.valueOf(110))
                    .setMinibusWith9seats(BigDecimal.valueOf(130));

            Transfers transfer5 = new Transfers();

            transfer5.setRoute("Sofia - Varna")
                    .setCarWith5seats(BigDecimal.valueOf(170))
                    .setMinivanWith7seats(BigDecimal.valueOf(200))
                    .setMinibusWith9seats(BigDecimal.valueOf(220));

            Transfers transfer6 = new Transfers();

            transfer6.setRoute("Sofia - Sunny Beach")
                    .setCarWith5seats(BigDecimal.valueOf(200))
                    .setMinivanWith7seats(BigDecimal.valueOf(220))
                    .setMinibusWith9seats(BigDecimal.valueOf(240));

            Transfers transfer7 = new Transfers();

            transfer7.setRoute("Sofia - Burgas")
                    .setCarWith5seats(BigDecimal.valueOf(170))
                    .setMinivanWith7seats(BigDecimal.valueOf(200))
                    .setMinibusWith9seats(BigDecimal.valueOf(220));

            Transfers transfer8 = new Transfers();

            transfer8.setRoute("Sofia - Velingrad")
                    .setCarWith5seats(BigDecimal.valueOf(80))
                    .setMinivanWith7seats(BigDecimal.valueOf(120))
                    .setMinibusWith9seats(BigDecimal.valueOf(140));

            Transfers transfer12 = new Transfers();

            transfer12.setRoute("Sofia - Sandanski")
                    .setCarWith5seats(BigDecimal.valueOf(100))
                    .setMinivanWith7seats(BigDecimal.valueOf(120))
                    .setMinibusWith9seats(BigDecimal.valueOf(150));


            Transfers transfer9 = new Transfers();

            transfer9.setRoute("Sofia - Istanbul")
                    .setCarWith5seats(BigDecimal.valueOf(250))
                    .setMinivanWith7seats(BigDecimal.valueOf(350))
                    .setMinibusWith9seats(BigDecimal.valueOf(380));

            Transfers transfer10 = new Transfers();

            transfer10.setRoute("Sofia - Solun")
                    .setCarWith5seats(BigDecimal.valueOf(250))
                    .setMinivanWith7seats(BigDecimal.valueOf(300))
                    .setMinibusWith9seats(BigDecimal.valueOf(350));

            Transfers transfer11 = new Transfers();

            transfer11.setRoute("Sofia - Bucurest")
                    .setCarWith5seats(BigDecimal.valueOf(300))
                    .setMinivanWith7seats(BigDecimal.valueOf(350))
                    .setMinibusWith9seats(BigDecimal.valueOf(390));

            Transfers transfer13 = new Transfers();

            transfer13.setRoute("Sofia - Belgrad")
                    .setCarWith5seats(BigDecimal.valueOf(170))
                    .setMinivanWith7seats(BigDecimal.valueOf(200))
                    .setMinibusWith9seats(BigDecimal.valueOf(270));



            this.transferRepository.save(transfer1);
            this.transferRepository.save(transfer1);
            this.transferRepository.save(transfer3);
            this.transferRepository.save(transfer4);
            this.transferRepository.save(transfer5);
            this.transferRepository.save(transfer6);
            this.transferRepository.save(transfer7);
            this.transferRepository.save(transfer8);
            this.transferRepository.save(transfer9);
            this.transferRepository.save(transfer10);
            this.transferRepository.save(transfer11);
            this.transferRepository.save(transfer12);

        }

    }
}
