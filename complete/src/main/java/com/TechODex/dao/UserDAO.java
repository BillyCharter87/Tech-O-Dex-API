package com.TechODex.dao;

import com.TechODex.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    void findByEIDAndPassword(User user);
}
