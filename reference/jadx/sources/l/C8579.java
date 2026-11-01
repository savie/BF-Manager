package l;

/* JADX INFO: renamed from: l.ۡ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8579 extends AbstractC17750 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9990 f29654;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f29655;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f29656;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f29657;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16277 f29658;

    public C8579(AbstractC9990 abstractC9990, C16277 c16277) {
        this.f29654 = abstractC9990;
        this.f29658 = c16277;
    }

    @Override // l.AbstractC17750
    /* JADX INFO: renamed from: ۨ */
    public final long mo20775() {
        return this.f29657;
    }

    @Override // l.AbstractC17750
    /* JADX INFO: renamed from: ܰ */
    public final void mo20778(long j) {
        this.f29657 = j;
    }

    @Override // l.AbstractC17750
    /* JADX INFO: renamed from: ۙ */
    public final long mo20773() {
        return this.f29655;
    }

    @Override // l.AbstractC17750
    /* JADX INFO: renamed from: ۙ */
    public final void mo20774(long j) {
        this.f29655 = j;
    }

    @Override // l.AbstractC17750
    /* JADX INFO: renamed from: ۖ */
    public final long mo20772() {
        return this.f29656;
    }

    @Override // l.AbstractC17750
    /* JADX INFO: renamed from: ۨ */
    public final void mo20776(long j) {
        this.f29656 = j;
    }

    @Override // l.AbstractC17750
    /* JADX INFO: renamed from: ܰ */
    public final Object mo20777() {
        String string = this.f29658.toString();
        AbstractC9990 abstractC9990 = this.f29654;
        Object objMo3902 = abstractC9990.mo3902(string);
        abstractC9990.mo3905(this.f29657, objMo3902);
        abstractC9990.mo3900(this.f29655, objMo3902);
        abstractC9990.mo3903(this.f29656, objMo3902);
        return objMo3902;
    }
}
