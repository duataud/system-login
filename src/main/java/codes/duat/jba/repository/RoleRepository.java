package codes.duat.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.duat.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
