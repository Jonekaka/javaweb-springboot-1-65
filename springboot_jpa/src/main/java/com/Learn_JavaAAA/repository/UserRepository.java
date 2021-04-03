package com.learnCCC.repository;

import com.learnCCC.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{

    public List<User> findAll();

}
