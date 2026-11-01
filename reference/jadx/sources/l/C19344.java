package l;

/* JADX INFO: renamed from: l.᩵۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19344 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18638[] f62379 = new C18638[16];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC16810 f62380;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11583 f62381;

    public C19344() {
        int i = 0;
        while (true) {
            C18638[] c18638Arr = this.f62379;
            if (i >= c18638Arr.length) {
                return;
            }
            c18638Arr[i] = new C18638(this, i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44346(C3403 c3403, AbstractC20050 abstractC20050) {
        this.f62380 = c3403;
        if (this.f62381 == null) {
            C11583 c11583 = new C11583();
            C7659 c7659 = new C7659("InputA");
            c11583.f38946 = c7659;
            c11583.m3818(c7659);
            C7659 c76510 = new C7659("InputB");
            c11583.f38944 = c76510;
            c11583.m3818(c76510);
            C21064 c21064 = new C21064("OutputB");
            c11583.f38945 = c21064;
            c11583.m3818(c21064);
            this.f62381 = c11583;
            c3403.m10095(c11583);
        }
        C8055 c8055 = new C8055(this, 64, abstractC20050);
        for (int i = 0; i < 16; i++) {
            this.f62379[i].m43115(c8055);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44344(int i, int i2) {
        this.f62379[i].m43119(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44345(int i, int i2, int i3) {
        this.f62379[i].m43113(i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44350(int i, int i2, int i3) {
        this.f62379[i].m43114(i2, ((double) i3) * 0.007874015748031496d * 0.25d);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44348(int i, double d) {
        this.f62379[i].m43117(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44343(int i, double d) {
        this.f62379[i].m43112(d);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44341(int i, double d) {
        this.f62379[i].m43111(d);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m44351(int i, double d) {
        this.f62379[i].m43120(d);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m44347(int i, double d) {
        this.f62379[i].m43116(d);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m44340(int i, double d) {
        this.f62379[i].m43110(d);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44349(int i, double d) {
        this.f62379[i].m43118(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21064 m44342() {
        return this.f62381.f38945;
    }
}
