package com.up.yungateway.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

//import org.xxpay.common.util.MyLog;

/**
 * @Description: Zuul过滤器
 * @author dingzhiwei jmdhappy@126.com
 * @date 2017-07-05
 * @version V1.0
 * @Copyright: www.xxpay.org
 */
public class AccessFilter extends ZuulFilter {

//    private static final MyLog _log = MyLog.getLog(ZuulFilter.class);
     private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
    // log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        System.out.println( request.getMethod()+request.getRequestURL().toString());
        Object accessToken = request.getParameter("accessToken");
        /*if(accessToken == null) {
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }*/
        return null;
    }

}
