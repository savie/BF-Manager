package l;

/* JADX INFO: renamed from: l.ܶܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16154 extends AbstractC9441 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52444;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24975 f52446;

    public C16154(C24975 c24975, int i, int i2) {
        this.f52446 = c24975;
        this.f52444 = i;
        this.f52445 = i2;
    }

    @Override // l.AbstractC9441
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5053(int i) {
        C24975 c24975 = this.f52446;
        return AbstractC6460.m18258(c24975, c24975.m55818().mo8719((i * 4) + this.f52444 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f52445;
    }
}
