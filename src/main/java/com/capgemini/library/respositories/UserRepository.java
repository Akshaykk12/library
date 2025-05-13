package com.capgemini.library.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.library.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
