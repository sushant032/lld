package com.compaloon.parkinglot.service;

import com.compaloon.parkinglot.model.ReservationResponse;
import org.springframework.stereotype.Component;

@Component
public class ReservationService {
    public ReservationResponse reserveParkingLot(){
        return new ReservationResponse();
    }
}
