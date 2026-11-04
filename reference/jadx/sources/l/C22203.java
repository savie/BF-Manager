package l;

/* JADX INFO: renamed from: l.᩷ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes.dex */
public final class C22203 implements InterfaceC17693 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5049 f71529;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16947 f71530;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f71531;

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final int mo11529() {
        return -1;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۤ */
    public final void mo11533(int i) {
    }

    public C22203(C16947 c16947, C5049 c5049) {
        this.f71530 = c16947;
        this.f71529 = c5049;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11538() {
        int i = this.f71531 + 1;
        this.f71531 = i;
        if ((i & 1023) == 0) {
            this.f71529.m15284();
        }
        this.f71530.mo11538();
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final int mo11537(int i) {
        int i2 = this.f71531 + 1;
        this.f71531 = i2;
        if ((i2 & 1023) == 0) {
            this.f71529.m15284();
        }
        return this.f71530.mo11537(i);
    }

    @Override // l.InterfaceC4269
    public final int index() {
        return this.f71530.index();
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final void mo11530(int i) {
        this.f71530.mo11530(i);
    }

    @Override // l.InterfaceC4269
    public final int size() {
        return this.f71530.size();
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ۙ */
    public final String mo19728(C4467 c4467) {
        return this.f71530.mo19728(c4467);
    }
}
