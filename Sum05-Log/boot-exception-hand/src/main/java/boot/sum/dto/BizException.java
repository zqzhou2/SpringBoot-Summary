package boot.sum.dto;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
public class BizException extends Exception {

    private String code;

    private String result;

    public BizException(String message) {
        super(message);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
