package l;

/* JADX INFO: renamed from: l.ۚ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5508 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f19161;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12219 f19163;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12965 f19164;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15202 f19165;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f19166;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f19167;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3335 f19168;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f19169;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20489 f19171;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20424 f19162 = new C20424();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24900 f19170 = new C24900();

    public C5508(C12219 c12219, boolean z, boolean z2) {
        C20489 c20489M10991;
        this.f19163 = c12219;
        this.f19161 = z2;
        if (z) {
            C20424 c20424 = c12219.f39261.f10906;
            c20489M10991 = !c20424.isEmpty() ? (C20489) c20424.last() : null;
        } else {
            c20489M10991 = c12219.f39261.m10991();
        }
        this.f19171 = c20489M10991;
        this.f19167 = c12219.f39258;
        this.f19166 = c12219.f39262;
        this.f19168 = c12219.f39261;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16382(C16694 c16694, C12219 c12219) {
        C20424 c20424M46835 = this.f19162.m46835(c16694.m39458());
        boolean zIsEmpty = c20424M46835.isEmpty();
        C12219 c122110 = this.f19163;
        this.f19165 = new C15202(c20424M46835, (zIsEmpty ? c122110.f39261 : c122110.f39261.m10988(c20424M46835, System.currentTimeMillis())).m10989(this.f19170, c12219.f39259, this.f19161), c16694.m39460(), c16694.m39459());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16383() {
        this.f19162 = this.f19165.f49620;
        this.f19168 = this.f19165.f49622;
        this.f19167 = this.f19165.f49621;
        this.f19166 = this.f19165.f49623;
        this.f19165 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16381() {
        this.f19165 = null;
        this.f19170.m55483();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12219 m16380(C12219 c12219) {
        long j = this.f19162.isEmpty() ? this.f19163.f39258 : this.f19167;
        long jMax = Math.max(c12219.f39262, this.f19166);
        C3335 c3335 = this.f19168;
        return new C12219(new C3335(c3335.f10908, c3335.f10906, Math.max(c3335.f10907, c12219.f39261.f10907), this.f19168.f10905), c12219.f39260, j, jMax, c12219.f39259);
    }
}
