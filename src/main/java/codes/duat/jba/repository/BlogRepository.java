package codes.duat.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.duat.jba.entity.Blog;
import codes.duat.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
