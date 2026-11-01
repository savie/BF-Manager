package l;

/* JADX INFO: renamed from: l.ۙۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4545 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f16159;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f16161;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f16162;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6694 f16163 = new C6694(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f16164 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f16165 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f16160 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2460 f16158 = new C2460();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m12689() {
        return this.f16162;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6694 m12690() {
        return this.f16163;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12687(InterfaceC7222 interfaceC7222, C0954 c0954) {
        boolean z = this.f16161;
        C2460 c2460 = this.f16158;
        long j = -9223372036854775807L;
        if (!z) {
            long length = interfaceC7222.getLength();
            int iMin = (int) Math.min(20000L, length);
            long j2 = length - ((long) iMin);
            if (interfaceC7222.getPosition() != j2) {
                c0954.f3770 = j2;
                return 1;
            }
            c2460.m7517(iMin);
            interfaceC7222.mo19217();
            interfaceC7222.mo19210(0, iMin, c2460.m7518());
            int iM7500 = c2460.m7500();
            for (int iM7509 = c2460.m7509() - 4; iM7509 >= iM7500; iM7509--) {
                if (m12684(iM7509, c2460.m7518()) == 442) {
                    c2460.m7510(iM7509 + 4);
                    long jM12685 = m12685(c2460);
                    if (jM12685 != -9223372036854775807L) {
                        j = jM12685;
                        break;
                    }
                }
            }
            this.f16165 = j;
            this.f16161 = true;
            return 0;
        }
        if (this.f16165 == -9223372036854775807L) {
            m12686(interfaceC7222);
            return 0;
        }
        if (this.f16159) {
            long j3 = this.f16164;
            if (j3 == -9223372036854775807L) {
                m12686(interfaceC7222);
                return 0;
            }
            C6694 c6694 = this.f16163;
            this.f16160 = c6694.m18075(this.f16165) - c6694.m18077(j3);
            m12686(interfaceC7222);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, interfaceC7222.getLength());
        long j4 = 0;
        if (interfaceC7222.getPosition() != j4) {
            c0954.f3770 = j4;
            return 1;
        }
        c2460.m7517(iMin2);
        interfaceC7222.mo19217();
        interfaceC7222.mo19210(0, iMin2, c2460.m7518());
        int iM75010 = c2460.m7509();
        for (int iM7501 = c2460.m7500(); iM7501 < iM75010 - 3; iM7501++) {
            if (m12684(iM7501, c2460.m7518()) == 442) {
                c2460.m7510(iM7501 + 4);
                long jM12686 = m12685(c2460);
                if (jM12686 != -9223372036854775807L) {
                    j = jM12686;
                    break;
                }
            }
        }
        this.f16164 = j;
        this.f16159 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m12688() {
        return this.f16160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m12685(C2460 c2460) {
        int iM7500 = c2460.m7500();
        if (c2460.m7503() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c2460.m7507(0, 9, bArr);
        c2460.m7510(iM7500);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12686(InterfaceC7222 interfaceC7222) {
        byte[] bArr = C17983.f57507;
        C2460 c2460 = this.f16158;
        c2460.getClass();
        c2460.m7508(bArr.length, bArr);
        this.f16162 = true;
        interfaceC7222.mo19217();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12684(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
