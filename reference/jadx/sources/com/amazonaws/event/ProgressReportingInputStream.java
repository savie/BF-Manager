package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f164;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f165;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ProgressListenerCallbackExecutor f166;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f165 = 8192;
        this.f166 = progressListenerCallbackExecutor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m226(int i) {
        this.f165 = i * 1024;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m227() {
        this.f164 = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i = super.read();
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f166;
        if (i == -1) {
            if (this.f164) {
                ProgressEvent progressEvent = new ProgressEvent(this.f163);
                progressEvent.f157 = 4;
                this.f163 = 0;
                progressListenerCallbackExecutor.m225(progressEvent);
                return i;
            }
        } else {
            int i2 = this.f163 + 1;
            this.f163 = i2;
            if (i2 >= this.f165) {
                progressListenerCallbackExecutor.m225(new ProgressEvent(i2));
                this.f163 = 0;
            }
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.f163);
        progressEvent.f157 = 32;
        this.f166.m225(progressEvent);
        this.f163 = 0;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = super.read(bArr, i, i2);
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f166;
        if (i3 == -1 && this.f164) {
            ProgressEvent progressEvent = new ProgressEvent(this.f163);
            progressEvent.f157 = 4;
            this.f163 = 0;
            progressListenerCallbackExecutor.m225(progressEvent);
        }
        if (i3 != -1) {
            int i4 = this.f163 + i3;
            this.f163 = i4;
            if (i4 >= this.f165) {
                progressListenerCallbackExecutor.m225(new ProgressEvent(i4));
                this.f163 = 0;
            }
        }
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f163;
        if (i > 0) {
            this.f166.m225(new ProgressEvent(i));
            this.f163 = 0;
        }
        super.close();
    }
}
