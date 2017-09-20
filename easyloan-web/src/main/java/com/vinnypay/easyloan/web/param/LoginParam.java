package com.vinnypay.easyloan.web.param;

import com.vinnypay.easyloan.constants.RegexRule;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <p>登录请求参数</p>
 *
 * @author Vinny
 * @version $Id: LoginParam, v1.0 2017/9/7 17:08 Vinny Exp $
 */
public class LoginParam implements Serializable {

    /**
     * 手机号码
     */
    @NotBlank(message = "手机号码不能为空")
    @Pattern(regexp = RegexRule.MOBLIE, message = "手机号码格式不正确")
    private String mobileNo;

    /**
     * 登录密码
     */
    @NotBlank(message = "登录密码不能为空")
    private String password;

    /**
     * 图片验证码
     */
    @NotBlank(message = "图形验证码不能为空")
    private String pictureCode;

    /**
     * 机器序列号
     */
    @NotBlank(message = "机器序列号不能为空")
    private String machineNo;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPictureCode() {
        return pictureCode;
    }

    public void setPictureCode(String pictureCode) {
        this.pictureCode = pictureCode;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
