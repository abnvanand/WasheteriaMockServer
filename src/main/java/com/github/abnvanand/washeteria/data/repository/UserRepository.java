package com.github.abnvanand.washeteria.data.repository;

import com.github.abnvanand.washeteria.data.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {

}
