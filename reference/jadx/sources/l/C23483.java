package l;

/* JADX INFO: renamed from: l.᩹ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes.dex */
public final class C23483 extends AbstractC9441 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4091 f75943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75945;

    public C23483(C4091 c4091, int i, int i2) {
        this.f75943 = c4091;
        this.f75945 = i;
        this.f75944 = i2;
    }

    @Override // l.AbstractC9441
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5053(int i) {
        C24975 c24975 = this.f75943.f13939;
        return c24975.m55822(c24975.m55818().m8721((i * 2) + this.f75945));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f75944;
    }
}
