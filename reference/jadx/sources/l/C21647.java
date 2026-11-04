package l;

/* JADX INFO: renamed from: l.᩶᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B9T */
/* JADX INFO: loaded from: classes.dex */
public final class C21647 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21647 f69102 = new C21647();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 1;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        return AbstractC6951.m19250(abstractC2476);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return AbstractC6951.m19245(abstractC2476);
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        if (!(abstractC18884 instanceof C24631) || abstractC18884.m43795().size() != 0) {
            return false;
        }
        C24631 c24631 = (C24631) abstractC18884;
        if (c24631.m54967()) {
            return mo16072(c24631);
        }
        return true;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16072(C24631 c24631) {
        int iM54970 = c24631.m54970();
        return iM54970 != 0 && ((byte) iM54970) == iM54970;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        c15000.m36123(AbstractC6951.m19239(abstractC2476, ((C24631) abstractC2476).m54970() & 255));
    }
}
