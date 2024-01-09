package org.greencoding.TravelUP.models.data;


import org.greencoding.TravelUP.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAll();
}
