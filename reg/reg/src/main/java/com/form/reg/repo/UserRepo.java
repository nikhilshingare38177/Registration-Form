package com.form.reg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.reg.entity.UserDtls;

public interface UserRepo extends JpaRepository<UserDtls, Integer> {

}
