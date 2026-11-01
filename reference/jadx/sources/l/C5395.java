package l;

/* JADX INFO: renamed from: l.ۚܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5395 extends AbstractC9361 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f18625 = new Object();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f18626;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f18627;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5395 m14957(C13689 c13689) {
        return new C5395(new C22329(c13689), C0282.f1577, f18625);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5395 m14958(AbstractC16511 abstractC16511, Object obj, Object obj2) {
        return new C5395(abstractC16511, obj, obj2);
    }

    public C5395(AbstractC16511 abstractC16511, Object obj, Object obj2) {
        super(abstractC16511);
        this.f18626 = obj;
        this.f18627 = obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5395 m14961(AbstractC16511 abstractC16511) {
        return new C5395(abstractC16511, this.f18626, this.f18627);
    }

    @Override // l.AbstractC9361, l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C0282 mo14810(int i, C0282 c0282, long j) {
        this.f31719.mo14810(i, c0282, j);
        if (C13638.equals(c0282.f1591, this.f18626)) {
            c0282.f1591 = C0282.f1577;
        }
        return c0282;
    }

    @Override // l.AbstractC9361, l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C20039 mo5920(int i, C20039 c20039, boolean z) {
        this.f31719.mo5920(i, c20039, z);
        if (C13638.equals(c20039.f64174, this.f18627) && z) {
            c20039.f64174 = f18625;
        }
        return c20039;
    }

    @Override // l.AbstractC9361, l.AbstractC16511
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14959(Object obj) {
        Object obj2;
        if (f18625.equals(obj) && (obj2 = this.f18627) != null) {
            obj = obj2;
        }
        return this.f31719.mo14959(obj);
    }

    @Override // l.AbstractC9361, l.AbstractC16511
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo14960(int i) {
        Object objMo14960 = this.f31719.mo14960(i);
        return C13638.equals(objMo14960, this.f18627) ? f18625 : objMo14960;
    }
}
