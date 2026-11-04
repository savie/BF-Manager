package l;

/* JADX INFO: renamed from: l.ۤۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10856 extends AbstractC14080 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5637 f34390;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34391;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C12348 f34392;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f34393;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f34394;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f34395;

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ۙ */
    public final int mo5132() {
        return 21;
    }

    public C10856(String str) {
        C5637 c5637 = new C5637();
        C12348 c12348 = new C12348();
        c12348.f39663 = 0;
        this.f34395 = str;
        this.f34394 = 200;
        this.f34391 = 65535;
        this.f34390 = c5637;
        this.f34392 = c12348;
        c5637.f19494 = 200;
        c5637.f19493 = new C13094();
        this.f44579 = 0;
        this.f44581 = 3;
    }

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ܳ */
    public final void mo5133(C3399 c3399) {
        C12348 c12348 = this.f34392;
        c3399.m11130(this.f34395);
        c3399.m11138(this.f34394);
        c3399.m11138(this.f34391);
        c3399.m11129(this.f34390);
        C5637 c5637 = this.f34390;
        if (c5637 != null) {
            c5637.mo6571(c3399);
        }
        c3399.m11129(c12348);
        if (c12348 != null) {
            c3399.m11138(c12348.f39663);
        }
    }

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ᩸ */
    public final void mo5135(C3399 c3399) {
        if (c3399.m11127() != 0) {
            if (this.f34390 == null) {
                this.f34390 = new C5637();
            }
            this.f34390.mo6570(c3399);
        }
        if (c3399.m11127() != 0) {
            C12348 c12348 = this.f34392;
            c12348.getClass();
            c12348.f39663 = c3399.m11127();
        }
        this.f34393 = c3399.m11127();
    }
}
