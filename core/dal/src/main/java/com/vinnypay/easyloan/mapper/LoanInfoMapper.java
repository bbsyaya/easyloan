package com.vinnypay.easyloan.mapper;

import com.vinnypay.easyloan.dataobject.LoanInfoDO;
import com.vinnypay.easyloan.domain.QueryPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoanInfoMapper {
    int deleteByPrimaryKey(String cloanNo);

    int insert(LoanInfoDO record);

    int insertSelective(LoanInfoDO record);

    LoanInfoDO selectByPrimaryKey(String cloanNo);

    int updateByPrimaryKeySelective(LoanInfoDO record);

    int updateByPrimaryKey(LoanInfoDO record);

    List<LoanInfoDO> selectByPage(@Param("queryPage") QueryPage queryPage, @Param("status") String status);

    int count(String status);
}