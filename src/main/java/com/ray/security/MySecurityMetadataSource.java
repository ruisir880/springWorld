package com.ray.security;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Ray Rui on 4/17/2017.
 */
public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    // ??
    private static HashMap<String, Collection<ConfigAttribute>> requestMap;//new HashMap<RequestMatcher, Collection<ConfigAttribute>>();
    // ?? ROLE_USER,ROLE_ADMIN
    private static Collection<ConfigAttribute> allAuthAttribute;// = new HashSet<ConfigAttribute>();

    /**
     * ?????????????
     * @return ??????????list
     */
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        // ????????
        final HttpServletRequest request = ((FilterInvocation) object).getRequest();
        // ????Map ??????????,???????????
        if(requestMap == null){
            initResources();
        }
        String uri = request.getRequestURI();
        String url = request.getRequestURL().toString();
        String servleturl = request.getServletPath();
        return requestMap.get(servleturl);
    }

    /**
     * ????????,???????????????????
     */
    private void initResources() {
        // ???????,??????????
        // ???????

    }

    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    public boolean supports(Class<?> aClass) {
        return true;
    }
}
