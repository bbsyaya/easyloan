package com.vinnypay.easyloan.mapper;

import com.vinnypay.easyloan.dataobject.BannerDO;
import com.vinnypay.easyloan.domain.QueryPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerMapper {
    int deleteByPrimaryKey(String bannerId);

    int insert(BannerDO record);

    int insertSelective(BannerDO record);

    BannerDO selectByPrimaryKey(String bannerId);

    int updateByPrimaryKeySelective(BannerDO record);

    int updateByPrimaryKey(BannerDO record);

    List<BannerDO> selectBannerList(@Param("queryPage") QueryPage queryPage, @Param("bannerState") String bannerState);

    int count(String bannerState);
}