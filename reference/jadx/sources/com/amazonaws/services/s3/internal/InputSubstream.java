package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class InputSubstream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f470;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f472;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f474;

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f473 = this.f474;
        super.mark(i);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f474 = this.f473;
        super.reset();
    }

    public InputSubstream(RepeatableFileInputStream repeatableFileInputStream, long j, long j2) {
        super(repeatableFileInputStream);
        this.f473 = 0L;
        this.f474 = 0L;
        this.f470 = j2;
        this.f471 = j;
        this.f472 = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        return i == -1 ? i : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        long j2;
        while (true) {
            j = this.f474;
            j2 = this.f471;
            if (j >= j2) {
                break;
            }
            this.f474 += skip(j2 - j);
        }
        long j3 = (this.f470 + j2) - j;
        if (j3 <= 0) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) Math.min(i2, j3));
        this.f474 += (long) i3;
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f472) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long j = this.f474;
        long j2 = this.f470;
        long j3 = this.f471;
        if (j >= j3) {
            j2 = (j2 + j3) - j;
        }
        return (int) Math.min(j2, super.available());
    }
}
