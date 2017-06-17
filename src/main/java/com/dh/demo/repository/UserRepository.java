package com.dh.demo.repository;

import com.dh.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alan on 17/06/2017.
 */
public interface UserRepository extends JpaRepository<User, Long>{ //CrudRepository<User, Long> JPARepository(Devuelve una lista directamente)

}
