package l;

/* JADX INFO: renamed from: l.᩻ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23621 extends AbstractC18494 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76527;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76528;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17684 f76529;

    public C23621(C17684 c17684, int i, int i2) {
        this.f76529 = c17684;
        this.f76528 = i;
        this.f76527 = i2;
    }

    @Override // l.AbstractC18494
    /* JADX INFO: renamed from: ۙ */
    public final Object mo42889(int i) {
        C17684 c17684 = this.f76529;
        return new C14158(c17684, c17684.m41166().mo9809((i * 4) + this.f76528 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f76527;
    }
}
