package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܿܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18467 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ExecutorC7258 f60099 = new ExecutorC7258(Runtime.getRuntime().availableProcessors());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f60101;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3025 f60102;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f60104;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20705 f60105;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22528 f60106;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile C3551 f60108;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f60109;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f60110;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Executor f60111;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C4297 f60112;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22528 f60113;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11754 f60114;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12500 f60116;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f60117;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f60118;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9629 f60119;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f60120;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23689 f60121;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9629 f60124;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20661 f60125;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f60126;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60128;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ExecutorC21429 f60129;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f60130;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f60131;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f60132;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f60122 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f60127 = new ArrayDeque();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f60115 = new Object();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12478 f60107 = new C12478();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10438 f60103 = new C10438();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f60100 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f60123 = true;

    public C18467(ExecutorC21429 executorC21429, InterfaceC23689 interfaceC23689) {
        ExecutorC7258 executorC7258 = f60099;
        C17359.requireNonNull(executorC7258, "workerExecutor");
        this.f60111 = executorC7258;
        this.f60126 = executorC7258.f23919;
        this.f60129 = executorC21429;
        this.f60121 = interfaceC23689;
        this.f60130 = 4096;
        this.f60120 = 8000000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43041(C20661 c20661, InterfaceC9629 interfaceC9629, C1270 c1270, int i) {
        m43023(c20661, interfaceC9629, interfaceC9629.mo15344(), interfaceC9629.length(), EnumC6535.FRESH, c1270, i, 0, 0, 0, -1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43040(C20661 c20661, InterfaceC9629 interfaceC9629, int i, int i2, int i3, C1270 c1270, int i4) {
        C17359.requireNonNull(interfaceC9629, TextBundle.TEXT_ENTRY);
        int iMo15344 = interfaceC9629.mo15344();
        int length = interfaceC9629.length();
        long j = i2;
        long j2 = (((long) length) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || j2 < 0 || j2 > 2147483647L || ((long) i) + j > j2) {
            throw new IndexOutOfBoundsException("Invalid syntax worker edit range");
        }
        m43023(c20661, interfaceC9629, iMo15344, length, EnumC6535.EDIT, c1270, i4, i, i2, i3, -1, -1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43048(C20661 c20661, InterfaceC9629 interfaceC9629, int i, int i2, int i3) {
        C17359.requireNonNull(c20661, "program");
        C17359.requireNonNull(interfaceC9629, TextBundle.TEXT_ENTRY);
        int iMo15344 = interfaceC9629.mo15344();
        int length = interfaceC9629.length();
        C17359.checkFromToIndex(i, i2, length);
        m43023(c20661, interfaceC9629, iMo15344, length, EnumC6535.WINDOW, null, i3, 0, 0, 0, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43039(C20661 c20661, InterfaceC9629 interfaceC9629, int i, int i2, int i3) {
        C22528 c22528;
        int iMo15344 = interfaceC9629.mo15344();
        long j = i2;
        long length = (((long) interfaceC9629.length()) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || length < 0 || length > 2147483647L || ((long) i) + j > length) {
            throw new IndexOutOfBoundsException("Invalid syntax window edit range");
        }
        try {
            synchronized (this.f60122) {
                m43029();
                m43028();
                this.f60103.m26792();
                C12478 c12478 = this.f60107;
                C20705 c20705 = this.f60105;
                if (c12478.m30981() != (c20705 == null ? null : c20705.f66372)) {
                    c12478.m30979();
                    m43025();
                }
                m43013();
                m43025();
                if (this.f60117 && this.f60125 == c20661 && this.f60119 == interfaceC9629 && this.f60112 != null && (c22528 = this.f60113) != null && this.f60101 + 1 == iMo15344 && c22528.m50767() == length) {
                    this.f60113 = this.f60113.m50757(new C10593(i, i2 + i, i3));
                    this.f60101 = iMo15344;
                } else {
                    m43027();
                }
            }
            m43031();
        } catch (Throwable th) {
            m43031();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20705 m43045() {
        C20705 c20705;
        synchronized (this.f60122) {
            c20705 = this.f60105;
        }
        return c20705;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4297 m43049() {
        C4297 c4297;
        synchronized (this.f60122) {
            c4297 = this.f60112;
        }
        return c4297;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43038(InterfaceC9629 interfaceC9629, int i, int i2) {
        if (i < 0 || i >= i2 || i2 > interfaceC9629.length()) {
            return;
        }
        synchronized (this.f60122) {
            if (this.f60119 != interfaceC9629) {
                return;
            }
            this.f60124 = interfaceC9629;
            this.f60110 = interfaceC9629.mo15344();
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.f60100 = j;
            C12500 c12500 = this.f60116;
            if (c12500 == null) {
                C11754 c11754 = this.f60114;
                c12500 = c11754 == null ? null : c11754.f37999;
            }
            if (c12500 != null && C12500.m31053(c12500)) {
                c12500.f40146 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3551 m43047() {
        return this.f60108;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43021(final C18467 c18467, C12500 c12500, C23667 c23667) {
        synchronized (c18467.f60122) {
            C11754 c11754 = c18467.f60114;
            if (c11754 != null && c11754.f37999 == c12500 && !c12500.f40148 && c18467.f60132 == c12500.f40142 && C12500.m31053(c12500)) {
                if (c18467.f60108 != null) {
                    c18467.f60108.f12175 = true;
                }
                c18467.f60108 = new C3551(c12500, c23667);
                final long j = c12500.f40142;
                c18467.m43017(new Runnable() { // from class: l.᩸ܽᩴ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18467.m43033(this.f74546, j);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43033(C18467 c18467, long j) {
        synchronized (c18467.f60122) {
            C3551 c3551 = c18467.f60108;
            if (c3551 != null && c3551.f12177 == j && c3551.m11575()) {
                C2783.m9161(((C18445) c18467.f60121).f60049, c3551);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m43035(InterfaceC9629 interfaceC9629) {
        long j;
        synchronized (this.f60122) {
            j = this.f60119 == interfaceC9629 ? this.f60132 : 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43037(long j) {
        if (j != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(500L) + System.nanoTime();
            synchronized (this.f60122) {
                while (this.f60132 == j && (this.f60116 != null || this.f60114 != null)) {
                    long jNanoTime = nanos - System.nanoTime();
                    if (jNanoTime <= 0) {
                        return;
                    } else {
                        TimeUnit.NANOSECONDS.timedWait(this.f60122, jNanoTime);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43044(C20705 c20705) {
        boolean z;
        synchronized (this.f60122) {
            z = this.f60105 == c20705 && this.f60132 == c20705.f66373 && m43024(c20705.f66375, c20705.f66371);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43042(C4297 c4297) {
        boolean z;
        synchronized (this.f60122) {
            z = this.f60112 == c4297 && this.f60132 == c4297.f15580 && m43024(c4297.f15582, c4297.f15581);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43043(C16975 c16975) {
        boolean z;
        synchronized (this.f60122) {
            z = c16975.f55494 == this.f60115 && this.f60132 == c16975.f55500 && m43024(c16975.f55495, c16975.f55498);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m43046() {
        try {
            synchronized (this.f60122) {
                m43029();
                m43028();
                this.f60107.m30980();
                this.f60103.m26792();
                C2761 c2761 = null;
                this.f60102 = null;
                C12478 c12478 = this.f60107;
                C20705 c20705 = this.f60105;
                if (c20705 != null) {
                    c2761 = c20705.f66372;
                }
                if (c12478.m30981() != c2761) {
                    c12478.m30979();
                    m43025();
                }
                m43013();
                m43025();
                m43027();
            }
            m43031();
        } catch (Throwable th) {
            m43031();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43036() {
        try {
            synchronized (this.f60122) {
                m43029();
                m43028();
                this.f60107.m30979();
                this.f60103.m26790();
                this.f60125 = null;
                this.f60119 = null;
                this.f60124 = null;
                this.f60100 = -1L;
                this.f60117 = false;
                this.f60102 = null;
                this.f60105 = null;
                this.f60112 = null;
                m43025();
                m43027();
            }
            m43031();
        } catch (Throwable th) {
            m43031();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43023(C20661 c20661, InterfaceC9629 interfaceC9629, int i, int i2, EnumC6535 enumC6535, C1270 c1270, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zM43030;
        C22528 c22528;
        C22528 c22529;
        C17359.requireNonNull(c20661, "program");
        C17359.requireNonNull(interfaceC9629, TextBundle.TEXT_ENTRY);
        if (enumC6535 != EnumC6535.WINDOW && c1270 != null && c1270.m4628() != i2) {
            throw new IllegalArgumentException("Display syntax base length mismatch");
        }
        try {
            synchronized (this.f60122) {
                try {
                    C3551 c3551 = this.f60108;
                    boolean z = this.f60119 != interfaceC9629;
                    C20661 c20662 = this.f60125;
                    boolean z2 = (c20662 == c20661 && !z && (c20662 == null || this.f60117 == enumC6535.m18412())) ? false : true;
                    m43029();
                    m43028();
                    if (z2) {
                        this.f60107.m30979();
                        this.f60103.m26790();
                        if (this.f60124 != interfaceC9629) {
                            this.f60124 = null;
                            this.f60100 = -1L;
                        }
                        this.f60125 = c20661;
                        this.f60119 = interfaceC9629;
                        this.f60117 = enumC6535.m18412();
                        this.f60105 = null;
                        this.f60112 = null;
                        m43025();
                        m43027();
                    } else if (enumC6535.m18412()) {
                        this.f60103.m26792();
                    } else {
                        this.f60107.m30980();
                    }
                    boolean z3 = z2;
                    long j = (((long) i2) - ((long) i6)) + ((long) i5);
                    if (enumC6535 == EnumC6535.EDIT && this.f60118 && this.f60105 != null && (c22529 = this.f60106) != null && this.f60128 + 1 == i && c22529.m50767() == j) {
                        this.f60106 = this.f60106.m50757(new C10593(i4, i5 + i4, i6));
                        this.f60128 = i;
                    } else {
                        m43025();
                    }
                    if (!enumC6535.m18412() || (c22528 = this.f60113) == null || this.f60101 != i || c22528.m50767() != i2) {
                        m43027();
                    }
                    C20705 c20705 = this.f60118 ? this.f60105 : null;
                    C3025 c3025 = this.f60102;
                    if (c3025 == null || c3025.f9812 != c20661 || c3025.f9815 != interfaceC9629 || c3025.f9814 != i || c3025.f9813 != i2) {
                        this.f60102 = new C3025(c20661, interfaceC9629, i, i2, this.f60126);
                    }
                    C12500 c12500 = new C12500(this.f60132, this.f60102, enumC6535, c20705, enumC6535.m18412() ? this.f60113 : this.f60106, c1270, i3, i7, i8, this.f60113 == null ? null : this.f60112);
                    this.f60116 = c12500;
                    if (this.f60124 == interfaceC9629 && this.f60110 == i) {
                        long j2 = this.f60100;
                        if (j2 != -1) {
                            c12500.f40146 = j2;
                        }
                    }
                    if (!z3 && c3551 != null && enumC6535.m18412() && c3551.f12176 == this.f60102) {
                        C23667 c23667 = c3551.f12174;
                        if (c23667.f76756 < i8 && c23667.f76757 > i7) {
                            this.f60108 = new C3551(this.f60116, c23667);
                        }
                    }
                    zM43030 = m43030();
                } catch (Throwable th) {
                    throw th;
                }
            }
            m43031();
            if (zM43030) {
                m43034();
            }
        } catch (Throwable th2) {
            m43031();
            throw th2;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x037e */
    /* JADX WARN: Code duplicated, block: B:203:0x03a2 A[Catch: all -> 0x0407, TryCatch #22 {, blocks: (B:196:0x038a, B:198:0x038e, B:200:0x0398, B:201:0x039b, B:203:0x03a2, B:204:0x03a7, B:206:0x03b1, B:208:0x03b5, B:209:0x03ba, B:210:0x03be), top: B:393:0x038a }] */
    /* JADX WARN: Code duplicated, block: B:213:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:215:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:258:0x043b A[Catch: all -> 0x0446, TryCatch #21 {, blocks: (B:256:0x0437, B:258:0x043b, B:259:0x043d, B:260:0x0444), top: B:391:0x0437, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0456 A[Catch: all -> 0x051e, TryCatch #34 {all -> 0x051e, blocks: (B:254:0x0434, B:255:0x0436, B:261:0x0445, B:264:0x0448, B:269:0x0452, B:271:0x0456, B:273:0x045a, B:275:0x0465, B:279:0x0471, B:280:0x0473, B:329:0x051d, B:256:0x0437, B:258:0x043b, B:259:0x043d, B:260:0x0444, B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:407:0x0036, inners: #21, #31 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x0478 A[Catch: all -> 0x051b, TryCatch #31 {, blocks: (B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:403:0x0474, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x047c A[Catch: all -> 0x051b, TryCatch #31 {, blocks: (B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:403:0x0474, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x048c A[Catch: all -> 0x051b, TryCatch #31 {, blocks: (B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:403:0x0474, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x04a0 A[Catch: all -> 0x0518, TryCatch #26 {, blocks: (B:292:0x049c, B:294:0x04a0, B:296:0x04aa, B:297:0x04ac, B:299:0x04b3, B:300:0x04b8, B:302:0x04c2, B:304:0x04c6, B:305:0x04cb, B:306:0x04cf), top: B:397:0x049c }] */
    /* JADX WARN: Code duplicated, block: B:299:0x04b3 A[Catch: all -> 0x0518, TryCatch #26 {, blocks: (B:292:0x049c, B:294:0x04a0, B:296:0x04aa, B:297:0x04ac, B:299:0x04b3, B:300:0x04b8, B:302:0x04c2, B:304:0x04c6, B:305:0x04cb, B:306:0x04cf), top: B:397:0x049c }] */
    /* JADX WARN: Code duplicated, block: B:302:0x04c2 A[Catch: all -> 0x0518, TryCatch #26 {, blocks: (B:292:0x049c, B:294:0x04a0, B:296:0x04aa, B:297:0x04ac, B:299:0x04b3, B:300:0x04b8, B:302:0x04c2, B:304:0x04c6, B:305:0x04cb, B:306:0x04cf), top: B:397:0x049c }] */
    /* JADX WARN: Code duplicated, block: B:309:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:311:0x04da  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:315:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:317:0x0506  */
    /* JADX WARN: Code duplicated, block: B:336:0x052a A[Catch: all -> 0x05a2, TryCatch #1 {, blocks: (B:334:0x0526, B:336:0x052a, B:338:0x0534, B:339:0x0536, B:341:0x053d, B:342:0x0542, B:344:0x054c, B:346:0x0550, B:347:0x0555, B:348:0x0559), top: B:374:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x053d A[Catch: all -> 0x05a2, TryCatch #1 {, blocks: (B:334:0x0526, B:336:0x052a, B:338:0x0534, B:339:0x0536, B:341:0x053d, B:342:0x0542, B:344:0x054c, B:346:0x0550, B:347:0x0555, B:348:0x0559), top: B:374:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x054c A[Catch: all -> 0x05a2, TryCatch #1 {, blocks: (B:334:0x0526, B:336:0x052a, B:338:0x0534, B:339:0x0536, B:341:0x053d, B:342:0x0542, B:344:0x054c, B:346:0x0550, B:347:0x0555, B:348:0x0559), top: B:374:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x055f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0564  */
    /* JADX WARN: Code duplicated, block: B:355:0x0574  */
    /* JADX WARN: Code duplicated, block: B:357:0x0582  */
    /* JADX WARN: Code duplicated, block: B:359:0x0590  */
    /* JADX WARN: Code duplicated, block: B:374:0x0526 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0437 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x038a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x049c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0474 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x035f, code lost:
    
        r3 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [l.᩵ܽᩴ] */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v6, types: [l.᩵ܽᩴ] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, l.ܿܽᩴ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l.ۧܽᩴ] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, l.ۧܽᩴ] */
    /* JADX WARN: Type inference failed for: r5v12, types: [l.ۧܽᩴ] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, l.ۧܽᩴ] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [l.ۘܽᩴ] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [l.ۘܽᩴ] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0243 -> B:123:0x0247). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m43019(final l.C18467 r17) {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18467.m43019(l.ܿܽᩴ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C25181 m43016(C11754 c11754) throws Throwable {
        C20705 c20705;
        C4297 c4297;
        C20683 c20683M30977;
        C12500 c12500 = c11754.f37999;
        m43018(c12500);
        C15508 c15508Mo15350 = c12500.f40151.mo15350();
        c11754.f38002 = c15508Mo15350;
        if (c15508Mo15350.m37177() != c12500.f40136 || c15508Mo15350.length() != c12500.f40145) {
            throw new C24435();
        }
        synchronized (this.f60122) {
            C11754 c11755 = this.f60114;
            if (c11755 == null || c11755.f37999 != c12500 || this.f60132 != c12500.f40142 || this.f60125 != c12500.f40141 || this.f60119 != c12500.f40151 || this.f60117 != c12500.f40139.m18412() || c12500.f40148) {
                throw new C24435();
            }
            c20705 = this.f60105;
            c4297 = this.f60112;
        }
        m43018(c12500);
        long j = 0;
        if (c12500.f40139.m18412()) {
            C0744 c0744 = c4297 != null ? c4297.f15583 : null;
            if (this.f60103.m26793() != c0744) {
                this.f60103.m26790();
            }
            C19389 c19389M26789 = this.f60103.m26789(c12500.f40141, c12500.f40151, c15508Mo15350, c12500.f40136, C12500.m31043(c12500), C12500.m31046(c12500), new C19959(c12500), c12500.f40144 == c4297 ? c0744 : null, c12500.f40140);
            m43018(c12500);
            if (this.f60123) {
                c19389M26789.m44847(c12500.f40143, this.f60111, new C5789(this, c12500));
            }
            return new C25181(new C14737(c19389M26789), 0L);
        }
        if (this.f60107.m30981() != (c20705 == null ? null : c20705.f66372)) {
            this.f60107.m30979();
        } else if (c20705 != null) {
            j = c20705.f66373;
        }
        C2761 c2761 = (c12500.f40138 != null && c12500.f40138 == c20705 && this.f60107.m30981() == c12500.f40138.f66372) ? c12500.f40138.f66372 : null;
        if (c12500.f40139 == EnumC6535.EDIT) {
            c20683M30977 = this.f60107.m30978(c12500.f40141, c12500.f40151, c15508Mo15350, c2761, c12500.f40136, c12500.f40140, new C19959(c12500));
        } else {
            c20683M30977 = this.f60107.m30977(c12500.f40141, c12500.f40151, c15508Mo15350, c12500.f40136, new C19959(c12500));
        }
        m43018(c12500);
        if (this.f60123) {
            c20683M30977.m47314(c12500.f40143, this.f60111, new C5789(this, c12500));
        }
        return new C25181(new C16229(c20683M30977), j);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m43034() {
        boolean z = false;
        Object c16975 = null;
        try {
            this.f60111.execute(new RunnableC8143(2, this));
        } catch (Error e) {
            synchronized (this.f60122) {
                this.f60109 = false;
                m43028();
                this.f60114 = null;
                this.f60107.m30980();
                this.f60103.m26792();
                C12478 c12478 = this.f60107;
                C20705 c20705 = this.f60105;
                if (c20705 != null) {
                    c16975 = c20705.f66372;
                }
                if (c12478.m30981() != c16975) {
                    c12478.m30979();
                    m43025();
                }
                m43013();
                m43031();
                throw e;
            }
        } catch (RuntimeException unused) {
            synchronized (this.f60122) {
                this.f60109 = false;
                C12500 c12500 = this.f60116;
                if (c12500 == null) {
                    C11754 c11754 = this.f60114;
                    c12500 = c11754 == null ? null : c11754.f37999;
                }
                if (c12500 != null && this.f60132 == c12500.f40142 && C12500.m31053(c12500)) {
                    z = true;
                }
                m43028();
                this.f60114 = null;
                this.f60107.m30980();
                this.f60103.m26792();
                C12478 c12479 = this.f60107;
                C20705 c20706 = this.f60105;
                if (c12479.m30981() != (c20706 == null ? null : c20706.f66372)) {
                    c12479.m30979();
                    m43025();
                }
                m43013();
                c16975 = z ? new C16975(this.f60115, c12500.f40142, c12500.f40136, c12500.f40145, c12500.f40139, C12500.m31043(c12500), C12500.m31046(c12500), EnumC17721.SCHEDULER_REJECTED) : null;
                m43031();
                if (c16975 != null) {
                    m43017(new RunnableC8349(2, this, c16975));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m43026(C18467 c18467, long j) {
        synchronized (c18467.f60122) {
            C20705 c20705 = c18467.f60105;
            if (c20705 != null && c20705.f66373 == j && c18467.f60132 == j && c18467.m43024(c20705.f66375, c20705.f66371)) {
                ((C18445) c18467.f60121).f60049.m9176(c20705);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43020(C18467 c18467, long j) {
        synchronized (c18467.f60122) {
            C4297 c4297 = c18467.f60112;
            if (c4297 != null && c4297.f15580 == j && c18467.f60132 == j && c18467.m43024(c4297.f15582, c4297.f15581)) {
                ((C18445) c18467.f60121).f60049.m9168(c4297);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43022(C18467 c18467, C16975 c16975) {
        synchronized (c18467.f60122) {
            if (c18467.f60132 == c16975.f55500 && c18467.m43024(c16975.f55495, c16975.f55498)) {
                C18445 c18445 = (C18445) c18467.f60121;
                C2783.m9166(c18445.f60049, c16975);
                c18445.f60050.postInvalidateOnAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43017(Runnable runnable) {
        try {
            this.f60129.execute(new RunnableC23484(1, runnable));
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m43029() {
        if (this.f60108 != null) {
            this.f60108.f12175 = true;
        }
        this.f60108 = null;
        long j = this.f60104 + 1;
        this.f60104 = j;
        this.f60132 = j;
        this.f60122.notifyAll();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m43025() {
        this.f60118 = false;
        this.f60106 = null;
        this.f60128 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m43027() {
        this.f60113 = null;
        this.f60101 = 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m43028() {
        if (this.f60108 != null) {
            this.f60108.f12175 = true;
        }
        this.f60108 = null;
        C12500 c12500 = this.f60116;
        if (c12500 != null) {
            C12500.m31056(c12500);
        }
        C11754 c11754 = this.f60114;
        if (c11754 != null) {
            C12500.m31056(c11754.f37999);
            if (!this.f60114.f38001) {
                this.f60127.add(this.f60114);
            }
        }
        this.f60116 = null;
        this.f60114 = null;
        this.f60122.notifyAll();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m43031() {
        C11754 c11754;
        while (true) {
            synchronized (this.f60122) {
                c11754 = (C11754) this.f60127.pollFirst();
            }
            if (c11754 == null) {
                return;
            } else {
                try {
                    C11754.m29512(c11754);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m43032(C12500 c12500) {
        if (this.f60108 != null && this.f60108.f12177 == c12500.f40142) {
            this.f60108.f12175 = true;
            this.f60108 = null;
            this.f60131 = true;
        }
        if (this.f60125 == c12500.f40141 && this.f60119 == c12500.f40151 && this.f60117 == c12500.f40139.m18412()) {
            if (c12500.f40139.m18412()) {
                this.f60103.m26792();
                m43013();
                return;
            }
            this.f60107.m30980();
            C12478 c12478 = this.f60107;
            C20705 c20705 = this.f60105;
            if (c12478.m30981() != (c20705 != null ? c20705.f66372 : null)) {
                c12478.m30979();
                m43025();
                return;
            }
            return;
        }
        this.f60107.m30979();
        this.f60103.m26790();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43013() {
        C4297 c4297 = this.f60112;
        C0744 c0744 = c4297 == null ? null : c4297.f15583;
        C10438 c10438 = this.f60103;
        if (c10438.m26793() != c0744) {
            c10438.m26790();
            m43027();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m43030() {
        if (this.f60109) {
            return false;
        }
        if (this.f60116 == null && this.f60114 == null) {
            return false;
        }
        this.f60109 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16975 m43014(C12500 c12500, EnumC17721 enumC17721) {
        if (this.f60132 != c12500.f40142 || c12500.f40148 || !C12500.m31053(c12500)) {
            return null;
        }
        return new C16975(this.f60115, c12500.f40142, c12500.f40136, c12500.f40145, c12500.f40139, C12500.m31043(c12500), C12500.m31046(c12500), enumC17721);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC17721 m43015(RuntimeException runtimeException) {
        if (runtimeException instanceof C5767) {
            int i = C2060.f6858[((C5767) runtimeException).m16844().ordinal()];
            if (i == 1) {
                return EnumC17721.REGEX_TIMEOUT;
            }
            if (i == 2) {
                return EnumC17721.REGEX_RESOURCE_LIMIT;
            }
            if (i == 3) {
                return EnumC17721.INVALID_RESULT;
            }
            if (i != 4) {
                throw new IncompatibleClassChangeError();
            }
            throw new IllegalArgumentException("Canceled syntax requests must not publish failures", runtimeException);
        }
        return EnumC17721.EXECUTION_BUG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43018(C12500 c12500) {
        if (c12500.f40148 || !C12500.m31053(c12500)) {
            throw new C24435();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m43024(int i, int i2) {
        InterfaceC9629 interfaceC9629 = this.f60119;
        if (interfaceC9629 == null) {
            return false;
        }
        try {
            return interfaceC9629.mo15344() == i && interfaceC9629.length() == i2 && interfaceC9629.mo15344() == i;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
