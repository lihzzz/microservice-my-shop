package com.davin.myshop.service.user.api;

import com.davin.myshop.commons.domain.TbUser;

import java.util.List;

public interface TbUserService {
    List<TbUser> selectAll();
}
