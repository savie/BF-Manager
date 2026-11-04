package l;

/* JADX INFO: renamed from: l.ܳۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RA0U */
/* JADX INFO: loaded from: classes5.dex */
public final class C15331 extends AbstractC6383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50083;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1908[] f50084;

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        c3399.m11136(4);
        c3399.m11138(this.f50083);
        c3399.m11129(this.f50084);
        if (this.f50084 != null) {
            C3399 c33910 = c3399.f11057;
            int i = this.f50083;
            c33910.m11138(i);
            int i2 = c33910.f11055;
            c33910.m11128(i * 4);
            C3399 c3399M11132 = c33910.m11132(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f50084[i3].mo6571(c3399M11132);
            }
        }
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) throws C20553 {
        c3399.m11136(4);
        this.f50083 = c3399.m11127();
        if (c3399.m11127() != 0) {
            C3399 c33910 = c3399.f11057;
            int iM11127 = c33910.m11127();
            int i = c33910.f11055;
            c33910.m11128(iM11127 * 4);
            if (this.f50084 == null) {
                if (iM11127 < 0 || iM11127 > 65535) {
                    throw new C20553("invalid array conformance");
                }
                this.f50084 = new C1908[iM11127];
            }
            C3399 c3399M11132 = c33910.m11132(i);
            for (int i2 = 0; i2 < iM11127; i2++) {
                C1908[] c1908Arr = this.f50084;
                if (c1908Arr[i2] == null) {
                    c1908Arr[i2] = new C1908();
                }
                c1908Arr[i2].mo6570(c3399M11132);
            }
        }
    }
}
