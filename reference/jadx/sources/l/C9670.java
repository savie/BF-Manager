package l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۡ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes4.dex */
public final class C9670 extends AbstractC13753 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f31219;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C6909 f31220;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31221;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C23821 f31222;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f31223;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f31224;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f31225;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public volatile C6909 f31226;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public volatile Throwable f31227;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31228;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C6909 f31229;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f31230;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public volatile RunnableC19367 f31231;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C6909 f31232;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31233;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25203(boolean z, char c) {
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

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte mo25217() {
        return (byte) 1;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo25219() {
        if (m33641()) {
            this.f43655.m40744(this, this.f43646, this.f31232, this.f43640.m16214());
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int mo25220(C7042 c7042) {
        return m25208(c7042.m19364(), c7042.m19363());
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo25225() {
        return false;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo25230(int i, int i2) {
        if (this.f31231 == null && !this.f43663 && this.f43643 == this.f31232) {
            return super.mo25230(i, i2);
        }
        if (this.f31231 == null) {
            if (!this.f43659.m54080(this)) {
                return -1L;
            }
            i2 = m25208(i, i2);
        }
        if (!(i2 > 0 && m25208(i, i2) == i2)) {
            return -1L;
        }
        C6909 c6909 = this.f43643;
        double d = i;
        return (((long) c6909.get(Math.min(c6909.m19178(), (int) ((d + ((double) i2)) / ((double) this.f43640.m16189())))).m34799()) & 4294967295L) | (((long) c6909.get(Math.min(c6909.m19178(), Math.max(0, (int) (d / ((double) this.f43640.m16189()))))).f45295) << 32);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo25239(int i, int i2) {
        if (!this.f43663 && this.f43643 == this.f31232) {
            super.mo25239(i, i2);
            return true;
        }
        return false;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized long mo25240(int i, int i2) {
        if (this.f31231 == null && !this.f43663 && this.f43643 == this.f31232) {
            return super.mo25240(i, i2);
        }
        if (this.f31231 == null) {
            if (!this.f43659.m54080(this)) {
                return 0L;
            }
            i2 = m25208(i, i2);
        }
        if (!(i2 > 0 && m25208(i, i2) == i2)) {
            return 0L;
        }
        C6909 c6909 = this.f43643;
        double d = i;
        return (((long) c6909.get(Math.min(c6909.m19178(), ((int) ((d + ((double) i2)) / ((double) this.f43640.m16189()))) + 200)).m34799()) & 4294967295L) | (((long) c6909.get(Math.min(c6909.m19178(), Math.max(0, ((int) (d / ((double) this.f43640.m16189()))) - 200))).f45295) << 32);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo25243(int i) {
        return super.mo25243(i);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo25244(C7042 c7042) {
        int iM19364;
        int iM19363;
        iM19364 = c7042.m19364();
        iM19363 = c7042.m19363();
        return iM19363 > 0 && m25208(iM19364, iM19363) == iM19363;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m25229() {
        return !this.f31233 && this.f43643 == this.f31232;
    }

    public C9670(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, boolean z, int i, C3683 c3683, C10705 c10705, C15508 c15508) {
        super(c24132, c14540);
        this.f31230 = new ReentrantLock();
        this.f31221 = new AtomicInteger(0);
        this.f31233 = false;
        this.f31228 = new AtomicInteger();
        this.f31229 = new C6909();
        this.f31220 = new C6909();
        this.f43644 = i;
        if (c15508 != null) {
            m33627(interfaceC19106, c15508.m37172());
        }
        try {
            this.f31225 = z;
            m33633();
            this.f31224 = c24132.m54108();
            m33626(interfaceC19106);
            this.f31222 = c3683.m11977(this, c10705);
            this.f31232 = this.f43643;
            this.f43630 = m25228();
            if ((this.f31224 - mo33635()) - mo33629() != ((C9670) c3683.f12659).f31223) {
                this.f31222 = null;
            }
            m25215(false);
        } finally {
            if (!this.f43663) {
                m33612();
            }
        }
    }

    public C9670(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, boolean z) {
        this(c24132, interfaceC19106, c14540, z, -1, null);
    }

    public C9670(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, boolean z, int i, C15508 c15508) {
        super(c24132, c14540);
        this.f31230 = new ReentrantLock();
        this.f31221 = new AtomicInteger(0);
        this.f31233 = false;
        this.f31228 = new AtomicInteger();
        this.f31229 = new C6909();
        this.f31220 = new C6909();
        this.f43644 = i;
        if (c15508 != null) {
            m33627(interfaceC19106, c15508.m37172());
        }
        this.f31225 = z;
        this.f31224 = c24132.m54108();
        mo25242(interfaceC19106);
    }

    public C9670(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, C20348 c20348) {
        super(c24132, interfaceC19106, c14540, c20348);
        this.f31230 = new ReentrantLock();
        this.f31221 = new AtomicInteger(0);
        this.f31233 = false;
        this.f31228 = new AtomicInteger();
        this.f31229 = new C6909();
        this.f31220 = new C6909();
        this.f31224 = c20348.readInt();
        this.f31223 = c20348.readInt();
        this.f31225 = c20348.m46753();
        m33633();
        this.f31232 = this.f43643;
        m33626(interfaceC19106);
        m33612();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25223(String str) {
        super.mo25223(str);
        m25207();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo25242(InterfaceC19106 interfaceC19106) {
        try {
            m25206(interfaceC19106);
        } finally {
            if (!this.f43663) {
                m33612();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m25206(InterfaceC19106 interfaceC19106) {
        m33633();
        this.f31222 = null;
        this.f31221.incrementAndGet();
        mo25241();
        try {
            this.f31230.lock();
            this.f43670 = false;
            m33626(interfaceC19106);
            C6909 c6909 = this.f43643.isEmpty() ? this.f43643 : new C6909();
            C17350 c17350 = this.f43655.isEmpty() ? this.f43655 : new C17350();
            c17350.clear();
            C15508 c15508M33642 = m33642();
            try {
                int iM16214 = this.f43640.m16214();
                C22968 c22968M33621 = m33621(c15508M33642, 0, c15508M33642.length());
                try {
                    C14366 c14366 = new C14366();
                    boolean z = true;
                    boolean z2 = true;
                    int i = 0;
                    int i2 = 0;
                    while (z2) {
                        if (this.f43670) {
                            c6909.clear();
                            c17350.clear();
                            c22968M33621.close();
                            c15508M33642.close();
                            this.f31230.unlock();
                            return;
                        }
                        c17350.add(C12875.m31911(this, c15508M33642, i, iM16214));
                        int iM51841 = c22968M33621.m51841();
                        if (iM51841 == -1) {
                            iM51841 = c15508M33642.length();
                            z2 = false;
                        }
                        c14366.m34800(i, iM51841, i2);
                        c6909.m19173(c14366);
                        i = iM51841 + 1;
                        i2++;
                        try {
                            c15508M33642.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c22968M33621.close();
                    c17350.m40746();
                    c15508M33642.close();
                    this.f43643 = c6909;
                    this.f43655 = c17350;
                    this.f31230.unlock();
                    synchronized (this.f31221) {
                        this.f31232 = this.f43643;
                        this.f31221.incrementAndGet();
                        this.f43630 = m25228();
                        int iM54108 = this.f43659.m54108();
                        boolean z3 = iM54108 > 0 && iM54108 != this.f31224;
                        if (z3) {
                            this.f31224 = iM54108;
                        }
                        if ((this.f31224 - mo33635()) - mo33629() > 0) {
                            z = false;
                        }
                        this.f31233 = z;
                        if (!z) {
                            m25215(false);
                            if (z3) {
                                m25207();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        c22968M33621.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c15508M33642.close();
                throw th4;
            }
        } catch (Throwable th5) {
            this.f31230.unlock();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25231(boolean z) {
        this.f31225 = z;
        this.f31223 = 0;
        m25215(false);
        m25207();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m25227() {
        return this.f31225;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo25236(int i) {
        synchronized (this.f31221) {
            if (i > 0) {
                if ((this.f31224 != i || this.f31233) && m33641()) {
                    this.f31224 = i;
                    if ((i - mo33635()) - mo33629() <= 0) {
                        this.f31233 = true;
                        return;
                    }
                    if (this.f31232.m19175()) {
                        this.f31233 = false;
                        return;
                    }
                    if (this.f31231 != null) {
                        m25204();
                    } else if (this.f31233) {
                        this.f31233 = false;
                        m25215(false);
                    } else {
                        m25215(true);
                    }
                    m25207();
                    this.f43659.postInvalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m25234(int i) {
        int i2;
        return !this.f31233 && (i2 = this.f31224) == i && (i2 - mo33635()) - mo33629() > 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m25207() {
        int iMo33635;
        if (this.f43636.isEmpty() || (iMo33635 = (this.f31224 - mo33635()) - mo33629()) <= 0) {
            return;
        }
        this.f43636.size();
        C6909 c6909 = new C6909(0);
        this.f43670 = false;
        String str = this.f43673;
        C6909 c69010 = this.f43636;
        int size = c69010.size();
        C14540 c14540 = this.f43640;
        m25190((CharSequence) str, c69010, c6909, size, iMo33635, true, new C1468(c14540, this.f31225, c14540.m35087(), mo25226(), this.f31225), new BooleanSupplier() { // from class: l.ۛ᩸ᩴ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f22282.f43670;
            }
        }, (C10416) null, false);
        this.f43636 = c6909;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m25208(int i, int i2) {
        if (i < 0 || i2 <= 0 || this.f43653 || this.f31227 != null || this.f43643.isEmpty()) {
            return 0;
        }
        if (this.f43643 == this.f31232 && (!this.f43663 || this.f31226 != null)) {
            return i2;
        }
        if (this.f43643 != this.f31226) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(i2, (Math.ceil(this.f43640.m16189() * (((long) this.f43643.size()) - 1)) - 1.0d) - ((double) i)));
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo25216() {
        return this.f31228.get();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Throwable mo25238() {
        return this.f31227;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m25228() {
        C6909 c6909 = this.f31232;
        return m33617((c6909 == null || c6909.isEmpty() || this.f43643.isEmpty()) ? 0 : this.f31232.m19187().f45296 - this.f43643.m19187().f45296);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25237() {
        return this.f31231 != null || this.f43663;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m25218() {
        RunnableC19367 runnableC19367 = this.f31231;
        this.f31231 = null;
        if (runnableC19367 != null) {
            runnableC19367.f62572 = true;
            this.f43643 = this.f31232;
            this.f31226 = null;
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo25241() {
        m25218();
        if (this.f43663) {
            this.f43653 = true;
            while (this.f43663) {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m25215(boolean z) {
        if (m33641() || m33651()) {
            InterfaceC19106 interfaceC19106 = this.f43646;
            boolean zMo11034 = interfaceC19106.mo11034();
            int i = this.f31221.get();
            interfaceC19106.setReadOnly(true);
            synchronized (this) {
                if (this.f43646 == interfaceC19106 && i == this.f31221.get()) {
                    m25200(z, interfaceC19106, i, zMo11034);
                    return;
                }
                interfaceC19106.setReadOnly(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public void m25204() {
        C1468 c1468;
        this.f43630 = m25228();
        int iMo33635 = (this.f31224 - mo33635()) - mo33629();
        if (iMo33635 <= 0) {
            this.f31233 = true;
            return;
        }
        int iM33615 = m33615(this.f43659.m54026() + 1);
        int iM19176 = this.f43643.m19176(iM33615);
        synchronized (this.f43640) {
            c1468 = new C1468(this.f43640.m16219(), this.f31225, this.f43640.m35087(), mo25226(), this.f31225);
        }
        int iM54026 = (int) (this.f43659.m54026() - (c1468.f5123.m16189() * iM33615));
        RunnableC19367 runnableC19367 = this.f31231;
        if (runnableC19367 != null) {
            runnableC19367.f62572 = true;
        }
        this.f31228.incrementAndGet();
        if (this.f43663) {
            this.f43653 = true;
        }
        RunnableC19367 runnableC19368 = new RunnableC19367(this, iMo33635, c1468, iM19176, iM54026);
        this.f31231 = runnableC19368;
        this.f31227 = null;
        this.f31233 = false;
        runnableC19368.f62567.setReadOnly(true);
        C24132 c24132 = this.f43659;
        c24132.getClass();
        C21576.m49068(new RunnableC4773(2, c24132));
        runnableC19368.f62573 = new RunnableC14303(0, c24132);
        try {
            C5261.f18540.execute(runnableC19368);
        } catch (Error | RuntimeException e) {
            runnableC19368.f62567.setReadOnly(false);
            runnableC19368.f62573.run();
            this.f31231 = null;
            throw e;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0361 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9471. Try increasing type updates limit count.
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
    private void m25200(boolean r29, l.InterfaceC19106 r30, int r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9670.m25200(boolean, l.ᩳ۬᩸, int, boolean):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25202(C9670 c9670, int i, int i2, InterfaceC19106 interfaceC19106, int i3) {
        return (!c9670.f43670 && !c9670.f43653 && i == c9670.f31221.get() && i2 == c9670.f31228.get() && c9670.f43646 == interfaceC19106 && c9670.m33631() == i3) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #4 {all -> 0x006b, blocks: (B:3:0x0009, B:5:0x0013, B:7:0x0019, B:9:0x001f, B:36:0x0073, B:38:0x0079), top: B:51:0x0009 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25195(C9670 c9670, List list, C23843 c23843, C6909 c6909, int i, InterfaceC19106 interfaceC19106, int i2, int i3, int i4, int i5, int i6, float f, ArrayList arrayList, C6909 c69010, Runnable runnable) throws Throwable {
        boolean z = false;
        try {
            try {
                try {
                    C6909 c6909M20371 = C7434.m20371(new C20859(0, c9670), list, c23843);
                    if (c6909M20371 != null && !c23843.getAsBoolean()) {
                        C6909 c69011 = new C6909(c6909);
                        c69011.m19172(c6909M20371);
                        c9670.f31232 = c69011;
                        c9670.f43643 = c69011;
                        c9670.f31223 = i;
                        try {
                            c9670.m25198(interfaceC19106, i2, i3, i4, c69011, i5, i6, f);
                            c9670.m25189(arrayList.size(), C7434.f24471, c69011);
                        } catch (Error e) {
                            e = e;
                            z = true;
                            if (!c23843.getAsBoolean()) {
                                c9670.f31227 = e;
                            }
                            if (!z && !c9670.f43659.m54054(c9670)) {
                                c9670.f43643 = c69010;
                            }
                            c9670.m25199(interfaceC19106, runnable);
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            z = true;
                            if (!c23843.getAsBoolean()) {
                                c9670.f31227 = e;
                            }
                            if (!z) {
                                c9670.f43643 = c69010;
                            }
                            c9670.m25199(interfaceC19106, runnable);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z && !c9670.f43659.m54054(c9670)) {
                                c9670.f43643 = c69010;
                            }
                            c9670.m25199(interfaceC19106, runnable);
                            throw th;
                        }
                    } else if (!c9670.f43659.m54054(c9670)) {
                        c9670.f43643 = c69010;
                    }
                    c9670.m25199(interfaceC19106, runnable);
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
    public void m25189(int i, int i2, C6909 c6909) {
        SystemClock.elapsedRealtime();
        c6909.size();
        Math.min(i2, i);
        Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6909 m25184(CharSequence charSequence, C6909 c6909, C14145 c14145, int i, C1468 c1468, BooleanSupplier booleanSupplier) {
        int i2;
        C5109 c5109;
        C6909 c69010 = new C6909();
        List listM34358 = c14145.m34358();
        C18096 c18096M19181 = c6909.m19181();
        C14366 c14366 = new C14366();
        int i3 = 0;
        while (i3 < listM34358.size() && !booleanSupplier.getAsBoolean()) {
            C5109 c51010 = (C5109) listM34358.get(i3);
            if (c51010.m15463()) {
                if (c6909.m19176(c51010.m15466()) >= c51010.m15465() && c6909.m19180(c51010.m15468() - 1) <= c51010.m15462()) {
                    c69010.m19170(c51010.m15466(), c51010.m15468(), c6909);
                } else {
                    for (int iM15466 = c51010.m15466(); iM15466 < c51010.m15468(); iM15466++) {
                        C14366 c14366M42205 = c18096M19181.m42205(iM15466);
                        if (c14366M42205.f45295 < c51010.m15465() || c14366M42205.f45294 > c51010.m15462()) {
                            c14366M42205.m34800(Math.max(c14366M42205.f45295, c51010.m15465()), Math.min(c14366M42205.f45294, c51010.m15462()), c14366M42205.f45296);
                            c14366M42205.m34802(false);
                        }
                        c69010.m19173(c14366M42205);
                    }
                }
                i3++;
            } else {
                C6909 c69011 = new C6909();
                while (true) {
                    i2 = i3 + 1;
                    c5109 = (C5109) listM34358.get(i3);
                    int iM15467 = c5109.m15466();
                    while (iM15467 < c5109.m15468()) {
                        int iMin = Math.min(c5109.m15468(), c6909.m19179(iM15467) + 1);
                        c14366.m34800(Math.max(c6909.m19176(iM15467), c5109.m15465()), Math.min(c6909.m19180(iMin - 1), c5109.m15462()), c6909.m19188(iM15467));
                        c69011.m19173(c14366);
                        iM15467 = iMin;
                    }
                    if (i2 >= listM34358.size() || ((C5109) listM34358.get(i2)).m15463()) {
                        break;
                    }
                    i3 = i2;
                }
                m25190(charSequence, c69011, c69010, c69011.size(), i, c51010.m15467(), c1468, booleanSupplier, (C10416) null, !c5109.m15464());
                i3 = i2;
            }
        }
        return c69010;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25201(C6909 c6909, int i, float f) {
        if (!c6909.isEmpty() && c6909.m19187().f45294 >= i) {
            int size = c6909.size() - 1;
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (c6909.m19180(i3) <= i) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            if ((((long) (c6909.size() - i2)) - 1) * f > this.f43659.m53993()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25199(InterfaceC19106 interfaceC19106, Runnable runnable) {
        try {
            m33612();
            interfaceC19106.setReadOnly(false);
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f43663 = false;
                    this.f43659.m54090(this);
                }
            }
            this.f43659.postInvalidate();
        } catch (Throwable th) {
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f43663 = false;
                    this.f43659.m54090(this);
                }
            }
            this.f43659.postInvalidate();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25198(final InterfaceC19106 interfaceC19106, final int i, final int i2, final int i3, final C6909 c6909, int i4, final int i5, final float f) {
        if (this.f43644 >= 0) {
            return;
        }
        final int iM25211 = m25211(c6909, i4);
        this.f43659.post(new Runnable() { // from class: l.ۘ᩸ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C9670.m25197(this.f15933, interfaceC19106, i, i2, c6909, i3, f, iM25211, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25197(C9670 c9670, InterfaceC19106 interfaceC19106, int i, int i2, C6909 c6909, int i3, float f, int i4, int i5) {
        C24132 c24132 = c9670.f43659;
        if (c24132.f78022 == c9670 && c9670.f43646 == interfaceC19106 && interfaceC19106.mo15344() == i && c9670.m33631() == i && c9670.f31228.get() == i2 && c9670.f43643 == c6909 && !c24132.m53941(c9670) && c24132.m54027() == i3) {
            c24132.m54036(c24132.m53873(((int) (f * i4)) + i5));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m25211(C6909 c6909, int i) {
        int size = c6909.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >>> 1;
            if (c6909.m19176(i3) >= i || c6909.m19180(i3) > i) {
                size = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25190(CharSequence charSequence, C6909 c6909, C6909 c69010, int i, int i2, boolean z, C1468 c1468, BooleanSupplier booleanSupplier, C10416 c10416, boolean z2) {
        c69010.getClass();
        C8400 c8400 = new C8400(c69010);
        try {
            m25191(charSequence, c6909, c8400, i, i2, z, c1468, booleanSupplier, c10416, z2);
            c8400.close();
        } catch (Throwable th) {
            try {
                c8400.close();
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
    public static void m25191(CharSequence charSequence, C6909 c6909, C8400 c8400, int i, int i2, boolean z, C1468 c1468, BooleanSupplier booleanSupplier, C10416 c10416, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        char cCharAt;
        boolean z3;
        float[] fArr;
        int iM6073;
        float fM16194;
        float f2;
        int i7;
        C14366 c14366;
        C5438 c5438;
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
        C8400 c8401 = c8400;
        C5438 c5439 = c1468.f5123;
        C19984 c19984 = charSequence instanceof C19984 ? (C19984) charSequence : null;
        float[] fArrM16202 = c19984 != null ? c5439.m16202() : null;
        C14366 c14367 = new C14366();
        boolean z4 = c1468.f5120;
        int i16 = c1468.f5119;
        boolean z5 = z;
        int i17 = 0;
        while (i17 < i && !booleanSupplier.getAsBoolean()) {
            int iMin = Math.min(i, c6909.m19179(i17) + 1);
            int iM19188 = c6909.m19188(i17);
            float f4 = i2;
            if (!z5) {
                if (c1468.f5121) {
                    f4 -= i16;
                }
                z5 = true;
            }
            float f5 = c1468.f5122 ? f4 - i16 : f4;
            int iM19176 = c6909.m19176(i17);
            float f6 = f4;
            int iM19180 = c6909.m19180(iMin - 1);
            int i18 = i;
            boolean z6 = z5;
            int i19 = iM19176;
            while (true) {
                float f7 = 0.0f;
                int i20 = i19;
                int i21 = i20;
                i3 = iM19176;
                int i22 = i18;
                int i23 = 0;
                int i24 = i21;
                while (true) {
                    if (i20 < iM19180) {
                        byte[] bArr = f31219;
                        if (c19984 != null) {
                            i4 = i16;
                            if (i20 + 1 < iM19180) {
                                char[] cArrM45930 = c19984.m45930(i20);
                                int iM45929 = c19984.m45929();
                                c19984 = c19984;
                                int iMin2 = Math.min(Math.min(iM19180 - 1, c19984.m45928() - 1) - i20, 256 - i23) + i20;
                                int i25 = i20;
                                while (true) {
                                    if (i25 >= iMin2) {
                                        c14367 = c14367;
                                        i5 = iM19188;
                                        break;
                                    }
                                    int i26 = i25 - iM45929;
                                    c14367 = c14367;
                                    char c = cArrM45930[i26];
                                    i5 = iM19188;
                                    if (c > 127 || c == '\t') {
                                        break;
                                    }
                                    char c2 = cArrM45930[i26 + 1];
                                    char[] cArr = cArrM45930;
                                    if (c2 == 65039 || c2 == 8419) {
                                        int i27 = C19080.f61794;
                                        if (('0' > c || c > '9') && c != '#' && c != '*') {
                                            f3 = f7 + fArrM16202[c];
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
                                            c14367 = c14367;
                                            iM19188 = i5;
                                            f7 = f3;
                                            cArrM45930 = cArr;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        f3 = f7 + fArrM16202[c];
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
                                        c14367 = c14367;
                                        iM19188 = i5;
                                        f7 = f3;
                                        cArrM45930 = cArr;
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
                                        int i29 = C19080.f61794;
                                        if (!(('0' > cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') || (i13 = i20 + 1) >= iM19180) {
                                            fArr = fArrM16202;
                                        } else {
                                            char cCharAt3 = charSequence.charAt(i13);
                                            fArr = fArrM16202;
                                            if (cCharAt3 == 65039 || cCharAt3 == 8419) {
                                                z3 = false;
                                            }
                                        }
                                    } else {
                                        fArr = fArrM16202;
                                    }
                                    if (z3 || (i23 = i23 + 1) == 256) {
                                        if (booleanSupplier.getAsBoolean()) {
                                            return;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    if (z3) {
                                        iM6073 = i20 + 1;
                                    } else {
                                        iM6073 = C1709.m6073(i20, iM19180, charSequence);
                                    }
                                    if (z3) {
                                        fM16194 = c5439.m16191(cCharAt);
                                    } else {
                                        fM16194 = c5439.m16194(charSequence, i20, iM6073, f);
                                    }
                                    f2 = f + fM16194;
                                    if (i19 != i20 || (f2 <= f6 && !(z2 && iMin == i22 && iM6073 == iM19180 && f2 > f5))) {
                                        i7 = i4;
                                        c14366 = c14367;
                                        iM19188 = i5;
                                        if (f2 <= f5) {
                                            if (z4) {
                                                c5438 = c5439;
                                                if (iM6073 - i20 < 2 || (cCharAt >= 128 ? !(cCharAt != 8203 && ((cCharAt < 55296 || cCharAt > 56319) && (cCharAt < 11904 || !m25203(true, cCharAt) || (i10 = i20 + 1) >= charSequence.length() || !m25203(false, charSequence.charAt(i10))))) : !((b = bArr[cCharAt]) == 2 ? (i11 = i20 + 1) < charSequence.length() && ((cCharAt2 = charSequence.charAt(i11)) >= 128 ? Character.isDigit(cCharAt2) : cCharAt2 >= '0' && cCharAt2 <= '9') : b != 1))) {
                                                    i6 = iM6073;
                                                    i21 = i6;
                                                }
                                            } else {
                                                c5438 = c5439;
                                            }
                                            i21 = iM6073;
                                            i6 = i6;
                                        } else {
                                            c5438 = c5439;
                                        }
                                        i8 = i6;
                                        i20 = iM6073;
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
                                        C14366 c14368 = c14367;
                                        iM19188 = i5;
                                        c14368.m34800(i19, i20, iM19188);
                                        c8400.m22572(c14368);
                                        if (z6) {
                                            if (c1468.f5121) {
                                                i12 = i4;
                                                f6 -= i12;
                                            } else {
                                                i12 = i4;
                                            }
                                            f5 = c1468.f5122 ? f6 - i12 : f6;
                                            z6 = false;
                                        } else {
                                            i12 = i4;
                                        }
                                        if (c10416 != null && c10416.m26728(c14368, c8400)) {
                                            return;
                                        }
                                        iM19176 = i3;
                                        c14367 = c14368;
                                        fArrM16202 = fArr;
                                        i16 = i12;
                                        i18 = i22;
                                        c8401 = c8400;
                                        i19 = i20;
                                        c19984 = c19984;
                                    }
                                } else {
                                    c5438 = c5439;
                                    i20 = i25;
                                    i9 = i22;
                                    i8 = i24;
                                    f2 = f7;
                                    i7 = i4;
                                    c14366 = c14367;
                                    iM19188 = i5;
                                    fArr = fArrM16202;
                                }
                            }
                            c14367 = c14366;
                            fArrM16202 = fArr;
                            i16 = i7;
                            i24 = i8;
                            f7 = f2;
                            c5439 = c5438;
                            c19984 = c19984;
                            i22 = i9;
                            c8401 = c8400;
                        } else {
                            i4 = i16;
                        }
                        i5 = iM19188;
                        i6 = i24;
                        f = f7;
                        cCharAt = charSequence.charAt(i20);
                        if (cCharAt <= 127) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            int i210 = C19080.f61794;
                            if ('0' > cCharAt) {
                            }
                            fArr = fArrM16202;
                        } else {
                            fArr = fArrM16202;
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
                            iM6073 = i20 + 1;
                        } else {
                            iM6073 = C1709.m6073(i20, iM19180, charSequence);
                        }
                        if (z3) {
                            fM16194 = c5439.m16191(cCharAt);
                        } else {
                            fM16194 = c5439.m16194(charSequence, i20, iM6073, f);
                        }
                        f2 = f + fM16194;
                        if (i19 != i20) {
                        }
                        i7 = i4;
                        c14366 = c14367;
                        iM19188 = i5;
                        if (f2 <= f5) {
                            if (z4) {
                                c5438 = c5439;
                                if (iM6073 - i20 < 2) {
                                }
                                i6 = iM6073;
                                i21 = i6;
                            } else {
                                c5438 = c5439;
                            }
                            i21 = iM6073;
                            i6 = i6;
                        } else {
                            c5438 = c5439;
                        }
                        i8 = i6;
                        i20 = iM6073;
                        i9 = i;
                        c14367 = c14366;
                        fArrM16202 = fArr;
                        i16 = i7;
                        i24 = i8;
                        f7 = f2;
                        c5439 = c5438;
                        c19984 = c19984;
                        i22 = i9;
                        c8401 = c8400;
                    }
                }
            }
            C8400 c8402 = c8401;
            C5438 c54310 = c5439;
            C19984 c19985 = c19984;
            float[] fArr2 = fArrM16202;
            int i30 = i16;
            C14366 c14369 = c14367;
            if (i19 != iM19180 || i3 == iM19180) {
                if (booleanSupplier.getAsBoolean()) {
                    return;
                }
                c14369.m34800(i19, iM19180, iM19188);
                c8402.m22572(c14369);
            }
            c14367 = c14369;
            i17 = iMin;
            c8401 = c8402;
            z5 = z5;
            fArrM16202 = fArr2;
            i16 = i30;
            c5439 = c54310;
            c19984 = c19985;
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo25226() {
        return !this.f43640.f45749;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo25233() {
        return this.f31225;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float mo25232() {
        return this.f31224;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo25222(int i, int i2, int i3) {
        m33637();
        if (mo25237()) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m33626(this.f43646);
        if ((this.f31224 - mo33635()) - mo33629() <= 0) {
            mo25242(this.f43646);
            return;
        }
        try {
            C15508 c15508M33642 = m33642();
            try {
                m25188(i, i2, i3, c15508M33642);
                c15508M33642.close();
                m33612();
            } catch (Throwable th) {
                try {
                    c15508M33642.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m33612();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25188(int i, int i2, int i3, C15508 c15508) {
        int size;
        int i4;
        int iM33619;
        int i5;
        int iM33617;
        int i6 = i;
        C6909 c6909 = this.f31229;
        c6909.clear();
        int iM336110 = m33619(i6, false);
        c6909.m19173(this.f43643.get(iM336110));
        if (i2 > 0) {
            iM33619 = m33619(i6 + i2, false);
            c6909.m19170(iM336110 + 1, iM33619 + 1, this.f43643);
            C14366 c14366 = c6909.get(0);
            C14366 c14366M19187 = c6909.m19187();
            size = c6909.size();
            i4 = c14366M19187.f45296 - c14366.f45296;
            int i7 = c14366M19187.f45294 - i2;
            if (c6909.size() == 1) {
                c14366M19187 = new C14366();
            }
            c14366.f45294 = i6;
            c14366M19187.f45295 = i6;
            c14366M19187.f45294 = i7;
            c6909.clear();
            c6909.m19173(c14366);
            c6909.m19173(c14366M19187);
        } else {
            C14366 c14367 = c6909.get(0);
            C14366 c14368 = new C14366();
            c14368.f45295 = i6;
            c14368.f45294 = c14367.f45294;
            c14367.f45294 = i6;
            c6909.m19184(0, c14367);
            c6909.m19173(c14368);
            size = 1;
            i4 = 0;
            iM33619 = iM336110;
        }
        if (i3 > 0) {
            int i8 = c6909.get(0).f45296;
            int i9 = i6 + i3;
            C14366 c14369 = new C14366();
            C22968 c22968M33621 = m33621(c15508, i6, i9);
            boolean z = true;
            while (z) {
                try {
                    int iM51841 = c22968M33621.m51841();
                    if (iM51841 == -1 || iM51841 >= i9) {
                        z = false;
                        iM51841 = i9;
                    }
                    c14369.m34800(i6, iM51841, i8);
                    c6909.add(c6909.m19178(), c14369);
                    i6 = iM51841 + 1;
                    i8++;
                } catch (Throwable th) {
                    try {
                        c22968M33621.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            c22968M33621.close();
            c6909.m19169(c6909.m19178(), c6909.size(), i3, 0);
        }
        C14366 c14366M19188 = c6909.m19187();
        c14366M19188.f45296 = c6909.m19188(c6909.size() - 2);
        c6909.m19184(c6909.m19178(), c14366M19188);
        int i10 = c6909.m19187().f45296 - c6909.get(0).f45296;
        for (int iM19178 = c6909.m19178(); iM19178 >= 0; iM19178--) {
            if (c6909.m19176(iM19178) == c6909.m19180(iM19178) && (!c6909.m19177(iM19178) || !c6909.m19174(iM19178))) {
                c6909.m19168(iM19178, iM19178 + 1);
            }
        }
        int i11 = i3 - i2;
        int i12 = i10 - i4;
        int iM19188 = this.f43643.m19188(iM336110);
        int iM19185 = this.f43643.m19185(iM336110);
        if (i12 != 0) {
            if (i12 < 0) {
                this.f43655.m40742(iM19188, iM19188 - i12);
            } else {
                this.f43655.m40748(iM19188, i12);
            }
        }
        C24132 c24132 = this.f43659;
        if (c24132.f78013) {
            this.f43643.m19183(iM336110, size, c6909);
            int size2 = iM336110 + c6909.size();
            c6909.clear();
            C6909 c69010 = this.f43643;
            c69010.m19169(size2, c69010.size(), i11, i12);
            return;
        }
        C14540 c14540 = this.f43640;
        if (!c14540.f45769 || (iM33617 = m33617(i12)) == this.f43630) {
            if (iM336110 > 0) {
                C14366 c143610 = this.f43643.get(iM336110 - 1);
                if (c143610.f45296 == c6909.get(0).f45296) {
                    c6909.add(0, c143610);
                    iM336110--;
                }
            }
            int iM19189 = this.f43643.m19188(iM33619);
            int i13 = iM33619 + 1;
            int iM19179 = (i13 >= this.f43643.size() || this.f43643.m19188(i13) != iM19189) ? i13 : this.f43643.m19179(i13) + 1;
            if (i13 < iM19179) {
                c6909.m19173(new C14366(this.f43643.m19176(i13) + i11, this.f43643.m19180(iM19179 - 1) + i11, iM19189 + i12));
            }
            C6909 c69011 = this.f31220;
            c69011.clear();
            int iMo33635 = (this.f31224 - mo33635()) - mo33629();
            this.f31223 = iMo33635;
            boolean zM19177 = this.f43643.m19177(iM336110);
            C10416 c10416 = i13 < iM19179 ? new C10416(this.f43643, i13, iM19179, i11, i12) : null;
            int i14 = iM19179;
            m25190((CharSequence) c15508, c6909, c69011, c6909.size(), iMo33635, zM19177, new C1468(c14540, this.f31225, c14540.m35087(), mo25226(), this.f31225), new BooleanSupplier() { // from class: l.᩺᩸ᩴ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f79676.f43670;
                }
            }, c10416, false);
            this.f43643.m19183(iM336110, (c10416 == null ? i14 : c10416.f33110) - iM336110, c69011);
            int size3 = c69011.size() + iM336110;
            c6909.clear();
            c69011.clear();
            C6909 c69012 = this.f43643;
            c69012.m19169(size3, c69012.size(), i11, i12);
        } else {
            this.f43643.m19183(iM336110, size, c6909);
            int size4 = iM336110 + c6909.size();
            c6909.clear();
            C6909 c69013 = this.f43643;
            c69013.m19169(size4, c69013.size(), i11, i12);
            this.f43630 = iM33617;
            m25215(true);
        }
        int iM16214 = c14540.m16214();
        int i15 = iM19185;
        int i16 = 0;
        while (i16 <= i10) {
            int i17 = iM19188 + i16;
            int iM19186 = this.f43643.m19186(i17, i15);
            this.f43655.m40743(i17, this, c15508, this.f43643.m19176(iM19186), iM16214);
            i16++;
            i15 = iM19186;
        }
        int i18 = iM19188 + i10 + 1;
        C10262 c10262 = c24132.f78033.f4725;
        if (c10262.f32767) {
            int iM33646 = m33646(c10262.f32768);
            int iM33647 = m33646(c10262.f32766);
            C14366 c143611 = this.f43643.get(iM33646);
            C14366 c143612 = this.f43643.get(iM33647);
            int iMin = Math.min(iM19188, c143611.f45296);
            int iMax = Math.max(i18, c143612.f45296 + 1);
            int i19 = iMin;
            int i20 = i19;
            while (i20 < iM19188) {
                int iM19187 = this.f43643.m19186(i20, i19);
                this.f43655.m40743(i20, this, c15508, this.f43643.m19176(iM19187), iM16214);
                i20++;
                i19 = iM19187;
            }
            int iMax2 = Math.max(i19, i18);
            while (i18 < iMax) {
                int iM191810 = this.f43643.m19186(i18, iMax2);
                this.f43655.m40743(i18, this, c15508, this.f43643.m19176(iM191810), iM16214);
                i18++;
                iMax2 = iM191810;
            }
            i5 = iMin;
            i18 = iMax;
        } else {
            i5 = iM19188;
        }
        this.f43655.m40749(i5, i18);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25221(float f) {
        if (this.f31231 != null) {
            this.f31231.f62576 = true;
            this.f31231.f62572 = true;
        }
        this.f43630 = m25228();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo25235() {
        this.f43630 = m25228();
        if (m33641() || m33651()) {
            if (this.f43659.f78022 == this && Looper.myLooper() == Looper.getMainLooper() && !this.f43646.mo11034() && (this.f31231 != null || m33638() > 100000)) {
                m25204();
            } else {
                m25215(false);
            }
        }
        m25207();
        this.f43659.invalidate();
        this.f43659.mo52308();
    }

    static {
        byte[] bArr = new byte[128];
        for (char c : " !?;,=|>\t".toCharArray()) {
            bArr[c] = 1;
        }
        for (char c2 : "+-*/.".toCharArray()) {
            bArr[c2] = 2;
        }
        f31219 = bArr;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25224(C6178 c6178) {
        ReentrantLock reentrantLock = this.f31230;
        try {
            reentrantLock.lock();
            super.mo25224(c6178);
            reentrantLock.unlock();
            c6178.writeInt(this.f31224);
            c6178.writeInt(this.f31223);
            c6178.m17789(this.f31225);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
