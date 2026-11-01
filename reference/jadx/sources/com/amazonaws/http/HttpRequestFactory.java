package com.amazonaws.http;

import com.alipay.sdk.m.w.a;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import l.C1679;
import l.C3012;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestFactory {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HttpRequest m265(DefaultRequest defaultRequest, ClientConfiguration clientConfiguration) {
        boolean z = true;
        String strM774 = HttpUtils.m774(defaultRequest.m193().toString(), defaultRequest.m177(), true);
        String strM773 = HttpUtils.m773(defaultRequest);
        HttpMethodName httpMethodNameM178 = defaultRequest.m178();
        boolean z2 = defaultRequest.m180() != null;
        if (httpMethodNameM178 == HttpMethodName.POST && !z2) {
            z = false;
        }
        if (strM773 != null && z) {
            strM774 = C1679.m5594(strM774, "?", strM773);
        }
        HashMap map = new HashMap();
        URI uriM193 = defaultRequest.m193();
        String host = uriM193.getHost();
        if (HttpUtils.m776(uriM193)) {
            StringBuilder sbM8976 = C3012.m8976(host, ":");
            sbM8976.append(uriM193.getPort());
            host = sbM8976.toString();
        }
        map.put("Host", host);
        for (Map.Entry entry : defaultRequest.m191().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || ((String) map.get("Content-Type")).isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.m789(a.D));
        }
        InputStream inputStreamM180 = defaultRequest.m180();
        HttpMethodName httpMethodName = HttpMethodName.PATCH;
        if (httpMethodNameM178 == httpMethodName) {
            httpMethodNameM178 = HttpMethodName.POST;
            map.put("X-HTTP-Method-Override", httpMethodName.toString());
        }
        if (httpMethodNameM178 == HttpMethodName.POST && defaultRequest.m180() == null && strM773 != null) {
            byte[] bytes = strM773.getBytes(StringUtils.f844);
            inputStreamM180 = new ByteArrayInputStream(bytes);
            map.put("Content-Length", String.valueOf(bytes.length));
        }
        clientConfiguration.getClass();
        map.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethodNameM178.toString(), URI.create(strM774), map, inputStreamM180);
        httpRequest.m260(defaultRequest.m179());
        return httpRequest;
    }
}
