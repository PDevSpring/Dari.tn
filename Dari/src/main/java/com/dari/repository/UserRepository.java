package com.dari.repository;

import org.springframework.data.repository.CrudRepository;

import com.dari.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
