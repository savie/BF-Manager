package l;

/* JADX INFO: renamed from: l.ۘۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3839 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f14316;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f14318;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f14319;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6694 f14320 = new C6694(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f14321 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f14322 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f14317 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2460 f14315 = new C2460();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m11165() {
        return this.f14319;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11163(InterfaceC7222 interfaceC7222, C0954 c0954, int i) {
        if (i <= 0) {
            m11162(interfaceC7222);
            return 0;
        }
        boolean z = this.f14318;
        C2460 c2460 = this.f14315;
        long j = -9223372036854775807L;
        if (z) {
            if (this.f14322 == -9223372036854775807L) {
                m11162(interfaceC7222);
                return 0;
            }
            if (this.f14316) {
                long j2 = this.f14321;
                if (j2 == -9223372036854775807L) {
                    m11162(interfaceC7222);
                    return 0;
                }
                C6694 c6694 = this.f14320;
                this.f14317 = c6694.m18075(this.f14322) - c6694.m18077(j2);
                m11162(interfaceC7222);
                return 0;
            }
            int iMin = (int) Math.min(112800, interfaceC7222.getLength());
            long j3 = 0;
            if (interfaceC7222.getPosition() != j3) {
                c0954.f3770 = j3;
                return 1;
            }
            c2460.m7517(iMin);
            interfaceC7222.mo19217();
            interfaceC7222.mo19210(0, iMin, c2460.m7518());
            int iM7509 = c2460.m7509();
            for (int iM7500 = c2460.m7500(); iM7500 < iM7509; iM7500++) {
                if (c2460.m7518()[iM7500] == 71) {
                    long jM35078 = C14611.m35078(c2460, iM7500, i);
                    if (jM35078 != -9223372036854775807L) {
                        j = jM35078;
                        break;
                    }
                }
            }
            this.f14321 = j;
            this.f14316 = true;
            return 0;
        }
        long length = interfaceC7222.getLength();
        int iMin2 = (int) Math.min(112800, length);
        long j4 = length - ((long) iMin2);
        if (interfaceC7222.getPosition() != j4) {
            c0954.f3770 = j4;
            return 1;
        }
        c2460.m7517(iMin2);
        interfaceC7222.mo19217();
        interfaceC7222.mo19210(0, iMin2, c2460.m7518());
        int iM7501 = c2460.m7500();
        int iM75010 = c2460.m7509();
        for (int i2 = iM75010 - 188; i2 >= iM7501; i2--) {
            byte[] bArrM7518 = c2460.m7518();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iM7501 && i5 < iM75010 && bArrM7518[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jM35079 = C14611.m35078(c2460, i2, i);
                        if (jM35079 == -9223372036854775807L) {
                            break;
                        }
                        j = jM35079;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.f14322 = j;
        this.f14318 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m11164() {
        return this.f14317;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6694 m11166() {
        return this.f14320;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11162(InterfaceC7222 interfaceC7222) {
        byte[] bArr = C17983.f57507;
        C2460 c2460 = this.f14315;
        c2460.getClass();
        c2460.m7508(bArr.length, bArr);
        this.f14319 = true;
        interfaceC7222.mo19217();
    }
}
