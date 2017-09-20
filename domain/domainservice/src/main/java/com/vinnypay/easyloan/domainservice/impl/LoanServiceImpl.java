package com.vinnypay.easyloan.domainservice.impl;

import com.vinnypay.easyloan.convert.DOConvert;
import com.vinnypay.easyloan.convert.DomainConvert;
import com.vinnypay.easyloan.dataobject.LoanInfoDO;
import com.vinnypay.easyloan.domain.ApplyInfo;
import com.vinnypay.easyloan.domain.LoanStepInfo;
import com.vinnypay.easyloan.domain.QueryPage;
import com.vinnypay.easyloan.domainservice.LoanService;
import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.enums.Status;
import com.vinnypay.easyloan.mapper.LoanInfoMapper;
import com.vinnypay.easyloan.result.ApplyResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.LoanResult;
import com.vinnypay.easyloan.result.LoanStepResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoanServiceImpl, v1.0 2017/9/11 19:34 Vinny Exp $
 */
@Service("loanService")
public class LoanServiceImpl implements LoanService {

    @Resource(name = "loanInfoMapper")
    private LoanInfoMapper loanInfoMapper;



//    @Override
//    public LoanResult getLoanList(QueryPage queryPage, String tag) {
//        LoanResult result = new LoanResult();
//        result.setResultCode(ReturnCode.SUCCESS.getCode());
//        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());
//
//        loanInfoMapper.selectByPrimaryKey("123");
//
//        List<LoanInfo> loanList = new ArrayList<>();
//        LoanInfo loanInfo1 = new LoanInfo();
//        loanInfo1.setDescription("超级爆款，最高可借1万元");
//        loanInfo1.setRateRangeMin(new BigDecimal(0.0003));
//        loanInfo1.setDateRangeMin(14);
//        loanInfo1.setDateRange("14-30");
//        loanInfo1.setRateRange("0.03%-0.05%");
//        loanInfo1.setStatus("status ");
//        loanInfo1.setCompany("借钱hi起来");
//        loanInfo1.setDayRate(new BigDecimal(0.0002));
//        loanInfo1.setRemitTime(1);
//        loanInfo1.setCloanTags("hot");
//        loanInfo1.setLoanMin(new BigDecimal(20000));
//        loanInfo1.setApplyCondition("年满18岁");
//        loanInfo1.setCloanName("嗨钱-通过率95%");
//        loanInfo1.setCloanNo("CLO_1501868886673");
//        loanInfo1.setId("600125");
//        loanInfo1.setMonthRate(new BigDecimal(0));
//        loanInfo1.setYearRate(new BigDecimal(0));
//        loanInfo1.setApplyDescription("机器审批;不打审核电话");
//        loanInfo1.setCloanOrder(100);
//        loanInfo1.setDateRangeMax(0);
//        loanInfo1.setH5link("https://m.hicash.cn/newweb/landPage/wtxx.html?mediasource=dywlsm");
//        loanInfo1.setApplyCustomer(67266);
//        loanInfo1.setLoanMax(new BigDecimal(20000));
//        loanInfo1.setLoanRange("1000-20000");
//        loanInfo1.setRateRangeMax(new BigDecimal(0.0005));
//        loanInfo1.setRemark("超级爆款，最高可借1万元");
//        loanInfo1.setRemitUnit("hour");
//        loanInfo1.setCloanLogo("https://www.flashcredit.cn/image/upload/1501395720112_5.pic.jpg");
//
//        LoanInfo loanInfo2 = new LoanInfo();
//        loanInfo2.setDescription("最高8千，3分钟到账");
//        loanInfo2.setRateRangeMin(new BigDecimal(0.0003));
//        loanInfo2.setDateRangeMin(14);
//        loanInfo2.setDateRange("14-30");
//        loanInfo2.setRateRange("0.03%-0.04%");
//        loanInfo2.setStatus("status ");
//        loanInfo2.setCompany("借钱路子多");
//        loanInfo2.setDayRate(new BigDecimal(0.0003));
//        loanInfo2.setRemitTime(1);
//        loanInfo2.setCloanTags("hot");
//        loanInfo2.setLoanMin(new BigDecimal(20000));
//        loanInfo2.setApplyCondition("身份证,手机实名认证");
//        loanInfo2.setCloanName("钱有路");
//        loanInfo2.setCloanNo("CLO_1501868886673");
//        loanInfo2.setId("600143");
//        loanInfo2.setMonthRate(new BigDecimal(0));
//        loanInfo2.setYearRate(new BigDecimal(0));
//        loanInfo2.setApplyDescription("机审+人工审核,最快3分钟放款");
//        loanInfo2.setCloanOrder(100);
//        loanInfo2.setDateRangeMax(0);
//        loanInfo2.setH5link("http://static.namifunds.com/qyl/web/views/invitation.html?iv_code=STP533939&channel=yy-8");
//        loanInfo2.setApplyCustomer(52653);
//        loanInfo2.setLoanMax(new BigDecimal(20000));
//        loanInfo2.setLoanRange("1000-20000");
//        loanInfo2.setRateRangeMax(new BigDecimal(0.0004));
//        loanInfo2.setRemark("小额借贷，额度灵活，最快3分钟到账");
//        loanInfo2.setRemitUnit("minute");
//        loanInfo2.setCloanLogo("https://www.flashcredit.cn/image/upload/1502762472941_qianyoululogo.png");
//
//        loanList.add(loanInfo1);
//        loanList.add(loanInfo2);
//
//        queryPage.setTotalCount(2);
//
//        result.setSuccess(true);
//        result.setQueryPage(queryPage);
//        result.setLoanList(loanList);
//
//        return result;
//    }

    @Override
    public LoanResult getLoanList(QueryPage queryPage, String tag) {
        LoanResult result = new LoanResult();

        int loanCount = loanInfoMapper.count(Status.USABLE.getCode());
        queryPage.setTotalCount(loanCount);
        result.setQueryPage(queryPage);

        if (queryPage.getTotalCount() > 0) {
            List<LoanInfoDO> loanInfoDOS = loanInfoMapper.selectByPage(queryPage, Status.USABLE.getCode());
            result.setLoanList(DomainConvert.convertToLoanInfoList(loanInfoDOS));
        }

        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        return result;



    }

    @Override
    public ApplyResult getApplyList(QueryPage queryPage, String operationType) {
        ApplyResult result = new ApplyResult();
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        ApplyInfo applyInfo = new ApplyInfo();
        applyInfo.setUserId("123465");
        applyInfo.setCreateDate(new Date());
        applyInfo.setDescription("超级爆款，最高可借1万元");
        applyInfo.setRateRangeMin(new BigDecimal(0.0003));
        applyInfo.setDateRangeMin(14);
        applyInfo.setDateRange("14-30");
        applyInfo.setRateRange("0.03%-0.05%");
        applyInfo.setStatus("status ");
        applyInfo.setCompany("借钱hi起来");
        applyInfo.setDayRate(new BigDecimal(0.0002));
        applyInfo.setRemitTime(1);
        applyInfo.setCloanTags("hot");
        applyInfo.setLoanMin(new BigDecimal(20000));
        applyInfo.setApplyCondition("年满18岁");
        applyInfo.setCloanName("嗨钱-通过率95%");
        applyInfo.setCloanNo("CLO_1501868886673");
        applyInfo.setId("600125");
        applyInfo.setMonthRate(new BigDecimal(0));
        applyInfo.setYearRate(new BigDecimal(0));
        applyInfo.setApplyDescription("机器审批;不打审核电话");
        applyInfo.setCloanOrder(100);
        applyInfo.setDateRangeMax(0);
        applyInfo.setH5link("https://m.hicash.cn/newweb/landPage/wtxx.html?mediasource=dywlsm");
        applyInfo.setApplyCustomer(67266);
        applyInfo.setLoanMax(new BigDecimal(20000));
        applyInfo.setLoanRange("1000-20000");
        applyInfo.setRateRangeMax(new BigDecimal(0.0005));
        applyInfo.setRemark("超级爆款，最高可借1万元");
        applyInfo.setRemitUnit("hour");
        applyInfo.setCloanLogo("https://www.flashcredit.cn/image/upload/1501395720112_5.pic.jpg");

        ApplyInfo applyInfo1 = new ApplyInfo();
        applyInfo.setUserId("987654");
        applyInfo.setCreateDate(new Date());
        applyInfo1.setDescription("最高8千，3分钟到账");
        applyInfo1.setRateRangeMin(new BigDecimal(0.0003));
        applyInfo1.setDateRangeMin(14);
        applyInfo1.setDateRange("14-30");
        applyInfo1.setRateRange("0.03%-0.04%");
        applyInfo1.setStatus("status ");
        applyInfo1.setCompany("借钱路子多");
        applyInfo1.setDayRate(new BigDecimal(0.0003));
        applyInfo1.setRemitTime(1);
        applyInfo1.setCloanTags("hot");
        applyInfo1.setLoanMin(new BigDecimal(20000));
        applyInfo1.setApplyCondition("身份证,手机实名认证");
        applyInfo1.setCloanName("钱有路");
        applyInfo1.setCloanNo("CLO_1501868886673");
        applyInfo1.setId("600143");
        applyInfo1.setMonthRate(new BigDecimal(0));
        applyInfo1.setYearRate(new BigDecimal(0));
        applyInfo1.setApplyDescription("机审+人工审核,最快3分钟放款");
        applyInfo1.setCloanOrder(100);
        applyInfo1.setDateRangeMax(0);
        applyInfo1.setH5link("http://static.namifunds.com/qyl/web/views/invitation.html?iv_code=STP533939&channel=yy-8");
        applyInfo1.setApplyCustomer(52653);
        applyInfo1.setLoanMax(new BigDecimal(20000));
        applyInfo1.setLoanRange("1000-20000");
        applyInfo1.setRateRangeMax(new BigDecimal(0.0004));
        applyInfo1.setRemark("小额借贷，额度灵活，最快3分钟到账");
        applyInfo1.setRemitUnit("minute");
        applyInfo1.setCloanLogo("https://www.flashcredit.cn/image/upload/1502762472941_qianyoululogo.png");

        List<ApplyInfo> list = new ArrayList<>();
        list.add(applyInfo);
        list.add(applyInfo1);

        queryPage.setTotalCount(2);

        result.setSuccess(true);
        result.setApplyList(list);
        result.setQueryPage(queryPage);

        return result;
    }

    @Override
    public BaseResult addApply(String cloanNo, String operationType) {
        BaseResult result = new LoanResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());
        return result;
    }

    @Override
    public LoanStepResult getLoanStepList(String cloanNo) {
        LoanStepResult result = new LoanStepResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        LoanStepInfo loanStepInfo1 = new LoanStepInfo();
        loanStepInfo1.setId("800197");
        loanStepInfo1.setStepId("700001");
        loanStepInfo1.setCloanNo(cloanNo);
        loanStepInfo1.setEnStepName("sfrz");
        loanStepInfo1.setStepName("身份检验");
        loanStepInfo1.setStepOrder("1");
        loanStepInfo1.setCreateDate(new Date());

        LoanStepInfo loanStepInfo2 = new LoanStepInfo();
        loanStepInfo2.setId("800198");
        loanStepInfo2.setStepId("7000011");
        loanStepInfo2.setCloanNo(cloanNo);
        loanStepInfo2.setEnStepName("zmsq");
        loanStepInfo2.setStepName("芝麻授权");
        loanStepInfo2.setStepOrder("2");
        loanStepInfo2.setCreateDate(new Date());

        LoanStepInfo loanStepInfo3 = new LoanStepInfo();
        loanStepInfo3.setId("800199");
        loanStepInfo3.setStepId("700008");
        loanStepInfo3.setCloanNo(cloanNo);
        loanStepInfo3.setEnStepName("yhkrz");
        loanStepInfo3.setStepName("银行卡认证");
        loanStepInfo3.setStepOrder("3");
        loanStepInfo3.setCreateDate(new Date());

        List<LoanStepInfo> loanStepInfos = new ArrayList<>();
        loanStepInfos.add(loanStepInfo1);
        loanStepInfos.add(loanStepInfo2);
        loanStepInfos.add(loanStepInfo3);

        result.setLoanStepList(loanStepInfos);
        return result;
    }
}
