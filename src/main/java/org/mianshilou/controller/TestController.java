package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.TestMapper;
import org.mianshilou.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class TestController {
    @Autowired
    TestMapper testMapper;

    private Gson gson =new Gson();

    @GetMapping("/test/select")
    public String getUserinfo() {
        List<Test> tests = testMapper.selectList(null);
        return gson.toJson(tests);
    }

    @PostMapping("/test/insert")
    public void addUserinfo(@RequestBody Test test) {
        testMapper.insert(test);
    }

    @PostMapping("/test/delete")
    public void removeUserinfo(@RequestBody Test test) {
        testMapper.deleteById(test);
    }

    @PostMapping("/test/update")
    public void updateUserinfo(@RequestBody Test test) {
        testMapper.updateById(test);
    }

}
