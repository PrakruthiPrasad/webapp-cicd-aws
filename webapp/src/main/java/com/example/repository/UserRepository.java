package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	UserEntity findByUserName(String username);
	//List<UserEntity> findByUsername(String username);
	//UserEntity findByUserPassword(String password);
	
}
