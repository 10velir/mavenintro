package com.itacademy.database.DAO;

import com.itacademy.database.entities.Car;

import java.sql.SQLException;

public interface CarDao extends DAO<Car>{
    Car getByModel(String model) throws SQLException;
}
