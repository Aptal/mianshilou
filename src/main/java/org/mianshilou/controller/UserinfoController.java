package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.UserinfoMapper;
import org.mianshilou.pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class UserinfoController {
    @Autowired
    UserinfoMapper userinfoMapper;

    private Gson gson =new Gson();

    @GetMapping("/userinfo")
    public String getUserinfo() {
        List<Userinfo> userinfos = userinfoMapper.selectList(null);
        return gson.toJson(userinfos);
    }

    @PostMapping("/insert")
    public void addUserinfo(@RequestBody Userinfo userinfo) {
        userinfoMapper.insert(userinfo);
    }

    @PostMapping("/delete")
    public void removeUserinfo(@RequestBody Userinfo userinfo) {
        userinfoMapper.deleteById(userinfo);
    }

    @PostMapping("/update")
    public void updateUserinfo(@RequestBody Userinfo userinfo) {
        userinfoMapper.updateById(userinfo);
    }

}
