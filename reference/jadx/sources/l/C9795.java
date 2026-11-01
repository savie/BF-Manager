package l;

/* JADX INFO: renamed from: l.ۢ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9795 implements InterfaceC22039 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f33520 = new C2460();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6694 f33521;

    public C9795(C6694 c6694) {
        this.f33521 = c6694;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // l.InterfaceC22039
    /* JADX INFO: renamed from: ۙ */
    public final C5105 mo3846(InterfaceC7222 interfaceC7222, long j) {
        int iM10148;
        long position = interfaceC7222.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC7222.getLength() - position);
        C2460 c2460 = this.f33520;
        c2460.m7517(iMin);
        interfaceC7222.mo19210(0, iMin, c2460.m7518());
        int iM7500 = -1;
        int iM7501 = -1;
        long j2 = -9223372036854775807L;
        while (c2460.m7503() >= 4) {
            if (C3443.m10148(c2460.m7500(), c2460.m7518()) != 442) {
                c2460.m7535(1);
            } else {
                c2460.m7535(4);
                long jM12685 = C4545.m12685(c2460);
                if (jM12685 != -9223372036854775807L) {
                    long jM18077 = this.f33521.m18077(jM12685);
                    if (jM18077 > j) {
                        if (j2 == -9223372036854775807L) {
                            return C5105.m14215(jM18077, position);
                        }
                        return C5105.m14214(position + ((long) iM7501));
                    }
                    if (100000 + jM18077 > j) {
                        return C5105.m14214(position + ((long) c2460.m7500()));
                    }
                    iM7501 = c2460.m7500();
                    j2 = jM18077;
                }
                int iM7509 = c2460.m7509();
                if (c2460.m7503() < 10) {
                    c2460.m7510(iM7509);
                } else {
                    c2460.m7535(9);
                    int iM7516 = c2460.m7516() & 7;
                    if (c2460.m7503() < iM7516) {
                        c2460.m7510(iM7509);
                    } else {
                        c2460.m7535(iM7516);
                        if (c2460.m7503() < 4) {
                            c2460.m7510(iM7509);
                        } else {
                            if (C3443.m10148(c2460.m7500(), c2460.m7518()) == 443) {
                                c2460.m7535(4);
                                int iM7519 = c2460.m7519();
                                if (c2460.m7503() < iM7519) {
                                    c2460.m7510(iM7509);
                                } else {
                                    c2460.m7535(iM7519);
                                    while (c2460.m7503() >= 4) {
                                        iM10148 = C3443.m10148(c2460.m7500(), c2460.m7518());
                                        if (iM10148 == 442 || iM10148 == 441 || (iM10148 >>> 8) != 1) {
                                            break;
                                        }
                                        c2460.m7535(4);
                                        if (c2460.m7503() < 2) {
                                            c2460.m7510(iM7509);
                                            break;
                                        }
                                        c2460.m7510(Math.min(c2460.m7509(), c2460.m7500() + c2460.m7519()));
                                    }
                                }
                            } else {
                                while (c2460.m7503() >= 4) {
                                    iM10148 = C3443.m10148(c2460.m7500(), c2460.m7518());
                                    if (iM10148 == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                iM7500 = c2460.m7500();
            }
        }
        if (j2 != -9223372036854775807L) {
            return C5105.m14218(j2, position + ((long) iM7500));
        }
        return C5105.f17795;
    }

    @Override // l.InterfaceC22039
    /* JADX INFO: renamed from: ۙ */
    public final void mo3847() {
        byte[] bArr = C17983.f57507;
        C2460 c2460 = this.f33520;
        c2460.getClass();
        c2460.m7508(bArr.length, bArr);
    }
}
