package com.June_15.June_SQL_CRUD.service;


import com.June_15.June_SQL_CRUD.model.userModel;

import java.util.List;

public interface userService {
    userModel save(userModel user);
    userModel fetchUser(int id);
    List<userModel> fetchAllUser();
    boolean delete(int id);

}
