package org.AutomaticSchedulingSystem.repository;

import org.AutomaticSchedulingSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
    User findBySurname(String surname);
}
