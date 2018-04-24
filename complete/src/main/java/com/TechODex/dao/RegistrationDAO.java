package com.TechODex.dao;

        import com.TechODex.model.Registration;
        import org.springframework.stereotype.Repository;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.util.List;

@Repository
public interface RegistrationDAO extends JpaRepository<Registration, Long> {
        List<Registration> findByTech(String tech);
}

