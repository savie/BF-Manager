package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֨֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBFV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0790 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0790 f3377 = new C0790();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 3;
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
        return c0727M38695.m15275get(0).m38392() + ", " + c0727M38695.m15275get(1).m38392();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        return (abstractC16438 instanceof C19052) && c0727M38695.size() == 2 && AbstractC14322.m34572(c0727M38695.m15275get(0).m38400()) && AbstractC14322.m34572(c0727M38695.m15275get(1).m38400());
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC14322.m34572(c0727M38695.m15275get(0).m38400()));
        bitSet.set(1, AbstractC14322.m34572(c0727M38695.m15275get(1).m38400()));
        return bitSet;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        short sM34565 = AbstractC14322.m34565(abstractC10794, 0);
        short sM38400 = (short) c0727M38695.m15275get(0).m38400();
        short sM38401 = (short) c0727M38695.m15275get(1).m38400();
        c2718.m8297(sM34565);
        c2718.m8297(sM38400);
        c2718.m8297(sM38401);
    }
}
