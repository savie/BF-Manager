package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩻ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24965 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23736 f80849;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C10046 f80850;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20006 f80851;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9300 f80852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3598 f80853;

    /* JADX WARN: Code duplicated, block: B:16:0x0019 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #11 {all -> 0x002d, blocks: (B:14:0x0015, B:16:0x0019, B:17:0x001b, B:20:0x0020, B:21:0x0025), top: B:96:0x0015, outer: #8, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0061 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #3 {all -> 0x0074, blocks: (B:46:0x005d, B:48:0x0061, B:49:0x0063, B:52:0x0068, B:53:0x006d), top: B:81:0x005d, outer: #8, inners: #0 }] */
    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C20006 c20006;
        C20006 c20007;
        C23736 c23736 = this.f80849;
        if (c23736 == null) {
            return;
        }
        this.f80849 = null;
        try {
            c23736.close();
            try {
                C10046 c10046 = this.f80850;
                if (c10046 == null) {
                    c20007 = this.f80851;
                    if (c20007 != null) {
                        this.f80851 = null;
                        c20007.close();
                    }
                    this.f80852.close();
                    return;
                }
                c10046.close();
                try {
                    c20007 = this.f80851;
                    if (c20007 != null) {
                        this.f80851 = null;
                        try {
                            c20007.close();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f80852.close();
                    return;
                } catch (Throwable th) {
                    this.f80852.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    C20006 c20008 = this.f80851;
                    if (c20008 != null) {
                        this.f80851 = null;
                        try {
                            c20008.close();
                        } catch (IOException e2) {
                            throw new UncheckedIOException(e2);
                        }
                    }
                    this.f80852.close();
                    throw th2;
                } catch (Throwable th3) {
                    this.f80852.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (this.f80850 == null) {
                    c20006 = this.f80851;
                    if (c20006 != null) {
                        this.f80851 = null;
                        c20006.close();
                    }
                    this.f80852.close();
                    throw th4;
                }
                this.f80850.close();
                try {
                    c20006 = this.f80851;
                    if (c20006 != null) {
                        this.f80851 = null;
                        try {
                            c20006.close();
                        } catch (IOException e3) {
                            throw new UncheckedIOException(e3);
                        }
                    }
                    this.f80852.close();
                    throw th4;
                } catch (Throwable th5) {
                    this.f80852.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                try {
                    C20006 c20009 = this.f80851;
                    if (c20009 != null) {
                        this.f80851 = null;
                        try {
                            c20009.close();
                        } catch (IOException e4) {
                            throw new UncheckedIOException(e4);
                        }
                    }
                    this.f80852.close();
                    throw th6;
                } catch (Throwable th7) {
                    this.f80852.close();
                    throw th7;
                }
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m55765() {
        return (byte[]) m55764().f76933.clone();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized long m55766() {
        return m55764().f76937;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized C7305 m55767() {
        C23736 c23736M55764;
        c23736M55764 = m55764();
        return new C7305(c23736M55764.f76934, c23736M55764.f76936);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m55768() {
        m55764();
        return this.f80850.f32223;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C17505 m55769() {
        C17505 c17505;
        C23736 c23736M55764 = m55764();
        C6560 c6560 = new C6560(c23736M55764.f76934, c23736M55764.f76936);
        C12547 c12547M53004 = c23736M55764.m53004();
        try {
            this.f80853.m11666(c23736M55764);
            C10046 c10046 = this.f80850;
            C12219 c12219 = c23736M55764.f76940;
            if (c12219 == null) {
                c12219 = new C12219();
            }
            c17505 = new C17505(c10046, c6560, c12547M53004, c12219, this.f80853, this.f80852, C8490.f27780, 0);
            c17505.f56907 = c23736M55764.f76931;
            c17505.f56892 = this.f80851;
            this.f80851 = null;
            this.f80849 = null;
            c23736M55764.close();
        } catch (Throwable th) {
            try {
                c6560.close();
                throw th;
            } finally {
                c12547M53004.close();
            }
        }
        return c17505;
    }

    public C24965(C10046 c10046, C3598 c3598, C23736 c23736, C9300 c9300) {
        this.f80850 = c10046;
        this.f80853 = c3598;
        this.f80849 = c23736;
        this.f80852 = c9300;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C23736 m55764() {
        C23736 c23736 = this.f80849;
        if (c23736 != null) {
            return c23736;
        }
        throw new IllegalStateException("Recovery handle is closed");
    }
}
