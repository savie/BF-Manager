package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֡᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBFN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0706 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0706 f2978 = new C0706();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3096() {
        return 1;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return "";
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return abstractC10794.m38695().m15275get(0).m38392();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        return (abstractC16438 instanceof C19052) && c0727M38695.size() == 1 && AbstractC14322.m34568(c0727M38695.m15275get(0).m38400());
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC14322.m34568(c0727M38695.m15275get(0).m38400()));
        return bitSet;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        c2718.m8297(AbstractC14322.m34565(abstractC10794, abstractC10794.m38695().m15275get(0).m38400()));
    }
}
