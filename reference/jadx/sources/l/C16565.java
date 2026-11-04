package l;

/* JADX INFO: renamed from: l.ܺۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P5QW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16565 extends AbstractRunnableC5882 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53623;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17311 f53624;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16565(C17311 c17311, C17311 c17312, int i) {
        super(c17312);
        this.f53624 = c17311;
        this.f53623 = i;
    }

    @Override // l.AbstractRunnableC5882
    /* JADX INFO: renamed from: ۙ */
    public final void mo17109() {
        C17311 c17311 = this.f53624;
        c17311.f56376.m56802(this.f53623, c17311.f56386);
        this.f20165.f56375.sendEmptyMessageAtTime(-1, 0L);
    }
}
