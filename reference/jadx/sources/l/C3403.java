package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۗᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3403 implements InterfaceC16810 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12551 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Logger f12552 = Logger.getLogger(C3403.class.getName());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f12553;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20817 f12554;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C9755 f12555;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12556;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1992 f12557;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f12558;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f12559;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f12560;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f12561;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17515 f12562;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C9755 f12563;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12564;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f12565;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f12566;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f12567;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f12568;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C11166 f12569;

    public final String toString() {
        return "JSyn V17.2.0 (build 467, 2025-06-29)";
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final synchronized void m10092() {
        C1992 c1992;
        if (!this.f12565) {
            f12552.info("JSyn already stopped.");
            return;
        }
        if (this.f12566 && (c1992 = this.f12557) != null) {
            try {
                c1992.m6409();
                this.f12557.join(2000L);
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f12564) {
            this.f12564.clear();
        }
        this.f12565 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10086(C3403 c3403, AbstractC0998 abstractC0998) {
        c3403.getClass();
        if (abstractC0998.m3822() == null) {
            synchronized (c3403.f12564) {
                if (!c3403.f12564.contains(abstractC0998)) {
                    c3403.f12564.add(abstractC0998);
                }
            }
        }
    }

    public C3403() {
        InterfaceC17515 interfaceC17515M30040 = C12076.m30040();
        this.f12554 = new C20817();
        this.f12567 = true;
        this.f12566 = true;
        this.f12561 = 44100;
        this.f12553 = 1.0d / ((double) 44100);
        this.f12556 = new ArrayList();
        this.f12564 = new ArrayList();
        this.f12559 = new ArrayList();
        this.f12560 = new CopyOnWriteArrayList();
        this.f12562 = interfaceC17515M30040;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m10099() {
        synchronized (this) {
            if (this.f12565) {
                return;
            }
            this.f12561 = 44100;
            double d = 44100;
            this.f12553 = 1.0d / d;
            this.f12555 = new C9755(0);
            this.f12563 = new C9755(2);
            this.f12558 = 2.0d / d;
            if (this.f12566) {
                this.f12557 = new C1992(this);
                Logger logger = f12552;
                logger.fine("Synth thread old priority = " + this.f12557.getPriority());
                int priority = 10;
                if (this.f12557.getPriority() + 2 <= 10) {
                    priority = this.f12557.getPriority() + 2;
                }
                this.f12557.setPriority(priority);
                logger.fine("Synth thread new priority = " + this.f12557.getPriority());
                this.f12557.start();
            }
            this.f12565 = true;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m10088(C3403 c3403) {
        Iterator it = c3403.f12560.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10100() {
        int iM24748 = 0;
        int iM24747 = 0;
        int i = 0;
        while (i < 8) {
            C9755 c9755 = this.f12555;
            if (c9755 != null) {
                iM24747 = c9755.m24747(iM24747);
            }
            int i2 = iM24747;
            C15879 c15879M10094 = m10094();
            C20817 c20817 = this.f12554;
            for (List listM46815 = c20817.m46815(c15879M10094); listM46815 != null; listM46815 = c20817.m46815(c15879M10094)) {
                while (!listM46815.isEmpty()) {
                    InterfaceC7411 interfaceC7411 = (InterfaceC7411) listM46815.remove(0);
                    f12552.fine("processing " + interfaceC7411 + ", at time " + c15879M10094.m37754());
                    interfaceC7411.run();
                }
            }
            C9755 c9756 = this.f12563;
            int i3 = 0;
            while (true) {
                C14694[] c14694Arr = c9756.f32808;
                if (i3 >= c14694Arr.length) {
                    break;
                }
                c14694Arr[i3].m35228();
                i3++;
            }
            synchronized (this.f12564) {
                ListIterator listIterator = this.f12564.listIterator();
                while (listIterator.hasNext()) {
                    AbstractC0998 abstractC0998 = (AbstractC0998) listIterator.next();
                    if (this.f12567) {
                        abstractC0998.m3815(this.f12568);
                    } else {
                        abstractC0998.mo2809();
                    }
                }
                for (AbstractC0998 abstractC0999 : this.f12559) {
                    this.f12564.remove(abstractC0999);
                    abstractC0999.mo3814();
                }
            }
            this.f12559.clear();
            C9755 c9757 = this.f12563;
            if (c9757 != null) {
                iM24748 = c9757.m24748(iM24748);
            }
            this.f12568 += 8;
            i++;
            iM24747 = i2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10101(double d) throws InterruptedException {
        long j = this.f12568;
        double d2 = this.f12553;
        double d3 = (j * d2) + d;
        double d4 = j * d2;
        while (true) {
            double d5 = d3 - d4;
            if (d5 <= 0.0d) {
                return;
            }
            if (this.f12566) {
                long j2 = (long) (d5 * 1000.0d);
                if (j2 <= 0) {
                    j2 = 1;
                }
                Thread.sleep(j2);
            } else {
                m10100();
            }
            d4 = this.f12568 * this.f12553;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15879 m10094() {
        return new C15879(this.f12568 * this.f12553);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10096(C15879 c15879, InterfaceC7411 interfaceC7411) {
        if (Thread.currentThread() == this.f12557 && c15879.m37754() <= this.f12568 * this.f12553) {
            interfaceC7411.run();
            return;
        }
        f12552.fine("scheduling " + interfaceC7411 + ", at time " + c15879.m37754());
        this.f12554.m46816(c15879, interfaceC7411);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10102(AbstractC0998 abstractC0998) {
        C15879 c15879M10094 = m10094();
        if (abstractC0998.m3822() == null) {
            m10096(c15879M10094, new C23866(this, abstractC0998));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double m10097() {
        return this.f12558;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m10091() {
        return this.f12561;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m10093(double d) {
        return Math.pow(3.0517578125E-5d, 1.0d / (d * ((double) this.f12561)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final double m10098() {
        return this.f12553;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m10090() {
        this.f12566 = false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m10103() {
        return this.f12566;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10095(AbstractC0998 abstractC0998) {
        abstractC0998.mo3816(this);
        this.f12556.add(abstractC0998);
    }
}
