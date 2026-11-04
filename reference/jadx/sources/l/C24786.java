package l;

/* JADX INFO: renamed from: l.᩻ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEF */
/* JADX INFO: loaded from: classes.dex */
public final class C24786 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C24786 f80231 = new C24786();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 3;
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
        if (!(abstractC18884 instanceof C18138)) {
            return false;
        }
        C18138 c18138 = (C18138) abstractC18884;
        int iM42254 = c18138.m42254();
        AbstractC13487 abstractC13487M42255 = c18138.m42255();
        if (!AbstractC6951.m19246(iM42254)) {
            return false;
        }
        if (!(abstractC13487M42255 instanceof C18181) && !(abstractC13487M42255 instanceof C1028) && !(abstractC13487M42255 instanceof C5503)) {
            return false;
        }
        C0063 c0063M43795 = c18138.m43795();
        c0063M43795.size();
        if (c0063M43795.size() != 0) {
            return AbstractC6951.m19243(c0063M43795) && AbstractC6951.m19246(c0063M43795.m31619get(0).m47903()) && AbstractC6951.m19242(c0063M43795.m1039());
        }
        return true;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        C0063 c0063M43795 = abstractC2476.m43795();
        int iM42254 = ((C18138) abstractC2476).m42254();
        int iM47903 = c0063M43795.size() != 0 ? c0063M43795.m31619get(0).m47903() : 0;
        c15000.m36123(AbstractC6951.m19239(abstractC2476, c0063M43795.m1039()));
        c15000.m36123((short) iM42254);
        c15000.m36123((short) iM47903);
    }
}
