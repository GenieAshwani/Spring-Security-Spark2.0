package com.genie.SSP03_DataBase.repo;

import com.genie.SSP03_DataBase.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepo extends JpaRepository<UserEntity,String> {

   Optional<UserEntity> findByEmail(String email);
}
