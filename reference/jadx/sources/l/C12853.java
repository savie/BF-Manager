package l;

/* JADX INFO: renamed from: l.۬ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12853 extends AbstractC22025 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC14970 f42755;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f42756 = C8574.f29651;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5091 f42757;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42758;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5091 f42759;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22731 f42760;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42761;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42762;

    public C12853(C22731 c22731, EnumC14970 enumC14970, int[] iArr, int[] iArr2) {
        this.f42760 = c22731;
        this.f42755 = enumC14970;
        this.f42759 = C22731.m50398(iArr);
        this.f42757 = C22731.m50398(iArr2);
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ۨ */
    public final EnumC14970 mo10851() {
        return this.f42761 ? EnumC14970.INITIAL : this.f42755;
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ۙ */
    public final int mo10850(byte[] bArr, int i, int i2) {
        int iMin;
        int iMin2;
        if (i2 == 0) {
            return 0;
        }
        if (this.f42761) {
            return -1;
        }
        int i3 = this.f42758 - this.f42762;
        if (i3 > 0) {
            iMin = Math.min(i2, i3);
            System.arraycopy(this.f42756, this.f42762, bArr, i, iMin);
            this.f42762 += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            C22731 c22731 = this.f42760;
            int iM50401 = C22731.m50401(c22731.f74056, this.f42759);
            if (iM50401 >= 256) {
                if (iM50401 > 256) {
                    short s = C22731.f74050[iM50401 - 257];
                    int iM6950 = C2268.m6950(s >>> 5, C22731.m50395(c22731, s & 31));
                    int i4 = C22731.f74048[C22731.m50401(c22731.f74056, this.f42757)];
                    int iM6951 = C2268.m6950(i4 >>> 4, C22731.m50395(c22731, i4 & 15));
                    if (this.f42756.length < iM6950) {
                        this.f42756 = new byte[iM6950];
                    }
                    this.f42758 = iM6950;
                    this.f42762 = 0;
                    c22731.f74053.m3469(iM6951, iM6950, this.f42756);
                    int i5 = i + iMin;
                    int i6 = i2 - iMin;
                    int i7 = this.f42758 - this.f42762;
                    if (i7 > 0) {
                        iMin2 = Math.min(i6, i7);
                        System.arraycopy(this.f42756, this.f42762, bArr, i5, iMin2);
                        this.f42762 += iMin2;
                    } else {
                        iMin2 = 0;
                    }
                    iMin += iMin2;
                } else {
                    this.f42761 = true;
                    break;
                }
            } else {
                byte b = (byte) iM50401;
                c22731.f74053.m3468(b);
                bArr[iMin + i] = b;
                iMin++;
            }
        }
        return iMin;
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo10852() {
        return !this.f42761;
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ۙ */
    public final int mo10849() {
        return this.f42758 - this.f42762;
    }
}
