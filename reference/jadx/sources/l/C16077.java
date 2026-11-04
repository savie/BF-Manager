package l;

/* JADX INFO: renamed from: l.ܶۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes5.dex */
public final class C16077 extends AbstractC6383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16823[] f52089;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f52090;

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        c3399.m11136(4);
        c3399.m11138(this.f52090);
        c3399.m11129(this.f52089);
        if (this.f52089 != null) {
            C3399 c33910 = c3399.f11057;
            int i = this.f52090;
            c33910.m11138(i);
            int i2 = c33910.f11055;
            c33910.m11128(i * 4);
            C3399 c3399M11132 = c33910.m11132(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f52089[i3].mo6571(c3399M11132);
            }
        }
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) throws C20553 {
        c3399.m11136(4);
        this.f52090 = c3399.m11127();
        if (c3399.m11127() != 0) {
            C3399 c33910 = c3399.f11057;
            int iM11127 = c33910.m11127();
            int i = c33910.f11055;
            c33910.m11128(iM11127 * 4);
            if (this.f52089 == null) {
                if (iM11127 < 0 || iM11127 > 65535) {
                    throw new C20553("invalid array conformance");
                }
                this.f52089 = new C16823[iM11127];
            }
            C3399 c3399M11132 = c33910.m11132(i);
            for (int i2 = 0; i2 < iM11127; i2++) {
                C16823[] c16823Arr = this.f52089;
                if (c16823Arr[i2] == null) {
                    c16823Arr[i2] = new C16823();
                }
                c16823Arr[i2].mo6570(c3399M11132);
            }
        }
    }
}
