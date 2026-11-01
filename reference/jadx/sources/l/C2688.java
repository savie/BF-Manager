package l;

/* JADX INFO: renamed from: l.ۖᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2688 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21033 f10374;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11862 f10375;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14789 f10376;

    public C2688(C11862 c11862, C14789 c14789, C21033 c21033) {
        if (c11862.m29565() != c14789.m35430() || c11862.m29568() != c14789.m35429() || c21033.m47422() != c11862.m29568()) {
            throw new IllegalArgumentException("Window reuse metadata identity differs");
        }
        this.f10375 = c11862;
        this.f10376 = c14789;
        this.f10374 = c21033;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2688 m8222(C21033 c21033) {
        int iM47422 = c21033.m47422();
        C21033 c21033M47420 = this.f10374;
        if (iM47422 != c21033M47420.m47416()) {
            throw new IllegalArgumentException("Window reuse edit chain differs");
        }
        int iM47429 = c21033.m47429();
        while (true) {
            iM47429--;
            if (iM47429 >= 0) {
                c21033M47420 = c21033M47420.m47420(new C7628(c21033.m47423(iM47429), c21033.m47417(iM47429), c21033.m47427(iM47429) - c21033.m47424(iM47429)));
            } else {
                return new C2688(this.f10375, this.f10376, c21033M47420);
            }
        }
    }
}
