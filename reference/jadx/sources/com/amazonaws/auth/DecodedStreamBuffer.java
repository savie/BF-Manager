package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import l.C12669;

/* JADX INFO: loaded from: classes.dex */
public class DecodedStreamBuffer {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Log f140 = LogFactory.m296(DecodedStreamBuffer.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f141;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f142;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f143 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f144;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f145;

    public DecodedStreamBuffer(int i) {
        this.f141 = new byte[i];
        this.f145 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m212(int i, int i2, byte[] bArr) {
        this.f143 = -1;
        int i3 = this.f142;
        int i4 = i3 + i2;
        int i5 = this.f145;
        if (i4 > i5) {
            Log log = f140;
            if (log.mo287()) {
                log.mo291("Buffer size " + i5 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
            }
            this.f144 = true;
            return;
        }
        System.arraycopy(bArr, i, this.f141, i3, i2);
        this.f142 += i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m213() {
        int i = this.f143;
        return i != -1 && i < this.f142;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte m215() {
        int i = this.f143;
        this.f143 = i + 1;
        return this.f141[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m214() {
        if (this.f144) {
            throw new AmazonClientException(C12669.m31437(this.f145, " has been exceeded.", new StringBuilder("The input stream is not repeatable since the buffer size ")));
        }
        this.f143 = 0;
    }
}
