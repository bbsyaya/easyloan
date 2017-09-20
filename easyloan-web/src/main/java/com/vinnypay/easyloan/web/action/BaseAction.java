package com.vinnypay.easyloan.web.action;

import com.vinnypay.easyloan.utils.CommonValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * <p>控制器基类</p>
 *
 * @author Vinny
 * @version $Id: BaseAction, v1.0 2017/9/7 21:00 Vinny Exp $
 */
public class BaseAction {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Resource(name = "commonValidator")
    protected CommonValidator commonValidator;

}
