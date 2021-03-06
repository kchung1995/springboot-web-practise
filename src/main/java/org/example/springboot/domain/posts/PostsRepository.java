package org.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();


    @Query("SELECT p FROM Posts p WHERE p.id = :postId AND p.author = :creatorName ORDER BY p.id DESC")
    List<Posts> findAllDesc(@Param("postId") Long postId, @Param("creatorName") String creatorName);
}
