package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRequest implements Request {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f102;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AWSRequestMetrics f103;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f106;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public URI f107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AmazonWebServiceRequest f108;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f104 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f99 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f105 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HttpMethodName f100 = HttpMethodName.POST;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f101 = "Amazon S3";

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        this.f108 = amazonWebServiceRequest;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AmazonWebServiceRequest m189() {
        return this.f108;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m185(String str, String str2) {
        this.f105.put(str, str2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap m191() {
        return this.f105;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m184(String str) {
        this.f106 = str;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m177() {
        return this.f106;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m194(String str, String str2) {
        this.f99.put(str, str2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m195() {
        return this.f99;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HttpMethodName m178() {
        return this.f100;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m181(HttpMethodName httpMethodName) {
        this.f100 = httpMethodName;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m186(URI uri) {
        this.f107 = uri;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final URI m193() {
        return this.f107;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m192() {
        return this.f101;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m180() {
        return this.f102;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m183(InputStream inputStream) {
        this.f102 = inputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m187(HashMap map) {
        HashMap map2 = this.f105;
        map2.clear();
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m188(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = this.f99;
        linkedHashMap2.clear();
        linkedHashMap2.putAll(linkedHashMap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f100);
        sb.append(" ");
        sb.append(this.f107);
        sb.append(" ");
        String str = this.f106;
        if (str == null) {
            sb.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str);
        }
        sb.append(" ");
        LinkedHashMap linkedHashMap = this.f99;
        if (!linkedHashMap.isEmpty()) {
            sb.append("Parameters: (");
            for (String str2 : linkedHashMap.keySet()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str2, ": ", (String) linkedHashMap.get(str2), ", ");
            }
            sb.append(") ");
        }
        HashMap map = this.f105;
        if (!map.isEmpty()) {
            sb.append("Headers: (");
            for (String str3 : map.keySet()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str3, ": ", (String) map.get(str3), ", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m182(AWSRequestMetrics aWSRequestMetrics) {
        if (this.f103 == null) {
            this.f103 = aWSRequestMetrics;
            return;
        }
        throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m179() {
        return this.f104;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m190() {
        this.f104 = true;
    }
}
