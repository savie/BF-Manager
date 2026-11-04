package l;

/* JADX INFO: renamed from: l.ۨܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12476 extends AbstractC16205 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f40067;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f40068;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f40069;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14560 f40070;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6511 f40071;

    public C12476(AbstractC6511 abstractC6511, C14560 c14560) {
        this.f40071 = abstractC6511;
        this.f40070 = c14560;
    }

    @Override // l.AbstractC16205
    /* JADX INFO: renamed from: ۤ */
    public final long mo11545() {
        return this.f40068;
    }

    @Override // l.AbstractC16205
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11548(long j) {
        this.f40068 = j;
    }

    @Override // l.AbstractC16205
    /* JADX INFO: renamed from: ۙ */
    public final long mo11543() {
        return this.f40067;
    }

    @Override // l.AbstractC16205
    /* JADX INFO: renamed from: ۙ */
    public final void mo11544(long j) {
        this.f40067 = j;
    }

    @Override // l.AbstractC16205
    /* JADX INFO: renamed from: ᩸ */
    public final long mo11549() {
        return this.f40069;
    }

    @Override // l.AbstractC16205
    /* JADX INFO: renamed from: ۤ */
    public final void mo11546(long j) {
        this.f40069 = j;
    }

    @Override // l.AbstractC16205
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo11547() {
        String string = this.f40070.toString();
        AbstractC6511 abstractC6511 = this.f40071;
        Object objMo18368 = abstractC6511.mo18368(string);
        abstractC6511.mo18372(this.f40068, objMo18368);
        abstractC6511.mo18366(this.f40067, objMo18368);
        abstractC6511.mo18369(this.f40069, objMo18368);
        return objMo18368;
    }
}
