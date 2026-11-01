package l;

/* JADX INFO: renamed from: l.᩺֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBX */
/* JADX INFO: loaded from: classes.dex */
public final class C22664 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C22664 f73816 = new C22664();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 4;
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
        if (!(abstractC16438 instanceof C2823)) {
            return false;
        }
        C2823 c2823 = (C2823) abstractC16438;
        int iM8566 = c2823.m8566(0);
        int iM8567 = c2823.m8566(1);
        if (!AbstractC14322.m34572(iM8566) || !AbstractC14322.m34572(iM8567) || !(c2823.m8574(0) instanceof C20255) || !(c2823.m8574(1) instanceof C16727)) {
            return false;
        }
        C0727 c0727M38695 = c2823.m38695();
        int size = c0727M38695.size();
        if (size == 0) {
            return true;
        }
        return AbstractC14322.m34568(c0727M38695.m3159()) && AbstractC14322.m34572(size) && AbstractC14322.m34572(c0727M38695.m15275get(0).m38400()) && AbstractC14322.m34569(c0727M38695);
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        C2823 c2823 = (C2823) abstractC10794;
        short sM8566 = (short) c2823.m8566(0);
        short sM8567 = (short) c2823.m8566(1);
        C0727 c0727M38695 = abstractC10794.m38695();
        short sM38400 = c0727M38695.size() > 0 ? (short) c0727M38695.m15275get(0).m38400() : (short) 0;
        c2718.m8297(AbstractC14322.m34565(abstractC10794, c0727M38695.m3159()));
        c2718.m8297(sM8566);
        c2718.m8297(sM38400);
        c2718.m8297(sM8567);
    }
}
