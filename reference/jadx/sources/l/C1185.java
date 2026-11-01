package l;

/* JADX INFO: renamed from: l.֨ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1185 extends AbstractC21316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5261;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4007 f5262;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5264;

    public C1185(C4007 c4007, int i, int i2, int i3) {
        this.f5262 = c4007;
        this.f5263 = i;
        this.f5264 = i2;
        this.f5261 = i3;
    }

    @Override // l.AbstractC21316
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3245(int i) {
        return new C15298(this.f5262.f14856, (i * 8) + this.f5263, this.f5264);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5261;
    }
}
