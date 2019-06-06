package ml.farmaciaalquimia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ml.farmaciaalquimia.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
