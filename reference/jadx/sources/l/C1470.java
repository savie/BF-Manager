package l;

/* JADX INFO: renamed from: l.֫֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f5986;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f5987;

    public C1470(byte[] bArr, int i) {
        this.f5986 = bArr;
        this.f5987 = i;
    }

    public final String toString() {
        byte[] bArr = this.f5986;
        int i = this.f5987;
        byte b = bArr[i];
        StringBuilder sb = new StringBuilder(b * 2);
        for (int i2 = 0; i2 < b; i2++) {
            int i3 = i2 * 2;
            byte b2 = bArr[i3 + i + 1];
            if (b2 == 0) {
                sb.append('[');
            } else if (b2 == 1) {
                sb.append('.');
            } else if (b2 == 2) {
                sb.append('*');
            } else if (b2 == 3) {
                sb.append((int) bArr[i3 + i + 2]);
                sb.append(';');
            } else {
                throw new AssertionError();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5115(C1470 c1470, C2175 c2175) {
        if (c1470 == null) {
            c2175.m6764(0);
            return;
        }
        byte[] bArr = c1470.f5986;
        int i = c1470.f5987;
        c2175.m6768(i, (bArr[i] * 2) + 1, bArr);
    }
}
