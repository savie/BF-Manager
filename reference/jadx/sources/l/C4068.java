package l;

/* JADX INFO: renamed from: l.ۘܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C4068 implements InterfaceC16294 {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l.InterfaceC16294
    /* JADX INFO: renamed from: ۙ */
    public final void mo2175(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
        boolean zM43148;
        C15840 c15840 = (C15840) abstractC19367;
        AbstractC14738 abstractC14738Mo35319 = c15840.mo35319();
        if (abstractC14738Mo35319 != null) {
            AbstractC19367 abstractC19367Mo35319 = abstractC14738Mo35319.mo35319();
            if (abstractC19367Mo35319 instanceof AbstractC18661) {
                zM43148 = ((AbstractC18661) abstractC19367Mo35319).m43148();
            } else {
                zM43148 = false;
            }
        } else {
            zM43148 = false;
        }
        if (!zM43148) {
            interfaceC12061.mo29964(c15840);
        }
        int length = interfaceC12061.length();
        interfaceC12061.mo29972(c15840);
        AbstractC16769.f53675.m34276(interfaceC12061.mo29965(), Boolean.valueOf(zM43148));
        interfaceC12061.mo29967(c15840, length);
        if (zM43148) {
            return;
        }
        interfaceC12061.mo29969(c15840);
    }
}
