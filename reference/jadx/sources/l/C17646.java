package l;

/* JADX INFO: renamed from: l.ܽܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17646 extends AbstractC8696 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58018;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58019;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24975 f58020;

    public C17646(C24975 c24975, int i, int i2) {
        this.f58020 = c24975;
        this.f58018 = i;
        this.f58019 = i2;
    }

    @Override // l.AbstractC8696
    /* JADX INFO: renamed from: ۙ */
    public final Object mo23382(int i) {
        C24975 c24975 = this.f58020;
        return new C24558(c24975, c24975.m55818().mo8719((i * 4) + this.f58018 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f58019;
    }
}
