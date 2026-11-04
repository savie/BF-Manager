package l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ᩳ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18923 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f61378;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24145 f61379;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f61380 = new int[6];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[][] f61381;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f61382;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f61383;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f61384;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[][] f61385;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[][] f61386;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43928() throws IOException {
        int i = this.f61382 + 1;
        this.f61382 = i;
        if (i % 50 == 0) {
            int i2 = this.f61383 + 1;
            this.f61383 = i2;
            byte[] bArr = this.f61378;
            if (i2 == bArr.length) {
                throw new C7736("Error decoding BZip2 block");
            }
            this.f61384 = bArr[i2] & 255;
        }
        int i3 = this.f61384;
        int[] iArr = this.f61381[i3];
        int i4 = this.f61380[i3];
        C24145 c24145 = this.f61379;
        int iM54114 = c24145.m54114(i4);
        while (i4 <= 23) {
            if (iM54114 <= iArr[i4]) {
                return this.f61386[i3][iM54114 - this.f61385[i3][i4]];
            }
            iM54114 = (iM54114 << 1) | c24145.m54114(1);
            i4++;
        }
        throw new C7736("Error decoding BZip2 block");
    }

    public C18923(C24145 c24145, int i, byte[][] bArr, byte[] bArr2) {
        Class cls = Integer.TYPE;
        this.f61385 = (int[][]) Array.newInstance((Class<?>) cls, 6, 25);
        this.f61381 = (int[][]) Array.newInstance((Class<?>) cls, 6, 24);
        this.f61386 = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f61383 = -1;
        this.f61382 = -1;
        this.f61379 = c24145;
        this.f61378 = bArr2;
        this.f61384 = bArr2[0];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int[] iArr = this.f61385[i2];
            int[] iArr2 = this.f61381[i2];
            int[] iArr3 = this.f61386[i2];
            byte[] bArr3 = bArr[i2];
            int iMin = 23;
            int iMax = 0;
            for (int i3 = 0; i3 < i; i3++) {
                iMax = Math.max((int) bArr3[i3], iMax);
                iMin = Math.min((int) bArr3[i3], iMin);
            }
            this.f61380[i2] = iMin;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr3[i4] + 1;
                iArr[i5] = iArr[i5] + 1;
            }
            for (int i6 = 1; i6 < 25; i6++) {
                iArr[i6] = iArr[i6] + iArr[i6 - 1];
            }
            int i7 = 0;
            int i8 = iMin;
            while (i8 <= iMax) {
                int i9 = i8 + 1;
                int i10 = iArr[i9];
                int i11 = iArr[i8];
                int i12 = (i10 - i11) + i7;
                iArr[i8] = i7 - i11;
                iArr2[i8] = i12 - 1;
                i7 = i12 << 1;
                i8 = i9;
            }
            int i13 = 0;
            while (iMin <= iMax) {
                for (int i14 = 0; i14 < i; i14++) {
                    if (bArr3[i14] == iMin) {
                        iArr3[i13] = i14;
                        i13++;
                    }
                }
                iMin++;
            }
        }
    }
}
