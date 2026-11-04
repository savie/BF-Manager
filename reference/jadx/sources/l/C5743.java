package l;

/* JADX INFO: renamed from: l.ۚܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5743 extends AbstractC15437 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19913 f19764;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25135 f19765;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19913 f19766;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC16929 f19767;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f19768;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f19769;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f19770;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f19771 = C9498.f30777;

    public C5743(C25135 c25135, EnumC16929 enumC16929, int[] iArr, int[] iArr2) {
        this.f19765 = c25135;
        this.f19767 = enumC16929;
        this.f19766 = C25135.m56036(iArr);
        this.f19764 = C25135.m56036(iArr2);
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ۤ */
    public final EnumC16929 mo6928() {
        return this.f19770 ? EnumC16929.INITIAL : this.f19767;
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ۙ */
    public final int mo6927(byte[] bArr, int i, int i2) {
        int iMin;
        int iMin2;
        if (i2 == 0) {
            return 0;
        }
        if (this.f19770) {
            return -1;
        }
        int i3 = this.f19769 - this.f19768;
        if (i3 > 0) {
            iMin = Math.min(i2, i3);
            System.arraycopy(this.f19771, this.f19768, bArr, i, iMin);
            this.f19768 += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            C25135 c25135 = this.f19765;
            int iM56037 = C25135.m56037(c25135.f81270, this.f19766);
            if (iM56037 >= 256) {
                if (iM56037 > 256) {
                    short s = C25135.f81266[iM56037 - 257];
                    int iM51627 = C22897.m51627(s >>> 5, C25135.m56032(c25135, s & 31));
                    int i4 = C25135.f81268[C25135.m56037(c25135.f81270, this.f19764)];
                    int iM51628 = C22897.m51627(i4 >>> 4, C25135.m56032(c25135, i4 & 15));
                    if (this.f19771.length < iM51627) {
                        this.f19771 = new byte[iM51627];
                    }
                    this.f19769 = iM51627;
                    this.f19768 = 0;
                    c25135.f81273.m32710(iM51628, iM51627, this.f19771);
                    int i5 = i + iMin;
                    int i6 = i2 - iMin;
                    int i7 = this.f19769 - this.f19768;
                    if (i7 > 0) {
                        iMin2 = Math.min(i6, i7);
                        System.arraycopy(this.f19771, this.f19768, bArr, i5, iMin2);
                        this.f19768 += iMin2;
                    } else {
                        iMin2 = 0;
                    }
                    iMin += iMin2;
                } else {
                    this.f19770 = true;
                    break;
                }
            } else {
                byte b = (byte) iM56037;
                c25135.f81273.m32709(b);
                bArr[iMin + i] = b;
                iMin++;
            }
        }
        return iMin;
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6929() {
        return !this.f19770;
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ۙ */
    public final int mo6926() {
        return this.f19769 - this.f19768;
    }
}
