package org.greencoding.TravelUP.models.data;

import org.greencoding.TravelUP.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository

@Service

public interface UserRepository extends CrudRepository<User, Long> {


    User findByUsername(String username);
}
