package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۫᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L2QA */
/* JADX INFO: loaded from: classes4.dex */
public class C12726 extends AbstractC11315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f42439;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f42440;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f42441;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f42442;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0219 f42443;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f42442 = this.f42439;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f42439 = this.f42442;
    }

    @Override // l.AbstractC11315, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        long j2 = this.f42441;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m31580());
        }
        jSkip = super.skip(j);
        this.f42439 += jSkip;
        return jSkip;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m31580() {
        return this.f42439;
    }

    @Override // l.AbstractC11315
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo28314(int i) {
        if (i != -1) {
            this.f42439 += (long) i;
        }
        super.mo28314(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m31581() {
        this.f42440 = false;
    }

    @Deprecated
    public C12726(long j, InputStream inputStream) {
        C16959 c16959 = new C16959();
        c16959.m3184(j);
        super(inputStream, c16959);
        this.f42440 = true;
        this.f42439 = 0L;
        this.f42441 = c16959.m3183();
        this.f42440 = c16959.m3185();
        this.f42443 = c16959.m3186();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (m31579()) {
            m31580();
            this.f42443.getClass();
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // l.AbstractC11315, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42440) {
            super.close();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m31579() {
        long j = this.f42441;
        return j >= 0 && m31580() >= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // l.AbstractC11315, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (m31579()) {
            m31580();
            this.f42443.getClass();
            return -1;
        }
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // l.AbstractC11315, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (m31579()) {
            m31580();
            this.f42443.getClass();
            return -1;
        }
        long jMin = i2;
        long j = this.f42441;
        if (j >= 0) {
            jMin = Math.min(jMin, j - m31580());
        }
        return super.read(bArr, i, (int) jMin);
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }
}
