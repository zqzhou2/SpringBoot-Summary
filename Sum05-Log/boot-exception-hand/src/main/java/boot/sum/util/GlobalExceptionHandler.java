package boot.sum.util;

import boot.sum.dto.BizException;
import boot.sum.dto.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zqzhou2 on 2017/6/7.
 */

/**
 * 全局的统一异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    static final String DEFAULT_ERROR_VIEW = "error";

    /**
     * 针对Exception异常，跳转错误页面
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultHand(HttpServletRequest request, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", request.getRequestURL());
        modelAndView.setViewName(DEFAULT_ERROR_VIEW);
        return modelAndView;
    }

    /**
     * 针对BizException异常，返回错误json
     * @param request
     * @param be
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public Result<String> bizHand(HttpServletRequest request, BizException be) {
        Result<String> result = new Result<String>();
        result.setCode("-1");
        result.setData("error data by " + request.getRequestURL());
        result.setFlag(false);
        return result;
    }
}
