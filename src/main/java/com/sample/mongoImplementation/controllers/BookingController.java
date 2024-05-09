package com.sample.mongoImplementation.controllers;

import com.sample.mongoImplementation.entities.BookingEntity;
import com.sample.mongoImplementation.entities.UserEntity;
import com.sample.mongoImplementation.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<BookingEntity> getUsers() {
        return bookingService.getBookings();
    }

    @PostMapping
    public boolean createBooking(@RequestBody BookingEntity booking) {
        return bookingService.addBooking(booking);
    }
}
