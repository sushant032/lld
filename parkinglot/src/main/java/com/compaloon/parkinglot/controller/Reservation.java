package com.compaloon.parkinglot.controller;

import com.compaloon.parkinglot.model.ReservationResponse;
import com.compaloon.parkinglot.service.ReservationService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.http.HttpRequest;

@RestController
@Slf4j
@RequestMapping("/reservation")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Reservation {

    @Autowired private ReservationService reservationService;

    @PostMapping("/reserve")
    public ReservationResponse reserve(HttpRequest request, JsonNode data){
        log.info("Entering into Reservation::reserve");
        ReservationResponse reservationResponse = reservationService.reserveParkingLot();
        log.info("Exiting from Reservation::reserve");
        return reservationResponse;
    }
}
