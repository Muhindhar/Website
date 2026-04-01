package com.kiot.javaselinium.selenium_basics.repo.api.impl;


import com.kiot.javaselinium.selenium_basics.repo.api.UmsUserRepository;
import cn.org.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;
import com.kiot.javaselinium.selenium_basics.domain.UmsUser;
import com.kiot.javaselinium.selenium_basics.repo.mapper.UmsUserMapper;

/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserRepositoryImpl extends BaseRepositoryImpl<UmsUserMapper, UmsUser> implements UmsUserRepository {

}
