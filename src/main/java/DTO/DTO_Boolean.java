package DTO;

import java.util.Objects;

public class DTO_Boolean {
    private boolean result;
    private String msg;

    public DTO_Boolean(boolean result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public boolean isResult() {
        return result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO_Boolean)) return false;
        DTO_Boolean that = (DTO_Boolean) o;
        return result == that.result &&
                Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, msg);
    }
}
