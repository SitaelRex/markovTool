package com.sitael.markovTool.repository;

import com.sitael.markovTool.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
