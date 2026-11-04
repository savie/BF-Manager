package l;

/* JADX INFO: renamed from: l.۫ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RA0U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13094 extends AbstractC6383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41839;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11602[] f41840;

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        c3399.m11136(4);
        c3399.m11138(this.f41839);
        c3399.m11129(this.f41840);
        if (this.f41840 != null) {
            C3399 c33910 = c3399.f11057;
            int i = this.f41839;
            c33910.m11138(i);
            int i2 = c33910.f11055;
            c33910.m11128(i * 4);
            C3399 c3399M11132 = c33910.m11132(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f41840[i3].mo6571(c3399M11132);
            }
        }
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) throws C20553 {
        c3399.m11136(4);
        this.f41839 = c3399.m11127();
        if (c3399.m11127() != 0) {
            C3399 c33910 = c3399.f11057;
            int iM11127 = c33910.m11127();
            int i = c33910.f11055;
            c33910.m11128(iM11127 * 4);
            if (this.f41840 == null) {
                if (iM11127 < 0 || iM11127 > 65535) {
                    throw new C20553("invalid array conformance");
                }
                this.f41840 = new C11602[iM11127];
            }
            C3399 c3399M11132 = c33910.m11132(i);
            for (int i2 = 0; i2 < iM11127; i2++) {
                C11602[] c11602Arr = this.f41840;
                if (c11602Arr[i2] == null) {
                    c11602Arr[i2] = new C11602();
                }
                c11602Arr[i2].mo6570(c3399M11132);
            }
        }
    }
}
