package l;

/* JADX INFO: renamed from: l.ܰۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1T0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14515 implements InterfaceC21229 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int[] f45663 = new int[256];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45664 = 0;

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = 8;
            int i3 = i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    int i4 = i3 & 1;
                    i3 >>>= 1;
                    if (i4 != 0) {
                        i3 ^= -306674912;
                    }
                }
            }
            f45663[i] = i3;
        }
    }

    @Override // l.InterfaceC21229
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = ~this.f45664;
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i4 = i + 1;
                i3 = (i3 >>> 8) ^ f45663[(bArr[i] ^ i3) & 255];
                i = i4;
            } else {
                this.f45664 = ~i3;
                return;
            }
        }
    }

    @Override // l.InterfaceC21229
    public final void reset() {
        this.f45664 = 0;
    }

    @Override // l.InterfaceC21229
    /* JADX INFO: renamed from: ۙ */
    public final void mo13158(long j) {
        this.f45664 = (int) (j & 4294967295L);
    }

    @Override // l.InterfaceC21229
    public final long getValue() {
        return ((long) this.f45664) & 4294967295L;
    }
}
