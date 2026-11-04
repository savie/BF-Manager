package l;

/* JADX INFO: renamed from: l.᩹ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes.dex */
public final class C23537 extends AbstractC6383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17569[] f76040;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76041;

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        c3399.m11136(4);
        c3399.m11138(this.f76041);
        c3399.m11129(this.f76040);
        if (this.f76040 != null) {
            C3399 c33910 = c3399.f11057;
            int i = this.f76041;
            c33910.m11138(i);
            int i2 = c33910.f11055;
            c33910.m11128(i * 12);
            C3399 c3399M11132 = c33910.m11132(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f76040[i3].mo6571(c3399M11132);
            }
        }
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) throws C20553 {
        c3399.m11136(4);
        this.f76041 = c3399.m11127();
        if (c3399.m11127() != 0) {
            C3399 c33910 = c3399.f11057;
            int iM11127 = c33910.m11127();
            int i = c33910.f11055;
            c33910.m11128(iM11127 * 12);
            if (this.f76040 == null) {
                if (iM11127 < 0 || iM11127 > 65535) {
                    throw new C20553("invalid array conformance");
                }
                this.f76040 = new C17569[iM11127];
            }
            C3399 c3399M11132 = c33910.m11132(i);
            for (int i2 = 0; i2 < iM11127; i2++) {
                C17569[] c17569Arr = this.f76040;
                if (c17569Arr[i2] == null) {
                    c17569Arr[i2] = new C17569();
                }
                c17569Arr[i2].mo6570(c3399M11132);
            }
        }
    }
}
