package com.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
