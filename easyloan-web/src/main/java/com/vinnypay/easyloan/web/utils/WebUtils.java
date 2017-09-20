package com.vinnypay.easyloan.web.utils;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class WebUtils {
	public static final String XML_HTTP_REQUEST[] = { "XMLHttpRequest" };
	public static final String REQUEST_AJAX_HEADER = "X-Requested-With";
	
	private static final String[] HEADERS_TO_TRY = {
		    "Cdn-Src-Ip",
		    "X-Forwarded-For",
		    "Proxy-Client-IP",
		    "WL-Proxy-Client-IP",
		    "HTTP_X_FORWARDED_FOR",
		    "HTTP_X_FORWARDED",
		    "HTTP_X_CLUSTER_CLIENT_IP",
		    "HTTP_CLIENT_IP",
		    "HTTP_FORWARDED_FOR",
		    "HTTP_FORWARDED",
		    "HTTP_VIA",
		    "REMOTE_ADDR"
	};
	
	protected static Logger logger = LoggerFactory.getLogger(WebUtils.class);

	public static String getClientIpAddress(HttpServletRequest request) {
	    for (String header : HEADERS_TO_TRY) {
	        String ip = request.getHeader(header);
	        if (StringUtils.isNotBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
	            return ip;
	        }
	    }
	    return request.getRemoteAddr();
	}
}
