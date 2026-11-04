package l;

/* JADX INFO: renamed from: l.ۡ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9226 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30051;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30052;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f30053 = new int[258];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f30054;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char[] f30055;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f30056;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f30057;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24408() {
        char[] cArr;
        int[] iArr;
        int i;
        int i2;
        byte[] bArr = new byte[256];
        C6990 c6990 = new C6990();
        char c = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (this.f30057[i4]) {
                bArr[i4] = (byte) i3;
                i3++;
            }
        }
        int i5 = i3 + 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.f30052;
            cArr = this.f30055;
            iArr = this.f30053;
            if (i6 >= i11) {
                break;
            }
            int iM19298 = c6990.m19298(bArr[this.f30056[i6] & 255]);
            if (iM19298 == 0) {
                i7++;
            } else {
                if (i7 > 0) {
                    int i12 = i7 - 1;
                    while (true) {
                        if ((i12 & 1) == 0) {
                            i2 = i8 + 1;
                            cArr[i8] = c;
                            i9++;
                        } else {
                            i2 = i8 + 1;
                            cArr[i8] = 1;
                            i10++;
                        }
                        i8 = i2;
                        if (i12 <= 1) {
                            break;
                        } else {
                            i12 = (i12 - 2) >>> 1;
                        }
                    }
                    i7 = 0;
                }
                int i13 = iM19298 + 1;
                cArr[i8] = (char) i13;
                iArr[i13] = iArr[i13] + 1;
                i8++;
            }
            i6++;
            c = 0;
        }
        if (i7 > 0) {
            int i14 = i7 - 1;
            while (true) {
                if ((i14 & 1) == 0) {
                    i = i8 + 1;
                    cArr[i8] = 0;
                    i9++;
                } else {
                    i = i8 + 1;
                    cArr[i8] = 1;
                    i10++;
                }
                i8 = i;
                if (i14 <= 1) {
                    break;
                } else {
                    i14 = (i14 - 2) >>> 1;
                }
            }
        }
        cArr[i8] = (char) i5;
        iArr[i5] = iArr[i5] + 1;
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        this.f30054 = i8 + 1;
        this.f30051 = i3 + 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char[] m24409() {
        return this.f30055;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m24412() {
        return this.f30054;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24411() {
        return this.f30051;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] m24410() {
        return this.f30053;
    }

    public C9226(int[] iArr, int i, boolean[] zArr) {
        this.f30056 = iArr;
        this.f30052 = i;
        this.f30057 = zArr;
        this.f30055 = new char[i + 1];
    }
}
