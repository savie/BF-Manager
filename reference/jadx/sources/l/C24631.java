package l;

/* JADX INFO: renamed from: l.᩺᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BA4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24631 extends AbstractC2476 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21122 f79758;

    public C24631(C0985 c0985, C9012 c9012, C0063 c0063, C21122 c21122) {
        super(c0985, c9012, c0063);
        if (c21122 == null) {
            throw new NullPointerException("target == null");
        }
        this.f79758 = c21122;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo14214(C0985 c0985) {
        return new C24631(c0985, m43799(), m43795(), this.f79758);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C24631(m43802(), m43799(), c0063, this.f79758);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21122 m54969() {
        return this.f79758;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m54968() {
        return this.f79758.m43804();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m54970() {
        return this.f79758.m43804() - m43804();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m54967() {
        return m43801() && this.f79758.m43801();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        C21122 c21122 = this.f79758;
        return c21122 == null ? "????" : c21122.m43807();
    }
}
