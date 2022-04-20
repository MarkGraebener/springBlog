package com.springblog.springblog.repositories;

import com.springblog.springblog.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long>
{

}
