package com.dh.demo.service;

import com.dh.demo.domain.Group;
import com.dh.demo.domain.GroupUser;
import com.dh.demo.domain.User;
import com.dh.demo.repository.GroupRepository;
import com.dh.demo.repository.GroupUserRepository;
import com.dh.demo.repository.UserRepository;
import com.dh.demo.web.UserGroupController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alan on 17/06/2017.
 */
@Service
public class GroupUserService {

    @Autowired
    private GroupUserRepository groupUserRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GroupRepository groupRepository;

    public List<GroupUser> getAllGroupUser(){
        return groupUserRepository.findAll();
    }

    public void addNewGroupUser(UserGroupController.GroupUserRequestDTO groupUser){
        GroupUser newGroupUser = new GroupUser();
        User user = userRepository.findOne(groupUser.getUserId());
        Group group = groupRepository.findOne(groupUser.getGroupId());

        newGroupUser.setGroup(group);
        newGroupUser.setUser(user);

        groupUserRepository.save(newGroupUser);
    }
}
