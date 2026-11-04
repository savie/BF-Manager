package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۚۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBGT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5394 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C5394 f18886 = new C5394();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 3;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo16072(C24631 c24631) {
        return true;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        return abstractC2476.m43795().m31619get(0).m47904() + ", " + AbstractC6951.m19250(abstractC2476);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return AbstractC6951.m19245(abstractC2476);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        return (abstractC18884 instanceof C24631) && c0063M43795.size() == 1 && AbstractC6951.m19242(c0063M43795.m31619get(0).m47903());
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3135(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC6951.m19242(c0063M43795.m31619get(0).m47903()));
        return bitSet;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        C0063 c0063M43795 = abstractC2476.m43795();
        AbstractC6951.m19241(c15000, AbstractC6951.m19239(abstractC2476, c0063M43795.m31619get(0).m47903()), ((C24631) abstractC2476).m54970());
    }
}
