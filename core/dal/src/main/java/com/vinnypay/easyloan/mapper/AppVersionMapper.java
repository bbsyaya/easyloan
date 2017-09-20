package com.vinnypay.easyloan.mapper;

import com.vinnypay.easyloan.dataobject.AppVersionDO;

public interface AppVersionMapper {
    int deleteByPrimaryKey(String appName);

    int insert(AppVersionDO record);

    int insertSelective(AppVersionDO record);

    AppVersionDO selectByPrimaryKey(String appName);

    int updateByPrimaryKeySelective(AppVersionDO record);

    int updateByPrimaryKey(AppVersionDO record);
}