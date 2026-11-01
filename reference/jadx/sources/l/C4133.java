package l;

/* JADX INFO: renamed from: l.ۘᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C4133 implements InterfaceC1995 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19741 f15137;

    public C4133(C2806 c2806, int i) {
        this.f15137 = (C19741) ((C21151) c2806.m8527().get(i)).getFields().get(0);
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo6415(AbstractC18245 abstractC18245) {
        return abstractC18245.hasField(this.f15137);
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo6413(AbstractC0584 abstractC0584) {
        return abstractC0584.hasField(this.f15137);
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ۙ */
    public final C19741 mo6411(AbstractC18245 abstractC18245) {
        C19741 c19741 = this.f15137;
        if (abstractC18245.hasField(c19741)) {
            return c19741;
        }
        return null;
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ܰ */
    public final C19741 mo6414(AbstractC0584 abstractC0584) {
        C19741 c19741 = this.f15137;
        if (abstractC0584.hasField(c19741)) {
            return c19741;
        }
        return null;
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ۙ */
    public final void mo6412(AbstractC0584 abstractC0584) {
        abstractC0584.clearField(this.f15137);
    }
}
