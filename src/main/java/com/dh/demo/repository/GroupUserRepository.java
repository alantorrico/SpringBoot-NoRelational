package com.dh.demo.repository;

import com.dh.demo.domain.GroupUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alan on 17/06/2017.
 */
public interface GroupUserRepository extends JpaRepository<GroupUser, Long> {
}
