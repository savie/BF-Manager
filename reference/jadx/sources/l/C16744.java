package l;

/* JADX INFO: renamed from: l.ܽܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16744 extends C10394 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12511 f53620;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f53621;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0309 f53622;

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        EnumC6865 enumC6865 = (EnumC6865) obj;
        C12511 c12511 = this.f53620;
        C23800 c23800 = c12511.f41873;
        C3836 c3836 = c23800.f76937;
        AbstractC16579 abstractC16579 = c23800.f76937.f14228;
        EnumC15395 enumC15395 = c0350.f1776;
        int i = C14068.f46212[enumC15395.ordinal()];
        if (i == 1) {
            AbstractC16579 abstractC165710 = c0350.f1774;
            abstractC165710.getClass();
            abstractC16579 = (AbstractC16579) abstractC165710.mo1928(c12511, enumC6865);
            if (abstractC16579.m39001(EnumC6617.BOT)) {
                return c3836.f14228;
            }
        } else if (i == 2) {
            AbstractC16579 abstractC165711 = c0350.f1774;
            EnumC6865 enumC6865Mo11547 = enumC6865.mo11547();
            abstractC165711.getClass();
            abstractC16579 = (AbstractC16579) abstractC165711.mo1928(c12511, enumC6865Mo11547);
            if (abstractC16579.m39001(EnumC6617.BOT)) {
                abstractC16579 = c3836.f14275;
                enumC15395 = EnumC15395.UNBOUND;
            }
        }
        return new C0515(abstractC16579, enumC15395, c12511.f41873.f76937.f14239);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @Override // l.C4748, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC16579 mo1767(AbstractC16579 abstractC16579, EnumC6865 enumC6865) {
        EnumC15395 enumC15395;
        C12511 c12511 = this.f53620;
        C23800 c23800 = c12511.f41873;
        Object obj = EnumC6865.f23148;
        if (enumC6865 == obj) {
            return c23800.f76937.f14228;
        }
        Object obj2 = EnumC6865.f23146;
        abstractC16579.getClass();
        AbstractC16579 abstractC165710 = (AbstractC16579) abstractC16579.mo1928(c12511, obj2);
        AbstractC16579 abstractC165711 = (AbstractC16579) abstractC16579.mo1928(c12511, obj);
        C21825 c21825Mo1938 = this.f53622.f53222.f77449.mo1938();
        if (!c23800.m52399(abstractC165710, c23800.f76937.f14275)) {
            AbstractC16579 abstractC165712 = this.f53621;
            if (abstractC165712.m39005(c21825Mo1938) || !c23800.m52413(abstractC165712, abstractC165710, true)) {
                enumC15395 = EnumC15395.EXTENDS;
            } else if (!abstractC165711.m39001(EnumC6617.BOT)) {
                abstractC165710 = abstractC165711;
                enumC15395 = EnumC15395.SUPER;
            } else {
                abstractC165710 = c23800.f76937.f14275;
                enumC15395 = EnumC15395.UNBOUND;
            }
        } else if (!abstractC165711.m39001(EnumC6617.BOT)) {
            abstractC165710 = abstractC165711;
            enumC15395 = EnumC15395.SUPER;
        } else {
            abstractC165710 = c23800.f76937.f14275;
            enumC15395 = EnumC15395.UNBOUND;
        }
        return new C0515(abstractC165710, enumC15395, c12511.f41873.f76937.f14239);
    }

    public C16744(C12511 c12511, C0309 c0309, AbstractC16579 abstractC16579) {
        this.f53620 = c12511;
        this.f53622 = c0309;
        this.f53621 = abstractC16579;
    }
}
