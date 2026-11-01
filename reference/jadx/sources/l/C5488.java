package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۚܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5488 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0548 f18876;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16072 f18877;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3350 f18878;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6754 f18879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22983 f18880;

    /* JADX WARN: Code duplicated, block: B:16:0x0019 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #11 {all -> 0x002d, blocks: (B:14:0x0015, B:16:0x0019, B:17:0x001b, B:20:0x0020, B:21:0x0025), top: B:96:0x0015, outer: #8, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0061 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #3 {all -> 0x0074, blocks: (B:46:0x005d, B:48:0x0061, B:49:0x0063, B:52:0x0068, B:53:0x006d), top: B:81:0x005d, outer: #8, inners: #0 }] */
    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C3350 c3350;
        C3350 c3351;
        C6754 c6754 = this.f18879;
        if (c6754 == null) {
            return;
        }
        this.f18879 = null;
        try {
            c6754.close();
            try {
                C16072 c16072 = this.f18877;
                if (c16072 == null) {
                    c3351 = this.f18878;
                    if (c3351 != null) {
                        this.f18878 = null;
                        c3351.close();
                    }
                    this.f18876.close();
                    return;
                }
                c16072.close();
                try {
                    c3351 = this.f18878;
                    if (c3351 != null) {
                        this.f18878 = null;
                        try {
                            c3351.close();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f18876.close();
                    return;
                } catch (Throwable th) {
                    this.f18876.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    C3350 c3352 = this.f18878;
                    if (c3352 != null) {
                        this.f18878 = null;
                        try {
                            c3352.close();
                        } catch (IOException e2) {
                            throw new UncheckedIOException(e2);
                        }
                    }
                    this.f18876.close();
                    throw th2;
                } catch (Throwable th3) {
                    this.f18876.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (this.f18877 == null) {
                    c3350 = this.f18878;
                    if (c3350 != null) {
                        this.f18878 = null;
                        c3350.close();
                    }
                    this.f18876.close();
                    throw th4;
                }
                this.f18877.close();
                try {
                    c3350 = this.f18878;
                    if (c3350 != null) {
                        this.f18878 = null;
                        try {
                            c3350.close();
                        } catch (IOException e3) {
                            throw new UncheckedIOException(e3);
                        }
                    }
                    this.f18876.close();
                    throw th4;
                } catch (Throwable th5) {
                    this.f18876.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                try {
                    C3350 c3353 = this.f18878;
                    if (c3353 != null) {
                        this.f18878 = null;
                        try {
                            c3353.close();
                        } catch (IOException e4) {
                            throw new UncheckedIOException(e4);
                        }
                    }
                    this.f18876.close();
                    throw th6;
                } catch (Throwable th7) {
                    this.f18876.close();
                    throw th7;
                }
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized C6276 m15172() {
        C6754 c6754M15171;
        c6754M15171 = m15171();
        return new C6276(c6754M15171.f22777, c6754M15171.f22775);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized long m15173() {
        return m15171().f22785;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m15174() {
        return (byte[]) m15171().f22780.clone();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized C1254 m15175() {
        C1254 c1254;
        C6754 c6754M15171 = m15171();
        C21799 c21799 = new C21799(c6754M15171.f22777, c6754M15171.f22775);
        C21571 c21571M18263 = c6754M15171.m18263();
        try {
            this.f18880.m50853(c6754M15171);
            C16072 c16072 = this.f18877;
            C21695 c21695 = c6754M15171.f22774;
            if (c21695 == null) {
                c21695 = new C21695();
            }
            c1254 = new C1254(c16072, c21799, c21571M18263, c21695, this.f18880, this.f18876, C17462.f55565, 0);
            c1254.f5470 = c6754M15171.f22782;
            c1254.f5457 = this.f18878;
            this.f18878 = null;
            this.f18879 = null;
            c6754M15171.close();
        } catch (Throwable th) {
            try {
                c21799.close();
                throw th;
            } finally {
                c21571M18263.close();
            }
        }
        return c1254;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m15176() {
        m15171();
        return this.f18877.f51979;
    }

    public C5488(C16072 c16072, C22983 c22983, C6754 c6754, C0548 c0548) {
        this.f18877 = c16072;
        this.f18880 = c22983;
        this.f18879 = c6754;
        this.f18876 = c0548;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C6754 m15171() {
        C6754 c6754 = this.f18879;
        if (c6754 != null) {
            return c6754;
        }
        throw new IllegalStateException("Recovery handle is closed");
    }
}
