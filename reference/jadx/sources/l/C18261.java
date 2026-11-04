package l;

/* JADX INFO: renamed from: l.ܿۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18261 extends AbstractC9441 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7820 f59584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59585;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59586;

    public C18261(C7820 c7820, int i, int i2, int i3) {
        this.f59584 = c7820;
        this.f59583 = i;
        this.f59586 = i2;
        this.f59585 = i3;
    }

    @Override // l.AbstractC9441
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5053(int i) {
        return new C1108(this.f59584.f26041, (i * 8) + this.f59583, this.f59586);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59585;
    }
}
