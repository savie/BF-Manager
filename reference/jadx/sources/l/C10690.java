package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 365A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10690 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f36504;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f36504 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26897(char c) {
        if (c < 128) {
            return f36504[c];
        }
        return -1;
    }
}
