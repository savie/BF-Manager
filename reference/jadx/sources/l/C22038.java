package l;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L2QA */
/* JADX INFO: loaded from: classes.dex */
public class C22038 extends AbstractC19800 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71075 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f71076;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f71077;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f71078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f71079;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13921 f71080;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f71076 = this.f71079;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f71079 = this.f71076;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        long j2 = this.f71077;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m49827());
        }
        jSkip = ((FilterInputStream) this).in.skip(j);
        this.f71079 += jSkip;
        return jSkip;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m49827() {
        return this.f71079;
    }

    @Override // l.AbstractC19800
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo45573(int i) {
        if (i != -1) {
            this.f71079 += (long) i;
        }
        super.mo45573(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m49828() {
        this.f71078 = false;
    }

    public C22038(C4884 c4884) {
        super(c4884.m32895(), c4884);
        this.f71078 = true;
        this.f71079 = 0L;
        this.f71077 = c4884.m34239();
        this.f71078 = c4884.m34240();
        this.f71080 = c4884.m34242();
    }

    @Deprecated
    public C22038(long j, InputStream inputStream) {
        C4884 c4884 = new C4884();
        c4884.m34238(j);
        super(inputStream, c4884);
        this.f71078 = true;
        this.f71079 = 0L;
        this.f71077 = c4884.m34239();
        this.f71078 = c4884.m34240();
        this.f71080 = c4884.m34242();
    }

    @Override // l.AbstractC19800, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f71078) {
            super.close();
        }
    }

    @Override // l.AbstractC19800, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long j = this.f71077;
        return Math.min(super.available(), (int) Math.min(j == -1 ? C25227.FOREVER_NS : Math.max(0L, j - m49827()), 2147483647L));
    }

    @Override // l.AbstractC19800, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        long j = this.f71077;
        if (j >= 0 && m49827() >= j) {
            m49827();
            this.f71080.getClass();
            return -1;
        }
        return super.read();
    }

    @Override // l.AbstractC19800, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f71077;
        if (j >= 0 && m49827() >= j) {
            m49827();
            this.f71080.getClass();
            return -1;
        }
        long jMin = i2;
        if (j >= 0) {
            jMin = Math.min(jMin, j - m49827());
        }
        return super.read(bArr, i, (int) jMin);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }
}
