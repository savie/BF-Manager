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
import l.C20196;
import l.C3188;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestFactory {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HttpRequest m259(DefaultRequest defaultRequest, ClientConfiguration clientConfiguration) {
        boolean z = true;
        String strM768 = HttpUtils.m768(defaultRequest.m187().toString(), defaultRequest.m184(), true);
        String strM767 = HttpUtils.m767(defaultRequest);
        HttpMethodName httpMethodNameM189 = defaultRequest.m189();
        boolean z2 = defaultRequest.m172() != null;
        if (httpMethodNameM189 == HttpMethodName.POST && !z2) {
            z = false;
        }
        if (strM767 != null && z) {
            strM768 = C20196.m46451(strM768, "?", strM767);
        }
        HashMap map = new HashMap();
        URI uriM187 = defaultRequest.m187();
        String host = uriM187.getHost();
        if (HttpUtils.m770(uriM187)) {
            StringBuilder sbM10405 = C3188.m10405(host, ":");
            sbM10405.append(uriM187.getPort());
            host = sbM10405.toString();
        }
        map.put("Host", host);
        for (Map.Entry entry : defaultRequest.m182().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || ((String) map.get("Content-Type")).isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.m783(a.D));
        }
        InputStream inputStreamM172 = defaultRequest.m172();
        HttpMethodName httpMethodName = HttpMethodName.PATCH;
        if (httpMethodNameM189 == httpMethodName) {
            httpMethodNameM189 = HttpMethodName.POST;
            map.put("X-HTTP-Method-Override", httpMethodName.toString());
        }
        if (httpMethodNameM189 == HttpMethodName.POST && defaultRequest.m172() == null && strM767 != null) {
            byte[] bytes = strM767.getBytes(StringUtils.f834);
            inputStreamM172 = new ByteArrayInputStream(bytes);
            map.put("Content-Length", String.valueOf(bytes.length));
        }
        clientConfiguration.getClass();
        map.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethodNameM189.toString(), URI.create(strM768), map, inputStreamM172);
        httpRequest.m253(defaultRequest.m171());
        return httpRequest;
    }
}
