package com.amazonaws.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import l.C4681;

/* JADX INFO: loaded from: classes.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f188;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InputStream f189;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f190;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f191;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f192;

    public HttpResponse(String str, int i, Map map, InputStream inputStream) {
        this.f190 = str;
        this.f192 = i;
        this.f191 = map;
        this.f189 = inputStream;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map m263() {
        return this.f191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m260() {
        if (this.f188 == null) {
            synchronized (this) {
                if (this.f189 != null && "gzip".equals(this.f191.get("Content-Encoding"))) {
                    this.f188 = new GZIPInputStream(this.f189);
                } else {
                    this.f188 = this.f189;
                }
            }
        }
        return this.f188;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InputStream m261() {
        return this.f189;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m262() {
        return this.f190;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m264() {
        return this.f192;
    }

    public class Builder {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public InputStream f193;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public int f194;

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final HashMap f195 = new HashMap();

        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
        public String f196;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m268(String str) {
            this.f196 = str;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m266(int i) {
            this.f194 = i;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m267(InputStream inputStream) {
            this.f193 = inputStream;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m269(String str, String str2) {
            this.f195.put(str, str2);
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final HttpResponse m265() {
            return new HttpResponse(this.f196, this.f194, C4681.unmodifiableMap(this.f195), this.f193);
        }
    }
}
