package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1EB */
/* JADX INFO: loaded from: classes4.dex */
public class C11994 implements InterfaceC1409 {
    @Override // l.InterfaceC1409
    /* JADX INFO: renamed from: ۙ */
    public void mo4924(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) {
        if (!interfaceC3609.mo7644()) {
            throw new RuntimeException();
        }
        interfaceC9380.mo24062("complex");
        interfaceC9380.mo24061("name", interfaceC3609.mo7645());
        if (interfaceC3609.getParent() != 0) {
            interfaceC9380.mo24061("parent", C6730.m18159(interfaceC3609.getParent()));
        }
        C7054.m18906(interfaceC9380, interfaceC3609, c2820);
        Iterator it = interfaceC3609.values().iterator();
        while (it.hasNext()) {
            m29876(interfaceC9380, (InterfaceC9961) it.next(), c22577);
        }
        interfaceC9380.mo24060("complex");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29876(InterfaceC9380 interfaceC9380, InterfaceC9961 interfaceC9961, C22577 c22577) {
        String strM18902 = C7054.m18902(interfaceC9961);
        interfaceC9380.mo24062(strM18902);
        if (interfaceC9961.mo25193() != -1) {
            interfaceC9380.mo24061("id", C6730.m18159(interfaceC9961.mo25193()));
        }
        C7054.m18903(interfaceC9380, C7054.m18900(c22577, interfaceC9961));
        interfaceC9380.mo24060(strM18902);
    }
}
