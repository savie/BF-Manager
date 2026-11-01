package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۨܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11779 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ExecutorC23298 f39530 = new ExecutorC23298(Runtime.getRuntime().availableProcessors());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f39532;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Executor f39533;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ExecutorC4952 f39534;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C3768 f39535;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21033 f39536;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1900 f39537;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21033 f39538;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f39540;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f39541;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14831 f39542;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f39543;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C11303 f39544;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f39545;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20475 f39546;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f39547;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39549;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6363 f39551;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f39552;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC0507 f39554;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f39555;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f39556;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f39557;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24003 f39559;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC0507 f39561;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f39562;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3540 f39563;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f39560 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f39558 = new ArrayDeque();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f39539 = new Object();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23526 f39548 = new C23526();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4099 f39550 = new C4099();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39553 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f39531 = true;

    public C11779(ExecutorC4952 executorC4952, InterfaceC6363 interfaceC6363) {
        ExecutorC23298 executorC23298 = f39530;
        C13638.requireNonNull(executorC23298, "workerExecutor");
        this.f39533 = executorC23298;
        this.f39557 = executorC23298.f75549;
        this.f39534 = executorC4952;
        this.f39551 = interfaceC6363;
        this.f39556 = 4096;
        this.f39555 = 8000000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29438(C1900 c1900, InterfaceC0507 interfaceC0507, C7027 c7027, int i) {
        m29415(c1900, interfaceC0507, interfaceC0507.mo2395(), interfaceC0507.length(), EnumC2129.FRESH, c7027, i, 0, 0, 0, -1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29437(C1900 c1900, InterfaceC0507 interfaceC0507, int i, int i2, int i3, C7027 c7027, int i4) {
        C13638.requireNonNull(interfaceC0507, TextBundle.TEXT_ENTRY);
        int iMo2395 = interfaceC0507.mo2395();
        int length = interfaceC0507.length();
        long j = i2;
        long j2 = (((long) length) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || j2 < 0 || j2 > 2147483647L || ((long) i) + j > j2) {
            throw new IndexOutOfBoundsException("Invalid syntax worker edit range");
        }
        m29415(c1900, interfaceC0507, iMo2395, length, EnumC2129.EDIT, c7027, i4, i, i2, i3, -1, -1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29445(C1900 c1900, InterfaceC0507 interfaceC0507, int i, int i2, int i3) {
        C13638.requireNonNull(c1900, "program");
        C13638.requireNonNull(interfaceC0507, TextBundle.TEXT_ENTRY);
        int iMo2395 = interfaceC0507.mo2395();
        int length = interfaceC0507.length();
        C13638.checkFromToIndex(i, i2, length);
        m29415(c1900, interfaceC0507, iMo2395, length, EnumC2129.WINDOW, null, i3, 0, 0, 0, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29436(C1900 c1900, InterfaceC0507 interfaceC0507, int i, int i2, int i3) {
        C21033 c21033;
        int iMo2395 = interfaceC0507.mo2395();
        long j = i2;
        long length = (((long) interfaceC0507.length()) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || length < 0 || length > 2147483647L || ((long) i) + j > length) {
            throw new IndexOutOfBoundsException("Invalid syntax window edit range");
        }
        try {
            synchronized (this.f39560) {
                m29429();
                m29409();
                this.f39550.m11640();
                C23526 c23526 = this.f39548;
                C24003 c24003 = this.f39559;
                if (c23526.m51830() != (c24003 == null ? null : c24003.f77797)) {
                    c23526.m51828();
                    m29424();
                }
                m29410();
                m29424();
                if (this.f39532 && this.f39537 == c1900 && this.f39561 == interfaceC0507 && this.f39563 != null && (c21033 = this.f39538) != null && this.f39545 + 1 == iMo2395 && c21033.m47416() == length) {
                    this.f39538 = this.f39538.m47420(new C7628(i, i2 + i, i3));
                    this.f39545 = iMo2395;
                } else {
                    m29422();
                }
            }
            m29428();
        } catch (Throwable th) {
            m29428();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C24003 m29443() {
        C24003 c24003;
        synchronized (this.f39560) {
            c24003 = this.f39559;
        }
        return c24003;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3540 m29431() {
        C3540 c3540;
        synchronized (this.f39560) {
            c3540 = this.f39563;
        }
        return c3540;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29435(InterfaceC0507 interfaceC0507, int i, int i2) {
        if (i < 0 || i >= i2 || i2 > interfaceC0507.length()) {
            return;
        }
        synchronized (this.f39560) {
            if (this.f39561 != interfaceC0507) {
                return;
            }
            this.f39554 = interfaceC0507;
            this.f39547 = interfaceC0507.mo2395();
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.f39553 = j;
            C14831 c14831 = this.f39542;
            if (c14831 == null) {
                C20475 c20475 = this.f39546;
                c14831 = c20475 == null ? null : c20475.f66415;
            }
            if (c14831 != null && C14831.m35526(c14831)) {
                c14831.f48474 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11303 m29444() {
        return this.f39544;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29418(final C11779 c11779, C14831 c14831, C17175 c17175) {
        synchronized (c11779.f39560) {
            C20475 c20475 = c11779.f39546;
            if (c20475 != null && c20475.f66415 == c14831 && !c14831.f48470 && c11779.f39562 == c14831.f48461 && C14831.m35526(c14831)) {
                if (c11779.f39544 != null) {
                    c11779.f39544.f38154 = true;
                }
                c11779.f39544 = new C11303(c14831, c17175);
                final long j = c14831.f48461;
                c11779.m29414(new Runnable() { // from class: l.۠᩺ۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11779.m29425(this.f29400, j);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29425(C11779 c11779, long j) {
        synchronized (c11779.f39560) {
            C11303 c11303 = c11779.f39544;
            if (c11303 != null && c11303.f38152 == j && c11303.m28307()) {
                C4246.m11924(((C14126) c11779.f39551).f46359, c11303);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m29432(InterfaceC0507 interfaceC0507) {
        long j;
        synchronized (this.f39560) {
            j = this.f39561 == interfaceC0507 ? this.f39562 : 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29434(long j) {
        if (j != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(500L) + System.nanoTime();
            synchronized (this.f39560) {
                while (this.f39562 == j && (this.f39542 != null || this.f39546 != null)) {
                    long jNanoTime = nanos - System.nanoTime();
                    if (jNanoTime <= 0) {
                        return;
                    } else {
                        TimeUnit.NANOSECONDS.timedWait(this.f39560, jNanoTime);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29441(C24003 c24003) {
        boolean z;
        synchronized (this.f39560) {
            z = this.f39559 == c24003 && this.f39562 == c24003.f77794 && m29421(c24003.f77792, c24003.f77791);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29439(C3540 c3540) {
        boolean z;
        synchronized (this.f39560) {
            z = this.f39563 == c3540 && this.f39562 == c3540.f13034 && m29421(c3540.f13035, c3540.f13033);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29440(C16947 c16947) {
        boolean z;
        synchronized (this.f39560) {
            z = c16947.f54178 == this.f39539 && this.f39562 == c16947.f54174 && m29421(c16947.f54177, c16947.f54176);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29442() {
        try {
            synchronized (this.f39560) {
                m29429();
                m29409();
                this.f39548.m51829();
                this.f39550.m11640();
                C15495 c15495 = null;
                this.f39535 = null;
                C23526 c23526 = this.f39548;
                C24003 c24003 = this.f39559;
                if (c24003 != null) {
                    c15495 = c24003.f77797;
                }
                if (c23526.m51830() != c15495) {
                    c23526.m51828();
                    m29424();
                }
                m29410();
                m29424();
                m29422();
            }
            m29428();
        } catch (Throwable th) {
            m29428();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29433() {
        try {
            synchronized (this.f39560) {
                m29429();
                m29409();
                this.f39548.m51828();
                this.f39550.m11638();
                this.f39537 = null;
                this.f39561 = null;
                this.f39554 = null;
                this.f39553 = -1L;
                this.f39532 = false;
                this.f39535 = null;
                this.f39559 = null;
                this.f39563 = null;
                m29424();
                m29422();
            }
            m29428();
        } catch (Throwable th) {
            m29428();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29415(C1900 c1900, InterfaceC0507 interfaceC0507, int i, int i2, EnumC2129 enumC2129, C7027 c7027, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zM29427;
        C21033 c21033;
        C21033 c21034;
        C13638.requireNonNull(c1900, "program");
        C13638.requireNonNull(interfaceC0507, TextBundle.TEXT_ENTRY);
        if (enumC2129 != EnumC2129.WINDOW && c7027 != null && c7027.m18860() != i2) {
            throw new IllegalArgumentException("Display syntax base length mismatch");
        }
        try {
            synchronized (this.f39560) {
                try {
                    C11303 c11303 = this.f39544;
                    boolean z = this.f39561 != interfaceC0507;
                    C1900 c1901 = this.f39537;
                    boolean z2 = (c1901 == c1900 && !z && (c1901 == null || this.f39532 == enumC2129.m6694())) ? false : true;
                    m29429();
                    m29409();
                    if (z2) {
                        this.f39548.m51828();
                        this.f39550.m11638();
                        if (this.f39554 != interfaceC0507) {
                            this.f39554 = null;
                            this.f39553 = -1L;
                        }
                        this.f39537 = c1900;
                        this.f39561 = interfaceC0507;
                        this.f39532 = enumC2129.m6694();
                        this.f39559 = null;
                        this.f39563 = null;
                        m29424();
                        m29422();
                    } else if (enumC2129.m6694()) {
                        this.f39550.m11640();
                    } else {
                        this.f39548.m51829();
                    }
                    boolean z3 = z2;
                    long j = (((long) i2) - ((long) i6)) + ((long) i5);
                    if (enumC2129 == EnumC2129.EDIT && this.f39552 && this.f39559 != null && (c21034 = this.f39536) != null && this.f39549 + 1 == i && c21034.m47416() == j) {
                        this.f39536 = this.f39536.m47420(new C7628(i4, i5 + i4, i6));
                        this.f39549 = i;
                    } else {
                        m29424();
                    }
                    if (!enumC2129.m6694() || (c21033 = this.f39538) == null || this.f39545 != i || c21033.m47416() != i2) {
                        m29422();
                    }
                    C24003 c24003 = this.f39552 ? this.f39559 : null;
                    C3768 c3768 = this.f39535;
                    if (c3768 == null || c3768.f13632 != c1900 || c3768.f13629 != interfaceC0507 || c3768.f13633 != i || c3768.f13631 != i2) {
                        this.f39535 = new C3768(c1900, interfaceC0507, i, i2, this.f39557);
                    }
                    C14831 c14831 = new C14831(this.f39562, this.f39535, enumC2129, c24003, enumC2129.m6694() ? this.f39538 : this.f39536, c7027, i3, i7, i8, this.f39538 == null ? null : this.f39563);
                    this.f39542 = c14831;
                    if (this.f39554 == interfaceC0507 && this.f39547 == i) {
                        long j2 = this.f39553;
                        if (j2 != -1) {
                            c14831.f48474 = j2;
                        }
                    }
                    if (!z3 && c11303 != null && enumC2129.m6694() && c11303.f38156 == this.f39535) {
                        C17175 c17175 = c11303.f38155;
                        if (c17175.f54749 < i8 && c17175.f54750 > i7) {
                            this.f39544 = new C11303(this.f39542, c17175);
                        }
                    }
                    zM29427 = m29427();
                } catch (Throwable th) {
                    throw th;
                }
            }
            m29428();
            if (zM29427) {
                m29430();
            }
        } catch (Throwable th2) {
            m29428();
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
    /* JADX WARN: Type inference failed for: r16v1, types: [l.᩻᩺ۚ] */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v6, types: [l.᩻᩺ۚ] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, l.ۨܶۚ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l.᩶᩺ۚ] */
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
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, l.᩶᩺ۚ] */
    /* JADX WARN: Type inference failed for: r5v12, types: [l.᩶᩺ۚ] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, l.᩶᩺ۚ] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [l.ۗ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [l.ۗ᩺ۚ] */
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
    public static void m29416(final l.C11779 r17) {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11779.m29416(l.ۨܶۚ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0718 m29411(C20475 c20475) throws Throwable {
        C24003 c24003;
        C3540 c3540;
        C10826 c10826M51826;
        C14831 c14831 = c20475.f66415;
        m29420(c14831);
        C3329 c3329Mo2399 = c14831.f48476.mo2399();
        c20475.f66414 = c3329Mo2399;
        if (c3329Mo2399.m9896() != c14831.f48463 || c3329Mo2399.length() != c14831.f48471) {
            throw new C9892();
        }
        synchronized (this.f39560) {
            C20475 c20476 = this.f39546;
            if (c20476 == null || c20476.f66415 != c14831 || this.f39562 != c14831.f48461 || this.f39537 != c14831.f48466 || this.f39561 != c14831.f48476 || this.f39532 != c14831.f48469.m6694() || c14831.f48470) {
                throw new C9892();
            }
            c24003 = this.f39559;
            c3540 = this.f39563;
        }
        m29420(c14831);
        long j = 0;
        if (c14831.f48469.m6694()) {
            C22445 c22445 = c3540 != null ? c3540.f13031 : null;
            if (this.f39550.m11641() != c22445) {
                this.f39550.m11638();
            }
            C13273 c13273M11637 = this.f39550.m11637(c14831.f48466, c14831.f48476, c3329Mo2399, c14831.f48463, C14831.m35519(c14831), C14831.m35518(c14831), new C19770(c14831), c14831.f48472 == c3540 ? c22445 : null, c14831.f48468);
            m29420(c14831);
            if (this.f39531) {
                c13273M11637.m32758(c14831.f48475, this.f39533, new C21180(this, c14831));
            }
            return new C0718(new C4722(c13273M11637), 0L);
        }
        if (this.f39548.m51830() != (c24003 == null ? null : c24003.f77797)) {
            this.f39548.m51828();
        } else if (c24003 != null) {
            j = c24003.f77794;
        }
        C15495 c15495 = (c14831.f48464 != null && c14831.f48464 == c24003 && this.f39548.m51830() == c14831.f48464.f77797) ? c14831.f48464.f77797 : null;
        if (c14831.f48469 == EnumC2129.EDIT) {
            c10826M51826 = this.f39548.m51827(c14831.f48466, c14831.f48476, c3329Mo2399, c15495, c14831.f48463, c14831.f48468, new C19770(c14831));
        } else {
            c10826M51826 = this.f39548.m51826(c14831.f48466, c14831.f48476, c3329Mo2399, c14831.f48463, new C19770(c14831));
        }
        m29420(c14831);
        if (this.f39531) {
            c10826M51826.m27144(c14831.f48475, this.f39533, new C21180(this, c14831));
        }
        return new C0718(new C17652(c10826M51826), j);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m29430() {
        boolean z = false;
        Object c16947 = null;
        try {
            this.f39533.execute(new RunnableC13043(1, this));
        } catch (Error e) {
            synchronized (this.f39560) {
                this.f39543 = false;
                m29409();
                this.f39546 = null;
                this.f39548.m51829();
                this.f39550.m11640();
                C23526 c23526 = this.f39548;
                C24003 c24003 = this.f39559;
                if (c24003 != null) {
                    c16947 = c24003.f77797;
                }
                if (c23526.m51830() != c16947) {
                    c23526.m51828();
                    m29424();
                }
                m29410();
                m29428();
                throw e;
            }
        } catch (RuntimeException unused) {
            synchronized (this.f39560) {
                this.f39543 = false;
                C14831 c14831 = this.f39542;
                if (c14831 == null) {
                    C20475 c20475 = this.f39546;
                    c14831 = c20475 == null ? null : c20475.f66415;
                }
                if (c14831 != null && this.f39562 == c14831.f48461 && C14831.m35526(c14831)) {
                    z = true;
                }
                m29409();
                this.f39546 = null;
                this.f39548.m51829();
                this.f39550.m11640();
                C23526 c23527 = this.f39548;
                C24003 c24004 = this.f39559;
                if (c23527.m51830() != (c24004 == null ? null : c24004.f77797)) {
                    c23527.m51828();
                    m29424();
                }
                m29410();
                c16947 = z ? new C16947(this.f39539, c14831.f48461, c14831.f48463, c14831.f48471, c14831.f48469, C14831.m35519(c14831), C14831.m35518(c14831), EnumC12714.SCHEDULER_REJECTED) : null;
                m29428();
                if (c16947 != null) {
                    m29414(new RunnableC0428(2, this, c16947));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m29423(C11779 c11779, long j) {
        synchronized (c11779.f39560) {
            C24003 c24003 = c11779.f39559;
            if (c24003 != null && c24003.f77794 == j && c11779.f39562 == j && c11779.m29421(c24003.f77792, c24003.f77791)) {
                ((C14126) c11779.f39551).f46359.m11931(c24003);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29417(C11779 c11779, long j) {
        synchronized (c11779.f39560) {
            C3540 c3540 = c11779.f39563;
            if (c3540 != null && c3540.f13034 == j && c11779.f39562 == j && c11779.m29421(c3540.f13035, c3540.f13033)) {
                ((C14126) c11779.f39551).f46359.m11919(c3540);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29419(C11779 c11779, C16947 c16947) {
        synchronized (c11779.f39560) {
            if (c11779.f39562 == c16947.f54174 && c11779.m29421(c16947.f54177, c16947.f54176)) {
                C14126 c14126 = (C14126) c11779.f39551;
                C4246.m11925(c14126.f46359, c16947);
                c14126.f46360.postInvalidateOnAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29414(Runnable runnable) {
        try {
            this.f39534.execute(new RunnableC9187(0, runnable));
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m29429() {
        if (this.f39544 != null) {
            this.f39544.f38154 = true;
        }
        this.f39544 = null;
        long j = this.f39541 + 1;
        this.f39541 = j;
        this.f39562 = j;
        this.f39560.notifyAll();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m29424() {
        this.f39552 = false;
        this.f39536 = null;
        this.f39549 = 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m29422() {
        this.f39538 = null;
        this.f39545 = 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m29409() {
        if (this.f39544 != null) {
            this.f39544.f38154 = true;
        }
        this.f39544 = null;
        C14831 c14831 = this.f39542;
        if (c14831 != null) {
            C14831.m35525(c14831);
        }
        C20475 c20475 = this.f39546;
        if (c20475 != null) {
            C14831.m35525(c20475.f66415);
            if (!this.f39546.f66417) {
                this.f39558.add(this.f39546);
            }
        }
        this.f39542 = null;
        this.f39546 = null;
        this.f39560.notifyAll();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m29428() {
        C20475 c20475;
        while (true) {
            synchronized (this.f39560) {
                c20475 = (C20475) this.f39558.pollFirst();
            }
            if (c20475 == null) {
                return;
            } else {
                try {
                    C20475.m46277(c20475);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m29426(C14831 c14831) {
        if (this.f39544 != null && this.f39544.f38152 == c14831.f48461) {
            this.f39544.f38154 = true;
            this.f39544 = null;
            this.f39540 = true;
        }
        if (this.f39537 == c14831.f48466 && this.f39561 == c14831.f48476 && this.f39532 == c14831.f48469.m6694()) {
            if (c14831.f48469.m6694()) {
                this.f39550.m11640();
                m29410();
                return;
            }
            this.f39548.m51829();
            C23526 c23526 = this.f39548;
            C24003 c24003 = this.f39559;
            if (c23526.m51830() != (c24003 != null ? c24003.f77797 : null)) {
                c23526.m51828();
                m29424();
                return;
            }
            return;
        }
        this.f39548.m51828();
        this.f39550.m11638();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m29410() {
        C3540 c3540 = this.f39563;
        C22445 c22445 = c3540 == null ? null : c3540.f13031;
        C4099 c4099 = this.f39550;
        if (c4099.m11641() != c22445) {
            c4099.m11638();
            m29422();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private boolean m29427() {
        if (this.f39543) {
            return false;
        }
        if (this.f39542 == null && this.f39546 == null) {
            return false;
        }
        this.f39543 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16947 m29413(C14831 c14831, EnumC12714 enumC12714) {
        if (this.f39562 != c14831.f48461 || c14831.f48470 || !C14831.m35526(c14831)) {
            return null;
        }
        return new C16947(this.f39539, c14831.f48461, c14831.f48463, c14831.f48471, c14831.f48469, C14831.m35519(c14831), C14831.m35518(c14831), enumC12714);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12714 m29412(RuntimeException runtimeException) {
        if (runtimeException instanceof C7297) {
            int i = C16242.f52385[((C7297) runtimeException).m19447().ordinal()];
            if (i == 1) {
                return EnumC12714.REGEX_TIMEOUT;
            }
            if (i == 2) {
                return EnumC12714.REGEX_RESOURCE_LIMIT;
            }
            if (i == 3) {
                return EnumC12714.INVALID_RESULT;
            }
            if (i != 4) {
                throw new IncompatibleClassChangeError();
            }
            throw new IllegalArgumentException("Canceled syntax requests must not publish failures", runtimeException);
        }
        return EnumC12714.EXECUTION_BUG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29420(C14831 c14831) {
        if (c14831.f48470 || !C14831.m35526(c14831)) {
            throw new C9892();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m29421(int i, int i2) {
        InterfaceC0507 interfaceC0507 = this.f39561;
        if (interfaceC0507 == null) {
            return false;
        }
        try {
            return interfaceC0507.mo2395() == i && interfaceC0507.length() == i2 && interfaceC0507.mo2395() == i;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
