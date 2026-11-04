package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3Exception extends AmazonServiceException implements Serializable {
    public static final long serialVersionUID = 7573680383273658477L;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f526;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f527;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m519(String str) {
        this.f526 = str;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map m518() {
        return this.f527;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m517(HashMap map) {
        this.f527 = map;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ", S3 Extended Request ID: " + this.f526;
    }
}
