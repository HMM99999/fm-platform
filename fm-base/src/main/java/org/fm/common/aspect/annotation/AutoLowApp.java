package org.fm.common.aspect.annotation;

import java.lang.annotation.*;

import org.fm.common.constant.enums.LowAppAopEnum;

/**
 * 自动注入low_app_id
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoLowApp {

	/**
	 * 切面类型（add、delete、db_import等其他操作）
	 *
	 * @return
	 */
	LowAppAopEnum action();

	/**
	 * 业务类型（cgform等）
	 *
	 * @return
	 */
	String bizType();

}
