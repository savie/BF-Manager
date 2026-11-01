package l;

/* JADX INFO: renamed from: l.ۙ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8LK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4918 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final long[] f17235 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17236;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f17237;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f17238 = new byte[8];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13684() {
        this.f17237 = 0;
        this.f17236 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m13683(InterfaceC7222 interfaceC7222, boolean z, boolean z2, int i) {
        int i2 = this.f17237;
        byte[] bArr = this.f17238;
        if (i2 == 0) {
            if (!interfaceC7222.mo19212(z, 0, 1, bArr)) {
                return -1L;
            }
            int iM13680 = m13680(bArr[0] & 255);
            this.f17236 = iM13680;
            if (iM13680 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f17237 = 1;
        }
        int i3 = this.f17236;
        if (i3 > i) {
            this.f17237 = 0;
            return -2L;
        }
        if (i3 != 1) {
            interfaceC7222.readFully(bArr, 1, i3 - 1);
        }
        this.f17237 = 0;
        return m13681(bArr, this.f17236, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13682() {
        return this.f17236;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13680(int i) {
        int i2 = 0;
        while (i2 < 8) {
            long j = f17235[i2] & ((long) i);
            i2++;
            if (j != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m13681(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f17235[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
