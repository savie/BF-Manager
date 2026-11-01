package l;

/* JADX INFO: renamed from: l.ܿۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17145 extends AbstractC7080 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5856 f54686;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17145(C5856 c5856, int i) {
        super(i);
        this.f54686 = c5856;
    }

    @Override // l.AbstractC4257
    /* JADX INFO: renamed from: ܰ */
    public final int mo11027(int i) {
        C5856 c5856 = this.f54686;
        return c5856.f20001.getInt(c5856.f20000 + i);
    }

    @Override // l.AbstractC7080
    /* JADX INFO: renamed from: ۙ */
    public final void mo11025(int i, int i2) {
        this.f54686.add(i, i2);
    }

    @Override // l.AbstractC7080
    /* JADX INFO: renamed from: ܰ */
    public final void mo11028(int i, int i2) {
        this.f54686.set(i, i2);
    }

    @Override // l.AbstractC4257
    /* JADX INFO: renamed from: ۨ */
    public final void mo11026(int i) {
        this.f54686.mo3180(i);
    }

    @Override // l.AbstractC4257
    /* JADX INFO: renamed from: ۙ */
    public final int mo11024() {
        C5856 c5856 = this.f54686;
        return c5856.f19999 - c5856.f20000;
    }
}
