package l;

/* JADX INFO: renamed from: l.ᩴ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B9V */
/* JADX INFO: loaded from: classes5.dex */
public final class C20155 extends AbstractC14933 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20946 f64753;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46372(C20946 c20946) {
        return c20946.m47904() + ' ' + c20946.m47896().toString() + ": " + c20946.m47898().mo1843();
    }

    public C20155(C9012 c9012, C20946 c20946) {
        super(c9012);
        if (c20946 == null) {
            throw new NullPointerException("local == null");
        }
        this.f64753 = c20946;
    }

    @Override // l.AbstractC14933, l.AbstractC18884
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC18884 mo8332(int i) {
        return new C20155(m43799(), this.f64753.m47890(i));
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C20155(m43799(), this.f64753);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20946 m46373() {
        return this.f64753;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        return this.f64753.toString();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ܺ */
    public final String mo8330() {
        return "local-start " + m46372(this.f64753);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo43797(C22985 c22985) {
        return new C20155(m43799(), c22985.mo21960(this.f64753));
    }
}
