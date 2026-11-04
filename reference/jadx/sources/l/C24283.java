package l;

/* JADX INFO: renamed from: l.᩺ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2A1U */
/* JADX INFO: loaded from: classes.dex */
public class C24283 extends AbstractC6383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f78598;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f78599;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f78600;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f78601;

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        c3399.m11136(4);
        byte b = this.f78601;
        c3399.m11138(b);
        c3399.m11133(this.f78600);
        c3399.m11133(this.f78601);
        int i = c3399.f11055;
        c3399.m11128(6);
        int i2 = c3399.f11055;
        c3399.m11128(b * 4);
        C3399 c3399M11132 = c3399.m11132(i);
        for (int i3 = 0; i3 < 6; i3++) {
            c3399M11132.m11133(this.f78598[i3]);
        }
        C3399 c3399M11133 = c3399M11132.m11132(i2);
        for (int i4 = 0; i4 < b; i4++) {
            c3399M11133.m11138(this.f78599[i4]);
        }
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) throws C20553 {
        c3399.m11136(4);
        int iM11127 = c3399.m11127();
        this.f78600 = (byte) c3399.m11131();
        this.f78601 = (byte) c3399.m11131();
        int i = c3399.f11055;
        c3399.m11128(6);
        int i2 = c3399.f11055;
        c3399.m11128(iM11127 * 4);
        if (this.f78598 == null) {
            this.f78598 = new byte[6];
        }
        C3399 c3399M11132 = c3399.m11132(i);
        for (int i3 = 0; i3 < 6; i3++) {
            this.f78598[i3] = (byte) c3399M11132.m11131();
        }
        if (this.f78599 == null) {
            if (iM11127 < 0 || iM11127 > 65535) {
                throw new C20553("invalid array conformance");
            }
            this.f78599 = new int[iM11127];
        }
        C3399 c3399M11133 = c3399M11132.m11132(i2);
        for (int i4 = 0; i4 < iM11127; i4++) {
            this.f78599[i4] = c3399M11133.m11127();
        }
    }
}
