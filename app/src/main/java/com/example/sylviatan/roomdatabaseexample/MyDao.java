package com.example.sylviatan.roomdatabaseexample;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    void addUser(User user);

    @Query("Select * from user")
    List<User> loadUser();
}
