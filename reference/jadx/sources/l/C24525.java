package l;

/* JADX INFO: renamed from: l.᩺᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OV */
/* JADX INFO: loaded from: classes.dex */
public final class C24525 implements InterfaceC18120 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f79528 = new C21287();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1150 f79529;

    public C24525(C1150 c1150) {
        this.f79529 = c1150;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // l.InterfaceC18120
    /* JADX INFO: renamed from: ۙ */
    public final C21104 mo26629(InterfaceC19502 interfaceC19502, long j) {
        int iM13997;
        long position = interfaceC19502.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC19502.getLength() - position);
        C21287 c21287 = this.f79528;
        c21287.m48496(iMin);
        interfaceC19502.mo10069(0, iMin, c21287.m48497());
        int iM48516 = -1;
        int iM48517 = -1;
        long j2 = -9223372036854775807L;
        while (c21287.m48486() >= 4) {
            if (C4387.m13997(c21287.m48516(), c21287.m48497()) != 442) {
                c21287.m48503(1);
            } else {
                c21287.m48503(4);
                long jM35745 = C14827.m35745(c21287);
                if (jM35745 != -9223372036854775807L) {
                    long jM4249 = this.f79529.m4249(jM35745);
                    if (jM4249 > j) {
                        if (j2 == -9223372036854775807L) {
                            return C21104.m48162(jM4249, position);
                        }
                        return C21104.m48161(position + ((long) iM48517));
                    }
                    if (100000 + jM4249 > j) {
                        return C21104.m48161(position + ((long) c21287.m48516()));
                    }
                    iM48517 = c21287.m48516();
                    j2 = jM4249;
                }
                int iM48509 = c21287.m48509();
                if (c21287.m48486() < 10) {
                    c21287.m48510(iM48509);
                } else {
                    c21287.m48503(9);
                    int iM48493 = c21287.m48493() & 7;
                    if (c21287.m48486() < iM48493) {
                        c21287.m48510(iM48509);
                    } else {
                        c21287.m48503(iM48493);
                        if (c21287.m48486() < 4) {
                            c21287.m48510(iM48509);
                        } else {
                            if (C4387.m13997(c21287.m48516(), c21287.m48497()) == 443) {
                                c21287.m48503(4);
                                int iM48494 = c21287.m48494();
                                if (c21287.m48486() < iM48494) {
                                    c21287.m48510(iM48509);
                                } else {
                                    c21287.m48503(iM48494);
                                    while (c21287.m48486() >= 4) {
                                        iM13997 = C4387.m13997(c21287.m48516(), c21287.m48497());
                                        if (iM13997 == 442 || iM13997 == 441 || (iM13997 >>> 8) != 1) {
                                            break;
                                        }
                                        c21287.m48503(4);
                                        if (c21287.m48486() < 2) {
                                            c21287.m48510(iM48509);
                                            break;
                                        }
                                        c21287.m48510(Math.min(c21287.m48509(), c21287.m48516() + c21287.m48494()));
                                    }
                                }
                            } else {
                                while (c21287.m48486() >= 4) {
                                    iM13997 = C4387.m13997(c21287.m48516(), c21287.m48497());
                                    if (iM13997 == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                iM48516 = c21287.m48516();
            }
        }
        if (j2 != -9223372036854775807L) {
            return C21104.m48165(j2, position + ((long) iM48516));
        }
        return C21104.f67396;
    }

    @Override // l.InterfaceC18120
    /* JADX INFO: renamed from: ۙ */
    public final void mo26630() {
        byte[] bArr = C7116.f23453;
        C21287 c21287 = this.f79528;
        c21287.getClass();
        c21287.m48491(bArr.length, bArr);
    }
}
