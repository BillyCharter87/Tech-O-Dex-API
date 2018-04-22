package com.TechODex.dao;

import com.TechODex.model.Greeting;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GreetingDAO extends JpaRepository<Greeting, Long> {}
