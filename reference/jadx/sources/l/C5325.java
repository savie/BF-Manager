package l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5325 extends AbstractC12359 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18372;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C3662 f18373;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C16364 f18374;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f18375;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f18376;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f18377;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f18378;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public volatile RunnableC13793 f18379;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f18380;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C3662 f18381;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f18382;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18383;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C3662 f18384;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public volatile C3662 f18385;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public volatile Throwable f18386;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14767(boolean z, char c) {
        if ((c >= 11904 && c <= 12287) || c == 12288 || c == 12290) {
            return true;
        }
        if (c >= 12352 && c <= 12447) {
            if (z) {
                return true;
            }
            if (c == 12353 || c == 12355 || c == 12357 || c == 12359 || c == 12361 || c == 12387 || c == 12419 || c == 12421 || c == 12423 || c == 12430 || c == 12437 || c == 12438) {
                return false;
            }
            switch (c) {
                case 12443:
                case 12444:
                case 12445:
                case 12446:
                    return false;
                default:
                    return true;
            }
        }
        if (c < 12448 || c > 12543) {
            if (c >= 13312 && c <= 19893) {
                return true;
            }
            if (c >= 19968 && c <= 40891) {
                return true;
            }
            if (c >= 63744 && c <= 64217) {
                return true;
            }
            if (c >= 40960 && c <= 42127) {
                return true;
            }
            if (c >= 42128 && c <= 42191) {
                return true;
            }
            if (c < 65122 || c > 65126) {
                return c >= 65280 && c <= 65519;
            }
            return true;
        }
        if (z) {
            return true;
        }
        if (c == 12448 || c == 12449 || c == 12451 || c == 12453 || c == 12455 || c == 12457 || c == 12483 || c == 12515 || c == 12517 || c == 12519 || c == 12526 || c == 12533 || c == 12534) {
            return false;
        }
        switch (c) {
            case 12539:
            case 12540:
            case 12541:
            case 12542:
                return false;
            default:
                return true;
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte mo14781() {
        return (byte) 1;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int mo14782(C16592 c16592) {
        return m14776(c16592.m39023(), c16592.m39024());
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14788() {
        return false;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo14789(int i, int i2) {
        if (!this.f41317 && this.f41308 == this.f18381) {
            super.mo14789(i, i2);
            return true;
        }
        return false;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo14795(int i, int i2) {
        if (this.f18379 == null && !this.f41317 && this.f41308 == this.f18381) {
            return super.mo14795(i, i2);
        }
        if (this.f18379 == null) {
            if (!this.f41314.m16995(this)) {
                return -1L;
            }
            i2 = m14776(i, i2);
        }
        if (!(i2 > 0 && m14776(i, i2) == i2)) {
            return -1L;
        }
        C3662 c3662 = this.f41308;
        double d = i;
        return (((long) c3662.get(Math.min(c3662.m10811(), (int) ((d + ((double) i2)) / ((double) this.f41286.m17870())))).m34708()) & 4294967295L) | (((long) c3662.get(Math.min(c3662.m10811(), Math.max(0, (int) (d / ((double) this.f41286.m17870()))))).f47316) << 32);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo14796(int i, int i2) {
        if (this.f18379 == null && !this.f41317 && this.f41308 == this.f18381) {
            return super.mo14796(i, i2);
        }
        if (this.f18379 == null) {
            if (!this.f41314.m16995(this)) {
                return 0L;
            }
            i2 = m14776(i, i2);
        }
        if (!(i2 > 0 && m14776(i, i2) == i2)) {
            return 0L;
        }
        C3662 c3662 = this.f41308;
        double d = i;
        return (((long) c3662.get(Math.min(c3662.m10811(), ((int) ((d + ((double) i2)) / ((double) this.f41286.m17870()))) + 200)).m34708()) & 4294967295L) | (((long) c3662.get(Math.min(c3662.m10811(), Math.max(0, ((int) (d / ((double) this.f41286.m17870()))) - 200))).f47316) << 32);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo14799(int i) {
        return super.mo14799(i);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo14800(C16592 c16592) {
        int iM39023;
        int iM39024;
        iM39023 = c16592.m39023();
        iM39024 = c16592.m39024();
        return iM39024 > 0 && m14776(iM39023, iM39024) == iM39024;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void mo14803() {
        if (m30759()) {
            this.f41315.m37706(this, this.f41297, this.f18381, this.f41286.m17881());
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m14806() {
        return !this.f18377 && this.f41308 == this.f18381;
    }

    public C5325(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, boolean z, int i, C12131 c12131, C23045 c23045, C3329 c3329) {
        super(c6111, c1590);
        this.f18375 = new ReentrantLock();
        this.f18382 = new AtomicInteger(0);
        this.f18377 = false;
        this.f18378 = new AtomicInteger();
        this.f18384 = new C3662();
        this.f18373 = new C3662();
        this.f41313 = i;
        if (c3329 != null) {
            m30741(interfaceC2916, c3329.m9891());
        }
        try {
            this.f18383 = z;
            m30749();
            this.f18380 = c6111.m16978();
            m30740(interfaceC2916);
            this.f18374 = c12131.m30189(this, c23045);
            this.f18381 = this.f41308;
            this.f41316 = m14780();
            if ((this.f18380 - mo30761()) - mo30751() != ((C5325) c12131.f40614).f18376) {
                this.f18374 = null;
            }
            m14775(false);
        } finally {
            if (!this.f41317) {
                m30755();
            }
        }
    }

    public C5325(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, boolean z) {
        this(c6111, interfaceC2916, c1590, z, -1, null);
    }

    public C5325(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, boolean z, int i, C3329 c3329) {
        super(c6111, c1590);
        this.f18375 = new ReentrantLock();
        this.f18382 = new AtomicInteger(0);
        this.f18377 = false;
        this.f18378 = new AtomicInteger();
        this.f18384 = new C3662();
        this.f18373 = new C3662();
        this.f41313 = i;
        if (c3329 != null) {
            m30741(interfaceC2916, c3329.m9891());
        }
        this.f18383 = z;
        this.f18380 = c6111.m16978();
        mo14798(interfaceC2916);
    }

    public C5325(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, C17367 c17367) {
        super(c6111, interfaceC2916, c1590, c17367);
        this.f18375 = new ReentrantLock();
        this.f18382 = new AtomicInteger(0);
        this.f18377 = false;
        this.f18378 = new AtomicInteger();
        this.f18384 = new C3662();
        this.f18373 = new C3662();
        this.f18380 = c17367.readInt();
        this.f18376 = c17367.readInt();
        this.f18383 = c17367.m40461();
        m30749();
        this.f18381 = this.f41308;
        m30740(interfaceC2916);
        m30755();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14785(String str) {
        super.mo14785(str);
        m14746();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14798(InterfaceC2916 interfaceC2916) {
        try {
            m14771(interfaceC2916);
        } finally {
            if (!this.f41317) {
                m30755();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m14771(InterfaceC2916 interfaceC2916) {
        m30749();
        this.f18374 = null;
        this.f18382.incrementAndGet();
        mo14797();
        try {
            this.f18375.lock();
            this.f41288 = false;
            m30740(interfaceC2916);
            C3662 c3662 = this.f41308.isEmpty() ? this.f41308 : new C3662();
            C15846 c15846 = this.f41315.isEmpty() ? this.f41315 : new C15846();
            c15846.clear();
            C3329 c3329M30760 = m30760();
            try {
                int iM17881 = this.f41286.m17881();
                C1918 c1918M30735 = m30735(c3329M30760, 0, c3329M30760.length());
                try {
                    C14435 c14435 = new C14435();
                    boolean z = true;
                    boolean z2 = true;
                    int i = 0;
                    int i2 = 0;
                    while (z2) {
                        if (this.f41288) {
                            c3662.clear();
                            c15846.clear();
                            c1918M30735.close();
                            c3329M30760.close();
                            this.f18375.unlock();
                            return;
                        }
                        c15846.add(C8084.m21291(this, c3329M30760, i, iM17881));
                        int iM6244 = c1918M30735.m6244();
                        if (iM6244 == -1) {
                            iM6244 = c3329M30760.length();
                            z2 = false;
                        }
                        c14435.m34709(i, iM6244, i2);
                        c3662.m10810(c14435);
                        i = iM6244 + 1;
                        i2++;
                        try {
                            c3329M30760.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c1918M30735.close();
                    c15846.m37708();
                    c3329M30760.close();
                    this.f41308 = c3662;
                    this.f41315 = c15846;
                    this.f18375.unlock();
                    synchronized (this.f18382) {
                        this.f18381 = this.f41308;
                        this.f18382.incrementAndGet();
                        this.f41316 = m14780();
                        int iM16978 = this.f41314.m16978();
                        boolean z3 = iM16978 > 0 && iM16978 != this.f18380;
                        if (z3) {
                            this.f18380 = iM16978;
                        }
                        if ((this.f18380 - mo30761()) - mo30751() > 0) {
                            z = false;
                        }
                        this.f18377 = z;
                        if (!z) {
                            m14775(false);
                            if (z3) {
                                m14746();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        c1918M30735.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c3329M30760.close();
                throw th4;
            }
        } catch (Throwable th5) {
            this.f18375.unlock();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14787(boolean z) {
        this.f18383 = z;
        this.f18376 = 0;
        m14775(false);
        m14746();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m14792() {
        return this.f18383;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo14805(int i) {
        synchronized (this.f18382) {
            if (i > 0) {
                if ((this.f18380 != i || this.f18377) && m30759()) {
                    this.f18380 = i;
                    if ((i - mo30761()) - mo30751() <= 0) {
                        this.f18377 = true;
                        return;
                    }
                    if (this.f18381.m10814()) {
                        this.f18377 = false;
                        return;
                    }
                    if (this.f18379 != null) {
                        m14768();
                    } else if (this.f18377) {
                        this.f18377 = false;
                        m14775(false);
                    } else {
                        m14775(true);
                    }
                    m14746();
                    this.f41314.postInvalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m14779(int i) {
        int i2;
        return !this.f18377 && (i2 = this.f18380) == i && (i2 - mo30761()) - mo30751() > 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m14746() {
        int iMo30761;
        if (this.f41322.isEmpty() || (iMo30761 = (this.f18380 - mo30761()) - mo30751()) <= 0) {
            return;
        }
        this.f41322.size();
        C3662 c3662 = new C3662(0);
        this.f41288 = false;
        String str = this.f41300;
        C3662 c3663 = this.f41322;
        int size = c3663.size();
        C1590 c1590 = this.f41286;
        m14754((CharSequence) str, c3663, c3662, size, iMo30761, true, new C2502(c1590, this.f18383, c1590.m5427(), mo14793(), this.f18383), new BooleanSupplier() { // from class: l.ۛܰۚ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f20610.f41288;
            }
        }, (C11676) null, false);
        this.f41322 = c3662;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m14776(int i, int i2) {
        if (i < 0 || i2 <= 0 || this.f41325 || this.f18386 != null || this.f41308.isEmpty()) {
            return 0;
        }
        if (this.f41308 == this.f18381 && (!this.f41317 || this.f18385 != null)) {
            return i2;
        }
        if (this.f41308 != this.f18385) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(i2, (Math.ceil(this.f41286.m17870() * (((long) this.f41308.size()) - 1)) - 1.0d) - ((double) i)));
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo14794() {
        return this.f18378.get();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Throwable mo14778() {
        return this.f18386;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14780() {
        C3662 c3662 = this.f18381;
        return m30731((c3662 == null || c3662.isEmpty() || this.f41308.isEmpty()) ? 0 : this.f18381.m10803().f47319 - this.f41308.m10803().f47319);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo14804() {
        return this.f18379 != null || this.f41317;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14801() {
        RunnableC13793 runnableC13793 = this.f18379;
        this.f18379 = null;
        if (runnableC13793 != null) {
            runnableC13793.f45537 = true;
            this.f41308 = this.f18381;
            this.f18385 = null;
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14797() {
        m14801();
        if (this.f41317) {
            this.f41325 = true;
            while (this.f41317) {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14775(boolean z) {
        if (m30759() || m30762()) {
            InterfaceC2916 interfaceC2916 = this.f41297;
            boolean zMo8725 = interfaceC2916.mo8725();
            int i = this.f18382.get();
            interfaceC2916.setReadOnly(true);
            synchronized (this) {
                if (this.f41297 == interfaceC2916 && i == this.f18382.get()) {
                    m14764(z, interfaceC2916, i, zMo8725);
                    return;
                }
                interfaceC2916.setReadOnly(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public void m14768() {
        C2502 c2502;
        this.f41316 = m14780();
        int iMo30761 = (this.f18380 - mo30761()) - mo30751();
        if (iMo30761 <= 0) {
            this.f18377 = true;
            return;
        }
        int iM30729 = m30729(this.f41314.m17066() + 1);
        int iM10813 = this.f41308.m10813(iM30729);
        synchronized (this.f41286) {
            c2502 = new C2502(this.f41286.m17872(), this.f18383, this.f41286.m5427(), mo14793(), this.f18383);
        }
        int iM17066 = (int) (this.f41314.m17066() - (c2502.f9909.m17870() * iM30729));
        RunnableC13793 runnableC13793 = this.f18379;
        if (runnableC13793 != null) {
            runnableC13793.f45537 = true;
        }
        this.f18378.incrementAndGet();
        if (this.f41317) {
            this.f41325 = true;
        }
        RunnableC13793 runnableC13794 = new RunnableC13793(this, iMo30761, c2502, iM10813, iM17066);
        this.f18379 = runnableC13794;
        this.f18386 = null;
        this.f18377 = false;
        runnableC13794.f45534.setReadOnly(true);
        C6111 c6111 = this.f41314;
        c6111.getClass();
        int i = 0;
        C16737.m39273(new RunnableC3185(i, c6111));
        runnableC13794.f45527 = new RunnableC4970(i, c6111);
        try {
            C4716.f16636.execute(runnableC13794);
        } catch (Error | RuntimeException e) {
            runnableC13794.f45534.setReadOnly(false);
            runnableC13794.f45527.run();
            this.f18379 = null;
            throw e;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x035e */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m14764(boolean r29, l.InterfaceC2916 r30, int r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5325.m14764(boolean, l.ۗ֫ۖ, int, boolean):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m14766(C5325 c5325, int i, int i2, InterfaceC2916 interfaceC2916, int i3) {
        return (!c5325.f41288 && !c5325.f41325 && i == c5325.f18382.get() && i2 == c5325.f18378.get() && c5325.f41297 == interfaceC2916 && c5325.m30745() == i3) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #5 {all -> 0x006a, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0018, B:9:0x001e, B:36:0x0072, B:38:0x0078), top: B:51:0x0009 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14761(C5325 c5325, List list, C0448 c0448, C3662 c3662, int i, InterfaceC2916 interfaceC2916, int i2, int i3, int i4, int i5, int i6, float f, ArrayList arrayList, C3662 c3663, Runnable runnable) throws Throwable {
        boolean z = false;
        try {
            try {
                try {
                    C3662 c3662M32305 = C13087.m32305(new C12444(c5325), list, c0448);
                    if (c3662M32305 != null && !c0448.getAsBoolean()) {
                        C3662 c3664 = new C3662(c3662);
                        c3664.m10809(c3662M32305);
                        c5325.f18381 = c3664;
                        c5325.f41308 = c3664;
                        c5325.f18376 = i;
                        try {
                            c5325.m14756(interfaceC2916, i2, i3, i4, c3664, i5, i6, f);
                            c5325.m14753(arrayList.size(), C13087.f43583, c3664);
                        } catch (Error e) {
                            e = e;
                            z = true;
                            if (!c0448.getAsBoolean()) {
                                c5325.f18386 = e;
                            }
                            if (!z && !c5325.f41314.m16910(c5325)) {
                                c5325.f41308 = c3663;
                            }
                            c5325.m14757(interfaceC2916, runnable);
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            z = true;
                            if (!c0448.getAsBoolean()) {
                                c5325.f18386 = e;
                            }
                            if (!z) {
                                c5325.f41308 = c3663;
                            }
                            c5325.m14757(interfaceC2916, runnable);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z && !c5325.f41314.m16910(c5325)) {
                                c5325.f41308 = c3663;
                            }
                            c5325.m14757(interfaceC2916, runnable);
                            throw th;
                        }
                    } else if (!c5325.f41314.m16910(c5325)) {
                        c5325.f41308 = c3663;
                    }
                    c5325.m14757(interfaceC2916, runnable);
                } catch (Error e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Error | Exception e5) {
            e = e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m14753(int i, int i2, C3662 c3662) {
        SystemClock.elapsedRealtime();
        c3662.size();
        Math.min(i2, i);
        Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3662 m14748(CharSequence charSequence, C3662 c3662, C3913 c3913, int i, C2502 c2502, BooleanSupplier booleanSupplier) {
        int i2;
        C6736 c6736;
        C3662 c3663 = new C3662();
        List listM11366 = c3913.m11366();
        C9496 c9496M10817 = c3662.m10817();
        C14435 c14435 = new C14435();
        int i3 = 0;
        while (i3 < listM11366.size() && !booleanSupplier.getAsBoolean()) {
            C6736 c6737 = (C6736) listM11366.get(i3);
            if (c6737.m18202()) {
                if (c3662.m10813(c6737.m18201()) >= c6737.m18204() && c3662.m10816(c6737.m18199() - 1) <= c6737.m18200()) {
                    c3663.m10807(c6737.m18201(), c6737.m18199(), c3662);
                } else {
                    for (int iM18201 = c6737.m18201(); iM18201 < c6737.m18199(); iM18201++) {
                        C14435 c14435M24325 = c9496M10817.m24325(iM18201);
                        if (c14435M24325.f47316 < c6737.m18204() || c14435M24325.f47317 > c6737.m18200()) {
                            c14435M24325.m34709(Math.max(c14435M24325.f47316, c6737.m18204()), Math.min(c14435M24325.f47317, c6737.m18200()), c14435M24325.f47319);
                            c14435M24325.m34711(false);
                        }
                        c3663.m10810(c14435M24325);
                    }
                }
                i3++;
            } else {
                C3662 c3664 = new C3662();
                while (true) {
                    i2 = i3 + 1;
                    c6736 = (C6736) listM11366.get(i3);
                    int iM18202 = c6736.m18201();
                    while (iM18202 < c6736.m18199()) {
                        int iMin = Math.min(c6736.m18199(), c3662.m10812(iM18202) + 1);
                        c14435.m34709(Math.max(c3662.m10813(iM18202), c6736.m18204()), Math.min(c3662.m10816(iMin - 1), c6736.m18200()), c3662.m10821(iM18202));
                        c3664.m10810(c14435);
                        iM18202 = iMin;
                    }
                    if (i2 >= listM11366.size() || ((C6736) listM11366.get(i2)).m18202()) {
                        break;
                    }
                    i3 = i2;
                }
                m14754(charSequence, c3664, c3663, c3664.size(), i, c6737.m18203(), c2502, booleanSupplier, (C11676) null, !c6736.m18198());
                i3 = i2;
            }
        }
        return c3663;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14765(C3662 c3662, int i, float f) {
        if (!c3662.isEmpty() && c3662.m10803().f47317 >= i) {
            int size = c3662.size() - 1;
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (c3662.m10816(i3) <= i) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            if ((((long) (c3662.size() - i2)) - 1) * f > this.f41314.m16814()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14757(InterfaceC2916 interfaceC2916, Runnable runnable) {
        try {
            m30755();
            interfaceC2916.setReadOnly(false);
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f41317 = false;
                    this.f41314.m16826(this);
                }
            }
            this.f41314.postInvalidate();
        } catch (Throwable th) {
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f41317 = false;
                    this.f41314.m16826(this);
                }
            }
            this.f41314.postInvalidate();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14756(final InterfaceC2916 interfaceC2916, final int i, final int i2, final int i3, final C3662 c3662, int i4, final int i5, final float f) {
        if (this.f41313 >= 0) {
            return;
        }
        final int iM14772 = m14772(c3662, i4);
        this.f41314.post(new Runnable() { // from class: l.᩻ܰۚ
            @Override // java.lang.Runnable
            public final void run() {
                C5325.m14762(this.f76794, interfaceC2916, i, i2, c3662, i3, f, iM14772, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14762(C5325 c5325, InterfaceC2916 interfaceC2916, int i, int i2, C3662 c3662, int i3, float f, int i4, int i5) {
        C6111 c6111 = c5325.f41314;
        if (c6111.f20764 == c5325 && c5325.f41297 == interfaceC2916 && interfaceC2916.mo2395() == i && c5325.m30745() == i && c5325.f18378.get() == i2 && c5325.f41308 == c3662 && !c6111.m16897(c5325) && c6111.m16979() == i3) {
            c6111.m17050(c6111.m16837(((int) (f * i4)) + i5));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m14772(C3662 c3662, int i) {
        int size = c3662.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >>> 1;
            if (c3662.m10813(i3) >= i || c3662.m10816(i3) > i) {
                size = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14754(CharSequence charSequence, C3662 c3662, C3662 c3663, int i, int i2, boolean z, C2502 c2502, BooleanSupplier booleanSupplier, C11676 c11676, boolean z2) {
        c3663.getClass();
        C12836 c12836 = new C12836(c3663);
        try {
            m14755(charSequence, c3662, c12836, i, i2, z, c2502, booleanSupplier, c11676, z2);
            c12836.close();
        } catch (Throwable th) {
            try {
                c12836.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x024e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0252  */
    /* JADX WARN: Code duplicated, block: B:209:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:211:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:227:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14755(CharSequence charSequence, C3662 c3662, C12836 c12836, int i, int i2, boolean z, C2502 c2502, BooleanSupplier booleanSupplier, C11676 c11676, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        char cCharAt;
        boolean z3;
        float[] fArr;
        int iM45558;
        float fM17858;
        float f2;
        int i7;
        C14435 c14435;
        C6585 c6585;
        int i8;
        int i9;
        int i10;
        byte b;
        int i11;
        char cCharAt2;
        int i12;
        int i13;
        float f3;
        int i14;
        int i15;
        byte b2;
        C12836 c12837 = c12836;
        C6585 c6586 = c2502.f9909;
        C9681 c9681 = charSequence instanceof C9681 ? (C9681) charSequence : null;
        float[] fArrM17863 = c9681 != null ? c6586.m17863() : null;
        C14435 c14436 = new C14435();
        boolean z4 = c2502.f9912;
        int i16 = c2502.f9910;
        boolean z5 = z;
        int i17 = 0;
        while (i17 < i && !booleanSupplier.getAsBoolean()) {
            int iMin = Math.min(i, c3662.m10812(i17) + 1);
            int iM10821 = c3662.m10821(i17);
            float f4 = i2;
            if (!z5) {
                if (c2502.f9911) {
                    f4 -= i16;
                }
                z5 = true;
            }
            float f5 = c2502.f9913 ? f4 - i16 : f4;
            int iM10813 = c3662.m10813(i17);
            float f6 = f4;
            int iM10816 = c3662.m10816(iMin - 1);
            int i18 = i;
            boolean z6 = z5;
            int i19 = iM10813;
            while (true) {
                float f7 = 0.0f;
                int i20 = i19;
                int i21 = i20;
                i3 = iM10813;
                int i22 = i18;
                int i23 = 0;
                int i24 = i21;
                while (true) {
                    if (i20 < iM10816) {
                        byte[] bArr = f18372;
                        if (c9681 != null) {
                            i4 = i16;
                            if (i20 + 1 < iM10816) {
                                char[] cArrM24637 = c9681.m24637(i20);
                                int iM24636 = c9681.m24636();
                                c9681 = c9681;
                                int iMin2 = Math.min(Math.min(iM10816 - 1, c9681.m24635() - 1) - i20, 256 - i23) + i20;
                                int i25 = i20;
                                while (true) {
                                    if (i25 >= iMin2) {
                                        c14436 = c14436;
                                        i5 = iM10821;
                                        break;
                                    }
                                    int i26 = i25 - iM24636;
                                    c14436 = c14436;
                                    char c = cArrM24637[i26];
                                    i5 = iM10821;
                                    if (c > 127 || c == '\t') {
                                        break;
                                    }
                                    char c2 = cArrM24637[i26 + 1];
                                    char[] cArr = cArrM24637;
                                    if (c2 == 65039 || c2 == 8419) {
                                        int i27 = C23850.f77103;
                                        if (('0' > c || c > '9') && c != '#' && c != '*') {
                                            f3 = f7 + fArrM17863[c];
                                            if (i19 == i25 && f3 > f6) {
                                                break;
                                            }
                                            i14 = i25 + 1;
                                            if (f3 <= f5) {
                                                if (z4) {
                                                    b2 = bArr[c];
                                                    i15 = i14;
                                                    if (b2 != 1 || (b2 == 2 && (c2 >= 128 ? !Character.isDigit(c2) : !(c2 >= '0' && c2 <= '9')))) {
                                                        i24 = i15;
                                                        i21 = i24;
                                                    }
                                                } else {
                                                    i15 = i14;
                                                }
                                                i21 = i15;
                                            } else {
                                                i15 = i14;
                                            }
                                            i25 = i15;
                                            c14436 = c14436;
                                            iM10821 = i5;
                                            f7 = f3;
                                            cArrM24637 = cArr;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        f3 = f7 + fArrM17863[c];
                                        if (i19 == i25) {
                                        }
                                        i14 = i25 + 1;
                                        if (f3 <= f5) {
                                            if (z4) {
                                                b2 = bArr[c];
                                                i15 = i14;
                                                if (b2 != 1) {
                                                }
                                                i24 = i15;
                                                i21 = i24;
                                            } else {
                                                i15 = i14;
                                            }
                                            i21 = i15;
                                        } else {
                                            i15 = i14;
                                        }
                                        i25 = i15;
                                        c14436 = c14436;
                                        iM10821 = i5;
                                        f7 = f3;
                                        cArrM24637 = cArr;
                                    }
                                }
                                int i28 = (i25 - i20) + i23;
                                if (i28 != 256) {
                                    i23 = i28;
                                } else if (booleanSupplier.getAsBoolean()) {
                                    return;
                                } else {
                                    i23 = 0;
                                }
                                if (i25 == i20 || i25 != iMin2) {
                                    i20 = i25;
                                    i6 = i24;
                                    f = f7;
                                    cCharAt = charSequence.charAt(i20);
                                    if (cCharAt <= 127 || cCharAt == '\t') {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        int i29 = C23850.f77103;
                                        if (!(('0' > cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') || (i13 = i20 + 1) >= iM10816) {
                                            fArr = fArrM17863;
                                        } else {
                                            char cCharAt3 = charSequence.charAt(i13);
                                            fArr = fArrM17863;
                                            if (cCharAt3 == 65039 || cCharAt3 == 8419) {
                                                z3 = false;
                                            }
                                        }
                                    } else {
                                        fArr = fArrM17863;
                                    }
                                    if (z3 || (i23 = i23 + 1) == 256) {
                                        if (booleanSupplier.getAsBoolean()) {
                                            return;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    if (z3) {
                                        iM45558 = i20 + 1;
                                    } else {
                                        iM45558 = C20149.m45558(i20, iM10816, charSequence);
                                    }
                                    if (z3) {
                                        fM17858 = c6586.m17855(cCharAt);
                                    } else {
                                        fM17858 = c6586.m17858(charSequence, i20, iM45558, f);
                                    }
                                    f2 = f + fM17858;
                                    if (i19 != i20 || (f2 <= f6 && !(z2 && iMin == i22 && iM45558 == iM10816 && f2 > f5))) {
                                        i7 = i4;
                                        c14435 = c14436;
                                        iM10821 = i5;
                                        if (f2 <= f5) {
                                            if (z4) {
                                                c6585 = c6586;
                                                if (iM45558 - i20 < 2 || (cCharAt >= 128 ? !(cCharAt != 8203 && ((cCharAt < 55296 || cCharAt > 56319) && (cCharAt < 11904 || !m14767(true, cCharAt) || (i10 = i20 + 1) >= charSequence.length() || !m14767(false, charSequence.charAt(i10))))) : !((b = bArr[cCharAt]) == 2 ? (i11 = i20 + 1) < charSequence.length() && ((cCharAt2 = charSequence.charAt(i11)) >= 128 ? Character.isDigit(cCharAt2) : cCharAt2 >= '0' && cCharAt2 <= '9') : b != 1))) {
                                                    i6 = iM45558;
                                                    i21 = i6;
                                                }
                                            } else {
                                                c6585 = c6586;
                                            }
                                            i21 = iM45558;
                                            i6 = i6;
                                        } else {
                                            c6585 = c6586;
                                        }
                                        i8 = i6;
                                        i20 = iM45558;
                                        i9 = i;
                                    } else {
                                        if (booleanSupplier.getAsBoolean()) {
                                            return;
                                        }
                                        if (!z4 || i6 <= i19) {
                                            i6 = i21;
                                        }
                                        if (i6 != i19) {
                                            i20 = i6;
                                        }
                                        C14435 c14437 = c14436;
                                        iM10821 = i5;
                                        c14437.m34709(i19, i20, iM10821);
                                        c12836.m31832(c14437);
                                        if (z6) {
                                            if (c2502.f9911) {
                                                i12 = i4;
                                                f6 -= i12;
                                            } else {
                                                i12 = i4;
                                            }
                                            f5 = c2502.f9913 ? f6 - i12 : f6;
                                            z6 = false;
                                        } else {
                                            i12 = i4;
                                        }
                                        if (c11676 != null && c11676.m29175(c14437, c12836)) {
                                            return;
                                        }
                                        iM10813 = i3;
                                        c14436 = c14437;
                                        fArrM17863 = fArr;
                                        i16 = i12;
                                        i18 = i22;
                                        c12837 = c12836;
                                        i19 = i20;
                                        c9681 = c9681;
                                    }
                                } else {
                                    c6585 = c6586;
                                    i20 = i25;
                                    i9 = i22;
                                    i8 = i24;
                                    f2 = f7;
                                    i7 = i4;
                                    c14435 = c14436;
                                    iM10821 = i5;
                                    fArr = fArrM17863;
                                }
                            }
                            c14436 = c14435;
                            fArrM17863 = fArr;
                            i16 = i7;
                            i24 = i8;
                            f7 = f2;
                            c6586 = c6585;
                            c9681 = c9681;
                            i22 = i9;
                            c12837 = c12836;
                        } else {
                            i4 = i16;
                        }
                        i5 = iM10821;
                        i6 = i24;
                        f = f7;
                        cCharAt = charSequence.charAt(i20);
                        if (cCharAt <= 127) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            int i210 = C23850.f77103;
                            if ('0' > cCharAt) {
                            }
                            fArr = fArrM17863;
                        } else {
                            fArr = fArrM17863;
                        }
                        if (z3) {
                            if (booleanSupplier.getAsBoolean()) {
                                return;
                            } else {
                                i23 = 0;
                            }
                        } else if (booleanSupplier.getAsBoolean()) {
                            return;
                        } else {
                            i23 = 0;
                        }
                        if (z3) {
                            iM45558 = i20 + 1;
                        } else {
                            iM45558 = C20149.m45558(i20, iM10816, charSequence);
                        }
                        if (z3) {
                            fM17858 = c6586.m17855(cCharAt);
                        } else {
                            fM17858 = c6586.m17858(charSequence, i20, iM45558, f);
                        }
                        f2 = f + fM17858;
                        if (i19 != i20) {
                        }
                        i7 = i4;
                        c14435 = c14436;
                        iM10821 = i5;
                        if (f2 <= f5) {
                            if (z4) {
                                c6585 = c6586;
                                if (iM45558 - i20 < 2) {
                                }
                                i6 = iM45558;
                                i21 = i6;
                            } else {
                                c6585 = c6586;
                            }
                            i21 = iM45558;
                            i6 = i6;
                        } else {
                            c6585 = c6586;
                        }
                        i8 = i6;
                        i20 = iM45558;
                        i9 = i;
                        c14436 = c14435;
                        fArrM17863 = fArr;
                        i16 = i7;
                        i24 = i8;
                        f7 = f2;
                        c6586 = c6585;
                        c9681 = c9681;
                        i22 = i9;
                        c12837 = c12836;
                    }
                }
            }
            C12836 c12838 = c12837;
            C6585 c6587 = c6586;
            C9681 c9682 = c9681;
            float[] fArr2 = fArrM17863;
            int i30 = i16;
            C14435 c14438 = c14436;
            if (i19 != iM10816 || i3 == iM10816) {
                if (booleanSupplier.getAsBoolean()) {
                    return;
                }
                c14438.m34709(i19, iM10816, iM10821);
                c12838.m31832(c14438);
            }
            c14436 = c14438;
            i17 = iMin;
            c12837 = c12838;
            z5 = z5;
            fArrM17863 = fArr2;
            i16 = i30;
            c6586 = c6587;
            c9681 = c9682;
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo14793() {
        return !this.f41286.f6401;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean mo14791() {
        return this.f18383;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float mo14790() {
        return this.f18380;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo14784(int i, int i2, int i3) {
        m30754();
        if (mo14804()) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m30740(this.f41297);
        if ((this.f18380 - mo30761()) - mo30751() <= 0) {
            mo14798(this.f41297);
            return;
        }
        try {
            C3329 c3329M30760 = m30760();
            try {
                m14752(i, i2, i3, c3329M30760);
                c3329M30760.close();
                m30755();
            } catch (Throwable th) {
                try {
                    c3329M30760.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m30755();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14752(int i, int i2, int i3, C3329 c3329) {
        int size;
        int i4;
        int iM30733;
        int i5;
        int iM30731;
        int i6 = i;
        C3662 c3662 = this.f18384;
        c3662.clear();
        int iM30734 = m30733(i6, false);
        c3662.m10810(this.f41308.get(iM30734));
        if (i2 > 0) {
            iM30733 = m30733(i6 + i2, false);
            c3662.m10807(iM30734 + 1, iM30733 + 1, this.f41308);
            C14435 c14435 = c3662.get(0);
            C14435 c14435M10803 = c3662.m10803();
            size = c3662.size();
            i4 = c14435M10803.f47319 - c14435.f47319;
            int i7 = c14435M10803.f47317 - i2;
            if (c3662.size() == 1) {
                c14435M10803 = new C14435();
            }
            c14435.f47317 = i6;
            c14435M10803.f47316 = i6;
            c14435M10803.f47317 = i7;
            c3662.clear();
            c3662.m10810(c14435);
            c3662.m10810(c14435M10803);
        } else {
            C14435 c14436 = c3662.get(0);
            C14435 c14437 = new C14435();
            c14437.f47316 = i6;
            c14437.f47317 = c14436.f47317;
            c14436.f47317 = i6;
            c3662.m10820(0, c14436);
            c3662.m10810(c14437);
            size = 1;
            i4 = 0;
            iM30733 = iM30734;
        }
        if (i3 > 0) {
            int i8 = c3662.get(0).f47319;
            int i9 = i6 + i3;
            C14435 c14438 = new C14435();
            C1918 c1918M30735 = m30735(c3329, i6, i9);
            boolean z = true;
            while (z) {
                try {
                    int iM6244 = c1918M30735.m6244();
                    if (iM6244 == -1 || iM6244 >= i9) {
                        z = false;
                        iM6244 = i9;
                    }
                    c14438.m34709(i6, iM6244, i8);
                    c3662.add(c3662.m10811(), c14438);
                    i6 = iM6244 + 1;
                    i8++;
                } catch (Throwable th) {
                    try {
                        c1918M30735.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            c1918M30735.close();
            c3662.m10806(c3662.m10811(), c3662.size(), i3, 0);
        }
        C14435 c14435M10804 = c3662.m10803();
        c14435M10804.f47319 = c3662.m10821(c3662.size() - 2);
        c3662.m10820(c3662.m10811(), c14435M10804);
        int i10 = c3662.m10803().f47319 - c3662.get(0).f47319;
        for (int iM10811 = c3662.m10811(); iM10811 >= 0; iM10811--) {
            if (c3662.m10813(iM10811) == c3662.m10816(iM10811) && (!c3662.m10800(iM10811) || !c3662.m10815(iM10811))) {
                c3662.m10805(iM10811, iM10811 + 1);
            }
        }
        int i11 = i3 - i2;
        int i12 = i10 - i4;
        int iM10821 = this.f41308.m10821(iM30734);
        int iM10801 = this.f41308.m10801(iM30734);
        if (i12 != 0) {
            if (i12 < 0) {
                this.f41315.m37704(iM10821, iM10821 - i12);
            } else {
                this.f41315.m37710(iM10821, i12);
            }
        }
        C6111 c6111 = this.f41314;
        if (c6111.f20787) {
            this.f41308.m10819(iM30734, size, c3662);
            int size2 = iM30734 + c3662.size();
            c3662.clear();
            C3662 c3663 = this.f41308;
            c3663.m10806(size2, c3663.size(), i11, i12);
            return;
        }
        C1590 c1590 = this.f41286;
        if (!c1590.f6388 || (iM30731 = m30731(i12)) == this.f41316) {
            if (iM30734 > 0) {
                C14435 c14439 = this.f41308.get(iM30734 - 1);
                if (c14439.f47319 == c3662.get(0).f47319) {
                    c3662.add(0, c14439);
                    iM30734--;
                }
            }
            int iM10822 = this.f41308.m10821(iM30733);
            int i13 = iM30733 + 1;
            int iM10812 = (i13 >= this.f41308.size() || this.f41308.m10821(i13) != iM10822) ? i13 : this.f41308.m10812(i13) + 1;
            if (i13 < iM10812) {
                c3662.m10810(new C14435(this.f41308.m10813(i13) + i11, this.f41308.m10816(iM10812 - 1) + i11, iM10822 + i12));
            }
            C3662 c3664 = this.f18373;
            c3664.clear();
            int iMo30761 = (this.f18380 - mo30761()) - mo30751();
            this.f18376 = iMo30761;
            boolean zM10800 = this.f41308.m10800(iM30734);
            C11676 c11676 = i13 < iM10812 ? new C11676(this.f41308, i13, iM10812, i11, i12) : null;
            int i14 = iM10812;
            m14754((CharSequence) c3329, c3662, c3664, c3662.size(), iMo30761, zM10800, new C2502(c1590, this.f18383, c1590.m5427(), mo14793(), this.f18383), new BooleanSupplier() { // from class: l.ۧܰۚ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f37486.f41288;
                }
            }, c11676, false);
            this.f41308.m10819(iM30734, (c11676 == null ? i14 : c11676.f39267) - iM30734, c3664);
            int size3 = c3664.size() + iM30734;
            c3662.clear();
            c3664.clear();
            C3662 c3665 = this.f41308;
            c3665.m10806(size3, c3665.size(), i11, i12);
        } else {
            this.f41308.m10819(iM30734, size, c3662);
            int size4 = iM30734 + c3662.size();
            c3662.clear();
            C3662 c3666 = this.f41308;
            c3666.m10806(size4, c3666.size(), i11, i12);
            this.f41316 = iM30731;
            m14775(true);
        }
        int iM17881 = c1590.m17881();
        int i15 = iM10801;
        int i16 = 0;
        while (i16 <= i10) {
            int i17 = iM10821 + i16;
            int iM10802 = this.f41308.m10802(i17, i15);
            this.f41315.m37705(i17, this, c3329, this.f41308.m10813(iM10802), iM17881);
            i16++;
            i15 = iM10802;
        }
        int i18 = iM10821 + i10 + 1;
        C1194 c1194 = c6111.f20770.f43902;
        if (c1194.f5296) {
            int iM30744 = m30744(c1194.f5297);
            int iM30745 = m30744(c1194.f5295);
            C14435 c144310 = this.f41308.get(iM30744);
            C14435 c144311 = this.f41308.get(iM30745);
            int iMin = Math.min(iM10821, c144310.f47319);
            int iMax = Math.max(i18, c144311.f47319 + 1);
            int i19 = iMin;
            int i20 = i19;
            while (i20 < iM10821) {
                int iM10803 = this.f41308.m10802(i20, i19);
                this.f41315.m37705(i20, this, c3329, this.f41308.m10813(iM10803), iM17881);
                i20++;
                i19 = iM10803;
            }
            int iMax2 = Math.max(i19, i18);
            while (i18 < iMax) {
                int iM10804 = this.f41308.m10802(i18, iMax2);
                this.f41315.m37705(i18, this, c3329, this.f41308.m10813(iM10804), iM17881);
                i18++;
                iMax2 = iM10804;
            }
            i5 = iMin;
            i18 = iMax;
        } else {
            i5 = iM10821;
        }
        this.f41315.m37703(i5, i18);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14783(float f) {
        if (this.f18379 != null) {
            this.f18379.f45535 = true;
            this.f18379.f45537 = true;
        }
        this.f41316 = m14780();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo14802() {
        this.f41316 = m14780();
        if (m30759() || m30762()) {
            if (this.f41314.f20764 == this && Looper.myLooper() == Looper.getMainLooper() && !this.f41297.mo8725() && (this.f18379 != null || m30756() > 100000)) {
                m14768();
            } else {
                m14775(false);
            }
        }
        m14746();
        this.f41314.invalidate();
        this.f41314.mo17067();
    }

    static {
        byte[] bArr = new byte[128];
        for (char c : " !?;,=|>\t".toCharArray()) {
            bArr[c] = 1;
        }
        for (char c2 : "+-*/.".toCharArray()) {
            bArr[c2] = 2;
        }
        f18372 = bArr;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14786(C11018 c11018) {
        ReentrantLock reentrantLock = this.f18375;
        try {
            reentrantLock.lock();
            super.mo14786(c11018);
            reentrantLock.unlock();
            c11018.writeInt(this.f18380);
            c11018.writeInt(this.f18376);
            c11018.m27784(this.f18383);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
