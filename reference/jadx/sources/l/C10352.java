package l;

/* JADX INFO: renamed from: l.ۢ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88S1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10352 implements InterfaceC18120 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f32970 = new C21287();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1150 f32971;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f32972;

    public C10352(int i, C1150 c1150) {
        this.f32972 = i;
        this.f32971 = c1150;
    }

    @Override // l.InterfaceC18120
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21104 mo26629(InterfaceC19502 interfaceC19502, long j) {
        long j2;
        long position = interfaceC19502.getPosition();
        int iMin = (int) Math.min(112800, interfaceC19502.getLength() - position);
        C21287 c21287 = this.f32970;
        c21287.m48496(iMin);
        interfaceC19502.mo10069(0, iMin, c21287.m48497());
        int iM48509 = c21287.m48509();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (true) {
            if (c21287.m48486() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArrM48497 = c21287.m48497();
            int iM48516 = c21287.m48516();
            while (iM48516 < iM48509 && bArrM48497[iM48516] != 71) {
                iM48516++;
            }
            j2 = -9223372036854775807L;
            int i = iM48516 + 188;
            if (i > iM48509) {
                break;
            }
            long jM20682 = C7569.m20682(c21287, iM48516, this.f32972);
            if (jM20682 != -9223372036854775807L) {
                long jM4249 = this.f32971.m4249(jM20682);
                if (jM4249 > j) {
                    if (j4 == -9223372036854775807L) {
                        return C21104.m48162(jM4249, position);
                    }
                    return C21104.m48161(position + j5);
                }
                if (100000 + jM4249 > j) {
                    return C21104.m48161(position + ((long) iM48516));
                }
                j5 = iM48516;
                j4 = jM4249;
            }
            c21287.m48510(i);
            j3 = i;
        }
        if (j4 != j2) {
            return C21104.m48165(j4, position + j3);
        }
        return C21104.f67396;
    }

    @Override // l.InterfaceC18120
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26630() {
        byte[] bArr = C7116.f23453;
        C21287 c21287 = this.f32970;
        c21287.getClass();
        c21287.m48491(bArr.length, bArr);
    }
}
