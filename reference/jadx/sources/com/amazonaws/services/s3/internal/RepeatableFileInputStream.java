package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class RepeatableFileInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Log f481 = LogFactory.m297("RepeatableFIS");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public FileInputStream f484;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f485;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f483 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f482 = 0;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public RepeatableFileInputStream(File file) {
        this.f484 = null;
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        this.f484 = new FileInputStream(file);
        this.f485 = file;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f484.close();
        m276();
        this.f484 = new FileInputStream(this.f485);
        long jSkip = this.f482;
        while (jSkip > 0) {
            jSkip -= this.f484.skip(jSkip);
        }
        Log log = f481;
        if (log.mo287()) {
            log.mo291("Reset to mark point " + this.f482 + " after returning " + this.f483 + " bytes");
        }
        this.f483 = 0L;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        m276();
        this.f482 += this.f483;
        this.f483 = 0L;
        Log log = f481;
        if (log.mo287()) {
            log.mo291("Input stream marked at " + this.f482 + " bytes");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        m276();
        return this.f484.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f484.close();
        m276();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        m276();
        int i = this.f484.read();
        if (i == -1) {
            return -1;
        }
        this.f483++;
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        m276();
        long jSkip = this.f484.skip(j);
        this.f483 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m276();
        int i3 = this.f484.read(bArr, i, i2);
        this.f483 += (long) i3;
        return i3;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    /* JADX INFO: renamed from: ۤ */
    public final InputStream mo209() {
        return this.f484;
    }
}
