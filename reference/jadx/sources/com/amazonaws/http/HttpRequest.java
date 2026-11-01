package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l.C0561;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequest {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f193;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f194;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public URI f195;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f196;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f197;

    public HttpRequest(String str, URI uri, HashMap map, InputStream inputStream) {
        String upperCase;
        Charset charset = StringUtils.f844;
        if (str == null) {
            upperCase = null;
        } else {
            upperCase = str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
        }
        this.f193 = upperCase;
        this.f195 = uri;
        this.f197 = C0561.unmodifiableMap(map);
        this.f194 = inputStream;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m258() {
        return this.f193;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final URI m261() {
        return this.f195;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Map m262() {
        return this.f197;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m259() {
        return this.f194;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m263() {
        String str;
        Map map = this.f197;
        if (map == null || (str = (String) map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m264() {
        return this.f196;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m260(boolean z) {
        this.f196 = z;
    }
}
