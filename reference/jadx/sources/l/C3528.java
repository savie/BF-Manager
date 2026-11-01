package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۗ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBFP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3528 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C3528 f13007 = new C3528();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 2;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        return c0727M38695.m15275get(0).m38392() + ", " + c0727M38695.m15275get(1).m38392() + ", " + AbstractC14322.m34560(abstractC10794);
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
        if (!(abstractC16438 instanceof C9175) || c0727M38695.size() != 2 || !AbstractC14322.m34575(c0727M38695.m15275get(0).m38400()) || !AbstractC14322.m34575(c0727M38695.m15275get(1).m38400())) {
            return false;
        }
        C9175 c9175 = (C9175) abstractC16438;
        if (c9175.m23587()) {
            return mo10389(c9175);
        }
        return true;
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10389(C9175 c9175) {
        int iM23589 = c9175.m23589();
        return iM23589 != 0 && ((short) iM23589) == iM23589;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        AbstractC14322.m34567((InterfaceC23865) c2718, AbstractC14322.m34565(abstractC10794, AbstractC14322.m34573(c0727M38695.m15275get(0).m38400(), c0727M38695.m15275get(1).m38400())), (short) ((C9175) abstractC10794).m23589());
    }
}
