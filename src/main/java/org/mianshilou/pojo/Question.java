package org.mianshilou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Question {
    @TableId
    private String questionId;
    private String questionType;
    private String questionTag;
    private String questionContent;
    private String questionAnswer;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date questionLastTime;

    private int questionValue;
    private int qCmtsCnt;
    private int qLikeCnt;
    private int qFCnt;
}
