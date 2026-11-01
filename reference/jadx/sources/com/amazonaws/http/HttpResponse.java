package com.amazonaws.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import l.C0561;

/* JADX INFO: loaded from: classes.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f198;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f199;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f200;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream f201;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f202;

    public HttpResponse(String str, int i, Map map, InputStream inputStream) {
        this.f200 = str;
        this.f198 = i;
        this.f202 = map;
        this.f201 = inputStream;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map m270() {
        return this.f202;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m267() {
        if (this.f199 == null) {
            synchronized (this) {
                if (this.f201 != null && "gzip".equals(this.f202.get("Content-Encoding"))) {
                    this.f199 = new GZIPInputStream(this.f201);
                } else {
                    this.f199 = this.f201;
                }
            }
        }
        return this.f199;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream m269() {
        return this.f201;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m268() {
        return this.f200;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m266() {
        return this.f198;
    }

    public class Builder {

        /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
        public String f203;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public InputStream f204;

        /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
        public int f205;

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public final HashMap f206 = new HashMap();

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m274(String str) {
            this.f203 = str;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m272(int i) {
            this.f205 = i;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m273(InputStream inputStream) {
            this.f204 = inputStream;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m275(String str, String str2) {
            this.f206.put(str, str2);
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final HttpResponse m271() {
            return new HttpResponse(this.f203, this.f205, C0561.unmodifiableMap(this.f206), this.f204);
        }
    }
}
