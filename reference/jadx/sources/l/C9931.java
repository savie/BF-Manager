package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ۤ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36TA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9931 extends Reader {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14165 f33910;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f33911;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9017 f33912;

    /* JADX WARN: Code duplicated, block: B:41:0x004d A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9931 m25135(InputStream inputStream, C10428 c10428) throws Throwable {
        Throwable e;
        C9017 c9017M26333;
        C14165 c14165 = null;
        boolean z = false;
        try {
            c9017M26333 = c10428.m26333(49152L);
            try {
                z = true;
                C14165 c14165M34241 = C14165.m34241(new GZIPInputStream(inputStream, 1024), c10428);
                try {
                    return new C9931(c14165M34241, c9017M26333);
                } catch (IOException | Error | RuntimeException e2) {
                    e = e2;
                    c14165 = c14165M34241;
                    try {
                        if (c14165 != null) {
                            c14165.close();
                        } else {
                            if (!z) {
                                inputStream.close();
                            } else if (c9017M26333 != null) {
                            }
                            throw e;
                        }
                        if (c9017M26333 != null) {
                        }
                    } catch (IOException e3) {
                        e.addSuppressed(e3);
                    } finally {
                        if (c9017M26333 != null) {
                            c9017M26333.close();
                        }
                    }
                    throw e;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Error e5) {
                e = e5;
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (IOException | Error | RuntimeException e7) {
            e = e7;
            c9017M26333 = null;
        }
    }

    public C9931(C14165 c14165, C9017 c9017) {
        this.f33910 = c14165;
        this.f33912 = c9017;
    }

    @Override // java.io.Reader
    public final int read() {
        return this.f33910.read();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f33910.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C9017 c9017 = this.f33912;
        if (this.f33911) {
            return;
        }
        this.f33911 = true;
        try {
            this.f33910.close();
        } finally {
            c9017.close();
        }
    }
}
