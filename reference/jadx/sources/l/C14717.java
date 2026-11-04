package l;

/* JADX INFO: renamed from: l.ܰܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A8LK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14717 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final long[] f48098 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48099;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f48100;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f48101 = new byte[8];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35411() {
        this.f48100 = 0;
        this.f48099 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m35410(InterfaceC19502 interfaceC19502, boolean z, boolean z2, int i) {
        int i2 = this.f48100;
        byte[] bArr = this.f48101;
        if (i2 == 0) {
            if (!interfaceC19502.mo10071(z, 0, 1, bArr)) {
                return -1L;
            }
            int iM35407 = m35407(bArr[0] & 255);
            this.f48099 = iM35407;
            if (iM35407 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f48100 = 1;
        }
        int i3 = this.f48099;
        if (i3 > i) {
            this.f48100 = 0;
            return -2L;
        }
        if (i3 != 1) {
            interfaceC19502.readFully(bArr, 1, i3 - 1);
        }
        this.f48100 = 0;
        return m35408(bArr, this.f48099, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35409() {
        return this.f48099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35407(int i) {
        int i2 = 0;
        while (i2 < 8) {
            long j = f48098[i2] & ((long) i);
            i2++;
            if (j != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m35408(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f48098[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
