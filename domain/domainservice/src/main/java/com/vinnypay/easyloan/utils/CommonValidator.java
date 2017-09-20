package com.vinnypay.easyloan.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CommonValidator, v1.0 2017/9/7 20:38 Vinny Exp $
 */
@Component("commonValidator")
public class CommonValidator {

    @Resource(name = "validator")
    private ValidatorFactory validatorFactory;

    /**
     * 验证一个对象的字段值
     * @param o 模板对象
     * @param <T> 模板
     * @return
     */
    public <T> String validate(T o) {
        Set<ConstraintViolation<T>> validations = validatorFactory.getValidator().validate(o);
        if (validations != null && validations.size() > 0) {
            ConstraintViolation<T> constraintViolation = validations.iterator().next();
            return constraintViolation.getMessage();
        }

        return null;

    }

    /**
     * 验证一个对象的字段值,失败抛出异常
     * @param o 验证对象
     */
    public void validateWithException(Object o) {
        String msg = validate(o);

        if (StringUtils.isNotBlank(msg)) {
            throw new IllegalArgumentException(msg);
        }

    }

}
