package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11818 extends AbstractC21976 implements InterfaceC5656, InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f38146 = new HashMap();

    @Override // l.AbstractC21976
    /* JADX INFO: renamed from: ᩷ */
    public final void mo27982(C21383 c21383) {
        c21383.m13511(true, true, true, false, new C22810(new C1927(0, 10, this)));
        this.f38146.clear();
    }

    @Override // l.AbstractC21976
    /* JADX INFO: renamed from: ۙ */
    public final void mo17037(AbstractC0500 abstractC0500) {
        String strM35295 = abstractC0500.m35295();
        AbstractC5107 abstractC5107M35293 = abstractC0500.m35293();
        if (C13923.m33909(strM35295)) {
            return;
        }
        C3615 c3615 = new C3615(strM35295, abstractC5107M35293, true);
        HashMap map = this.f38146;
        AbstractC14669 abstractC14669 = (AbstractC14669) map.get(c3615);
        if (abstractC14669 == null) {
            map.put(c3615, m29666((AbstractC14669) abstractC0500));
            return;
        }
        Object objM29666 = m29666((AbstractC14669) abstractC0500);
        AbstractC14669 abstractC14669M29666 = m29666(abstractC14669);
        if (objM29666.equals(abstractC14669M29666)) {
            return;
        }
        abstractC14669M29666.mo13503(objM29666);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14669 m29666(AbstractC14669 abstractC14669) {
        while (abstractC14669.mo13501() != null && (abstractC14669.mo13501() instanceof AbstractC14669)) {
            abstractC14669 = (AbstractC14669) abstractC14669.mo13501();
        }
        return abstractC14669;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC16842 m29667(AbstractC0500 abstractC0500) {
        InterfaceC16842 interfaceC16842 = abstractC0500;
        while (interfaceC16842.mo13501() != null && (interfaceC16842.mo13501() instanceof InterfaceC16842)) {
            interfaceC16842 = (InterfaceC16842) interfaceC16842.mo13501();
        }
        return interfaceC16842;
    }
}
