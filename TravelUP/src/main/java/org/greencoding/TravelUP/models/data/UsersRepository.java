package org.greencoding.TravelUP.models.data;


import org.greencoding.TravelUP.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
