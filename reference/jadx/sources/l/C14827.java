package l;

/* JADX INFO: renamed from: l.ܰ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14827 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f48506;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f48509;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f48511;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1150 f48505 = new C1150(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f48510 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f48508 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f48504 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21287 f48507 = new C21287();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35749() {
        return this.f48506;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1150 m35750() {
        return this.f48505;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35747(InterfaceC19502 interfaceC19502, C18756 c18756) {
        boolean z = this.f48509;
        C21287 c21287 = this.f48507;
        long j = -9223372036854775807L;
        if (!z) {
            long length = interfaceC19502.getLength();
            int iMin = (int) Math.min(20000L, length);
            long j2 = length - ((long) iMin);
            if (interfaceC19502.getPosition() != j2) {
                c18756.f60914 = j2;
                return 1;
            }
            c21287.m48496(iMin);
            interfaceC19502.mo10076();
            interfaceC19502.mo10069(0, iMin, c21287.m48497());
            int iM48516 = c21287.m48516();
            for (int iM48509 = c21287.m48509() - 4; iM48509 >= iM48516; iM48509--) {
                if (m35744(iM48509, c21287.m48497()) == 442) {
                    c21287.m48510(iM48509 + 4);
                    long jM35745 = m35745(c21287);
                    if (jM35745 != -9223372036854775807L) {
                        j = jM35745;
                        break;
                    }
                }
            }
            this.f48508 = j;
            this.f48509 = true;
            return 0;
        }
        if (this.f48508 == -9223372036854775807L) {
            m35746(interfaceC19502);
            return 0;
        }
        if (this.f48511) {
            long j3 = this.f48510;
            if (j3 == -9223372036854775807L) {
                m35746(interfaceC19502);
                return 0;
            }
            C1150 c1150 = this.f48505;
            this.f48504 = c1150.m4247(this.f48508) - c1150.m4249(j3);
            m35746(interfaceC19502);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, interfaceC19502.getLength());
        long j4 = 0;
        if (interfaceC19502.getPosition() != j4) {
            c18756.f60914 = j4;
            return 1;
        }
        c21287.m48496(iMin2);
        interfaceC19502.mo10076();
        interfaceC19502.mo10069(0, iMin2, c21287.m48497());
        int iM485010 = c21287.m48509();
        for (int iM48517 = c21287.m48516(); iM48517 < iM485010 - 3; iM48517++) {
            if (m35744(iM48517, c21287.m48497()) == 442) {
                c21287.m48510(iM48517 + 4);
                long jM35746 = m35745(c21287);
                if (jM35746 != -9223372036854775807L) {
                    j = jM35746;
                    break;
                }
            }
        }
        this.f48510 = j;
        this.f48511 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m35748() {
        return this.f48504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m35745(C21287 c21287) {
        int iM48516 = c21287.m48516();
        if (c21287.m48486() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c21287.m48490(0, 9, bArr);
        c21287.m48510(iM48516);
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
    private void m35746(InterfaceC19502 interfaceC19502) {
        byte[] bArr = C7116.f23453;
        C21287 c21287 = this.f48507;
        c21287.getClass();
        c21287.m48491(bArr.length, bArr);
        this.f48506 = true;
        interfaceC19502.mo10076();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35744(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
