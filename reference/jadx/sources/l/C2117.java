package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֫᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBEN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2117 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C2117 f7770 = new C2117();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 2;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        return c0727M38695.m15275get(0).m38392() + ", " + c0727M38695.m15275get(1).m38392() + ", " + abstractC10794.mo8567();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return abstractC10794.mo8573();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        if (!(abstractC16438 instanceof C15733) || c0727M38695.size() != 2 || !AbstractC14322.m34575(c0727M38695.m15275get(0).m38400()) || !AbstractC14322.m34575(c0727M38695.m15275get(1).m38400())) {
            return false;
        }
        C15733 c15733 = (C15733) abstractC16438;
        if (!AbstractC14322.m34572(c15733.m37457())) {
            return false;
        }
        AbstractC9901 abstractC9901M37458 = c15733.m37458();
        return (abstractC9901M37458 instanceof C6143) || (abstractC9901M37458 instanceof C23077);
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC14322.m34575(c0727M38695.m15275get(0).m38400()));
        bitSet.set(1, AbstractC14322.m34575(c0727M38695.m15275get(1).m38400()));
        return bitSet;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        AbstractC14322.m34567((InterfaceC23865) c2718, AbstractC14322.m34565(abstractC10794, AbstractC14322.m34573(c0727M38695.m15275get(0).m38400(), c0727M38695.m15275get(1).m38400())), (short) ((C15733) abstractC10794).m37457());
    }
}
