package org.fm.common.system.base.service.impl;

import org.fm.common.system.base.entity.JeecgEntity;
import org.fm.common.system.base.service.JeecgService;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description: ServiceImpl基类
 */
@Slf4j
public class JeecgServiceImpl<M extends BaseMapper<T>, T extends JeecgEntity> extends ServiceImpl<M, T> implements JeecgService<T> {

}
