package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17505 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f56890 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f56891;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20006 f56892;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C12547 f56893;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f56894;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C12219 f56895;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final UUID f56896;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f56897;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public FutureC23690 f56898;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C5508 f56899;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C6560 f56900;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile boolean f56901;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f56902;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f56903;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C11538 f56904;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f56905;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14784 f56906;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C21170 f56907;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C10046 f56908;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f56909;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public volatile long f56910;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f56911;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f56912;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C20424 f56913;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56914;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C24900 f56915;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f56916;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C13710 f56917;

    public /* synthetic */ C17505(C10046 c10046, C6560 c6560, C12547 c12547, C12219 c12219, C3598 c3598, C9300 c9300, C8490 c8490, int i) {
        this(c10046, c6560, c12547, c12219, c3598, c9300, c8490);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final synchronized C21170 m41081() {
        m41072();
        return this.f56907;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized C10046 m41082() {
        m41075();
        m41074();
        if (this.f56917 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        this.f56908.m25972();
        return this.f56908;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final synchronized C7305 m41083() {
        m41072();
        if (!this.f56907.m48300()) {
            throw new IllegalStateException("Text loading is incomplete");
        }
        return this.f56900.m18474();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41089(int i, int i2) {
        m41075();
        C21498 c21498 = new C21498(i, i2);
        if (i > this.f56900.length() || i2 > this.f56900.length()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (c21498.equals(this.f56895.f39260)) {
            return;
        }
        C12219 c12219 = this.f56895;
        this.f56895 = new C12219(c12219.f39261, c21498, c12219.f39258, c12219.f39262, c12219.f39259);
        m41070(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41092(C11538 c11538) {
        if (this.f56904 != c11538 || c11538.f36293) {
            throw new IllegalStateException("Text load publication is not active");
        }
        if (!m41067(c11538.f36292, c11538.f36289, c11538.f36294, c11538.f36291, c11538.f36290, c11538)) {
            throw new IllegalStateException("Text load publication was invalidated");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41093(C12965 c12965, C2918 c2918) {
        C5508 c5508 = this.f56899;
        if (c5508 == null || c5508.f19164 != c12965 || c12965.f41564) {
            throw new IllegalStateException("History replay step is not active");
        }
        c12965.f41564 = true;
        m41064(EnumC22662.USER, c2918, c12965);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41094(C14784 c14784) {
        if (this.f56906 == c14784) {
            m41075();
            m41074();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41095(C14784 c14784, EnumC14456 enumC14456, EnumC4016 enumC4016) {
        m41074();
        if (this.f56906 != c14784) {
            return;
        }
        m41075();
        C21170 c21170M48293 = this.f56907.m48293(enumC14456, enumC4016);
        this.f56907 = c21170M48293;
        c14784.f48390 = c21170M48293;
        this.f56906 = null;
        m41070(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41096(C14784 c14784, C21170 c21170) {
        m41075();
        m41074();
        if (this.f56906 != null) {
            throw new IllegalStateException("Text loader is already active");
        }
        if (c21170 != null) {
            if (this.f56900.length() != 0 || this.f56907.m48303() != null || this.f56895.f39261.m10990() || !this.f56895.f39261.f10906.isEmpty()) {
                throw new IllegalStateException("Initial text loading requires an empty session");
            }
            this.f56907 = c21170;
        } else {
            if (this.f56907.m48300() || this.f56907.m48303() == null) {
                throw new IllegalStateException("No incomplete text source to resume");
            }
            this.f56907 = this.f56907.m48293(EnumC14456.LOADING, EnumC4016.NONE);
        }
        this.f56906 = c14784;
        c14784.f48390 = this.f56907;
        m41070(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41097(C16759 c16759) {
        m41075();
        m41074();
        if (this.f56906 != null || this.f56897) {
            throw new IllegalStateException("Cannot replace active loading or checkpoint session");
        }
        synchronized (c16759) {
            C7745 c7745M39570 = C16759.m39570(c16759);
            C10046 c10046 = c7745M39570.f25502.m23622().f69247;
            C10046 c10047 = this.f56908;
            C16276.f52867.getClass();
            C15530 c15530 = new C15530(c10046, c10047, 0);
            try {
                C7745 c7745M37189 = c15530.m37189(c7745M39570);
                try {
                    C6560 c6560 = new C6560(c7745M37189.f25502.m23622(), c7745M37189.f25502.m19989());
                    C24900 c24900 = new C24900();
                    try {
                        C12219 c12219 = c7745M37189.f25503;
                        C12219 c122110 = new C12219(c12219.f39261.m10989(c24900, c12219.f39259, m41113()), c12219.f39260, c12219.f39258, c12219.f39262, c12219.f39259);
                        C10046 c10048 = this.f56908;
                        C12547 c12547M31220 = C12547.m31220(c10048 == null ? null : c10048.f32208, c7745M37189.f25501.f40313);
                        C6560 c6561 = this.f56900;
                        C12547 c12547 = this.f56893;
                        C24900 c24901 = this.f56915;
                        synchronized (this.f56894) {
                            this.f56900 = c6560;
                        }
                        this.f56893 = c12547M31220;
                        this.f56895 = c122110;
                        this.f56907 = c7745M37189.f25505;
                        this.f56915 = c24900;
                        try {
                            m41070(Math.max(1, c6560.length()));
                            c6561.close();
                            c12547.close();
                            c24901.m55483();
                            c7745M37189.close();
                            c15530.close();
                        } catch (Throwable th) {
                            c6561.close();
                            c12547.close();
                            c24901.m55483();
                            throw th;
                        }
                    } catch (Error e) {
                        e = e;
                        c6560.close();
                        c24900.m55483();
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        c6560.close();
                        c24900.m55483();
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        c7745M37189.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c15530.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41100(C14784 c14784, char[] cArr, int i, C21170 c21170, int i2) {
        m41074();
        return m41067(c14784, cArr, i, c21170, i2, (C11538) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41101(InterfaceC18186 interfaceC18186, C14784 c14784, char[] cArr, int i, C21170 c21170, int i2) {
        if (this.f56906 == c14784 && !c14784.m35627()) {
            m41075();
            m41074();
            if (((long) this.f56900.length()) + ((long) i) > i2) {
                return false;
            }
            C11538 c11538 = new C11538(c14784, cArr, i, c21170, i2);
            this.f56904 = c11538;
            try {
                if (i == 0) {
                    m41092(c11538);
                } else {
                    interfaceC18186.mo20308(c11538);
                }
                boolean z = c11538.f36293;
                this.f56904 = null;
                return z;
            } catch (Throwable th) {
                this.f56904 = null;
                throw th;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized C7745 m41102() {
        m41072();
        if (this.f56903 || this.f56899 != null || this.f56905 || this.f56904 != null) {
            throw new IllegalStateException("Cannot capture session during edit");
        }
        if (this.f56897 && this.f56891 != this.f56910) {
            throw new IllegalStateException("Current session state requires an explicit checkpoint");
        }
        return new C7745(this.f56900.m18474(), this.f56893, this.f56895, this.f56907, this.f56910);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized C21498 m41103() {
        m41072();
        return this.f56895.f39260;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m41104() {
        m41072();
        return (byte[]) this.f56893.f40313.clone();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41106() {
        m41072();
        return this.f56895.f39261.m10990();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized C16759 m41107() {
        m41072();
        m41074();
        if (this.f56903 || this.f56906 != null || !this.f56907.m48300()) {
            throw new IllegalStateException("Cannot transfer incomplete or editing session");
        }
        return new C16759(new C7745(this.f56900.m18474(), this.f56893, this.f56895, this.f56907, this.f56910));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m41108() {
        C10046 c10046;
        m41072();
        c10046 = this.f56908;
        return c10046 == null ? this.f56896 : c10046.f32223;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41109() {
        m41075();
        m41074();
        if (this.f56906 != null) {
            throw new IllegalStateException("Text loading is still active");
        }
        this.f56907 = C21170.f67574;
        m41111();
        m41070(1L);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized C15267 m41110() {
        C15267 c15267;
        m41075();
        m41074();
        if (!this.f56897) {
            throw new IllegalStateException("Explicit checkpoints are not enabled");
        }
        c15267 = new C15267(this, new C7745(this.f56900.m18474(), this.f56893, this.f56895, this.f56907, this.f56910 + 1), this.f56908.f32223, this.f56911);
        this.f56910++;
        return c15267;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41111() {
        m41075();
        m41074();
        if (this.f56895.f39261.m10990() || !this.f56895.f39261.f10906.isEmpty()) {
            C3335 c3335 = this.f56895.f39261;
            c3335.getClass();
            C3335 c3336 = new C3335(new C20424(), new C20424(), c3335.f10907, c3335.f10905);
            C12219 c12219 = this.f56895;
            this.f56895 = new C12219(c3336, c12219.f39260, c12219.f39258, c12219.f39262, c12219.f39259);
            this.f56915.m55483();
            m41070(1L);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41112() {
        m41075();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41114() {
        m41072();
        C13710 c13710 = this.f56917;
        if (c13710 != null) {
            c13710.m33521();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized long m41115() {
        m41072();
        return this.f56895.f39258;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final synchronized long m41116() {
        m41072();
        return this.f56895.f39259;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC23690 m41117(long j) {
        C13710 c13710;
        m41072();
        m41074();
        if (this.f56917 == null && j > this.f56910) {
            throw new IllegalArgumentException("Revision exceeds current session");
        }
        c13710 = this.f56917;
        return c13710 == null ? FutureC23690.m52928(Long.valueOf(this.f56910)) : c13710.m33515(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m41118(byte[] bArr) {
        m41075();
        if (Arrays.equals(this.f56893.f40313, bArr)) {
            return;
        }
        C10046 c10046 = this.f56908;
        C12547 c12547M31220 = C12547.m31220(c10046 == null ? null : c10046.f32208, bArr);
        C12547 c12547 = this.f56893;
        this.f56893 = c12547M31220;
        try {
            m41070(Math.max(1, bArr.length));
            c12547.close();
        } catch (Throwable th) {
            c12547.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41119() {
        m41072();
        return !this.f56895.f39261.f10906.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41120(boolean z) {
        C17440 c17440M40939;
        m41072();
        c17440M40939 = C17440.m40939(this.f56895, z);
        return (c17440M40939 == null || c17440M40939.m40941() || !c17440M40939.m40940()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m41122(long j) {
        m41075();
        m41074();
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C12219 c12219 = this.f56895;
        if (j == c12219.f39259) {
            return;
        }
        C3335 c3335M10989 = c12219.f39261.m10989(this.f56915, j, m41113());
        C12219 c122110 = this.f56895;
        this.f56895 = new C12219(c3335M10989, c122110.f39260, c122110.f39258, c122110.f39262, j);
        m41070(1L);
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41123() {
        if (this.f56917 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        m41075();
        m41074();
        if (this.f56897) {
            return;
        }
        this.f56897 = true;
        this.f56891 = this.f56910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41057(C17505 c17505, BooleanSupplier booleanSupplier, C7745 c7745, C22727 c22727, long j, long j2) {
        c17505.getClass();
        if (booleanSupplier.getAsBoolean() || c17505.f56912 || c17505.f56901 || c17505.f56910 != c7745.f25504) {
            throw new CancellationException("Automatic compaction yielded");
        }
        C10792 c10792 = c22727.f73765;
        if (System.nanoTime() - j >= j2) {
            throw new C13030();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41090(Runnable runnable) {
        m41075();
        m41074();
        this.f56913 = new C20424();
        this.f56916 = this.f56895.f39261.f10907;
        this.f56902 = 0L;
        try {
            runnable.run();
            try {
                C12219 c12219 = this.f56895;
                C3335 c3335M10989 = c12219.f39261.m10989(this.f56915, c12219.f39259, m41113());
                C12219 c122110 = this.f56895;
                C12219 c122111 = new C12219(c3335M10989, c122110.f39260, c122110.f39258, c122110.f39262, c122110.f39259);
                this.f56895 = c122111;
                long j = this.f56902;
                this.f56902 = 0L;
                this.f56916 = 0L;
                this.f56913 = null;
                try {
                    C24900 c24900 = this.f56915;
                    C3335 c3335 = c122111.f39261;
                    c24900.m55482(c3335.f10908, c3335.f10906);
                    if (j != 0) {
                        m41046(j);
                    }
                } catch (Throwable th) {
                    if (j != 0) {
                        m41046(j);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                long j2 = this.f56902;
                this.f56902 = 0L;
                this.f56916 = 0L;
                this.f56913 = null;
                try {
                    C24900 c24901 = this.f56915;
                    C3335 c3336 = this.f56895.f39261;
                    c24901.m55482(c3336.f10908, c3336.f10906);
                    throw th2;
                } finally {
                    if (j2 != 0) {
                        m41046(j2);
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                this.f56895 = new C12219(this.f56895.f39261.m10989(this.f56915, this.f56895.f39259, m41113()), this.f56895.f39260, this.f56895.f39258, this.f56895.f39262, this.f56895.f39259);
                long j3 = this.f56902;
                this.f56902 = 0L;
                this.f56916 = 0L;
                this.f56913 = null;
                try {
                    this.f56915.m55482(this.f56895.f39261.f10908, this.f56895.f39261.f10906);
                    if (j3 == j) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                    if (j3 != 0) {
                        m41046(j3);
                    }
                }
            } catch (Throwable th4) {
                long j4 = this.f56902;
                this.f56902 = 0L;
                this.f56916 = 0L;
                this.f56913 = null;
                try {
                    C24900 c24902 = this.f56915;
                    C3335 c3337 = this.f56895.f39261;
                    c24902.m55482(c3337.f10908, c3337.f10906);
                    throw th4;
                } finally {
                    if (j4 != 0) {
                        m41046(j4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41098(boolean z) {
        C3335 c3335;
        m41075();
        if (this.f56899 != null || this.f56905 || this.f56904 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        C7305 c7305M18474 = this.f56900.m18474();
        try {
            C21697 c21697M23622 = c7305M18474.m23622();
            C21697 c21697M49247 = C21697.m49247(c21697M23622.f69244, c21697M23622.f69246, c21697M23622.f69247);
            int iMax = Math.max(0, this.f56895.f39260.m48908());
            C12219 c12219 = this.f56895;
            long j = c12219.f39258;
            C10727 c10727 = new C10727(iMax, j, j, c12219.f39260, c21697M49247, c21697M49247);
            if (this.f56916 != 0) {
                C20489 c20489M10991 = this.f56895.f39261.m10991();
                if (c20489M10991 != null && c20489M10991.f65634 == this.f56916) {
                    C3335 c3335M41050 = m41050(this.f56895.f39261, new C20424().m46834(c10727));
                    C12219 c122110 = this.f56895;
                    this.f56895 = new C12219(c3335M41050, c122110.f39260, c122110.f39258, c122110.f39262, c122110.f39259);
                    this.f56915.m55482(c3335M41050.f10908, c3335M41050.f10906);
                    m41070(1L);
                    c7305M18474.close();
                    return;
                }
                this.f56913 = this.f56913.m46834(c10727);
                c7305M18474.close();
                return;
            }
            if (z) {
                C3335 c3336 = this.f56895.f39261;
                c3335 = new C3335(c3336.f10908, c3336.f10906, c3336.f10907, true);
            } else {
                c3335 = this.f56895.f39261;
            }
            C3335 c3335M10989 = c3335.m10987(c10727, System.currentTimeMillis()).m10989(this.f56915, this.f56895.f39259, m41113());
            C12219 c122111 = this.f56895;
            this.f56895 = new C12219(c3335M10989, c122111.f39260, c122111.f39258, c122111.f39262, c122111.f39259);
            m41070(1L);
            c7305M18474.close();
        } catch (Throwable th) {
            try {
                c7305M18474.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x016a */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01cf */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01ab: MOVE (r14 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:114:0x01ab */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m41049(final l.C17505 r25, final java.util.function.BooleanSupplier r26, final l.C22727 r27, l.C13921 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17505.m41049(l.ܽۢ᩸, java.util.function.BooleanSupplier, l.᩸ۢ᩸, l.۬ܳܳ):long");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0102 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010b A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010e A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0114 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:38:0x00ce, B:40:0x00d7, B:42:0x00e7, B:44:0x00ec, B:46:0x0102, B:48:0x010b, B:50:0x0110, B:52:0x0114, B:54:0x0119, B:60:0x012e, B:72:0x013f, B:73:0x0141, B:53:0x0117, B:49:0x010e, B:43:0x00ea, B:79:0x014d, B:80:0x0159, B:56:0x011e, B:58:0x012a, B:69:0x013c, B:68:0x0139), top: B:142:0x00ce, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized l.EnumC1844 m41086(boolean r18, l.InterfaceC19678 r19) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17505.m41086(boolean, l.ᩴ۟᩸):l.֫ۢ᩸");
    }

    public C17505(C10046 c10046, C6560 c6560, C12547 c12547, C12219 c12219, C3598 c3598, C9300 c9300, C8490 c8490) {
        this.f56894 = new Object();
        this.f56907 = C21170.f67574;
        this.f56915 = new C24900();
        this.f56909 = new FutureC23690();
        this.f56896 = UUID.randomUUID();
        this.f56908 = c10046;
        this.f56900 = c6560;
        this.f56893 = c12547;
        this.f56895 = c12219;
        C24900 c24900 = this.f56915;
        C3335 c3335 = c12219.f39261;
        c24900.m55482(c3335.f10908, c3335.f10906);
        this.f56910 = c3598.m11662();
        this.f56917 = new C13710(c3598, c10046, c9300, c8490);
    }

    public C17505(CharSequence charSequence) {
        this.f56894 = new Object();
        this.f56907 = C21170.f67574;
        this.f56915 = new C24900();
        this.f56909 = new FutureC23690();
        this.f56896 = UUID.randomUUID();
        this.f56900 = new C6560(charSequence);
        this.f56895 = new C12219();
        this.f56893 = C12547.m31220(null, new byte[0]);
        this.f56917 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17505 m41052(CharSequence charSequence) {
        return new C17505(charSequence);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m41113() {
        return this.f56917 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41065(InterfaceC24329 interfaceC24329) {
        C20006.m46029(interfaceC24329);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17505 m41054(InterfaceC24329 interfaceC24329, C0352 c0352, C2589 c2589) {
        C20006[] c20006Arr = new C20006[1];
        C11055[] c11055Arr = new C11055[1];
        C17505 c17505M41053 = null;
        try {
            c17505M41053 = m41053(c0352, c2589, C8490.f27780, new C9563(c20006Arr, interfaceC24329, c11055Arr, c0352));
            c20006Arr[0].m46039(c11055Arr[0], c17505M41053.f56910);
            c11055Arr[0].m27948();
            c17505M41053.f56892 = c20006Arr[0];
            return c17505M41053;
        } catch (Throwable th) {
            if (c17505M41053 != null) {
                try {
                    c17505M41053.m41087().m52947();
                } catch (Throwable th2) {
                    try {
                        C11055 c11055 = c11055Arr[0];
                        if (c11055 != null) {
                            c11055.close();
                        }
                        throw th2;
                    } finally {
                        C20006 c20006 = c20006Arr[0];
                        if (c20006 != null) {
                            c20006.close();
                        }
                    }
                }
            }
            try {
                C11055 c11056 = c11055Arr[0];
                if (c11056 != null) {
                    c11056.close();
                }
                throw th;
            } finally {
                C20006 c20007 = c20006Arr[0];
                if (c20007 != null) {
                    c20007.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17505 m41053(C0352 c0352, C2589 c2589, C8490 c8490, C9563 c9563) throws Throwable {
        C10046 c10046;
        C12547 c12547M31220;
        C9300 c9300M8661 = c2589.m8661();
        C6560 c6560 = null;
        try {
            C20006[] c20006Arr = c9563.f30955;
            InterfaceC24329 interfaceC24329 = c9563.f30957;
            C11055[] c11055Arr = c9563.f30956;
            C0352 c0353 = c9563.f30958;
            C20006 c20006M46016 = C20006.m46016(interfaceC24329);
            c20006Arr[0] = c20006M46016;
            C11055 c11055M46033 = c20006M46016.m46033(c0353);
            c11055Arr[0] = c11055M46033;
            c10046 = c11055M46033.f34879;
            try {
                c12547M31220 = C12547.m31220(c0352, new byte[0]);
                try {
                    C6560 c6561 = new C6560(C21697.m49247(c10046.f32213, c10046.f32209, c10046), 0L);
                    try {
                        C3598 c3598 = new C3598(c10046);
                        C12219 c12219 = new C12219();
                        C7305 c7305M18474 = c6561.m18474();
                        try {
                            byte[] bArr = c12547M31220.f40313;
                            synchronized (c3598) {
                                c3598.m11665(c7305M18474, bArr, c12219, null, 0L);
                            }
                            c7305M18474.close();
                            return new C17505(c10046, c6561, c12547M31220, c12219, c3598, c9300M8661, c8490);
                        } catch (Throwable th) {
                            try {
                                c7305M18474.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c6560 = c6561;
                        if (c6560 != null) {
                            try {
                                c6560.close();
                            } catch (Throwable th4) {
                                if (c10046 != null) {
                                    try {
                                        c10046.close();
                                    } finally {
                                        c9300M8661.close();
                                    }
                                }
                                throw th4;
                            }
                        }
                        if (c12547M31220 != null) {
                            c12547M31220.close();
                        }
                        if (c10046 != null) {
                            try {
                                c10046.close();
                            } finally {
                                c9300M8661.close();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c12547M31220 = null;
            }
        } catch (Throwable th7) {
            th = th7;
            c10046 = null;
            c12547M31220 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C24965 m41079(InterfaceC24329 interfaceC24329, C0352 c0352, C2589 c2589) {
        C20006 c20006M46031;
        C10046 c10046M25961;
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        C9300 c9300M8661 = c2589.m8661();
        C23736 c23736M11663 = null;
        try {
            c20006M46031 = C20006.m46031(interfaceC24329);
            try {
                C22990 c22990M46036 = c20006M46031.m46036();
                c10046M25961 = C10046.m25961(interfaceC22465.mo26979(c20006M46031.m46037(c22990M46036), false), c0352);
                try {
                    C3598 c3598 = new C3598(c10046M25961);
                    c23736M11663 = c3598.m11663(C16276.f52867);
                    C20006.m46020(c22990M46036, c10046M25961, c23736M11663.f76937);
                    C24965 c24965 = new C24965(c10046M25961, c3598, c23736M11663, c9300M8661);
                    c24965.f80851 = c20006M46031;
                    return c24965;
                } catch (Throwable th) {
                    th = th;
                    if (c23736M11663 != null) {
                        try {
                            c23736M11663.close();
                        } catch (Throwable th2) {
                            if (c10046M25961 != null) {
                                try {
                                    c10046M25961.close();
                                } catch (Throwable th3) {
                                    if (c20006M46031 != null) {
                                        try {
                                            c20006M46031.close();
                                        } finally {
                                            c9300M8661.close();
                                        }
                                    }
                                    throw th3;
                                }
                            }
                            if (c20006M46031 != null) {
                                try {
                                    c20006M46031.close();
                                } finally {
                                    c9300M8661.close();
                                }
                            }
                            throw th2;
                        }
                    }
                    if (c10046M25961 != null) {
                        try {
                            c10046M25961.close();
                        } catch (Throwable th4) {
                            if (c20006M46031 != null) {
                                try {
                                    c20006M46031.close();
                                } finally {
                                    c9300M8661.close();
                                }
                            }
                            throw th4;
                        }
                    }
                    if (c20006M46031 != null) {
                        try {
                            c20006M46031.close();
                        } finally {
                            c9300M8661.close();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c10046M25961 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            c20006M46031 = null;
            c10046M25961 = null;
        }
    }

    public final int length() {
        int length;
        synchronized (this.f56894) {
            length = this.f56900.length();
        }
        return length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m41085(int i) {
        C21697 c21697M18475;
        synchronized (this.f56894) {
            c21697M18475 = this.f56900.m18475(i);
        }
        C10046 c10046 = c21697M18475.f69247;
        try {
            return c21697M18475.m49251(i);
        } finally {
            if (c10046 != null) {
                c10046.m25975();
            }
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long m41105() {
        return this.f56910;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m41084() {
        C13710 c13710 = this.f56917;
        return c13710 == null ? this.f56910 : c13710.m33522();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C7305 m41121() {
        C7305 c7305M18474;
        synchronized (this.f56894) {
            c7305M18474 = this.f56900.m18474();
        }
        return c7305M18474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41099(C7305 c7305) {
        boolean zM18477;
        synchronized (this.f56894) {
            zM18477 = this.f56900.m18477(c7305);
        }
        return zM18477;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41067(final C14784 c14784, final char[] cArr, final int i, final C21170 c21170, int i2, C11538 c11538) {
        if (this.f56906 == c14784 && !c14784.m35627()) {
            m41075();
            long j = i;
            if (((long) this.f56900.length()) + j <= i2) {
                this.f56903 = true;
                try {
                    if (i != 0) {
                        this.f56900.m18476(new Consumer() { // from class: l.ۙۢ᩸
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C12312.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                C14784 c14785 = c14784;
                                char[] cArr2 = cArr;
                                int i3 = i;
                                C21170 c21171 = c21170;
                                C12525 c12525 = (C12525) obj;
                                try {
                                    c14785.m35622();
                                    c12525.m31115(c12525.m31116(), c12525.m31116(), CharBuffer.wrap(cArr2, 0, i3));
                                    c14785.m35623(c21171.m48300());
                                } catch (IOException e) {
                                    throw new UncheckedIOException(e);
                                }
                            }
                        }, null);
                    } else {
                        try {
                            c14784.m35623(c21170.m48300());
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f56907 = c21170;
                    c14784.f48390 = c21170;
                    if (c11538 != null) {
                        c11538.f36293 = true;
                    }
                    if (c21170.m48300()) {
                        this.f56906 = null;
                    }
                    m41070(Math.max(1L, j * 2));
                    this.f56903 = false;
                    return true;
                } catch (Throwable th) {
                    this.f56903 = false;
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3335 m41050(C3335 c3335, C20424 c20424) {
        if (c20424.isEmpty()) {
            return c3335;
        }
        C20489 c20489M10991 = c3335.m10991();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c20489M10991 != null) {
            long j = c20489M10991.f65634;
            if (j == this.f56916) {
                return new C3335(c3335.f10908.m46837(new C20489(j, jCurrentTimeMillis, EnumC22662.BATCH, c20489M10991.f65630.m46835(c20424))), c3335.f10906, c3335.f10907, c3335.f10905);
            }
        }
        return c3335.m10988(this.f56913.m46835(c20424), jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41091(C8884 c8884) {
        EnumC22662 enumC22662 = EnumC22662.USER;
        synchronized (this) {
            m41064(enumC22662, c8884, (C12965) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.۬ᩳ᩸] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41064(final EnumC22662 enumC22662, final Consumer consumer, C12965 c12965) throws Throwable {
        boolean z;
        m41075();
        EnumC22662 enumC22663 = EnumC22662.LOADER;
        if (enumC22662 == enumC22663) {
            m41074();
        }
        if (enumC22662 != EnumC22662.USER && enumC22662 != EnumC22662.BATCH && enumC22662 != enumC22663) {
            throw new IllegalArgumentException("Unsupported session edit origin");
        }
        this.f56903 = true;
        long jM18478 = this.f56900.m18478();
        final long[] jArr = new long[1];
        final C12219 c12219 = this.f56895;
        final C12219[] c12219Arr = new C12219[1];
        final C21498[] c21498Arr = {c12219.f39260};
        C16694 c16694 = (enumC22662 == enumC22663 || c12965 != null) ? null : new C16694(enumC22662, c12219.f39258, c12219.f39262, new Supplier() { // from class: l.ۖᩳ᩸
            @Override // java.util.function.Supplier
            public final Object get() {
                return c21498Arr[0];
            }
        }, true);
        C5508 c5508 = this.f56899;
        final C16694 c16695 = c5508 != null ? new C16694(EnumC22662.BATCH, c5508.f19167, c5508.f19166, new Supplier() { // from class: l.۠ᩳ᩸
            @Override // java.util.function.Supplier
            public final Object get() {
                return c21498Arr[0];
            }
        }, false) : null;
        try {
            final C16694 c16696 = c16694;
            final C16694 c16697 = c16694;
            z = false;
            try {
                this.f56900.m18476(new Consumer() { // from class: l.ۜᩳ᩸
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C17505.m41058(this.f24140, consumer, jArr, c16696, c12219, c12219Arr, c21498Arr, c16695, (C12525) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return C12312.$default$andThen(this, consumer2);
                    }
                }, new InterfaceC20730() { // from class: l.۬ᩳ᩸
                    @Override // l.InterfaceC20730
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo34206(int i, int i2, C21697 c21697, C21697 c21698, int i3) {
                        if (enumC22662 == EnumC22662.LOADER) {
                            if (i != c21697.m49259() || i2 != i) {
                                throw new IllegalArgumentException("Loader may only append text");
                            }
                            return;
                        }
                        C16694 c16698 = c16697;
                        if (c16698 != null) {
                            c16698.mo34206(i, i2, c21697, c21698, i3);
                        }
                        C16694 c16699 = c16695;
                        if (c16699 != null) {
                            c16699.mo34206(i, i2, c21697, c21698, i3);
                        }
                        C21498[] c21498Arr2 = c21498Arr;
                        c21498Arr2[0] = c21498Arr2[0].m48907(i, i2, i3);
                    }
                });
                if (this.f56900.m18478() != jM18478) {
                    if (c16695 != null) {
                        this.f56899.m16383();
                    }
                    this.f56895 = c12219Arr[0];
                    m41070(jArr[0]);
                }
                try {
                    C24900 c24900 = this.f56915;
                    C3335 c3335 = this.f56895.f39261;
                    c24900.m55482(c3335.f10908, c3335.f10906);
                } finally {
                    this.f56903 = false;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C24900 c24901 = this.f56915;
                    C3335 c3336 = this.f56895.f39261;
                    c24901.m55482(c3336.f10908, c3336.f10906);
                    throw th;
                } finally {
                    this.f56903 = z;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41058(C17505 c17505, Consumer consumer, long[] jArr, C16694 c16694, C12219 c12219, C12219[] c12219Arr, C21498[] c21498Arr, C16694 c16695, C12525 c12525) {
        C3335 c3335M41050;
        consumer.accept(c12525);
        jArr[0] = c12525.m31113();
        if (c16694 == null) {
            c3335M41050 = c12219.f39261;
        } else {
            c3335M41050 = c17505.f56916 != 0 ? c17505.m41050(c12219.f39261, c16694.m39458()) : c16694.m39457(c12219.f39261, System.currentTimeMillis());
        }
        if (c17505.f56916 == 0) {
            c3335M41050 = c3335M41050.m10989(c17505.f56915, c12219.f39259, c17505.m41113());
        }
        C12219 c122110 = new C12219(c3335M41050, c21498Arr[0], c16694 == null ? c12219.f39258 : c16694.m39460(), c16694 == null ? c12219.f39262 : c16694.m39459(), c12219.f39259);
        c12219Arr[0] = c122110;
        if (c16695 != null) {
            c17505.f56899.m16382(c16695, c122110);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public void m41074() {
        if (this.f56899 != null || this.f56905 || this.f56904 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        if (this.f56916 != 0) {
            throw new IllegalStateException("Operation is unavailable during history grouping");
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m41070(long j) {
        this.f56910++;
        if (this.f56916 != 0) {
            long jMax = Math.max(1L, j);
            long j2 = this.f56902;
            long j3 = C25227.FOREVER_NS;
            if (jMax <= C25227.FOREVER_NS - j2) {
                j3 = j2 + jMax;
            }
            this.f56902 = j3;
            return;
        }
        m41046(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41046(long j) {
        C13710 c13710;
        boolean z = this.f56897;
        long j2 = C25227.FOREVER_NS;
        if (z) {
            long j3 = this.f56911;
            this.f56911 = j > C25227.FOREVER_NS - j3 ? Long.MAX_VALUE : j3 + j;
        }
        C5508 c5508 = this.f56899;
        if (c5508 != null) {
            long j4 = c5508.f19169;
            if (j <= C25227.FOREVER_NS - j4) {
                j2 = j4 + j;
            }
            c5508.f19169 = j2;
            return;
        }
        if (z || (c13710 = this.f56917) == null) {
            return;
        }
        c13710.m33519(new C7745(this.f56900.m18474(), this.f56893, this.f56895, this.f56907, this.f56910), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16759 m41051(C20348 c20348) {
        return new C16759(C6582.m18507(c20348));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.᩷ۢ᩸] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m41088(final BooleanSupplier booleanSupplier) {
        final C22727 c22727 = C22727.f73764;
        final C13921 c13921 = new C13921(1);
        synchronized (this) {
            C17359.requireNonNull(booleanSupplier);
            if (m41077()) {
                return this.f56917.m33516((C21981) new InterfaceC2524() { // from class: l.᩷ۢ᩸
                    @Override // l.InterfaceC2524
                    public final long run() {
                        return C17505.m41049(this.f70923, booleanSupplier, c22727, c13921);
                    }
                }, true).m52949((InterfaceC25138) new C24966(7));
            }
            return FutureC23690.m52928(EnumC19743.SKIPPED);
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private boolean m41077() {
        if (this.f56892 == null || this.f56912 || this.f56901 || this.f56903 || this.f56899 != null || this.f56905 || this.f56904 != null || this.f56906 != null || !this.f56907.m48300()) {
            return false;
        }
        return !this.f56897 || this.f56891 == this.f56910;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x012f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [l.ۢۢ᩸] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [l.ۢۢ᩸] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m41066(l.C7745 r16, l.C15530 r17, l.C11055 r18, final l.C20006 r19, l.C3598 r20, l.C13921 r21, java.lang.Runnable r22, long r23) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17505.m41066(l.۟۟᩸, l.ܳᩳ᩸, l.ۤᩳ᩸, l.ᩴᩳ᩸, l.ۗᩳ᩸, l.۬ܳܳ, java.lang.Runnable, long):boolean");
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private void m41072() {
        if (this.f56912) {
            throw new C13271("Text session is closed");
        }
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    private void m41075() {
        m41047();
        if (this.f56910 == C25227.FOREVER_NS) {
            throw new IllegalStateException("Session revision exhausted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public void m41047() {
        m41072();
        C20006 c20006 = this.f56892;
        if (c20006 != null && c20006.m46041()) {
            throw new IllegalStateException("Recovery generation requires reopening");
        }
        if (this.f56901 || this.f56903) {
            throw new IllegalStateException("Text session is closing or already editing");
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m41124() {
        synchronized (this) {
            if (this.f56912) {
                return this.f56909;
            }
            if (this.f56917 == null) {
                return m41087();
            }
            FutureC23690 futureC23690 = this.f56898;
            if (futureC23690 != null) {
                return futureC23690;
            }
            if (!this.f56903 && this.f56899 == null && !this.f56905 && this.f56904 == null && this.f56916 == 0) {
                if (this.f56897 && this.f56891 != this.f56910) {
                    throw new IllegalStateException("Current session state requires an explicit checkpoint");
                }
                if (this.f56897 && this.f56906 != null) {
                    throw new IllegalStateException("Stop loading before the final explicit checkpoint");
                }
                C20006 c20006 = this.f56892;
                if (c20006 == null || !c20006.m46041()) {
                    C14784 c14784 = this.f56906;
                    if (c14784 != null) {
                        C21170 c21170M48293 = this.f56907.m48293(EnumC14456.CANCELED, EnumC4016.NONE);
                        this.f56907 = c21170M48293;
                        c14784.f48390 = c21170M48293;
                        this.f56906 = null;
                        m41070(1L);
                    }
                    this.f56901 = true;
                    final FutureC23690 futureC23691 = new FutureC23690();
                    this.f56898 = futureC23691;
                    long j = this.f56910;
                    if (c14784 != null) {
                        c14784.m35628();
                    }
                    this.f56917.m33515(j).m52931(new InterfaceC2017() { // from class: l.ܿᩳ᩸
                        @Override // l.InterfaceC2017
                        /* JADX INFO: renamed from: ᩷ */
                        public final void mo1355(Object obj, Throwable th) {
                            C17505.m41063(this.f60206, futureC23691, th);
                        }
                    });
                    return futureC23691;
                }
                FutureC23690 futureC23692 = new FutureC23690();
                futureC23692.m52937((Throwable) new IOException("Recovery generation requires reopening; abandon before recovery"));
                return futureC23692;
            }
            throw new IllegalStateException("Cannot close during session edit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41063(C17505 c17505, FutureC23690 futureC23690, Throwable th) {
        if (th != null) {
            synchronized (c17505) {
                c17505.f56901 = false;
                c17505.f56898 = null;
            }
            futureC23690.m52937(th);
            return;
        }
        c17505.m41087().m52931((InterfaceC2017) new C4092(futureC23690));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m41087() {
        synchronized (this) {
            if (this.f56912) {
                return this.f56909;
            }
            if (this.f56903 || this.f56899 != null || this.f56905 || this.f56904 != null || this.f56916 != 0) {
                throw new IllegalStateException("Cannot abandon during session edit");
            }
            C14784 c14784 = this.f56906;
            if (c14784 != null) {
                c14784.f48390 = this.f56907.m48293(EnumC14456.CANCELED, EnumC4016.NONE);
            }
            this.f56906 = null;
            this.f56912 = true;
            C12547 c12547 = this.f56893;
            this.f56893 = null;
            this.f56895 = null;
            final C20006 c20006 = this.f56892;
            this.f56892 = null;
            this.f56915.m55483();
            if (c14784 != null) {
                c14784.m35628();
            }
            this.f56900.close();
            th = null;
            try {
                c12547.close();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                } else if (th != th) {
                    th.addSuppressed(th);
                }
            }
            try {
                C10046 c10046 = this.f56908;
                if (c10046 != null) {
                    c10046.close();
                }
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    th.addSuppressed(th2);
                }
            }
            C13710 c13710 = this.f56917;
            if (c13710 == null) {
                if (th == null) {
                    this.f56909.m52935((Object) null);
                } else {
                    this.f56909.m52937(th);
                }
                return this.f56909;
            }
            c13710.m33523().m52931(new InterfaceC2017() { // from class: l.֨ᩳ᩸
                @Override // l.InterfaceC2017
                /* JADX INFO: renamed from: ᩷ */
                public final void mo1355(Object obj, Throwable th3) {
                    C17505.m41056(this.f4850, th, c20006, th3);
                }
            });
            this.f56917.m33517();
            return this.f56909;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41056(C17505 c17505, Throwable th, C20006 c20006, Throwable th2) {
        FutureC23690 futureC23690 = c17505.f56909;
        if (th2 != null) {
            if (th == null) {
                th = th2;
            } else if (th != th2) {
                th.addSuppressed(th2);
            }
        }
        if (c20006 != null) {
            try {
                c20006.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else if (th != th3) {
                    th.addSuppressed(th3);
                }
            }
        }
        if (th == null) {
            futureC23690.m52935((Object) null);
        } else {
            futureC23690.m52937(th);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FutureC23690 futureC23690M41124 = m41124();
        if (C2589.m8660() && !futureC23690M41124.isDone()) {
            throw new IllegalStateException("Use closeAsync from persistence callbacks");
        }
        try {
            futureC23690M41124.m52947();
        } catch (C3552 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                IOException iOException = (IOException) cause;
                C22327.m50389(iOException);
                throw iOException;
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException("Failed to close text session", cause);
            }
            RuntimeException runtimeException = (RuntimeException) cause;
            C22327.m50389(runtimeException);
            throw runtimeException;
        }
    }
}
