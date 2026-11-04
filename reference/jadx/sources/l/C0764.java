package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֡᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BAJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0764 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0764 f2770 = new C0764();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3133() {
        return 1;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo3134(AbstractC2476 abstractC2476) {
        return abstractC2476.m43795().m31619get(0).m47904() + ", " + AbstractC6951.m19235((AbstractC24149) ((C18138) abstractC2476).m42255());
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return AbstractC6951.m19236((AbstractC24149) ((C18138) abstractC2476).m42255(), 4);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        int iMo17877;
        C0063 c0063M43795 = abstractC18884.m43795();
        if ((abstractC18884 instanceof C18138) && c0063M43795.size() == 1 && AbstractC6951.m19249(c0063M43795.m31619get(0).m47903())) {
            AbstractC13487 abstractC13487M42255 = ((C18138) abstractC18884).m42255();
            if (abstractC13487M42255 instanceof AbstractC24149) {
                AbstractC24149 abstractC24149 = (AbstractC24149) abstractC13487M42255;
                if (abstractC24149.mo17875() && (iMo17877 = abstractC24149.mo17877()) >= -8 && iMo17877 <= 7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet mo3135(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC6951.m19249(c0063M43795.m31619get(0).m47903()));
        return bitSet;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        c15000.m36123(AbstractC6951.m19239(abstractC2476, AbstractC6951.m19247(abstractC2476.m43795().m31619get(0).m47903(), ((AbstractC24149) ((C18138) abstractC2476).m42255()).mo17877() & 15)));
    }
}
