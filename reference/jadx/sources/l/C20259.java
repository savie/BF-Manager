package l;

/* JADX INFO: renamed from: l.᩵ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20259 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f65057;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f65058;

    public C20259(byte[] bArr, int i) {
        this.f65057 = bArr;
        this.f65058 = i;
    }

    public final String toString() {
        byte[] bArr = this.f65057;
        int i = this.f65058;
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
    public static void m46532(C20259 c20259, C4047 c4047) {
        if (c20259 == null) {
            c4047.m13014(0);
            return;
        }
        byte[] bArr = c20259.f65057;
        int i = c20259.f65058;
        c4047.m13018(i, (bArr[i] * 2) + 1, bArr);
    }
}
