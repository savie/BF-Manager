package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ܿ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 36TA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17967 extends Reader {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58887;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21916 f58888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18251 f58889;

    /* JADX WARN: Code duplicated, block: B:41:0x004d A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17967 m41924(InputStream inputStream, C0352 c0352) throws Throwable {
        Throwable e;
        C18251 c18251M2112;
        C21916 c21916 = null;
        boolean z = false;
        try {
            c18251M2112 = c0352.m2112(49152L);
            try {
                z = true;
                C21916 c21916M49606 = C21916.m49606(new GZIPInputStream(inputStream, 1024), c0352);
                try {
                    return new C17967(c21916M49606, c18251M2112);
                } catch (IOException | Error | RuntimeException e2) {
                    e = e2;
                    c21916 = c21916M49606;
                    try {
                        if (c21916 != null) {
                            c21916.close();
                        } else {
                            if (!z) {
                                inputStream.close();
                            } else if (c18251M2112 != null) {
                            }
                            throw e;
                        }
                        if (c18251M2112 != null) {
                        }
                    } catch (IOException e3) {
                        e.addSuppressed(e3);
                    } finally {
                        if (c18251M2112 != null) {
                            c18251M2112.close();
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
            c18251M2112 = null;
        }
    }

    public C17967(C21916 c21916, C18251 c18251) {
        this.f58888 = c21916;
        this.f58889 = c18251;
    }

    @Override // java.io.Reader
    public final int read() {
        return this.f58888.read();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f58888.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C18251 c18251 = this.f58889;
        if (this.f58887) {
            return;
        }
        this.f58887 = true;
        try {
            this.f58888.close();
        } finally {
            c18251.close();
        }
    }
}
