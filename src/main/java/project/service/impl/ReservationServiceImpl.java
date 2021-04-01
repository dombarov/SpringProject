package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import project.models.entity.Reservation;
import project.models.entity.UserEntity;
import project.models.service.ReservationAddServiceModel;
import project.repository.ReservationRepository;
import project.repository.UserRepository;
import project.service.CarRentService;
import project.service.ReservationService;
import project.service.UserService;
import project.view.CarViewModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final UserRepository userRepository;
    private final CarRentService carRentService;


    public ReservationServiceImpl(ReservationRepository reservationRepository, ModelMapper modelMapper, UserService userService, UserRepository userRepository, CarRentService carRentService) {
        this.reservationRepository = reservationRepository;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.userRepository = userRepository;
        this.carRentService = carRentService;
    }


    @Override
    public void addReservation(ReservationAddServiceModel reservationAddServiceModel) {

        Reservation reservation = this.modelMapper.map(reservationAddServiceModel, Reservation.class);


//        reservation.setCarModel(this.carRentService.findByModel(reservationAddServiceModel.getCarModel().getCarModel()));
        String username = getUsername();
        UserEntity userEntity = userService.findByUserName(username);
        reservation.setUser(userEntity);
        this.reservationRepository.save(reservation);

    }



//    @Override
//    public void diff(ReservationAddServiceModel reservationAddServiceModel) throws ParseException {
//        ReservationAddServiceModel reservationAddServiceModel1 = new ReservationAddServiceModel();
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//        LocalDate a = reservationAddServiceModel.getPickUpdate();
//       LocalDate b = reservationAddServiceModel.getReturnDate();
//        LocalDate c = a.
//
//    }

    public String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetails userPrincipal = (UserDetails) authentication.getPrincipal();
            return userPrincipal.getUsername();
        }
        return null;
    }
}
