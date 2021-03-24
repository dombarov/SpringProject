package project.service;

import project.models.service.ReservationAddServiceModel;

import java.text.ParseException;

public interface ReservationService {
    void addReservation(ReservationAddServiceModel reservationAddServiceModel);

//    void diff(ReservationAddServiceModel reservationAddServiceModel) throws ParseException;
}
