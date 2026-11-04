package l;

/* JADX INFO: renamed from: l.ܳܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C15408 extends AbstractC9441 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13171 f50223;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50224;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50225;

    public C15408(C13171 c13171, int i, int i2) {
        this.f50223 = c13171;
        this.f50225 = i;
        this.f50224 = i2;
    }

    @Override // l.AbstractC9441
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5053(int i) {
        C24975 c24975 = this.f50223.f42096;
        return c24975.m55822(c24975.m55818().m8721((i * 2) + this.f50225));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50224;
    }
}
