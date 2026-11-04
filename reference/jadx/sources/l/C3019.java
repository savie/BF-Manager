package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6AA */
/* JADX INFO: loaded from: classes3.dex */
public final class C3019 extends AbstractC19427 implements InterfaceC15455, InterfaceC8985 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9796;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C17370 f9797;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19931 f9798;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6003 f9799;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f9800;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f9801;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f9802;

    public C3019(C9730 c9730) {
        C17370 c17370 = new C17370();
        this.f9796 = false;
        this.f9802 = 0;
        this.f9801 = c9730;
        this.f9797 = c17370;
        C19931 c19931 = new C19931();
        c19931.f64117 = true;
        c19931.f64118 = c9730;
        c19931.f64114 = c9730;
        c19931.f64113 = new C8240();
        c19931.f64116 = c17370.m40807(2, "DOWN");
        c19931.f64115 = c17370.m40807(3, "UP");
        c19931.f64119 = c17370.m40807(-1, "EOF");
        this.f9798 = c19931;
    }

    @Override // l.AbstractC19427
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object mo9830() {
        C19931 c19931 = this.f9798;
        Object next = c19931.next();
        if (next == c19931.f64115) {
            int i = this.f9802 - 1;
            this.f9802 = i;
            if (i == 0 && this.f9796) {
                return c19931.next();
            }
        } else if (next == c19931.f64116) {
            this.f9802++;
        }
        if (this.f9802 == 0) {
            this.f9797.getClass();
            if (((InterfaceC22915) next).mo5415()) {
                this.f9796 = true;
                c19931.next();
                this.f9802++;
                return c19931.next();
            }
        }
        return next;
    }

    @Override // l.AbstractC19427, l.C8240
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object mo9832() {
        Object objMo9832 = super.mo9832();
        if (this.f27101 == 0 && m9834(this.f62770)) {
            this.f9800 = this.f62770;
        }
        return objMo9832;
    }

    @Override // l.AbstractC19427
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9829(Object obj) {
        this.f9797.getClass();
        return (obj == null ? 0 : ((InterfaceC22915) obj).getType()) == -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18681 m9826() {
        return this.f9799;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9828(C6003 c6003) {
        this.f9799 = c6003;
    }

    @Override // l.InterfaceC15455
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17370 mo9831() {
        return this.f9797;
    }

    @Override // l.InterfaceC17189
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo9833(int i) {
        Object objM44918 = m44918(i);
        this.f9797.getClass();
        if (objM44918 == null) {
            return 0;
        }
        return ((InterfaceC22915) objM44918).getType();
    }

    @Override // l.InterfaceC8985
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo9827(boolean z) {
        Object obj;
        int i = this.f27101;
        ArrayList arrayList = this.f27099;
        Object obj2 = arrayList.get(i);
        if (m9834(obj2)) {
            return obj2;
        }
        if (!z) {
            return null;
        }
        int i2 = this.f27101;
        do {
            i2--;
            if (i2 >= 0) {
                obj = arrayList.get(i2);
            } else {
                return this.f9800;
            }
        } while (!m9834(obj));
        return obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9834(Object obj) {
        this.f9797.getClass();
        InterfaceC21665 interfaceC21665 = obj instanceof C9730 ? ((C9730) obj).f31384 : null;
        return interfaceC21665 != null && interfaceC21665.getLine() > 0;
    }
}
