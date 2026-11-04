package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.۬᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBEN */
/* JADX INFO: loaded from: classes5.dex */
public final class C14187 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14187 f44858 = new C14187();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 2;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        C0063 c0063M43795 = abstractC2476.m43795();
        return c0063M43795.m31619get(0).m47904() + ", " + c0063M43795.m31619get(1).m47904() + ", " + abstractC2476.mo37455();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return abstractC2476.mo37450();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        if (!(abstractC18884 instanceof C18138) || c0063M43795.size() != 2 || !AbstractC6951.m19249(c0063M43795.m31619get(0).m47903()) || !AbstractC6951.m19249(c0063M43795.m31619get(1).m47903())) {
            return false;
        }
        C18138 c18138 = (C18138) abstractC18884;
        if (!AbstractC6951.m19246(c18138.m42254())) {
            return false;
        }
        AbstractC13487 abstractC13487M42255 = c18138.m42255();
        return (abstractC13487M42255 instanceof C1028) || (abstractC13487M42255 instanceof C16689);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3135(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC6951.m19249(c0063M43795.m31619get(0).m47903()));
        bitSet.set(1, AbstractC6951.m19249(c0063M43795.m31619get(1).m47903()));
        return bitSet;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        C0063 c0063M43795 = abstractC2476.m43795();
        AbstractC6951.m19240((InterfaceC8550) c15000, AbstractC6951.m19239(abstractC2476, AbstractC6951.m19247(c0063M43795.m31619get(0).m47903(), c0063M43795.m31619get(1).m47903())), (short) ((C18138) abstractC2476).m42254());
    }
}
