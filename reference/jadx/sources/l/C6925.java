package l;

/* JADX INFO: renamed from: l.ۜۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6925 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f22926;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f22927;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f22928;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f22929;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6925(C22478 c22478, int i, int i2) {
        super("OkHttp %s ping %08x%08x", c22478.f72725, Integer.valueOf(i), Integer.valueOf(i2));
        this.f22927 = c22478;
        this.f22926 = true;
        this.f22929 = i;
        this.f22928 = i2;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        this.f22927.m50693(this.f22929, this.f22928, this.f22926);
    }
}
