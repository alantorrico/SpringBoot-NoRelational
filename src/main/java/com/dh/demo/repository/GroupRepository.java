package com.dh.demo.repository;

import com.dh.demo.domain.Group;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Alan on 17/06/2017.
 */
public interface GroupRepository extends CrudRepository<Group, Long> {//CrudRepository Devuelve un Iterable

}
