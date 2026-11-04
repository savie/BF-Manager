package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import l.C4794;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRequest implements Request {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f90;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f91;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AmazonWebServiceRequest f95;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AWSRequestMetrics f96;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public URI f97;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f93 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f94 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f92 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HttpMethodName f98 = HttpMethodName.POST;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f89 = "Amazon S3";

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        this.f95 = amazonWebServiceRequest;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AmazonWebServiceRequest m186() {
        return this.f95;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m177(String str, String str2) {
        this.f92.put(str, str2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap m182() {
        return this.f92;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m176(String str) {
        this.f91 = str;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m184() {
        return this.f91;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m188(String str, String str2) {
        this.f94.put(str, str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m185() {
        return this.f94;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HttpMethodName m189() {
        return this.f98;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m173(HttpMethodName httpMethodName) {
        this.f98 = httpMethodName;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m178(URI uri) {
        this.f97 = uri;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final URI m187() {
        return this.f97;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m181() {
        return this.f89;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m172() {
        return this.f90;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m175(InputStream inputStream) {
        this.f90 = inputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m179(HashMap map) {
        HashMap map2 = this.f92;
        map2.clear();
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m180(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = this.f94;
        linkedHashMap2.clear();
        linkedHashMap2.putAll(linkedHashMap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f98);
        sb.append(" ");
        sb.append(this.f97);
        sb.append(" ");
        String str = this.f91;
        if (str == null) {
            sb.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str);
        }
        sb.append(" ");
        LinkedHashMap linkedHashMap = this.f94;
        if (!linkedHashMap.isEmpty()) {
            sb.append("Parameters: (");
            for (String str2 : linkedHashMap.keySet()) {
                C4794.m14774(sb, str2, ": ", (String) linkedHashMap.get(str2), ", ");
            }
            sb.append(") ");
        }
        HashMap map = this.f92;
        if (!map.isEmpty()) {
            sb.append("Headers: (");
            for (String str3 : map.keySet()) {
                C4794.m14774(sb, str3, ": ", (String) map.get(str3), ", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m174(AWSRequestMetrics aWSRequestMetrics) {
        if (this.f96 == null) {
            this.f96 = aWSRequestMetrics;
            return;
        }
        throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m171() {
        return this.f93;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m183() {
        this.f93 = true;
    }
}
