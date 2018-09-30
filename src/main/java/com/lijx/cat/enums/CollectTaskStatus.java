package com.lijx.cat.enums;

/**
 *
 * @author cyuan
 * @date 2018/9/21
 */
public enum CollectTaskStatus {
    UNOPEND_TASK("未分配任务"),
    TASK_IN_PROGRESS("任务中"),
    TASK_FINISHED("任务结束"),
    TASK_POSTPONE("延期还款");

    private String desc;

    private CollectTaskStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
