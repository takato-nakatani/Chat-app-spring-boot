package com.spring.tktapp.repositories;

import com.spring.tktapp.entity.MLoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MLoginUser, String> {

    public MLoginUser findByMailAddress(String mailAddress);
}
