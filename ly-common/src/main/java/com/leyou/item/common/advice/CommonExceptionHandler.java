package com.leyou.item.common.advice;

import com.leyou.item.common.exception.LyException;
import com.leyou.item.common.result.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResultBean<?> handlerException(RuntimeException e) {
        ResultBean result = new ResultBean();
        if (e instanceof LyException) {
            result.setCode(ResultBean.FAIL);
            result.setMsg(e.getLocalizedMessage());
        } else {
            result.setCode(ResultBean.UN_KNOW_EXCEPTION);
            result.setMsg(e.getMessage());
        }
        return result;
    }
}
