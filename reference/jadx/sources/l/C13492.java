package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܰ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBF1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13492 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13492 f44591 = new C13492();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 2;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return "";
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        return c0727M38695.m15275get(0).m38392() + ", " + c0727M38695.m15275get(1).m38392() + ", " + c0727M38695.m15275get(2).m38392();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        return (abstractC16438 instanceof C19052) && c0727M38695.size() == 3 && AbstractC14322.m34568(c0727M38695.m15275get(0).m38400()) && AbstractC14322.m34568(c0727M38695.m15275get(1).m38400()) && AbstractC14322.m34568(c0727M38695.m15275get(2).m38400());
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        BitSet bitSet = new BitSet(3);
        bitSet.set(0, AbstractC14322.m34568(c0727M38695.m15275get(0).m38400()));
        bitSet.set(1, AbstractC14322.m34568(c0727M38695.m15275get(1).m38400()));
        bitSet.set(2, AbstractC14322.m34568(c0727M38695.m15275get(2).m38400()));
        return bitSet;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        AbstractC14322.m34567((InterfaceC23865) c2718, AbstractC14322.m34565(abstractC10794, c0727M38695.m15275get(0).m38400()), AbstractC14322.m34563(c0727M38695.m15275get(1).m38400(), c0727M38695.m15275get(2).m38400()));
    }
}
