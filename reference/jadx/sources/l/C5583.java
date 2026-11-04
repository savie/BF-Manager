package l;

/* JADX INFO: renamed from: l.ۚۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5583 extends AbstractC9441 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24975 f19388;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19389;

    public C5583(C24975 c24975, int i) {
        this.f19388 = c24975;
        this.f19389 = i;
    }

    @Override // l.AbstractC9441
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5053(int i) {
        C24975 c24975 = this.f19388;
        return new C22122(c24975, (i * 12) + c24975.f80880 + 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19389;
    }
}
