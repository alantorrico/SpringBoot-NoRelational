package com.dh.demo.web;

import com.dh.demo.domain.Group;
import com.dh.demo.domain.GroupUser;
import com.dh.demo.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Alan on 17/06/2017.
 */
@RestController
@RequestMapping("/userGroups")
public class UserGroupController {

    @Autowired
    private GroupUserService groupUserService;

    @RequestMapping(method = RequestMethod.GET)
    public List<GroupUser> getAllGroupUser(){
        return groupUserService.getAllGroupUser();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewGroupUser(@RequestBody GroupUserRequestDTO newGroupUser){
        groupUserService.addNewGroupUser(newGroupUser);
    }

    public static class GroupUserRequestDTO{
        private long groupId;
        private long userId;

        public long getGroupId() {
            return groupId;
        }

        public void setGroupId(long groupId) {
            this.groupId = groupId;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }
    }
}
