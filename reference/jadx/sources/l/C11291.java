package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۧ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBDJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11291 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C11291 f38128 = new C11291();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 2;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return abstractC10794.m38695().m15275get(0).m38392() + ", " + AbstractC14322.m34561((AbstractC10377) ((C15733) abstractC10794).m37458());
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return AbstractC14322.m34562((AbstractC10377) ((C15733) abstractC10794).m37458(), 16);
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        if ((abstractC16438 instanceof C15733) && c0727M38695.size() == 1 && AbstractC14322.m34568(c0727M38695.m15275get(0).m38400())) {
            AbstractC9901 abstractC9901M37458 = ((C15733) abstractC16438).m37458();
            if (abstractC9901M37458 instanceof AbstractC10377) {
                AbstractC10377 abstractC10377 = (AbstractC10377) abstractC9901M37458;
                if (abstractC10377.mo21657()) {
                    int iMo21658 = abstractC10377.mo21658();
                    if (((short) iMo21658) == iMo21658) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC14322.m34568(c0727M38695.m15275get(0).m38400()));
        return bitSet;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        AbstractC14322.m34567((InterfaceC23865) c2718, AbstractC14322.m34565(abstractC10794, abstractC10794.m38695().m15275get(0).m38400()), (short) ((AbstractC10377) ((C15733) abstractC10794).m37458()).mo21658());
    }
}
