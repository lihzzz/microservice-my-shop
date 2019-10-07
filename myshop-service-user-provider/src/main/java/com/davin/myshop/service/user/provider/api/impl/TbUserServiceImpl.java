package com.davin.myshop.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.davin.myshop.commons.domain.TbUser;
import com.davin.myshop.commons.mapper.TbUserMapper;
import com.davin.myshop.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(version = "${services.versions.user.v1}")
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> selectAll() {
        return tbUserMapper.selectAll();
    }
}
