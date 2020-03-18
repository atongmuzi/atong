package httpInterface.complaint;
public enum ErrorCode {
    SUCCESS(0, "成功");
    private  int errorNo;
    private String errorMsg;
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


    public int getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(int errorNo) {
        this.errorNo = errorNo;
    }

    ErrorCode(int errorNo, String errorMsg) {
        this.errorNo = errorNo;
        this.errorMsg = errorMsg;
    }

    ErrorCode() {
        this.errorNo = 100;
        this.errorMsg = "未知错误";
    }



}

