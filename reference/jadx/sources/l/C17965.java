package l;

/* JADX INFO: renamed from: l.ᩳۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C17965 implements InterfaceC1623 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21493 f57458;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14325 f57459;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f57460;

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final int mo11328() {
        return -1;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۨ */
    public final void mo11331(int i) {
    }

    public C17965(C14325 c14325, C21493 c21493) {
        this.f57459 = c14325;
        this.f57458 = c21493;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final void mo11333() {
        int i = this.f57460 + 1;
        this.f57460 = i;
        if ((i & 1023) == 0) {
            this.f57458.m48131();
        }
        this.f57459.mo11333();
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final int mo11332(int i) {
        int i2 = this.f57460 + 1;
        this.f57460 = i2;
        if ((i2 & 1023) == 0) {
            this.f57458.m48131();
        }
        return this.f57459.mo11332(i);
    }

    @Override // l.InterfaceC22583
    public final int index() {
        return this.f57459.index();
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final void mo11329(int i) {
        this.f57459.mo11329(i);
    }

    @Override // l.InterfaceC22583
    public final int size() {
        return this.f57459.size();
    }

    @Override // l.InterfaceC1623
    /* JADX INFO: renamed from: ۙ */
    public final String mo5499(C22043 c22043) {
        return this.f57459.mo5499(c22043);
    }
}
