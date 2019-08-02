package com.tedu.sp11;

import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by Administrator on 2019/8/1.
 */
public interface FallbackProvider {
    String getRoute();
    ClientHttpResponse fallbackResponse(String route,Throwable cause);
}
