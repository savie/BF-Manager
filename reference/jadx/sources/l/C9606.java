package l;

/* JADX INFO: renamed from: l.ۡ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9606 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f31081;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f31084;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f31086;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1150 f31080 = new C1150(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f31085 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f31083 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f31079 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21287 f31082 = new C21287();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m25089() {
        return this.f31081;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25087(InterfaceC19502 interfaceC19502, C18756 c18756, int i) {
        if (i <= 0) {
            m25086(interfaceC19502);
            return 0;
        }
        boolean z = this.f31084;
        C21287 c21287 = this.f31082;
        long j = -9223372036854775807L;
        if (z) {
            if (this.f31083 == -9223372036854775807L) {
                m25086(interfaceC19502);
                return 0;
            }
            if (this.f31086) {
                long j2 = this.f31085;
                if (j2 == -9223372036854775807L) {
                    m25086(interfaceC19502);
                    return 0;
                }
                C1150 c1150 = this.f31080;
                this.f31079 = c1150.m4247(this.f31083) - c1150.m4249(j2);
                m25086(interfaceC19502);
                return 0;
            }
            int iMin = (int) Math.min(112800, interfaceC19502.getLength());
            long j3 = 0;
            if (interfaceC19502.getPosition() != j3) {
                c18756.f60914 = j3;
                return 1;
            }
            c21287.m48496(iMin);
            interfaceC19502.mo10076();
            interfaceC19502.mo10069(0, iMin, c21287.m48497());
            int iM48509 = c21287.m48509();
            for (int iM48516 = c21287.m48516(); iM48516 < iM48509; iM48516++) {
                if (c21287.m48497()[iM48516] == 71) {
                    long jM20682 = C7569.m20682(c21287, iM48516, i);
                    if (jM20682 != -9223372036854775807L) {
                        j = jM20682;
                        break;
                    }
                }
            }
            this.f31085 = j;
            this.f31086 = true;
            return 0;
        }
        long length = interfaceC19502.getLength();
        int iMin2 = (int) Math.min(112800, length);
        long j4 = length - ((long) iMin2);
        if (interfaceC19502.getPosition() != j4) {
            c18756.f60914 = j4;
            return 1;
        }
        c21287.m48496(iMin2);
        interfaceC19502.mo10076();
        interfaceC19502.mo10069(0, iMin2, c21287.m48497());
        int iM48517 = c21287.m48516();
        int iM485010 = c21287.m48509();
        for (int i2 = iM485010 - 188; i2 >= iM48517; i2--) {
            byte[] bArrM48497 = c21287.m48497();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iM48517 && i5 < iM485010 && bArrM48497[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jM20683 = C7569.m20682(c21287, i2, i);
                        if (jM20683 == -9223372036854775807L) {
                            break;
                        }
                        j = jM20683;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.f31083 = j;
        this.f31084 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m25088() {
        return this.f31079;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1150 m25090() {
        return this.f31080;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25086(InterfaceC19502 interfaceC19502) {
        byte[] bArr = C7116.f23453;
        C21287 c21287 = this.f31082;
        c21287.getClass();
        c21287.m48491(bArr.length, bArr);
        this.f31081 = true;
        interfaceC19502.mo10076();
    }
}
