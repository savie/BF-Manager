package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܶ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15745 implements InterfaceC19475 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static Logger f51193 = Logger.getLogger(C15745.class.getName());

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51194 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17237 f51195;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51196;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51197;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f51198;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f51199;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f51200;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double f51201;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f51202;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51203;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17237 f51204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51205;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16491 f51206;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f51207;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC12762 f51208;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13682 f51209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f51210;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1576 f51211;

    public final String toString() {
        return "JSyn V17.2.0 (build 467, 2025-06-29)";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m37652() {
        C16491 c16491;
        if (!this.f51210) {
            f51193.info("JSyn already stopped.");
            return;
        }
        if (this.f51207 && (c16491 = this.f51206) != null) {
            try {
                c16491.m39126();
                this.f51206.join(2000L);
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f51203) {
            this.f51203.clear();
        }
        this.f51210 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37649(C15745 c15745, AbstractC4053 abstractC4053) {
        c15745.getClass();
        if (abstractC4053.m13043() == null) {
            synchronized (c15745.f51203) {
                if (!c15745.f51203.contains(abstractC4053)) {
                    c15745.f51203.add(abstractC4053);
                }
            }
        }
    }

    public C15745() {
        InterfaceC12762 interfaceC12762M28550 = C11293.m28550();
        this.f51209 = new C13682();
        this.f51205 = true;
        this.f51207 = true;
        this.f51198 = 44100;
        this.f51201 = 1.0d / ((double) 44100);
        this.f51197 = new ArrayList();
        this.f51203 = new ArrayList();
        this.f51196 = new ArrayList();
        this.f51199 = new CopyOnWriteArrayList();
        this.f51208 = interfaceC12762M28550;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m37657() {
        synchronized (this) {
            if (this.f51210) {
                return;
            }
            this.f51198 = 44100;
            double d = 44100;
            this.f51201 = 1.0d / d;
            this.f51195 = new C17237(0);
            this.f51204 = new C17237(2);
            this.f51200 = 2.0d / d;
            if (this.f51207) {
                this.f51206 = new C16491(this);
                Logger logger = f51193;
                logger.fine("Synth thread old priority = " + this.f51206.getPriority());
                int priority = 10;
                if (this.f51206.getPriority() + 2 <= 10) {
                    priority = this.f51206.getPriority() + 2;
                }
                this.f51206.setPriority(priority);
                logger.fine("Synth thread new priority = " + this.f51206.getPriority());
                this.f51206.start();
            }
            this.f51210 = true;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m37650(C15745 c15745) {
        Iterator it = c15745.f51199.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37662() {
        int iM40491 = 0;
        int iM40490 = 0;
        int i = 0;
        while (i < 8) {
            C17237 c17237 = this.f51195;
            if (c17237 != null) {
                iM40490 = c17237.m40490(iM40490);
            }
            int i2 = iM40490;
            C4930 c4930M37654 = m37654();
            C13682 c13682 = this.f51209;
            for (List listM33472 = c13682.m33472(c4930M37654); listM33472 != null; listM33472 = c13682.m33472(c4930M37654)) {
                while (!listM33472.isEmpty()) {
                    InterfaceC6971 interfaceC6971 = (InterfaceC6971) listM33472.remove(0);
                    f51193.fine("processing " + interfaceC6971 + ", at time " + c4930M37654.m15111());
                    interfaceC6971.run();
                }
            }
            C17237 c17238 = this.f51204;
            int i3 = 0;
            while (true) {
                C24697[] c24697Arr = c17238.f56165;
                if (i3 >= c24697Arr.length) {
                    break;
                }
                c24697Arr[i3].m55040();
                i3++;
            }
            synchronized (this.f51203) {
                ListIterator listIterator = this.f51203.listIterator();
                while (listIterator.hasNext()) {
                    AbstractC4053 abstractC4053 = (AbstractC4053) listIterator.next();
                    if (this.f51205) {
                        abstractC4053.m13036(this.f51202);
                    } else {
                        abstractC4053.mo2017();
                    }
                }
                for (AbstractC4053 abstractC4054 : this.f51196) {
                    this.f51203.remove(abstractC4054);
                    abstractC4054.mo13035();
                }
            }
            this.f51196.clear();
            C17237 c17239 = this.f51204;
            if (c17239 != null) {
                iM40491 = c17239.m40491(iM40491);
            }
            this.f51202 += 8;
            i++;
            iM40490 = i2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37663(double d) throws InterruptedException {
        long j = this.f51202;
        double d2 = this.f51201;
        double d3 = (j * d2) + d;
        double d4 = j * d2;
        while (true) {
            double d5 = d3 - d4;
            if (d5 <= 0.0d) {
                return;
            }
            if (this.f51207) {
                long j2 = (long) (d5 * 1000.0d);
                if (j2 <= 0) {
                    j2 = 1;
                }
                Thread.sleep(j2);
            } else {
                m37662();
            }
            d4 = this.f51202 * this.f51201;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4930 m37654() {
        return new C4930(this.f51202 * this.f51201);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37656(C4930 c4930, InterfaceC6971 interfaceC6971) {
        if (Thread.currentThread() == this.f51206 && c4930.m15111() <= this.f51202 * this.f51201) {
            interfaceC6971.run();
            return;
        }
        f51193.fine("scheduling " + interfaceC6971 + ", at time " + c4930.m15111());
        this.f51209.m33473(c4930, interfaceC6971);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37664(AbstractC4053 abstractC4053) {
        C4930 c4930M37654 = m37654();
        if (abstractC4053.m13043() == null) {
            m37656(c4930M37654, new C11270(this, abstractC4053));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double m37661() {
        return this.f51200;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m37653(double d) {
        return Math.pow(3.0517578125E-5d, 1.0d / (d * ((double) this.f51198)));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m37665() {
        return this.f51198;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final double m37658() {
        return this.f51201;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m37659() {
        this.f51207 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m37660() {
        return this.f51207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37655(AbstractC4053 abstractC4053) {
        abstractC4053.mo13038(this);
        this.f51197.add(abstractC4053);
    }
}
