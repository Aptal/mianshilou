package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.QuestionMapper;
import org.mianshilou.pojo.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class QuestionController {
    @Autowired
    QuestionMapper questionMapper;

    private Gson gson =new Gson();

    @GetMapping("/question/select")
    public String getUserinfo() {
        List<Question> questions = questionMapper.selectList(null);
        return gson.toJson(questions);
    }

    @PostMapping("/question/insert")
    public void addUserinfo(@RequestBody Question question) {
        questionMapper.insert(question);
    }

    @PostMapping("/question/delete")
    public void removeUserinfo(@RequestBody Question question) {
        questionMapper.deleteById(question);
    }

    @PostMapping("/question/update")
    public void updateUserinfo(@RequestBody Question question) {
        questionMapper.updateById(question);
    }

}
