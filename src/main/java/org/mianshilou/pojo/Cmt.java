package org.mianshilou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Cmt {
    @TableId
    private String cmtId;
    private String questionId;
    private String userId;
    private String cmtContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cmtTime;

    private int respondCnt;
    private int cmtLikeCnt;
    private int cmtFCnt;
}
