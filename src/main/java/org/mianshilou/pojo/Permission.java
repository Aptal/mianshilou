package org.mianshilou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Permission {
    @TableId
    private String userId;
    private String permissionLevel;
}
