package com.leyou.item.common.result;

import com.leyou.item.common.enums.ExceptionEnum;
import lombok.Data;

@Data
public class ExceptionResult {
    // 状态码
    private int status;
    // 错误信息
    private String message;
    // 时间戳
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
