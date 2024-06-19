package com.June_15.June_SQL_CRUD.service;

import com.June_15.June_SQL_CRUD.model.userModel;
import com.June_15.June_SQL_CRUD.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class userServiceImpl implements userService {

    @Autowired
    userRepository user_Repository;

    @Override
    public userModel save(userModel user) {
        return user_Repository.save(user);
    }

    @Override
    public userModel fetchUser(int id) {
        Optional<userModel> user = user_Repository.findById(id);
        return null;
    }

    @Override
    public List<userModel> fetchAllUser() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
