package com.dh.demo.web;

import com.dh.demo.domain.Group;
import com.dh.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Alan on 17/06/2017.
 */
@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Group> getAllGroup(){
        return groupService.getAllGroup();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewGroup(@RequestBody GroupRequestDTO newGroup){
        groupService.addGroup(newGroup);
    }


    public static class GroupRequestDTO{

        private long ownerId;
        private String name;
        private String logo;

        public long getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(long ownerId) {
            this.ownerId = ownerId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }
    }
}
