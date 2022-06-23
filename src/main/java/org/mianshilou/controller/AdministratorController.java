package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.AdministratorMapper;
import org.mianshilou.pojo.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class AdministratorController {
    @Autowired
    AdministratorMapper administratorMapper;

    private Gson gson =new Gson();

    @GetMapping("/administrator/select")
    public String getUserinfo() {
        List<Administrator> administrators = administratorMapper.selectList(null);
        return gson.toJson(administrators);
    }

    @PostMapping("/administrator/insert")
    public void addUserinfo(@RequestBody Administrator administrator) {
        administratorMapper.insert(administrator);
    }

    @PostMapping("/administrator/delete")
    public void removeUserinfo(@RequestBody Administrator administrator) {
        administratorMapper.deleteById(administrator);
    }

    @PostMapping("/administrator/update")
    public void updateUserinfo(@RequestBody Administrator administrator) {
        administratorMapper.updateById(administrator);
    }

}
