package com.dennis.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dennis.entity.User;

public interface UserDetailsRepository extends CrudRepository<User, Long>{

}
