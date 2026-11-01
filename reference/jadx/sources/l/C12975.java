package l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.۬۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12975 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f43277;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[][] f43278;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] f43279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4507 f43280;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f43281;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[][] f43282;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f43283 = new int[6];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[][] f43284;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f43285;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32099() throws IOException {
        int i = this.f43277 + 1;
        this.f43277 = i;
        if (i % 50 == 0) {
            int i2 = this.f43285 + 1;
            this.f43285 = i2;
            byte[] bArr = this.f43279;
            if (i2 == bArr.length) {
                throw new C0979("Error decoding BZip2 block");
            }
            this.f43281 = bArr[i2] & 255;
        }
        int i3 = this.f43281;
        int[] iArr = this.f43282[i3];
        int i4 = this.f43283[i3];
        C4507 c4507 = this.f43280;
        int iM12543 = c4507.m12543(i4);
        while (i4 <= 23) {
            if (iM12543 <= iArr[i4]) {
                return this.f43278[i3][iM12543 - this.f43284[i3][i4]];
            }
            iM12543 = (iM12543 << 1) | c4507.m12543(1);
            i4++;
        }
        throw new C0979("Error decoding BZip2 block");
    }

    public C12975(C4507 c4507, int i, byte[][] bArr, byte[] bArr2) {
        Class cls = Integer.TYPE;
        this.f43284 = (int[][]) Array.newInstance((Class<?>) cls, 6, 25);
        this.f43282 = (int[][]) Array.newInstance((Class<?>) cls, 6, 24);
        this.f43278 = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f43285 = -1;
        this.f43277 = -1;
        this.f43280 = c4507;
        this.f43279 = bArr2;
        this.f43281 = bArr2[0];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int[] iArr = this.f43284[i2];
            int[] iArr2 = this.f43282[i2];
            int[] iArr3 = this.f43278[i2];
            byte[] bArr3 = bArr[i2];
            int iMin = 23;
            int iMax = 0;
            for (int i3 = 0; i3 < i; i3++) {
                iMax = Math.max((int) bArr3[i3], iMax);
                iMin = Math.min((int) bArr3[i3], iMin);
            }
            this.f43283[i2] = iMin;
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
