package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import l.C22697;

/* JADX INFO: loaded from: classes.dex */
public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient S3ObjectInputStream f653;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f654 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f652 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f651 = new ObjectMetadata();

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo465(boolean z) {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ObjectMetadata m653() {
        return this.f651;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        S3ObjectInputStream s3ObjectInputStream = this.f653;
        if (s3ObjectInputStream != null) {
            s3ObjectInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final S3ObjectInputStream m650() {
        return this.f653;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m651(S3ObjectInputStream s3ObjectInputStream) {
        this.f653 = s3ObjectInputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m652(String str) {
        this.f652 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m654(String str) {
        this.f654 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Object [key=");
        sb.append(this.f654);
        sb.append(",bucket=");
        String str = this.f652;
        if (str == null) {
            str = "<Unknown>";
        }
        return C22697.m50267(sb, str, "]");
    }
}
