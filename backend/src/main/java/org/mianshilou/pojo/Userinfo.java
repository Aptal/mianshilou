package org.mianshilou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Userinfo {
    // 用户信息表
    @TableId
    // TableId解决Mybatis中deleteById与updateById访问错误
    private String UserId;
    private String UserImg;
    private String Nickname;
    private String Gender;
    private String Email;
    private String Birthday;
    private String Intro;
    private int Integral;
    private String Regtime;
}
