package com.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampleproject.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
