package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.CmtMapper;
import org.mianshilou.pojo.Cmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class CmtController {

    @Autowired
    CmtMapper cmtMapper;

    private Gson gson =new Gson();

    @GetMapping("/cmt/select")
    public String getUserinfo() {
        List<Cmt> cmts = cmtMapper.selectList(null);
        return gson.toJson(cmts);
    }

    @PostMapping("/cmt/insert")
    public void addUserinfo(@RequestBody Cmt cmt) {
        cmtMapper.insert(cmt);
    }

    @PostMapping("/cmt/delete")
    public void removeUserinfo(@RequestBody Cmt cmt) {
        cmtMapper.deleteById(cmt);
    }

    @PostMapping("/cmt/update")
    public void updateUserinfo(@RequestBody Cmt cmt) {
        cmtMapper.updateById(cmt);
    }

}
