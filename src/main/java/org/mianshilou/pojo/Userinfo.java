package org.mianshilou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Userinfo {
    // 用户信息表
    @TableId
    // TableId解决Mybatis中deleteById与updateById访问错误
    private String userId;
    private String userImg;
    private String nickname;
    private String gender;
    private String email;
    private String birthday;
    private String intro;
    private int integral;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date regtime;
}
