package l;

/* JADX INFO: renamed from: l.ۡܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8928 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f30614;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f30615;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f30616;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f30617;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8928(C20217 c20217, int i, int i2) {
        super("OkHttp %s ping %08x%08x", c20217.f65613, Integer.valueOf(i), Integer.valueOf(i2));
        this.f30615 = c20217;
        this.f30616 = true;
        this.f30617 = i;
        this.f30614 = i2;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        this.f30615.m45693(this.f30617, this.f30614, this.f30616);
    }
}
