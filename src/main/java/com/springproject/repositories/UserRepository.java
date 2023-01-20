package com.springproject.repositories;

import com.springproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Allowing the search and capture of an individual user by username.
    //User findByUsername(String Username);
}
