package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W403 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5075 f20975;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f20976;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13477 f20974 = new C13477();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5075 f20973 = new C20317();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6147 m17745(C4747 c4747) {
        C13477 c13477 = f20974;
        C6147 c6147 = (C6147) c4747.m14643(c13477);
        if (c6147 != null) {
            return c6147;
        }
        C6147 c6148 = new C6147();
        c6148.f20976 = new HashMap();
        c4747.m14646(c13477, c6148);
        c6148.f20975 = f20973;
        return c6148;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17749(InterfaceC12112 interfaceC12112) {
        HashMap map = this.f20976;
        InterfaceC5075 interfaceC5075 = this.f20975;
        if (interfaceC5075 == f20973) {
            interfaceC12112.mo6201();
            return;
        }
        C18499 c18499 = (C18499) map.get(interfaceC5075);
        if (c18499 == null) {
            InterfaceC5075 interfaceC5076 = this.f20975;
            C18499 c184910 = new C18499();
            map.put(interfaceC5076, c184910);
            c18499 = c184910;
        }
        c18499.m43089(interfaceC12112);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17748(AbstractC8036 abstractC8036) {
        HashMap map = this.f20976;
        C18499 c18499 = (C18499) map.get(abstractC8036);
        if (c18499 != null) {
            Iterator it = c18499.iterator();
            while (it.hasNext()) {
                ((InterfaceC12112) it.next()).mo6201();
            }
            map.remove(abstractC8036);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5075 m17746() {
        InterfaceC5075 interfaceC5075 = this.f20975;
        this.f20975 = f20973;
        return interfaceC5075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5075 m17747(InterfaceC5075 interfaceC5075) {
        InterfaceC5075 interfaceC5076 = this.f20975;
        this.f20975 = interfaceC5075;
        return interfaceC5076;
    }
}
