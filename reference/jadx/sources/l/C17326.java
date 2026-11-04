package l;

/* JADX INFO: renamed from: l.ܽۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17326 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17326 f56422 = new C17326();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 4;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        return AbstractC6951.m19244(abstractC2476.m43795()) + ", " + abstractC2476.mo37455();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return abstractC2476.mo37450();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        if (!(abstractC18884 instanceof C15679)) {
            return false;
        }
        C15679 c15679 = (C15679) abstractC18884;
        int iM37454 = c15679.m37454(0);
        int iM37455 = c15679.m37454(1);
        if (!AbstractC6951.m19246(iM37454) || !AbstractC6951.m19246(iM37455) || !(c15679.m37451(0) instanceof C18181) || !(c15679.m37451(1) instanceof C7740)) {
            return false;
        }
        C0063 c0063M43795 = c15679.m43795();
        int size = c0063M43795.size();
        if (size == 0) {
            return true;
        }
        return AbstractC6951.m19242(c0063M43795.m1039()) && AbstractC6951.m19246(size) && AbstractC6951.m19246(c0063M43795.m31619get(0).m47903()) && AbstractC6951.m19243(c0063M43795);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        C15679 c15679 = (C15679) abstractC2476;
        short sM37454 = (short) c15679.m37454(0);
        short sM37455 = (short) c15679.m37454(1);
        C0063 c0063M43795 = abstractC2476.m43795();
        short sM47903 = c0063M43795.size() > 0 ? (short) c0063M43795.m31619get(0).m47903() : (short) 0;
        c15000.m36123(AbstractC6951.m19239(abstractC2476, c0063M43795.m1039()));
        c15000.m36123(sM37454);
        c15000.m36123(sM47903);
        c15000.m36123(sM37455);
    }
}
