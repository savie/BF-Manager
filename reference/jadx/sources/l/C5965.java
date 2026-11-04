package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۚ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5965 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC13422 f20418;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f20419;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f20421;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f20424;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Executor f20425;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3025 f20429;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10792 f20432;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f20431 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f20423 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile int f20434 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20422 = 1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f20426 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f20433 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public volatile long f20430 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile long f20417 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f20420 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f20428 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f20427 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m17356(C5965 c5965, int i, int i2, RunnableC20135 runnableC20135) {
        c5965.getClass();
        int i3 = runnableC20135.f64709;
        if (i3 > i) {
            return false;
        }
        if (runnableC20135.f64708 && runnableC20135.f64703 <= i2 && i2 < i3) {
            if (!runnableC20135.f64710) {
                return false;
            }
            c5965.f20428 = runnableC20135.f64703;
            c5965.f20427 = runnableC20135.f64701;
        }
        runnableC20135.m46363();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17357(C5965 c5965, int i, RunnableC20135 runnableC20135) {
        c5965.getClass();
        if (!runnableC20135.f64708) {
            int i2 = runnableC20135.f64703;
            C24655 c24655 = c5965.f20429.f9811;
            C17359.checkIndex(i, c24655.f79808);
            if (i2 != ((int) (((long) i) * ((long) c24655.f79810)))) {
                return false;
            }
        }
        runnableC20135.m46363();
        return true;
    }

    public C5965(C3025 c3025, Executor executor, InterfaceC7509 interfaceC7509, C10792 c10792) {
        this.f20429 = c3025;
        this.f20425 = executor;
        this.f20419 = interfaceC7509;
        this.f20432 = c10792;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e6, code lost:
    
        r1.m46362();
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m17370(final int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5965.m17370(int, int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17352(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i < 0 || i >= i2 || i2 > this.f20429.f9813) {
            return;
        }
        int iMin = (int) Math.min(i2, ((long) i) + 65536);
        int iMin2 = Math.min(10000, (65536 - (iMin - i)) / 2);
        int i3 = iMin2 / 2;
        int iMax = Math.max(0, i - i3);
        long j2 = iMin;
        int iMin3 = (int) Math.min(this.f20429.f9813, ((long) i3) + j2);
        long j3 = this.f20430;
        if (j3 == -1 || ((int) (j3 >>> 32)) > iMax || iMin3 > ((int) j3)) {
            int iMax2 = Math.max(0, i - iMin2);
            int iMin4 = (int) Math.min(this.f20429.f9813, j2 + ((long) iMin2));
            synchronized (this.f20431) {
                this.f20430 = (((long) iMin4) & 4294967295L) | (((long) iMax2) << 32);
                this.f20424 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m17353(List list, long j, InterfaceC7509 interfaceC7509) {
        C23667 c23667;
        C20661 c20661;
        synchronized (this.f20431) {
            if (!this.f20421 && this.f20430 == j && (this.f20420 != j || this.f20424 != list)) {
                C20661 c20662 = this.f20429.f9812;
                int i = (int) (j >>> 32);
                int i2 = (int) j;
                if (!list.isEmpty()) {
                    int iMax = Math.max(i, ((C15659) list.get(0)).f50890);
                    int iMin = (int) Math.min(Math.min(i2, ((C15659) C7750.m21093(1, list)).f50887), ((long) iMax) + 65536);
                    if (iMax < iMin) {
                        C1270 c1270M4615 = C1270.m4615(iMin - iMax, c20662.f66262, false);
                        C16405 c16405 = c20662.m47283() ? null : new C16405(c1270M4615, c20662.f66262, iMax);
                        long jNanoTime = System.nanoTime();
                        Iterator it = list.iterator();
                        int i3 = 0;
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                if (c16405 != null) {
                                    c1270M4615 = c16405.m38963();
                                }
                                C14693 c14693 = new C14693();
                                c1270M4615.getClass();
                                C21407 c21407 = new C21407();
                                c21407.m48710(c1270M4615);
                                while (c21407.m48714()) {
                                    C11974 c11974M48712 = c21407.m48712();
                                    c14693.m35347(c21407.m48709() - c21407.m48715(), new C11974(null, c11974M48712.m30041(), 0, c11974M48712.m30034(), 0, 0), false);
                                }
                                if (!m17358(this, interfaceC7509, j)) {
                                    c23667 = new C23667(iMax, c14693.m35346());
                                    break;
                                }
                                break;
                            }
                            C15659 c15659 = (C15659) it.next();
                            if (c20662.m47283()) {
                                int iMax2 = Math.max(iMax, c15659.f50890);
                                c20661 = c20662;
                                int iMin2 = Math.min(iMin, c15659.f50887);
                                if (iMax2 < iMin2) {
                                    int i4 = i3;
                                    C1270 c1270 = c15659.f50889;
                                    int i5 = c15659.f50890;
                                    c1270M4615 = c1270M4615.m4629(iMax2 - iMax, iMin2 - iMax, c1270.m4635(iMax2 - i5, iMin2 - i5));
                                    i3 = i4;
                                }
                            } else {
                                c20661 = c20662;
                                Iterator it2 = c15659.f50888.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C17151 c17151M38964 = c16405.m38964((C23865) it2.next());
                                        while (true) {
                                            i3++;
                                            if (i3 <= 65536 && ((i3 & 255) != 0 || (!m17358(this, interfaceC7509, j) && System.nanoTime() - jNanoTime <= 8000000))) {
                                                if (c17151M38964 == null || c17151M38964.m40293()) {
                                                    if (c17151M38964 != null) {
                                                        c16405.m38966(c17151M38964);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            c20662 = c20661;
                            iMin = iMin;
                            it = it;
                            c23667 = null;
                            break;
                        }
                    }
                    c23667 = null;
                    break;
                }
                c23667 = null;
                break;
                if (c23667 != null) {
                    this.f20417 = j;
                    C5789 c5789 = (C5789) this.f20418;
                    C18467.m43021(c5789.f19882, c5789.f19883, c23667);
                } else {
                    if (interfaceC7509.mo924() || !this.f20429.m9836()) {
                        return;
                    }
                    synchronized (this.f20431) {
                        if (!this.f20421 && this.f20430 == j) {
                            this.f20420 = j;
                            this.f20424 = list;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m17358(C5965 c5965, InterfaceC7509 interfaceC7509, long j) {
        return c5965.f20421 || interfaceC7509.mo924() || !c5965.f20429.m9836() || c5965.f20430 != j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15659 m17368(int i) {
        C15659 c15659 = null;
        if (this.f20421 || i < this.f20434) {
            return null;
        }
        synchronized (this.f20431) {
            int iMin = Integer.MAX_VALUE;
            for (RunnableC20135 runnableC20135 : this.f20431) {
                if (!runnableC20135.f64708) {
                    for (C15659 c156510 : runnableC20135.f64701) {
                        int i2 = c156510.f50890;
                        if (i2 == i) {
                            c15659 = c156510;
                        }
                        if (i2 > i) {
                            iMin = Math.min(iMin, i2);
                        }
                    }
                }
            }
            this.f20434 = iMin;
        }
        return c15659;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17369() {
        this.f20421 = true;
        synchronized (this.f20431) {
            Iterator it = this.f20431.iterator();
            while (it.hasNext()) {
                ((RunnableC20135) it.next()).m46363();
            }
            this.f20431.clear();
            this.f20427 = Collections.EMPTY_LIST;
            this.f20428 = -1;
            this.f20424 = null;
        }
        m17366();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m17366() {
        while (true) {
            C15508 c15508 = (C15508) this.f20423.poll();
            if (c15508 == null) {
                return;
            } else {
                try {
                    c15508.close();
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
