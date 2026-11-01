package l;

/* JADX INFO: renamed from: l.۟ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C7597 implements InterfaceC16294 {
    @Override // l.InterfaceC16294
    /* JADX INFO: renamed from: ۙ */
    public final void mo2175(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
        C8078 c8078 = (C8078) abstractC19367;
        int length = interfaceC12061.length();
        interfaceC12061.mo29972(c8078);
        AbstractC14738 abstractC14738Mo35319 = c8078.mo35319();
        if (abstractC14738Mo35319 instanceof C20778) {
            final C20778 c20778 = (C20778) abstractC14738Mo35319;
            AbstractC16769.f53673.m34276(interfaceC12061.mo29965(), EnumC20297.ORDERED);
            AbstractC16769.f53677.m34276(interfaceC12061.mo29965(), Integer.valueOf(c20778.m46769()));
            AbstractC16769.f53670.m34276(interfaceC12061.mo29965(), new InterfaceC0540() { // from class: l.ۤܽᩳ
                @Override // l.InterfaceC0540
                /* JADX INFO: renamed from: ۙ */
                public final int mo2549() {
                    return c20778.m46769() - 1;
                }
            });
            c20778.m46765(c20778.m46769() + 1);
        } else {
            AbstractC16769.f53673.m34276(interfaceC12061.mo29965(), EnumC20297.BULLET);
            C14178 c14178 = AbstractC16769.f53672;
            InterfaceC9239 interfaceC9239Mo29965 = interfaceC12061.mo29965();
            int i = 0;
            for (AbstractC19367 abstractC19367Mo35319 = c8078.mo35319(); abstractC19367Mo35319 != null; abstractC19367Mo35319 = abstractC19367Mo35319.mo35319()) {
                if (abstractC19367Mo35319 instanceof C8078) {
                    i++;
                }
            }
            c14178.m34276(interfaceC9239Mo29965, Integer.valueOf(i));
        }
        interfaceC12061.mo29967(c8078, length);
        if (interfaceC12061.mo29971(c8078)) {
            interfaceC12061.mo29968();
        }
    }
}
