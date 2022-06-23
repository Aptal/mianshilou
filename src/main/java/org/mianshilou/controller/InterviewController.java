package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.InterviewMapper;
import org.mianshilou.pojo.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class InterviewController {
    @Autowired
    InterviewMapper interviewMapper;

    private Gson gson =new Gson();

    @GetMapping("/interview/select")
    public String getUserinfo() {
        List<Interview> interviews = interviewMapper.selectList(null);
        return gson.toJson(interviews);
    }

    @PostMapping("/interview/insert")
    public void addUserinfo(@RequestBody Interview interview) {
        interviewMapper.insert(interview);
    }

    @PostMapping("/interview/delete")
    public void removeUserinfo(@RequestBody Interview interview) {
        interviewMapper.deleteById(interview);
    }

    @PostMapping("/interview/update")
    public void updateUserinfo(@RequestBody Interview interview) {
        interviewMapper.updateById(interview);
    }

}
