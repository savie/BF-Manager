package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0540 extends AbstractC9488 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24605 f2257;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f2258;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f2259;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3523 f2260;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12472 f2261 = new C12472();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7998 f2262;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2263;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f2264;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo2524(C7998 c7998) {
        C24605 c24605 = this.f2257;
        c24605.m54931(c24605.m54930() - 1);
        this.f2262.f26548 = this.f2260.mo5263(-1);
        C7998 c7999 = this.f2262;
        if (this.f2258 != null) {
            while (this.f2262 != c7998) {
                m2526();
                this.f2262 = this.f2262.f9157;
            }
        } else {
            this.f2262 = c7998;
        }
        c7999.f9157 = c7998;
        if (!this.f2263 || c7998 == null) {
            return;
        }
        c7998.m21806(c7999);
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2516(int i) {
        C24605 c24605 = this.f2257;
        return i >= c24605.m54932(c24605.m54930() - 1);
    }

    public AbstractC0540(C3523 c3523) {
        C24605 c24605 = new C24605();
        this.f2257 = c24605;
        c24605.m54929(0);
        this.f2263 = true;
        this.f2260 = null;
        C12472 c12472 = this.f2261;
        c12472.f40059 = false;
        c12472.f40060 = null;
        c12472.f40062 = -1;
        this.f2262 = null;
        this.f2259 = 0;
        this.f2264 = false;
        ArrayList arrayList = this.f2258;
        if (arrayList != null && arrayList.remove((Object) null) && this.f2258.isEmpty()) {
            this.f2258 = null;
        }
        c24605.m54928();
        c24605.m54929(0);
        AbstractC16969 abstractC16969 = this.f30727;
        if (abstractC16969 != null) {
            abstractC16969.mo4767();
        }
        this.f2260 = c3523;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m2518(int i) {
        if (m2520().getType() == i) {
            if (i == -1) {
                this.f2264 = true;
            }
            C12472 c12472 = this.f2261;
            c12472.f40059 = false;
            c12472.f40060 = null;
            c12472.f40062 = -1;
            mo2527();
            return;
        }
        InterfaceC8743 interfaceC8743Mo29436 = this.f2261.mo29436(this);
        if (this.f2263 && interfaceC8743Mo29436.mo23438() == -1) {
            C7998 c7998 = this.f2262;
            C8196 c8196 = new C8196(interfaceC8743Mo29436);
            c7998.getClass();
            c8196.f31272 = c7998;
            c7998.m21806(c8196);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m2519() {
        this.f2263 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2514(InterfaceC10432 interfaceC10432) {
        if (this.f2258 == null) {
            this.f2258 = new ArrayList();
        }
        this.f2258.add(interfaceC10432);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m2517() {
        Iterator it = this.f2258.iterator();
        while (it.hasNext()) {
            ((InterfaceC10432) it.next()).mo26785(this.f2262);
            this.f2262.getClass();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m2526() {
        int size = this.f2258.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC10432 interfaceC10432 = (InterfaceC10432) this.f2258.get(size);
            this.f2262.getClass();
            interfaceC10432.mo26782(this.f2262);
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m2508() {
        return this.f2259;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2515(C12472 c12472) {
        this.f2261 = c12472;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8743 m2520() {
        return this.f2260.mo5263(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2513(InterfaceC8743 interfaceC8743, String str, C10234 c10234) {
        this.f2259++;
        m24873().mo2202(this, interfaceC8743, interfaceC8743.getLine(), interfaceC8743.mo23437(), str, c10234);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 mo2527() {
        InterfaceC8743 interfaceC8743M2520 = m2520();
        if (interfaceC8743M2520.getType() != -1) {
            this.f2260.mo11538();
        }
        ArrayList arrayList = this.f2258;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.f2263 || z) {
            if (this.f2261.f40059) {
                C7998 c7998 = this.f2262;
                C8196 c8196 = new C8196(interfaceC8743M2520);
                c7998.getClass();
                c8196.f31272 = c7998;
                c7998.m21806(c8196);
                ArrayList arrayList2 = this.f2258;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC10432) it.next()).mo26783(c8196);
                    }
                }
            } else {
                C7998 c7999 = this.f2262;
                C9686 c9686 = new C9686(interfaceC8743M2520);
                c7999.getClass();
                c9686.f31272 = c7999;
                c7999.m21806(c9686);
                ArrayList arrayList3 = this.f2258;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC10432) it2.next()).mo26784(c9686);
                    }
                }
            }
        }
        return interfaceC8743M2520;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2511(C7998 c7998, int i, int i2) {
        C7998 c7999;
        C7998 c79910;
        m24872(i);
        this.f2262 = c7998;
        c7998.f26549 = this.f2260.mo5263(1);
        if (this.f2263 && (c79910 = (c7999 = this.f2262).f9157) != null) {
            c79910.m21806(c7999);
        }
        if (this.f2258 != null) {
            m2517();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void mo2521() {
        if (this.f2264) {
            this.f2262.f26548 = this.f2260.mo5263(1);
        } else {
            this.f2262.f26548 = this.f2260.mo5263(-1);
        }
        if (this.f2258 != null) {
            m2526();
        }
        m24872(this.f2262.f9156);
        this.f2262 = this.f2262.f9157;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2510(C7998 c7998) {
        C7998 c7999;
        C7998 c79910;
        if (this.f2263 && (c7999 = this.f2262) != c7998 && (c79910 = c7999.f9157) != null) {
            ArrayList arrayList = c79910.f26547;
            if (arrayList != null) {
                C2764.m9138(arrayList, 1);
            }
            c79910.m21806(c7998);
        }
        this.f2262 = c7998;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m2523() {
        C24605 c24605 = this.f2257;
        if (c24605.m54933()) {
            return -1;
        }
        return c24605.m54932(c24605.m54930() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2512(C7998 c7998, int i, int i2, int i3) {
        m24872(i);
        this.f2257.m54929(i3);
        this.f2262 = c7998;
        c7998.f26549 = this.f2260.mo5263(1);
        if (this.f2258 != null) {
            m2517();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2509(int i, C7998 c7998) {
        C7998 c7999 = this.f2262;
        c7999.f9157 = c7998;
        c7999.f9156 = i;
        c7999.f26548 = this.f2260.mo5263(-1);
        this.f2262 = c7998;
        c7998.f26549 = c7999.f26549;
        if (this.f2263) {
            c7998.m21806(c7999);
        }
        if (this.f2258 != null) {
            m2517();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7998 m2522() {
        return this.f2262;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14907 m2525() {
        return mo6669().m27843(m24870(), this.f2262);
    }
}
