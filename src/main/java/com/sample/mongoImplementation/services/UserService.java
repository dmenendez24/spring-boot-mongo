package com.sample.mongoImplementation.services;

import com.sample.mongoImplementation.entities.BookingEntity;
import com.sample.mongoImplementation.entities.UserEntity;
import com.sample.mongoImplementation.models.UserModel;
import com.sample.mongoImplementation.respositories.BookingRepository;
import com.sample.mongoImplementation.respositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserModel> getUsers() {
        List<UserEntity> users = this.userRepository.findAll();
        for(UserEntity user : users) {
            user.setBookings(bookingRepository.getBookingEntitiesByUserId(user.getId()));
        }

        return users.stream().map(user -> this.modelMapper.map(user, UserModel.class)).toList();
    }

    public boolean addUser(UserEntity user) {
        return this.userRepository.save(user) != null;
    }
}
