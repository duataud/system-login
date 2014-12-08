package codes.duat.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.duat.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);


}
