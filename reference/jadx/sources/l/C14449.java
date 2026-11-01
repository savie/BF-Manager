package l;

/* JADX INFO: renamed from: l.ܳۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14449 extends AbstractC21316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47390;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47391;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17684 f47392;

    public C14449(C17684 c17684, int i, int i2) {
        this.f47392 = c17684;
        this.f47391 = i;
        this.f47390 = i2;
    }

    @Override // l.AbstractC21316
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3245(int i) {
        C17684 c17684 = this.f47392;
        return AbstractC13556.m33143(c17684, c17684.m41166().mo9809((i * 4) + this.f47391 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47390;
    }
}
