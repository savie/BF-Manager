package l;

/* JADX INFO: renamed from: l.ܳ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14863 extends AbstractC21316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48556;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11770 f48557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48558;

    public C14863(C11770 c11770, int i, int i2) {
        this.f48557 = c11770;
        this.f48558 = i;
        this.f48556 = i2;
    }

    @Override // l.AbstractC21316
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3245(int i) {
        C17684 c17684 = this.f48557.f39511;
        return c17684.m41204(c17684.m41166().m42183((i * 2) + this.f48558));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48556;
    }
}
