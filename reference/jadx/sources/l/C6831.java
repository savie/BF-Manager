package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: YIVE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6831 extends AbstractC0118 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f22694;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11785 f22695;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC21976 f22696;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C21943 f22697;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C21943 f22698;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC18213 f22699;

    @Override // l.AbstractC20255, l.InterfaceC18213
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19029(InterfaceC6281 interfaceC6281, InterfaceC6281 interfaceC6282) {
        return false;
    }

    public C6831(C12050 c12050, C11785 c11785, C21943 c21943, boolean z) {
        super(c12050);
        this.f22695 = c11785;
        this.f22698 = c21943;
        this.f22694 = z;
        if (c21943 != null) {
            m1253(c21943);
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C11785 m19036() {
        return this.f22695;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m19032() {
        return this.f22698;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19033() {
        return this.f22698 == null;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18213 m19038() {
        return this.f22699;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19027(C12050 c12050) {
        this.f22699 = c12050;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19031() {
        return this.f22694;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19037(C21943 c21943) {
        this.f22697 = c21943;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19030() {
        ArrayList arrayList = (ArrayList) this.f22697.mo1986();
        if (!arrayList.isEmpty()) {
            C9812 c9812M1251 = m1251();
            if (c9812M1251 != null) {
                ArrayList arrayListM25587 = c9812M1251.m25587();
                if (!arrayListM25587.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        C18959 c18959 = (C18959) arrayList.get(i);
                        if (c18959.m44027() != null) {
                            C6041 c6041M44027 = c18959.m44027();
                            if (c6041M44027.m17530().m41952() <= 1) {
                                int i2 = i + 1;
                                boolean z = false;
                                for (int i3 = i2; i3 < size; i3++) {
                                    if (((C18959) arrayList.get(i)).m44016(c6041M44027)) {
                                        z = true;
                                    }
                                }
                                if (!z && C8314.m22406(arrayListM25587, c6041M44027)) {
                                    z = true;
                                }
                                if (z) {
                                    i = i2;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final void m19039() {
        C21943 c21943;
        if (this.f22697 == null || (c21943 = this.f22698) == null) {
            return;
        }
        List listMo1986 = c21943.mo1986();
        ArrayList arrayList = (ArrayList) this.f22697.mo1986();
        arrayList.addAll(listMo1986);
        ArrayList arrayList2 = (ArrayList) listMo1986;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        c21943.mo17866(EnumC1763.ALLOW_MULTIPLE_INSNS_LOOP_COND);
        arrayList.clear();
        this.f22697 = null;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int m19034() {
        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) this.f22698);
        int iM16977 = c18959M52200 == null ? 0 : c18959M52200.m16977();
        return iM16977 != 0 ? iM16977 : mo1256();
    }

    public final AbstractC21976 getType() {
        return this.f22696;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19028(AbstractC21976 abstractC21976) {
        this.f22696 = abstractC21976;
    }

    @Override // l.InterfaceC18213
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List mo19035() {
        ArrayList arrayList = new ArrayList(mo1257().size() + 2);
        C21943 c21943 = this.f22697;
        if (c21943 != null) {
            arrayList.add(c21943);
        }
        arrayList.addAll(mo1257());
        InterfaceC18213 interfaceC18213 = this.f22699;
        if (interfaceC18213 != null) {
            arrayList.add(interfaceC18213);
        }
        return arrayList;
    }

    @Override // l.AbstractC20255, l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ */
    public final void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        c13476.m33154(this, interfaceC3145);
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻ */
    public final String mo1988() {
        InterfaceC18213 interfaceC18213 = this.f22699;
        return interfaceC18213 == null ? "-" : interfaceC18213.mo1988();
    }

    public final String toString() {
        return "LOOP:" + this.f22695.m29623() + ": " + mo1988();
    }
}
