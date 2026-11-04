package com.amazonaws;

import com.google.android.material.motion.MotionUtils;
import l.C8947;

/* JADX INFO: loaded from: classes.dex */
public class AmazonServiceException extends AmazonClientException {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f60;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f61;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f62;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f63;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f64;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        ErrorType errorType = ErrorType.Client;
        this.f64 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m140(String str) {
        this.f63 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m139() {
        return this.f63;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m144(String str) {
        this.f60 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m138(String str) {
        this.f62 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m136() {
        return this.f62;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m141() {
        return this.f64;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m137(int i) {
        this.f61 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m143() {
        return this.f61;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f64);
        sb.append(" (Service: ");
        sb.append(this.f60);
        sb.append("; Status Code: ");
        sb.append(this.f61);
        sb.append("; Error Code: ");
        sb.append(m136());
        sb.append("; Request ID: ");
        return C8947.m23910(sb, this.f63, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m142(String str) {
        this.f64 = str;
    }
}
