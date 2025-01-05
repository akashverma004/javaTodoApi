package com.akash.restApi.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.restApi.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
