package l;

/* JADX INFO: renamed from: l.ۘ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3612 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C3612 f13272 = new C3612();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 3;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return AbstractC14322.m34570(abstractC10794.m38695()) + ", " + abstractC10794.mo8567();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return abstractC10794.mo8573();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        if (!(abstractC16438 instanceof C15733)) {
            return false;
        }
        C15733 c15733 = (C15733) abstractC16438;
        int iM37457 = c15733.m37457();
        AbstractC9901 abstractC9901M37458 = c15733.m37458();
        if (!AbstractC14322.m34572(iM37457)) {
            return false;
        }
        if (!(abstractC9901M37458 instanceof C20255) && !(abstractC9901M37458 instanceof C6143) && !(abstractC9901M37458 instanceof C1203)) {
            return false;
        }
        C0727 c0727M38695 = c15733.m38695();
        c0727M38695.size();
        if (c0727M38695.size() != 0) {
            return AbstractC14322.m34569(c0727M38695) && AbstractC14322.m34572(c0727M38695.m15275get(0).m38400()) && AbstractC14322.m34568(c0727M38695.m3159());
        }
        return true;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        int iM37457 = ((C15733) abstractC10794).m37457();
        int iM38400 = c0727M38695.size() != 0 ? c0727M38695.m15275get(0).m38400() : 0;
        c2718.m8297(AbstractC14322.m34565(abstractC10794, c0727M38695.m3159()));
        c2718.m8297((short) iM37457);
        c2718.m8297((short) iM38400);
    }
}
