package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩶᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20433 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f66242;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14517 f66243;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f66245;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3768 f66246;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC16200 f66248;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66250;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Executor f66258;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66252 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f66249 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile int f66259 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f66247 = 1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f66254 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f66255 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public volatile long f66256 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile long f66244 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f66251 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f66257 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public List f66253 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m46214(C20433 c20433, int i, int i2, RunnableC7733 runnableC7733) {
        c20433.getClass();
        int i3 = runnableC7733.f25567;
        if (i3 > i) {
            return false;
        }
        if (runnableC7733.f25562 && runnableC7733.f25566 <= i2 && i2 < i3) {
            if (!runnableC7733.f25560) {
                return false;
            }
            c20433.f66257 = runnableC7733.f25566;
            c20433.f66253 = runnableC7733.f25568;
        }
        runnableC7733.m20383();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46215(C20433 c20433, int i, RunnableC7733 runnableC7733) {
        c20433.getClass();
        if (!runnableC7733.f25562) {
            int i2 = runnableC7733.f25566;
            C1569 c1569 = c20433.f66246.f13630;
            C13638.checkIndex(i, c1569.f6312);
            if (i2 != ((int) (((long) i) * ((long) c1569.f6314)))) {
                return false;
            }
        }
        runnableC7733.m20383();
        return true;
    }

    public C20433(C3768 c3768, Executor executor, InterfaceC5614 interfaceC5614, C14517 c14517) {
        this.f66246 = c3768;
        this.f66258 = executor;
        this.f66245 = interfaceC5614;
        this.f66243 = c14517;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e6, code lost:
    
        r1.m20382();
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m46226(final int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20433.m46226(int, int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46210(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i < 0 || i >= i2 || i2 > this.f66246.f13631) {
            return;
        }
        int iMin = (int) Math.min(i2, ((long) i) + 65536);
        int iMin2 = Math.min(10000, (65536 - (iMin - i)) / 2);
        int i3 = iMin2 / 2;
        int iMax = Math.max(0, i - i3);
        long j2 = iMin;
        int iMin3 = (int) Math.min(this.f66246.f13631, ((long) i3) + j2);
        long j3 = this.f66256;
        if (j3 == -1 || ((int) (j3 >>> 32)) > iMax || iMin3 > ((int) j3)) {
            int iMax2 = Math.max(0, i - iMin2);
            int iMin4 = (int) Math.min(this.f66246.f13631, j2 + ((long) iMin2));
            synchronized (this.f66252) {
                this.f66256 = (((long) iMin4) & 4294967295L) | (((long) iMax2) << 32);
                this.f66242 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46211(List list, long j, InterfaceC5614 interfaceC5614) {
        C17175 c17175;
        C1900 c1900;
        synchronized (this.f66252) {
            if (!this.f66250 && this.f66256 == j && (this.f66251 != j || this.f66242 != list)) {
                C1900 c1901 = this.f66246.f13632;
                int i = (int) (j >>> 32);
                int i2 = (int) j;
                if (!list.isEmpty()) {
                    int iMax = Math.max(i, ((C21138) list.get(0)).f68853);
                    int iMin = (int) Math.min(Math.min(i2, ((C21138) C3012.m8974(1, list)).f68854), ((long) iMax) + 65536);
                    if (iMax < iMin) {
                        C7027 c7027M18851 = C7027.m18851(iMin - iMax, c1901.f7174, false);
                        C11261 c11261 = c1901.m6196() ? null : new C11261(c7027M18851, c1901.f7174, iMax);
                        long jNanoTime = System.nanoTime();
                        Iterator it = list.iterator();
                        int i3 = 0;
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                if (c11261 != null) {
                                    c7027M18851 = c11261.m28224();
                                }
                                C11967 c11967 = new C11967();
                                c7027M18851.getClass();
                                C2793 c2793 = new C2793();
                                c2793.m8488(c7027M18851);
                                while (c2793.m8490()) {
                                    C15682 c15682M8491 = c2793.m8491();
                                    c11967.m29779(c2793.m8487() - c2793.m8492(), new C15682(null, c15682M8491.m37368(), 0, c15682M8491.m37374(), 0, 0), false);
                                }
                                if (!m46216(this, interfaceC5614, j)) {
                                    c17175 = new C17175(iMax, c11967.m29778());
                                    break;
                                }
                                break;
                            }
                            C21138 c21138 = (C21138) it.next();
                            if (c1901.m6196()) {
                                int iMax2 = Math.max(iMax, c21138.f68853);
                                c1900 = c1901;
                                int iMin2 = Math.min(iMin, c21138.f68854);
                                if (iMax2 < iMin2) {
                                    int i4 = i3;
                                    C7027 c7027 = c21138.f68856;
                                    int i5 = c21138.f68853;
                                    c7027M18851 = c7027M18851.m18861(iMax2 - iMax, iMin2 - iMax, c7027.m18866(iMax2 - i5, iMin2 - i5));
                                    i3 = i4;
                                }
                            } else {
                                c1900 = c1901;
                                Iterator it2 = c21138.f68850.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C17610 c17610M28225 = c11261.m28225((C23961) it2.next());
                                        while (true) {
                                            i3++;
                                            if (i3 <= 65536 && ((i3 & 255) != 0 || (!m46216(this, interfaceC5614, j) && System.nanoTime() - jNanoTime <= 8000000))) {
                                                if (c17610M28225 == null || c17610M28225.m40936()) {
                                                    if (c17610M28225 != null) {
                                                        c11261.m28227(c17610M28225);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            c1901 = c1900;
                            iMin = iMin;
                            it = it;
                            c17175 = null;
                            break;
                        }
                    }
                    c17175 = null;
                    break;
                }
                c17175 = null;
                break;
                if (c17175 != null) {
                    this.f66244 = j;
                    C21180 c21180 = (C21180) this.f66248;
                    C11779.m29418(c21180.f68964, c21180.f68965, c17175);
                } else {
                    if (interfaceC5614.mo2357() || !this.f66246.m11011()) {
                        return;
                    }
                    synchronized (this.f66252) {
                        if (!this.f66250 && this.f66256 == j) {
                            this.f66251 = j;
                            this.f66242 = list;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m46216(C20433 c20433, InterfaceC5614 interfaceC5614, long j) {
        return c20433.f66250 || interfaceC5614.mo2357() || !c20433.f66246.m11011() || c20433.f66256 != j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21138 m46224(int i) {
        C21138 c21138 = null;
        if (this.f66250 || i < this.f66259) {
            return null;
        }
        synchronized (this.f66252) {
            int iMin = Integer.MAX_VALUE;
            for (RunnableC7733 runnableC7733 : this.f66252) {
                if (!runnableC7733.f25562) {
                    for (C21138 c21139 : runnableC7733.f25568) {
                        int i2 = c21139.f68853;
                        if (i2 == i) {
                            c21138 = c21139;
                        }
                        if (i2 > i) {
                            iMin = Math.min(iMin, i2);
                        }
                    }
                }
            }
            this.f66259 = iMin;
        }
        return c21138;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46225() {
        this.f66250 = true;
        synchronized (this.f66252) {
            Iterator it = this.f66252.iterator();
            while (it.hasNext()) {
                ((RunnableC7733) it.next()).m20383();
            }
            this.f66252.clear();
            this.f66253 = Collections.EMPTY_LIST;
            this.f66257 = -1;
            this.f66242 = null;
        }
        m46222();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m46222() {
        while (true) {
            C3329 c3329 = (C3329) this.f66249.poll();
            if (c3329 == null) {
                return;
            } else {
                try {
                    c3329.close();
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
