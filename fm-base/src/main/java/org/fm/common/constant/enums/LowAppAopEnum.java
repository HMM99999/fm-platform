package org.fm.common.constant.enums;

/**
 * LowApp 切面注解枚举
 */
public enum LowAppAopEnum {

    /**
     * 新增方法
     */
    ADD,
    /**
     * 删除方法（包含单个和批量删除）
     */
    DELETE,
    /** 复制表单操作 */
    COPY,

    /**
     * Online表单专用：数据库表转Online表单
     */
    CGFORM_DB_IMPORT
}
