package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.PermissionMapper;
import org.mianshilou.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class PermissionController {
    @Autowired
    PermissionMapper permissionMapper;

    private Gson gson =new Gson();

    @GetMapping("/permission/select")
    public String getUserinfo() {
        List<Permission> permissions = permissionMapper.selectList(null);
        return gson.toJson(permissions);
    }

    @PostMapping("/permission/insert")
    public void addUserinfo(@RequestBody Permission permission) {
        permissionMapper.insert(permission);
    }

    @PostMapping("/permission/delete")
    public void removeUserinfo(@RequestBody Permission permission) {
        permissionMapper.deleteById(permission);
    }

    @PostMapping("/permission/update")
    public void updateUserinfo(@RequestBody Permission permission) {
        permissionMapper.updateById(permission);
    }

}
