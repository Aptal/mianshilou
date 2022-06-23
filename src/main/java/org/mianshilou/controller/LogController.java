package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.LogMapper;
import org.mianshilou.pojo.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class LogController {

    @Autowired
    LogMapper logMapper;

    private Gson gson =new Gson();

    @GetMapping("/log/select")
    public String getUserinfo() {
        List<Log> logs = logMapper.selectList(null);
        return gson.toJson(logs);
    }

    @PostMapping("/log/insert")
    public void addUserinfo(@RequestBody Log log) {
        logMapper.insert(log);
    }

    @PostMapping("/log/delete")
    public void removeUserinfo(@RequestBody Log log) {
        logMapper.deleteById(log);
    }

    @PostMapping("/log/update")
    public void updateUserinfo(@RequestBody Log log) {
        logMapper.updateById(log);
    }

}
