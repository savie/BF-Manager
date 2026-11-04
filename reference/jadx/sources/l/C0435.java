package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f2001;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m2253(char c) {
        if (c >= '!' && c <= '/') {
            return true;
        }
        if (c >= ':' && c <= '@') {
            return true;
        }
        if (c < '[' || c > '`') {
            return c >= '{' && c <= '~';
        }
        return true;
    }

    static {
        byte[] bArr = new byte[65536];
        f2001 = bArr;
        Arrays.fill(bArr, (byte) 15);
        for (int i = 0; i <= 127; i++) {
            f2001[i] = 4;
        }
        byte[] bArr2 = f2001;
        bArr2[32] = 1;
        bArr2[10] = 1;
        bArr2[13] = 1;
        bArr2[9] = 2;
        bArr2[160] = 10;
        for (int i2 = 48; i2 <= 57; i2++) {
            f2001[i2] = 3;
        }
        byte[] bArr3 = f2001;
        bArr3[35] = 3;
        bArr3[42] = 3;
        int[] iArr = {129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, EnumC24309.f78687, 155, 156, 157, 158, 159, 173};
        for (int i3 = 0; i3 < 32; i3++) {
            f2001[iArr[i3]] = 8;
        }
        for (int i4 = 8192; i4 <= 8207; i4++) {
            f2001[i4] = 8;
        }
        for (int i5 = 8232; i5 <= 8239; i5++) {
            f2001[i5] = 8;
        }
        f2001[8287] = 8;
        for (int i6 = 8288; i6 <= 8303; i6++) {
            if (i6 != 8293) {
                f2001[i6] = 8;
            }
        }
        f2001[65279] = 9;
        for (int i7 = 19968; i7 <= 40869; i7++) {
            f2001[i7] = 0;
        }
        f2001[65533] = 5;
        for (int i8 = 65520; i8 <= 65528; i8++) {
            f2001[i8] = 6;
        }
        for (int i9 = 0; i9 < 31; i9++) {
            f2001["（）［］〔〕〈〉｛｝【】《》「」『』〖〗｟｠〚〛，。！？：；～".charAt(i9)] = 7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m2252(char c) {
        return f2001[c];
    }
}
