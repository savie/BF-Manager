package l;

/* JADX INFO: renamed from: l.۫᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBBQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12702 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12702 f42378 = new C12702();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 2;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return AbstractC14322.m34560(abstractC10794);
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return AbstractC14322.m34571(abstractC10794);
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        if (!(abstractC16438 instanceof C9175) || abstractC16438.m38695().size() != 0) {
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
    public final boolean mo10389(C9175 c9175) {
        int iM23589 = c9175.m23589();
        return iM23589 != 0 && ((short) iM23589) == iM23589;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        AbstractC14322.m34567((InterfaceC23865) c2718, AbstractC14322.m34565(abstractC10794, 0), (short) ((C9175) abstractC10794).m23589());
    }
}
