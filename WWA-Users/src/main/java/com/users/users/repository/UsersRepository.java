package com.users.users.repository;
import org.springframework.data.repository.CrudRepository;
import com.users.users.model.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}

