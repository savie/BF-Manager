package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import l.C12441;

/* JADX INFO: loaded from: classes.dex */
public class DecodedStreamBuffer {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Log f150 = LogFactory.m302(DecodedStreamBuffer.class);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f151;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f152;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f153 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f154;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f155;

    public DecodedStreamBuffer(int i) {
        this.f152 = new byte[i];
        this.f151 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m218(int i, int i2, byte[] bArr) {
        this.f153 = -1;
        int i3 = this.f154;
        int i4 = i3 + i2;
        int i5 = this.f151;
        if (i4 > i5) {
            Log log = f150;
            if (log.mo294()) {
                log.mo298("Buffer size " + i5 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
            }
            this.f155 = true;
            return;
        }
        System.arraycopy(bArr, i, this.f152, i3, i2);
        this.f154 += i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m219() {
        int i = this.f153;
        return i != -1 && i < this.f154;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte m221() {
        int i = this.f153;
        this.f153 = i + 1;
        return this.f152[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m220() {
        if (this.f155) {
            throw new AmazonClientException(C12441.m30911(this.f151, " has been exceeded.", new StringBuilder("The input stream is not repeatable since the buffer size ")));
        }
        this.f153 = 0;
    }
}
