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

/* JADX INFO: renamed from: l.֨ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1254 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f5445 = new AtomicBoolean();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f5446;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C2665 f5447;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11818 f5448;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public long f5449;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f5450;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C21571 f5451;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C21695 f5452;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C15346 f5453;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile boolean f5454;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f5455;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f5456;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3350 f5457;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f5458;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FutureC12075 f5459;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final UUID f5460;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C22401 f5461;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f5462;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f5463;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19455 f5464;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f5465;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f5466;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C16072 f5467;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f5468;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public volatile long f5469;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C8996 f5470;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C11113 f5471;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21799 f5472;

    public /* synthetic */ C1254(C16072 c16072, C21799 c21799, C21571 c21571, C21695 c21695, C22983 c22983, C0548 c0548, C17462 c17462, int i) {
        this(c16072, c21799, c21571, c21695, c22983, c0548, c17462);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized C22422 m4522() {
        m4488();
        m4520();
        if (this.f5455 || this.f5464 != null || !this.f5470.m23300()) {
            throw new IllegalStateException("Cannot transfer incomplete or editing session");
        }
        return new C22422(new C20990(this.f5472.m48558(), this.f5451, this.f5452, this.f5470, this.f5469));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4524(long j) {
        m4518();
        m4520();
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C21695 c21695 = this.f5452;
        if (j == c21695.f70378) {
            return;
        }
        C6899 c6899M18517 = c21695.f70379.m18517(this.f5461, j, m4521());
        C21695 c21696 = this.f5452;
        this.f5452 = new C21695(c6899M18517, c21696.f70377, c21696.f70376, c21696.f70375, j);
        m4486(1L);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m4525() {
        m4488();
        return this.f5452.f70379.m18518();
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4526() {
        if (this.f5471 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        m4518();
        m4520();
        if (this.f5456) {
            return;
        }
        this.f5456 = true;
        this.f5465 = this.f5469;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m4527() {
        C16072 c16072;
        m4488();
        c16072 = this.f5467;
        return c16072 == null ? this.f5460 : c16072.f51979;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4532(int i, int i2) {
        m4518();
        C8872 c8872 = new C8872(i, i2);
        if (i > this.f5472.length() || i2 > this.f5472.length()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (c8872.equals(this.f5452.f70377)) {
            return;
        }
        C21695 c21695 = this.f5452;
        this.f5452 = new C21695(c21695.f70379, c8872, c21695.f70376, c21695.f70375, c21695.f70378);
        m4486(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4534(C2665 c2665) {
        if (this.f5447 != c2665 || c2665.f10333) {
            throw new IllegalStateException("Text load publication is not active");
        }
        if (!m4510(c2665.f10331, c2665.f10330, c2665.f10329, c2665.f10334, c2665.f10332, c2665)) {
            throw new IllegalStateException("Text load publication was invalidated");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4536(C13935 c13935, C16736 c16736) {
        C11818 c11818 = this.f5448;
        if (c11818 == null || c11818.f39703 != c13935 || c13935.f45882) {
            throw new IllegalStateException("History replay step is not active");
        }
        c13935.f45882 = true;
        m4509(EnumC9226.USER, c16736, c13935);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4537(C19455 c19455) {
        if (this.f5464 == c19455) {
            m4518();
            m4520();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4538(C19455 c19455, C8996 c8996) {
        m4518();
        m4520();
        if (this.f5464 != null) {
            throw new IllegalStateException("Text loader is already active");
        }
        if (c8996 != null) {
            if (this.f5472.length() != 0 || this.f5470.m23307() != null || this.f5452.f70379.m18518() || !this.f5452.f70379.f23227.isEmpty()) {
                throw new IllegalStateException("Initial text loading requires an empty session");
            }
            this.f5470 = c8996;
        } else {
            if (this.f5470.m23300() || this.f5470.m23307() == null) {
                throw new IllegalStateException("No incomplete text source to resume");
            }
            this.f5470 = this.f5470.m23299(EnumC19579.LOADING, EnumC8290.NONE);
        }
        this.f5464 = c19455;
        c19455.f62635 = this.f5470;
        m4486(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4539(C19455 c19455, EnumC19579 enumC19579, EnumC8290 enumC8290) {
        m4520();
        if (this.f5464 != c19455) {
            return;
        }
        m4518();
        C8996 c8996M23299 = this.f5470.m23299(enumC19579, enumC8290);
        this.f5470 = c8996M23299;
        c19455.f62635 = c8996M23299;
        this.f5464 = null;
        m4486(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4540(C22422 c22422) {
        m4518();
        m4520();
        if (this.f5464 != null || this.f5456) {
            throw new IllegalStateException("Cannot replace active loading or checkpoint session");
        }
        synchronized (c22422) {
            C20990 c20990M49745 = C22422.m49745(c22422);
            C16072 c16072 = c20990M49745.f68349.m40840().f48220;
            C16072 c16073 = this.f5467;
            C3931.f14649.getClass();
            C4637 c4637 = new C4637(c16072, c16073, 0);
            try {
                C20990 c20990M12802 = c4637.m12802(c20990M49745);
                try {
                    C21799 c21799 = new C21799(c20990M12802.f68349.m40840(), c20990M12802.f68349.m17352());
                    C22401 c22401 = new C22401();
                    try {
                        C21695 c21695 = c20990M12802.f68350;
                        C21695 c21696 = new C21695(c21695.f70379.m18517(c22401, c21695.f70378, m4521()), c21695.f70377, c21695.f70376, c21695.f70375, c21695.f70378);
                        C16072 c16074 = this.f5467;
                        C21571 c21571M48288 = C21571.m48288(c16074 == null ? null : c16074.f51982, c20990M12802.f68351.f70014);
                        C21799 c217910 = this.f5472;
                        C21571 c21571 = this.f5451;
                        C22401 c22402 = this.f5461;
                        synchronized (this.f5462) {
                            this.f5472 = c21799;
                        }
                        this.f5451 = c21571M48288;
                        this.f5452 = c21696;
                        this.f5470 = c20990M12802.f68352;
                        this.f5461 = c22401;
                        try {
                            m4486(Math.max(1, c21799.length()));
                            c217910.close();
                            c21571.close();
                            c22402.m49683();
                            c20990M12802.close();
                            c4637.close();
                        } catch (Throwable th) {
                            c217910.close();
                            c21571.close();
                            c22402.m49683();
                            throw th;
                        }
                    } catch (Error e) {
                        e = e;
                        c21799.close();
                        c22401.m49683();
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        c21799.close();
                        c22401.m49683();
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        c20990M12802.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c4637.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m4543(InterfaceC10407 interfaceC10407, C19455 c19455, char[] cArr, int i, C8996 c8996, int i2) {
        if (this.f5464 == c19455 && !c19455.m44524()) {
            m4518();
            m4520();
            if (((long) this.f5472.length()) + ((long) i) > i2) {
                return false;
            }
            C2665 c2665 = new C2665(c19455, cArr, i, c8996, i2);
            this.f5447 = c2665;
            try {
                if (i == 0) {
                    m4534(c2665);
                } else {
                    interfaceC10407.mo26308(c2665);
                }
                boolean z = c2665.f10333;
                this.f5447 = null;
                return z;
            } catch (Throwable th) {
                this.f5447 = null;
                throw th;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m4544(C19455 c19455, char[] cArr, int i, C8996 c8996, int i2) {
        m4520();
        return m4510(c19455, cArr, i, c8996, i2, (C2665) null);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final synchronized C6276 m4545() {
        m4488();
        if (!this.f5470.m23300()) {
            throw new IllegalStateException("Text loading is incomplete");
        }
        return this.f5472.m48558();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final synchronized C8872 m4546() {
        m4488();
        return this.f5452.f70377;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C16072 m4547() {
        m4518();
        m4520();
        if (this.f5471 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        this.f5467.m38089();
        return this.f5467;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m4548() {
        m4488();
        return !this.f5452.f70379.f23227.isEmpty();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m4549() {
        m4488();
        return (byte[]) this.f5451.f70014.clone();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final synchronized C20990 m4550() {
        m4488();
        if (this.f5455 || this.f5448 != null || this.f5450 || this.f5447 != null) {
            throw new IllegalStateException("Cannot capture session during edit");
        }
        if (this.f5456 && this.f5465 != this.f5469) {
            throw new IllegalStateException("Current session state requires an explicit checkpoint");
        }
        return new C20990(this.f5472.m48558(), this.f5451, this.f5452, this.f5470, this.f5469);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC12075 m4551(long j) {
        C11113 c11113;
        m4488();
        m4520();
        if (this.f5471 == null && j > this.f5469) {
            throw new IllegalArgumentException("Revision exceeds current session");
        }
        c11113 = this.f5471;
        return c11113 == null ? FutureC12075.m30001(Long.valueOf(this.f5469)) : c11113.m28021(j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4552(byte[] bArr) {
        m4518();
        if (Arrays.equals(this.f5451.f70014, bArr)) {
            return;
        }
        C16072 c16072 = this.f5467;
        C21571 c21571M48288 = C21571.m48288(c16072 == null ? null : c16072.f51982, bArr);
        C21571 c21571 = this.f5451;
        this.f5451 = c21571M48288;
        try {
            m4486(Math.max(1, bArr.length));
            c21571.close();
        } catch (Throwable th) {
            c21571.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m4553(boolean z) {
        C13229 c13229M32713;
        m4488();
        c13229M32713 = C13229.m32713(this.f5452, z);
        return (c13229M32713 == null || c13229M32713.m32715() || !c13229M32713.m32714()) ? false : true;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4555() {
        m4518();
        m4520();
        if (this.f5464 != null) {
            throw new IllegalStateException("Text loading is still active");
        }
        this.f5470 = C8996.f30769;
        m4558();
        m4486(1L);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C8996 m4556() {
        m4488();
        return this.f5470;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4557() {
        m4488();
        C11113 c11113 = this.f5471;
        if (c11113 != null) {
            c11113.m28028();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4558() {
        m4518();
        m4520();
        if (this.f5452.f70379.m18518() || !this.f5452.f70379.f23227.isEmpty()) {
            C6899 c6899 = this.f5452.f70379;
            c6899.getClass();
            C6899 c68910 = new C6899(new C15346(), new C15346(), c6899.f23228, c6899.f23226);
            C21695 c21695 = this.f5452;
            this.f5452 = new C21695(c68910, c21695.f70377, c21695.f70376, c21695.f70375, c21695.f70378);
            this.f5461.m49683();
            m4486(1L);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized long m4560() {
        m4488();
        return this.f5452.f70376;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final synchronized long m4561() {
        m4488();
        return this.f5452.f70378;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m4563() {
        m4518();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized C3226 m4564() {
        C3226 c3226;
        m4518();
        m4520();
        if (!this.f5456) {
            throw new IllegalStateException("Explicit checkpoints are not enabled");
        }
        c3226 = new C3226(this, new C20990(this.f5472.m48558(), this.f5451, this.f5452, this.f5470, this.f5469 + 1), this.f5467.f51979, this.f5446);
        this.f5469++;
        return c3226;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4501(C1254 c1254, BooleanSupplier booleanSupplier, C20990 c20990, C1815 c1815, long j, long j2) {
        c1254.getClass();
        if (booleanSupplier.getAsBoolean() || c1254.f5466 || c1254.f5454 || c1254.f5469 != c20990.f68348) {
            throw new CancellationException("Automatic compaction yielded");
        }
        C14517 c14517 = c1815.f6976;
        if (System.nanoTime() - j >= j2) {
            throw new C4782();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4533(Runnable runnable) {
        m4518();
        m4520();
        this.f5453 = new C15346();
        this.f5449 = this.f5452.f70379.f23228;
        this.f5458 = 0L;
        try {
            runnable.run();
            try {
                C21695 c21695 = this.f5452;
                C6899 c6899M18517 = c21695.f70379.m18517(this.f5461, c21695.f70378, m4521());
                C21695 c21696 = this.f5452;
                C21695 c21697 = new C21695(c6899M18517, c21696.f70377, c21696.f70376, c21696.f70375, c21696.f70378);
                this.f5452 = c21697;
                long j = this.f5458;
                this.f5458 = 0L;
                this.f5449 = 0L;
                this.f5453 = null;
                try {
                    C22401 c22401 = this.f5461;
                    C6899 c6899 = c21697.f70379;
                    c22401.m49682(c6899.f23225, c6899.f23227);
                    if (j != 0) {
                        m4490(j);
                    }
                } catch (Throwable th) {
                    if (j != 0) {
                        m4490(j);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                long j2 = this.f5458;
                this.f5458 = 0L;
                this.f5449 = 0L;
                this.f5453 = null;
                try {
                    C22401 c22402 = this.f5461;
                    C6899 c68910 = this.f5452.f70379;
                    c22402.m49682(c68910.f23225, c68910.f23227);
                    throw th2;
                } finally {
                    if (j2 != 0) {
                        m4490(j2);
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                this.f5452 = new C21695(this.f5452.f70379.m18517(this.f5461, this.f5452.f70378, m4521()), this.f5452.f70377, this.f5452.f70376, this.f5452.f70375, this.f5452.f70378);
                long j3 = this.f5458;
                this.f5458 = 0L;
                this.f5449 = 0L;
                this.f5453 = null;
                try {
                    this.f5461.m49682(this.f5452.f70379.f23225, this.f5452.f70379.f23227);
                    if (j3 == j) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                    if (j3 != 0) {
                        m4490(j3);
                    }
                }
            } catch (Throwable th4) {
                long j4 = this.f5458;
                this.f5458 = 0L;
                this.f5449 = 0L;
                this.f5453 = null;
                try {
                    C22401 c22403 = this.f5461;
                    C6899 c68911 = this.f5452.f70379;
                    c22403.m49682(c68911.f23225, c68911.f23227);
                    throw th4;
                } finally {
                    if (j4 != 0) {
                        m4490(j4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4541(boolean z) {
        C6899 c6899;
        m4518();
        if (this.f5448 != null || this.f5450 || this.f5447 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        C6276 c6276M48558 = this.f5472.m48558();
        try {
            C14744 c14744M40840 = c6276M48558.m40840();
            C14744 c14744M35326 = C14744.m35326(c14744M40840.f48221, c14744M40840.f48223, c14744M40840.f48220);
            int iMax = Math.max(0, this.f5452.f70377.m23016());
            C21695 c21695 = this.f5452;
            long j = c21695.f70376;
            C1463 c1463 = new C1463(iMax, j, j, c21695.f70377, c14744M35326, c14744M35326);
            if (this.f5449 != 0) {
                C23128 c23128M18519 = this.f5452.f70379.m18519();
                if (c23128M18519 != null && c23128M18519.f75116 == this.f5449) {
                    C6899 c6899M4497 = m4497(this.f5452.f70379, new C15346().m36738(c1463));
                    C21695 c21696 = this.f5452;
                    this.f5452 = new C21695(c6899M4497, c21696.f70377, c21696.f70376, c21696.f70375, c21696.f70378);
                    this.f5461.m49682(c6899M4497.f23225, c6899M4497.f23227);
                    m4486(1L);
                    c6276M48558.close();
                    return;
                }
                this.f5453 = this.f5453.m36738(c1463);
                c6276M48558.close();
                return;
            }
            if (z) {
                C6899 c68910 = this.f5452.f70379;
                c6899 = new C6899(c68910.f23225, c68910.f23227, c68910.f23228, true);
            } else {
                c6899 = this.f5452.f70379;
            }
            C6899 c6899M18517 = c6899.m18515(c1463, System.currentTimeMillis()).m18517(this.f5461, this.f5452.f70378, m4521());
            C21695 c21697 = this.f5452;
            this.f5452 = new C21695(c6899M18517, c21697.f70377, c21697.f70376, c21697.f70375, c21697.f70378);
            m4486(1L);
            c6276M48558.close();
        } catch (Throwable th) {
            try {
                c6276M48558.close();
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
    public static long m4493(final l.C1254 r25, final java.util.function.BooleanSupplier r26, final l.C1815 r27, l.C0219 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1254.m4493(l.֨ܿۖ, java.util.function.BooleanSupplier, l.֫۫ۖ, l.֡ۛۘ):long");
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
    public final synchronized l.EnumC11839 m4529(boolean r18, l.InterfaceC2874 r19) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1254.m4529(boolean, l.ۗ֡ۖ):l.ۨܿۖ");
    }

    public C1254(C16072 c16072, C21799 c21799, C21571 c21571, C21695 c21695, C22983 c22983, C0548 c0548, C17462 c17462) {
        this.f5462 = new Object();
        this.f5470 = C8996.f30769;
        this.f5461 = new C22401();
        this.f5463 = new FutureC12075();
        this.f5460 = UUID.randomUUID();
        this.f5467 = c16072;
        this.f5472 = c21799;
        this.f5451 = c21571;
        this.f5452 = c21695;
        C22401 c22401 = this.f5461;
        C6899 c6899 = c21695.f70379;
        c22401.m49682(c6899.f23225, c6899.f23227);
        this.f5469 = c22983.m50849();
        this.f5471 = new C11113(c22983, c16072, c0548, c17462);
    }

    public C1254(CharSequence charSequence) {
        this.f5462 = new Object();
        this.f5470 = C8996.f30769;
        this.f5461 = new C22401();
        this.f5463 = new FutureC12075();
        this.f5460 = UUID.randomUUID();
        this.f5472 = new C21799(charSequence);
        this.f5452 = new C21695();
        this.f5451 = C21571.m48288(null, new byte[0]);
        this.f5471 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1254 m4494(CharSequence charSequence) {
        return new C1254(charSequence);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m4521() {
        return this.f5471 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4508(InterfaceC3800 interfaceC3800) {
        C3350.m9975(interfaceC3800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1254 m4495(InterfaceC3800 interfaceC3800, C10428 c10428, C16777 c16777) {
        C3350[] c3350Arr = new C3350[1];
        C1939[] c1939Arr = new C1939[1];
        C1254 c1254M4496 = null;
        try {
            c1254M4496 = m4496(c10428, c16777, C17462.f55565, new C16633(c3350Arr, interfaceC3800, c1939Arr, c10428));
            c3350Arr[0].m9986(c1939Arr[0], c1254M4496.f5469);
            c1939Arr[0].m6300();
            c1254M4496.f5457 = c3350Arr[0];
            return c1254M4496;
        } catch (Throwable th) {
            if (c1254M4496 != null) {
                try {
                    c1254M4496.m4530().m30027();
                } catch (Throwable th2) {
                    try {
                        C1939 c1939 = c1939Arr[0];
                        if (c1939 != null) {
                            c1939.close();
                        }
                        throw th2;
                    } finally {
                        C3350 c3350 = c3350Arr[0];
                        if (c3350 != null) {
                            c3350.close();
                        }
                    }
                }
            }
            try {
                C1939 c19310 = c1939Arr[0];
                if (c19310 != null) {
                    c19310.close();
                }
                throw th;
            } finally {
                C3350 c3351 = c3350Arr[0];
                if (c3351 != null) {
                    c3351.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1254 m4496(C10428 c10428, C16777 c16777, C17462 c17462, C16633 c16633) throws Throwable {
        C16072 c16072;
        C21571 c21571M48288;
        C0548 c0548M39352 = c16777.m39352();
        C21799 c21799 = null;
        try {
            C3350[] c3350Arr = c16633.f53360;
            InterfaceC3800 interfaceC3800 = c16633.f53362;
            C1939[] c1939Arr = c16633.f53361;
            C10428 c10429 = c16633.f53359;
            C3350 c3350M9963 = C3350.m9963(interfaceC3800);
            c3350Arr[0] = c3350M9963;
            C1939 c1939M9980 = c3350M9963.m9980(c10429);
            c1939Arr[0] = c1939M9980;
            c16072 = c1939M9980.f7322;
            try {
                c21571M48288 = C21571.m48288(c10428, new byte[0]);
                try {
                    C21799 c217910 = new C21799(C14744.m35326(c16072.f51978, c16072.f51976, c16072), 0L);
                    try {
                        C22983 c22983 = new C22983(c16072);
                        C21695 c21695 = new C21695();
                        C6276 c6276M48558 = c217910.m48558();
                        try {
                            byte[] bArr = c21571M48288.f70014;
                            synchronized (c22983) {
                                c22983.m50852(c6276M48558, bArr, c21695, null, 0L);
                            }
                            c6276M48558.close();
                            return new C1254(c16072, c217910, c21571M48288, c21695, c22983, c0548M39352, c17462);
                        } catch (Throwable th) {
                            try {
                                c6276M48558.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c21799 = c217910;
                        if (c21799 != null) {
                            try {
                                c21799.close();
                            } catch (Throwable th4) {
                                if (c16072 != null) {
                                    try {
                                        c16072.close();
                                    } finally {
                                        c0548M39352.close();
                                    }
                                }
                                throw th4;
                            }
                        }
                        if (c21571M48288 != null) {
                            c21571M48288.close();
                        }
                        if (c16072 != null) {
                            try {
                                c16072.close();
                            } finally {
                                c0548M39352.close();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c21571M48288 = null;
            }
        } catch (Throwable th7) {
            th = th7;
            c16072 = null;
            c21571M48288 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5488 m4516(InterfaceC3800 interfaceC3800, C10428 c10428, C16777 c16777) {
        C3350 c3350M9960;
        C16072 c16072M38086;
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        C0548 c0548M39352 = c16777.m39352();
        C6754 c6754M50850 = null;
        try {
            c3350M9960 = C3350.m9960(interfaceC3800);
            try {
                C9702 c9702M9984 = c3350M9960.m9984();
                c16072M38086 = C16072.m38086(interfaceC1959.mo6325(c3350M9960.m9983(c9702M9984), false), c10428);
                try {
                    C22983 c22983 = new C22983(c16072M38086);
                    c6754M50850 = c22983.m50850(C3931.f14649);
                    C3350.m9967(c9702M9984, c16072M38086, c6754M50850.f22785);
                    C5488 c5488 = new C5488(c16072M38086, c22983, c6754M50850, c0548M39352);
                    c5488.f18878 = c3350M9960;
                    return c5488;
                } catch (Throwable th) {
                    th = th;
                    if (c6754M50850 != null) {
                        try {
                            c6754M50850.close();
                        } catch (Throwable th2) {
                            if (c16072M38086 != null) {
                                try {
                                    c16072M38086.close();
                                } catch (Throwable th3) {
                                    if (c3350M9960 != null) {
                                        try {
                                            c3350M9960.close();
                                        } finally {
                                            c0548M39352.close();
                                        }
                                    }
                                    throw th3;
                                }
                            }
                            if (c3350M9960 != null) {
                                try {
                                    c3350M9960.close();
                                } finally {
                                    c0548M39352.close();
                                }
                            }
                            throw th2;
                        }
                    }
                    if (c16072M38086 != null) {
                        try {
                            c16072M38086.close();
                        } catch (Throwable th4) {
                            if (c3350M9960 != null) {
                                try {
                                    c3350M9960.close();
                                } finally {
                                    c0548M39352.close();
                                }
                            }
                            throw th4;
                        }
                    }
                    if (c3350M9960 != null) {
                        try {
                            c3350M9960.close();
                        } finally {
                            c0548M39352.close();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c16072M38086 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            c3350M9960 = null;
            c16072M38086 = null;
        }
    }

    public final int length() {
        int length;
        synchronized (this.f5462) {
            length = this.f5472.length();
        }
        return length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m4528(int i) {
        C14744 c14744M48559;
        synchronized (this.f5462) {
            c14744M48559 = this.f5472.m48559(i);
        }
        C16072 c16072 = c14744M48559.f48220;
        try {
            return c14744M48559.m35331(i);
        } finally {
            if (c16072 != null) {
                c16072.m38088();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m4523() {
        return this.f5469;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m4562() {
        C11113 c11113 = this.f5471;
        return c11113 == null ? this.f5469 : c11113.m28029();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C6276 m4554() {
        C6276 c6276M48558;
        synchronized (this.f5462) {
            c6276M48558 = this.f5472.m48558();
        }
        return c6276M48558;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4542(C6276 c6276) {
        boolean zM48561;
        synchronized (this.f5462) {
            zM48561 = this.f5472.m48561(c6276);
        }
        return zM48561;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m4510(final C19455 c19455, final char[] cArr, final int i, final C8996 c8996, int i2, C2665 c2665) {
        if (this.f5464 == c19455 && !c19455.m44524()) {
            m4518();
            long j = i;
            if (((long) this.f5472.length()) + j <= i2) {
                this.f5455 = true;
                try {
                    if (i != 0) {
                        this.f5472.m48560(new Consumer() { // from class: l.ۧ۫ۖ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C1455.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                C19455 c19456 = c19455;
                                char[] cArr2 = cArr;
                                int i3 = i;
                                C8996 c8997 = c8996;
                                C15450 c15450 = (C15450) obj;
                                try {
                                    c19456.m44520();
                                    c15450.m36972(c15450.m36973(), c15450.m36973(), CharBuffer.wrap(cArr2, 0, i3));
                                    c19456.m44521(c8997.m23300());
                                } catch (IOException e) {
                                    throw new UncheckedIOException(e);
                                }
                            }
                        }, null);
                    } else {
                        try {
                            c19455.m44521(c8996.m23300());
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f5470 = c8996;
                    c19455.f62635 = c8996;
                    if (c2665 != null) {
                        c2665.f10333 = true;
                    }
                    if (c8996.m23300()) {
                        this.f5464 = null;
                    }
                    m4486(Math.max(1L, j * 2));
                    this.f5455 = false;
                    return true;
                } catch (Throwable th) {
                    this.f5455 = false;
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6899 m4497(C6899 c6899, C15346 c15346) {
        if (c15346.isEmpty()) {
            return c6899;
        }
        C23128 c23128M18519 = c6899.m18519();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c23128M18519 != null) {
            long j = c23128M18519.f75116;
            if (j == this.f5449) {
                return new C6899(c6899.f23225.m36741(new C23128(j, jCurrentTimeMillis, EnumC9226.BATCH, c23128M18519.f75113.m36739(c15346))), c6899.f23227, c6899.f23228, c6899.f23226);
            }
        }
        return c6899.m18516(this.f5453.m36739(c15346), jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4535(C12503 c12503) {
        EnumC9226 enumC9226 = EnumC9226.USER;
        synchronized (this) {
            m4509(enumC9226, c12503, (C13935) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ۛ۫ۖ] */
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
    private void m4509(final EnumC9226 enumC9226, final Consumer consumer, C13935 c13935) throws Throwable {
        boolean z;
        m4518();
        EnumC9226 enumC9227 = EnumC9226.LOADER;
        if (enumC9226 == enumC9227) {
            m4520();
        }
        if (enumC9226 != EnumC9226.USER && enumC9226 != EnumC9226.BATCH && enumC9226 != enumC9227) {
            throw new IllegalArgumentException("Unsupported session edit origin");
        }
        int i = 1;
        this.f5455 = true;
        long jM48562 = this.f5472.m48562();
        final long[] jArr = new long[1];
        final C21695 c21695 = this.f5452;
        final C21695[] c21695Arr = new C21695[1];
        final C8872[] c8872Arr = {c21695.f70377};
        C1233 c1233 = (enumC9226 == enumC9227 || c13935 != null) ? null : new C1233(enumC9226, c21695.f70376, c21695.f70375, new C5675(i, c8872Arr), true);
        int i2 = 0;
        C11818 c11818 = this.f5448;
        final C1233 c1234 = c11818 != null ? new C1233(EnumC9226.BATCH, c11818.f39706, c11818.f39697, new C12400(i2, c8872Arr), false) : null;
        try {
            final C1233 c1235 = c1233;
            final C1233 c1236 = c1233;
            z = false;
            try {
                this.f5472.m48560(new Consumer() { // from class: l.ܿ۫ۖ
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C1254.m4502(this.f55169, consumer, jArr, c1235, c21695, c21695Arr, c8872Arr, c1234, (C15450) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return C1455.$default$andThen(this, consumer2);
                    }
                }, new InterfaceC23211() { // from class: l.ۛ۫ۖ
                    @Override // l.InterfaceC23211
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo4432(int i3, int i4, C14744 c14744, C14744 c14745, int i5) {
                        if (enumC9226 == EnumC9226.LOADER) {
                            if (i3 != c14744.m35339() || i4 != i3) {
                                throw new IllegalArgumentException("Loader may only append text");
                            }
                            return;
                        }
                        C1233 c1237 = c1236;
                        if (c1237 != null) {
                            c1237.mo4432(i3, i4, c14744, c14745, i5);
                        }
                        C1233 c1238 = c1234;
                        if (c1238 != null) {
                            c1238.mo4432(i3, i4, c14744, c14745, i5);
                        }
                        C8872[] c8872Arr2 = c8872Arr;
                        c8872Arr2[0] = c8872Arr2[0].m23015(i3, i4, i5);
                    }
                });
                if (this.f5472.m48562() != jM48562) {
                    if (c1234 != null) {
                        this.f5448.m29491();
                    }
                    this.f5452 = c21695Arr[0];
                    m4486(jArr[0]);
                }
                try {
                    C22401 c22401 = this.f5461;
                    C6899 c6899 = this.f5452.f70379;
                    c22401.m49682(c6899.f23225, c6899.f23227);
                } finally {
                    this.f5455 = false;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C22401 c22402 = this.f5461;
                    C6899 c68910 = this.f5452.f70379;
                    c22402.m49682(c68910.f23225, c68910.f23227);
                    throw th;
                } finally {
                    this.f5455 = z;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4502(C1254 c1254, Consumer consumer, long[] jArr, C1233 c1233, C21695 c21695, C21695[] c21695Arr, C8872[] c8872Arr, C1233 c1234, C15450 c15450) {
        C6899 c6899M4497;
        consumer.accept(c15450);
        jArr[0] = c15450.m36970();
        if (c1233 == null) {
            c6899M4497 = c21695.f70379;
        } else {
            c6899M4497 = c1254.f5449 != 0 ? c1254.m4497(c21695.f70379, c1233.m4431()) : c1233.m4430(c21695.f70379, System.currentTimeMillis());
        }
        if (c1254.f5449 == 0) {
            c6899M4497 = c6899M4497.m18517(c1254.f5461, c21695.f70378, c1254.m4521());
        }
        C21695 c21696 = new C21695(c6899M4497, c8872Arr[0], c1233 == null ? c21695.f70376 : c1233.m4434(), c1233 == null ? c21695.f70375 : c1233.m4433(), c21695.f70378);
        c21695Arr[0] = c21696;
        if (c1234 != null) {
            c1254.f5448.m29490(c1234, c21696);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public void m4520() {
        if (this.f5448 != null || this.f5450 || this.f5447 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        if (this.f5449 != 0) {
            throw new IllegalStateException("Operation is unavailable during history grouping");
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m4486(long j) {
        this.f5469++;
        if (this.f5449 != 0) {
            long jMax = Math.max(1L, j);
            long j2 = this.f5458;
            long j3 = C17492.FOREVER_NS;
            if (jMax <= C17492.FOREVER_NS - j2) {
                j3 = j2 + jMax;
            }
            this.f5458 = j3;
            return;
        }
        m4490(j);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m4490(long j) {
        C11113 c11113;
        boolean z = this.f5456;
        long j2 = C17492.FOREVER_NS;
        if (z) {
            long j3 = this.f5446;
            this.f5446 = j > C17492.FOREVER_NS - j3 ? Long.MAX_VALUE : j3 + j;
        }
        C11818 c11818 = this.f5448;
        if (c11818 != null) {
            long j4 = c11818.f39705;
            if (j <= C17492.FOREVER_NS - j4) {
                j2 = j4 + j;
            }
            c11818.f39705 = j2;
            return;
        }
        if (z || (c11113 = this.f5471) == null) {
            return;
        }
        c11113.m28027(new C20990(this.f5472.m48558(), this.f5451, this.f5452, this.f5470, this.f5469), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22422 m4498(C17367 c17367) {
        return new C22422(C18043.m42027(c17367));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.᩻۫ۖ] */
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
    public final FutureC12075 m4531(final BooleanSupplier booleanSupplier) {
        final C1815 c1815 = C1815.f6975;
        final C0219 c0219 = new C0219();
        synchronized (this) {
            C13638.requireNonNull(booleanSupplier);
            if (m4513()) {
                return this.f5471.m28022((C23689) new InterfaceC12524() { // from class: l.᩻۫ۖ
                    @Override // l.InterfaceC12524
                    public final long run() {
                        return C1254.m4493(this.f76660, booleanSupplier, c1815, c0219);
                    }
                }, true).m30032((InterfaceC15954) new C19084(6));
            }
            return FutureC12075.m30001(EnumC9578.SKIPPED);
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private boolean m4513() {
        if (this.f5457 == null || this.f5466 || this.f5454 || this.f5455 || this.f5448 != null || this.f5450 || this.f5447 != null || this.f5464 != null || !this.f5470.m23300()) {
            return false;
        }
        return !this.f5456 || this.f5465 == this.f5469;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x012f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [l.ܺܿۖ] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [l.ܺܿۖ] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m4511(l.C20990 r16, l.C4637 r17, l.C1939 r18, l.C3350 r19, l.C22983 r20, l.C0219 r21, java.lang.Runnable r22, long r23) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1254.m4511(l.᩷ܽۖ, l.ۙ۫ۖ, l.֫ܽۖ, l.ۗܽۖ, l.᩺۫ۖ, l.֡ۛۘ, java.lang.Runnable, long):boolean");
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    private void m4488() {
        if (this.f5466) {
            throw new C4865("Text session is closed");
        }
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    private void m4518() {
        m4491();
        if (this.f5469 == C17492.FOREVER_NS) {
            throw new IllegalStateException("Session revision exhausted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public void m4491() {
        m4488();
        C3350 c3350 = this.f5457;
        if (c3350 != null && c3350.m9979()) {
            throw new IllegalStateException("Recovery generation requires reopening");
        }
        if (this.f5454 || this.f5455) {
            throw new IllegalStateException("Text session is closing or already editing");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m4559() {
        synchronized (this) {
            if (this.f5466) {
                return this.f5463;
            }
            if (this.f5471 == null) {
                return m4530();
            }
            FutureC12075 futureC12075 = this.f5459;
            if (futureC12075 != null) {
                return futureC12075;
            }
            if (!this.f5455 && this.f5448 == null && !this.f5450 && this.f5447 == null && this.f5449 == 0) {
                if (this.f5456 && this.f5465 != this.f5469) {
                    throw new IllegalStateException("Current session state requires an explicit checkpoint");
                }
                if (this.f5456 && this.f5464 != null) {
                    throw new IllegalStateException("Stop loading before the final explicit checkpoint");
                }
                C3350 c3350 = this.f5457;
                if (c3350 == null || !c3350.m9979()) {
                    C19455 c19455 = this.f5464;
                    if (c19455 != null) {
                        C8996 c8996M23299 = this.f5470.m23299(EnumC19579.CANCELED, EnumC8290.NONE);
                        this.f5470 = c8996M23299;
                        c19455.f62635 = c8996M23299;
                        this.f5464 = null;
                        m4486(1L);
                    }
                    this.f5454 = true;
                    FutureC12075 futureC12076 = new FutureC12075();
                    this.f5459 = futureC12076;
                    long j = this.f5469;
                    if (c19455 != null) {
                        c19455.m44522();
                    }
                    this.f5471.m28021(j).m30016((InterfaceC7486) new C0732(this, futureC12076));
                    return futureC12076;
                }
                FutureC12075 futureC12077 = new FutureC12075();
                futureC12077.m30021((Throwable) new IOException("Recovery generation requires reopening; abandon before recovery"));
                return futureC12077;
            }
            throw new IllegalStateException("Cannot close during session edit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4506(C1254 c1254, FutureC12075 futureC12075, Throwable th) {
        if (th != null) {
            synchronized (c1254) {
                c1254.f5454 = false;
                c1254.f5459 = null;
            }
            futureC12075.m30021(th);
            return;
        }
        c1254.m4530().m30016((InterfaceC7486) new C0404(futureC12075));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m4530() {
        synchronized (this) {
            if (this.f5466) {
                return this.f5463;
            }
            if (this.f5455 || this.f5448 != null || this.f5450 || this.f5447 != null || this.f5449 != 0) {
                throw new IllegalStateException("Cannot abandon during session edit");
            }
            C19455 c19455 = this.f5464;
            if (c19455 != null) {
                c19455.f62635 = this.f5470.m23299(EnumC19579.CANCELED, EnumC8290.NONE);
            }
            this.f5464 = null;
            this.f5466 = true;
            C21571 c21571 = this.f5451;
            this.f5451 = null;
            this.f5452 = null;
            final C3350 c3350 = this.f5457;
            this.f5457 = null;
            this.f5461.m49683();
            if (c19455 != null) {
                c19455.m44522();
            }
            this.f5472.close();
            th = null;
            try {
                c21571.close();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                } else if (th != th) {
                    th.addSuppressed(th);
                }
            }
            try {
                C16072 c16072 = this.f5467;
                if (c16072 != null) {
                    c16072.close();
                }
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    th.addSuppressed(th2);
                }
            }
            C11113 c11113 = this.f5471;
            if (c11113 == null) {
                if (th == null) {
                    this.f5463.m30019((Object) null);
                } else {
                    this.f5463.m30021(th);
                }
                return this.f5463;
            }
            c11113.m28020().m30016(new InterfaceC7486() { // from class: l.᩶۫ۖ
                @Override // l.InterfaceC7486
                /* JADX INFO: renamed from: ܰ */
                public final void mo2142(Object obj, Throwable th3) {
                    C1254.m4500(this.f65473, th, c3350, th3);
                }
            });
            this.f5471.m28024();
            return this.f5463;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4500(C1254 c1254, Throwable th, C3350 c3350, Throwable th2) {
        FutureC12075 futureC12075 = c1254.f5463;
        if (th2 != null) {
            if (th == null) {
                th = th2;
            } else if (th != th2) {
                th.addSuppressed(th2);
            }
        }
        if (c3350 != null) {
            try {
                c3350.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else if (th != th3) {
                    th.addSuppressed(th3);
                }
            }
        }
        if (th == null) {
            futureC12075.m30019((Object) null);
        } else {
            futureC12075.m30021(th);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FutureC12075 futureC12075M4559 = m4559();
        if (C16777.m39350() && !futureC12075M4559.isDone()) {
            throw new IllegalStateException("Use closeAsync from persistence callbacks");
        }
        try {
            futureC12075M4559.m30027();
        } catch (C17013 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException("Failed to close text session", cause);
            }
            throw ((RuntimeException) cause);
        }
    }
}
