package l;

/* JADX INFO: renamed from: l.֨ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88S1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1017 implements InterfaceC22039 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f4705 = new C2460();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6694 f4706;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f4707;

    public C1017(int i, C6694 c6694) {
        this.f4707 = i;
        this.f4706 = c6694;
    }

    @Override // l.InterfaceC22039
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5105 mo3846(InterfaceC7222 interfaceC7222, long j) {
        long j2;
        long position = interfaceC7222.getPosition();
        int iMin = (int) Math.min(112800, interfaceC7222.getLength() - position);
        C2460 c2460 = this.f4705;
        c2460.m7517(iMin);
        interfaceC7222.mo19210(0, iMin, c2460.m7518());
        int iM7509 = c2460.m7509();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (true) {
            if (c2460.m7503() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArrM7518 = c2460.m7518();
            int iM7500 = c2460.m7500();
            while (iM7500 < iM7509 && bArrM7518[iM7500] != 71) {
                iM7500++;
            }
            j2 = -9223372036854775807L;
            int i = iM7500 + 188;
            if (i > iM7509) {
                break;
            }
            long jM35078 = C14611.m35078(c2460, iM7500, this.f4707);
            if (jM35078 != -9223372036854775807L) {
                long jM18077 = this.f4706.m18077(jM35078);
                if (jM18077 > j) {
                    if (j4 == -9223372036854775807L) {
                        return C5105.m14215(jM18077, position);
                    }
                    return C5105.m14214(position + j5);
                }
                if (100000 + jM18077 > j) {
                    return C5105.m14214(position + ((long) iM7500));
                }
                j5 = iM7500;
                j4 = jM18077;
            }
            c2460.m7510(i);
            j3 = i;
        }
        if (j4 != j2) {
            return C5105.m14218(j4, position + j3);
        }
        return C5105.f17795;
    }

    @Override // l.InterfaceC22039
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3847() {
        byte[] bArr = C17983.f57507;
        C2460 c2460 = this.f4705;
        c2460.getClass();
        c2460.m7508(bArr.length, bArr);
    }
}
