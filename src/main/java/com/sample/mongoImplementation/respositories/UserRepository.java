package com.sample.mongoImplementation.respositories;

import com.sample.mongoImplementation.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
