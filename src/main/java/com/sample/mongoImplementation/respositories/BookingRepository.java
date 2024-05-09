package com.sample.mongoImplementation.respositories;

import com.sample.mongoImplementation.entities.BookingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookingRepository extends MongoRepository<BookingEntity, String> {
    List<BookingEntity> getBookingEntitiesByUserId(String userId);

    List<BookingEntity> getBookingEntitiesByUserUserName(String userName);
}
