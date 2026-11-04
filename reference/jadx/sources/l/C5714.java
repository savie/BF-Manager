package l;

/* JADX INFO: renamed from: l.ۚܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5714 extends AbstractC9441 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1985 f19717;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19719;

    public C5714(C1985 c1985, int i, int i2) {
        this.f19717 = c1985;
        this.f19719 = i;
        this.f19718 = i2;
    }

    @Override // l.AbstractC9441
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5053(int i) {
        C24975 c24975 = this.f19717.f6647;
        return c24975.m55822(c24975.m55818().m8721((i * 2) + this.f19719));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19718;
    }
}
