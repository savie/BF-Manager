package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBGT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21958 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21958 f71250 = new C21958();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 3;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10389(C9175 c9175) {
        return true;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return abstractC10794.m38695().m15275get(0).m38392() + ", " + AbstractC14322.m34560(abstractC10794);
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return AbstractC14322.m34571(abstractC10794);
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        return (abstractC16438 instanceof C9175) && c0727M38695.size() == 1 && AbstractC14322.m34568(c0727M38695.m15275get(0).m38400());
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
        C0727 c0727M38695 = abstractC10794.m38695();
        AbstractC14322.m34566(c2718, AbstractC14322.m34565(abstractC10794, c0727M38695.m15275get(0).m38400()), ((C9175) abstractC10794).m23589());
    }
}
