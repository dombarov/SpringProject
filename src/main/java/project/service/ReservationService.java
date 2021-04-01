package project.service;

import project.models.entity.Reservation;
import project.models.service.ReservationAddServiceModel;
import project.view.CarViewModel;

import java.text.ParseException;

public interface ReservationService {
    void addReservation(ReservationAddServiceModel reservationAddServiceModel);



//    void diff(ReservationAddServiceModel reservationAddServiceModel) throws ParseException;
}
