package l;

/* JADX INFO: renamed from: l.᩺۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O7S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22853 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f74344 = new int[258];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f74345;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74346;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char[] f74347;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74348;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f74349;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50595() {
        char[] cArr;
        int[] iArr;
        int i;
        int i2;
        byte[] bArr = new byte[256];
        C17913 c17913 = new C17913();
        char c = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (this.f74345[i4]) {
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
            int i11 = this.f74348;
            cArr = this.f74347;
            iArr = this.f74344;
            if (i6 >= i11) {
                break;
            }
            int iM41599 = c17913.m41599(bArr[this.f74349[i6] & 255]);
            if (iM41599 == 0) {
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
                int i13 = iM41599 + 1;
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
        this.f74350 = i8 + 1;
        this.f74346 = i3 + 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char[] m50597() {
        return this.f74347;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m50594() {
        return this.f74350;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m50598() {
        return this.f74346;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] m50596() {
        return this.f74344;
    }

    public C22853(int[] iArr, int i, boolean[] zArr) {
        this.f74349 = iArr;
        this.f74348 = i;
        this.f74345 = zArr;
        this.f74347 = new char[i + 1];
    }
}
