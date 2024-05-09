package com.sample.mongoImplementation.services;

import com.sample.mongoImplementation.entities.BookingEntity;
import com.sample.mongoImplementation.respositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public BookingService() {}

    public List<BookingEntity> getBookings() {
        return bookingRepository.findAll();
    }

    public boolean addBooking(BookingEntity booking) {
        return bookingRepository.save(booking) != null;
    }
}
