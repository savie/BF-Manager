package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import l.C8947;

/* JADX INFO: loaded from: classes.dex */
public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient S3ObjectInputStream f641;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f644 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f642 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f643 = new ObjectMetadata();

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo459(boolean z) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ObjectMetadata m647() {
        return this.f643;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        S3ObjectInputStream s3ObjectInputStream = this.f641;
        if (s3ObjectInputStream != null) {
            s3ObjectInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final S3ObjectInputStream m644() {
        return this.f641;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m645(S3ObjectInputStream s3ObjectInputStream) {
        this.f641 = s3ObjectInputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m646(String str) {
        this.f642 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m648(String str) {
        this.f644 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Object [key=");
        sb.append(this.f644);
        sb.append(",bucket=");
        String str = this.f642;
        if (str == null) {
            str = "<Unknown>";
        }
        return C8947.m23910(sb, str, "]");
    }
}
