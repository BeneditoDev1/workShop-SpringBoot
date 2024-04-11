package combeneditodev1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import combeneditodev1.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
