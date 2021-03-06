package org.thframework.dto;

/**
 *
 */
public class ResultInfo<T> {

    // 成功标记
    private boolean success;

    // 提示信息
    private String msg;

    // 异常堆栈
    private String stackTrace;

    // 错误码
    private int errorCode;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {

        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {

        this.msg = msg;
    }

    /**
     * 获取 stackTrace
     * @return 返回 stackTrace
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * 设置 stackTrace
     * @param
     */
    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {

        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <E> ResultInfo<E> buildSuccessResultInfo() {
        ResultInfo<E> resultInfo = new ResultInfo<E>();
        resultInfo.setSuccess(true);
//        resultInfo.setErrorCode(CommonExceptionCode.SUCCESS.getErrorCode());
//        resultInfo.setMsg(CommonExceptionCode.SUCCESS.getErrorMsg());
        return resultInfo;
    }

    public static <E> ResultInfo<E> buildSuccessResultInfo(E data) {
        ResultInfo<E> resultInfo = new ResultInfo<E>();
        resultInfo.setSuccess(true);
//        resultInfo.setErrorCode(CommonExceptionCode.SUCCESS.getErrorCode());
//        resultInfo.setMsg(CommonExceptionCode.SUCCESS.getErrorMsg());
        resultInfo.setData(data);
        return resultInfo;
    }

    public static <E> ResultInfo<E> buildFailureResultInfo(int errorCode, String errorMsg) {
        ResultInfo<E> resultInfo = new ResultInfo<E>();
        resultInfo.setSuccess(false);
        resultInfo.setErrorCode(errorCode);
        resultInfo.setMsg(errorMsg);
        return resultInfo;
    }

    public static <E> ResultInfo<E> buildFailureResultInfo(E data, int errorCode, String errorMsg) {
        ResultInfo<E> resultInfo = new ResultInfo<E>();
        resultInfo.setSuccess(false);
        resultInfo.setErrorCode(errorCode);
        resultInfo.setMsg(errorMsg);
        resultInfo.setData(data);
        return resultInfo;
    }

}
