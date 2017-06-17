package com.dh.demo.service;

import com.dh.demo.domain.Group;
import com.dh.demo.domain.User;
import com.dh.demo.repository.GroupRepository;
import com.dh.demo.repository.UserRepository;
import com.dh.demo.web.GroupController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Alan on 17/06/2017.
 */

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Group> getAllGroup(){
        return (List<Group>) groupRepository.findAll();//Ver patron(Singlenton) Iterable Pattern
    }

    public void addGroup(GroupController.GroupRequestDTO group){
        Group newGroup = new Group();

        newGroup.setName(group.getName());
        newGroup.setLogo(group.getLogo());
        newGroup.setCreation_date(new Date());

        User user = userRepository.findOne(group.getOwnerId());
        newGroup.setOwner(user);

        groupRepository.save(newGroup);
    }
}
