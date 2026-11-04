package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܶۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBAC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15834 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15834 f51503 = new C15834();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 5;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        return abstractC2476.m43795().m31619get(0).m47904() + ", " + AbstractC6951.m19235((AbstractC24149) ((C18138) abstractC2476).m42255());
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return AbstractC6951.m19236((AbstractC24149) ((C18138) abstractC2476).m42255(), 64);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        if ((abstractC18884 instanceof C18138) && c0063M43795.size() == 1 && AbstractC6951.m19242(c0063M43795.m31619get(0).m47903())) {
            return ((C18138) abstractC18884).m42255() instanceof AbstractC6249;
        }
        return false;
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
        long jMo17876 = ((AbstractC6249) ((C18138) abstractC2476).m42255()).mo17876();
        c15000.m36123(AbstractC6951.m19239(abstractC2476, c0063M43795.m31619get(0).m47903()));
        c15000.m36123((short) jMo17876);
        c15000.m36123((short) (jMo17876 >> 16));
        c15000.m36123((short) (jMo17876 >> 32));
        c15000.m36123((short) (jMo17876 >> 48));
    }
}
