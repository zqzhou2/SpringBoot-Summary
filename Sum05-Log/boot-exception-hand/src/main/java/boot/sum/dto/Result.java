package boot.sum.dto;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
public class Result<T> {
    private String code;
    private boolean flag;
    T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
