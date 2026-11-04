package l;

/* JADX INFO: renamed from: l.ᩴᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20007 extends AbstractC24220 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15531 f64290;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20007(C15531 c15531, int i) {
        super(i);
        this.f64290 = c15531;
    }

    @Override // l.AbstractC6320
    /* JADX INFO: renamed from: ᩷ */
    public final long mo18041(int i) {
        C15531 c15531 = this.f64290;
        return c15531.f50534.getLong(c15531.f50532 + i);
    }

    @Override // l.AbstractC24220
    /* JADX INFO: renamed from: ۙ */
    public final void mo20101(int i, long j) {
        this.f64290.mo37193(i, j);
    }

    @Override // l.AbstractC24220
    /* JADX INFO: renamed from: ᩷ */
    public final void mo20102(int i, long j) {
        this.f64290.set(i, j);
    }

    @Override // l.AbstractC6320
    /* JADX INFO: renamed from: ۤ */
    public final void mo18040(int i) {
        this.f64290.mo37196(i);
    }

    @Override // l.AbstractC6320
    /* JADX INFO: renamed from: ۙ */
    public final int mo18039() {
        C15531 c15531 = this.f64290;
        return c15531.f50533 - c15531.f50532;
    }
}
