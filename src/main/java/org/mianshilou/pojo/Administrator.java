package org.mianshilou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Administrator {
    @TableId
    private String administratorId;
    private String administratorMail;
    private String administratorName;
    private String phoneNumber;
}
