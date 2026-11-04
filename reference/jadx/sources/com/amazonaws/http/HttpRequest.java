package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l.C4681;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequest {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f183;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f184;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public URI f185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f186;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f187;

    public HttpRequest(String str, URI uri, HashMap map, InputStream inputStream) {
        String upperCase;
        Charset charset = StringUtils.f834;
        if (str == null) {
            upperCase = null;
        } else {
            upperCase = str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
        }
        this.f187 = upperCase;
        this.f185 = uri;
        this.f186 = C4681.unmodifiableMap(map);
        this.f183 = inputStream;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m258() {
        return this.f187;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final URI m256() {
        return this.f185;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Map m254() {
        return this.f186;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m252() {
        return this.f183;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m257() {
        String str;
        Map map = this.f186;
        if (map == null || (str = (String) map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m255() {
        return this.f184;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m253(boolean z) {
        this.f184 = z;
    }
}
