package com.example.shoppingWebApplication.DAO;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.shoppingWebApplication.Model.userModel;

public interface StandardUserDAO extends JpaRepositoryImplementation<userModel, Integer>{

}
