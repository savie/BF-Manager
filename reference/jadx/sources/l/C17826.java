package l;

/* JADX INFO: renamed from: l.ᩳۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17826 implements InterfaceC6806, InterfaceC3983 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f56455;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f56456;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f56457;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC3983 f56458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6806 f56459;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21354[] f56460 = new C21354[0];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19238 f56461;

    @Override // l.InterfaceC8156
    /* JADX INFO: renamed from: ۙ */
    public final void mo2532(InterfaceC19445 interfaceC19445) {
        InterfaceC3983 interfaceC3983 = this.f56458;
        interfaceC3983.getClass();
        interfaceC3983.mo2532((InterfaceC19445) this);
    }

    public C17826(InterfaceC6806 interfaceC6806, boolean z, long j, long j2) {
        this.f56459 = interfaceC6806;
        this.f56457 = z ? j : -9223372036854775807L;
        this.f56456 = j;
        this.f56455 = j2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41401(long j) {
        this.f56456 = 0L;
        this.f56455 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41400(C19238 c19238) {
        this.f56461 = c19238;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7689(InterfaceC3983 interfaceC3983, long j) {
        this.f56458 = interfaceC3983;
        this.f56459.mo7689(this, j);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۚ */
    public final void mo7692() throws C19238 {
        C19238 c19238 = this.f56461;
        if (c19238 != null) {
            throw c19238;
        }
        this.f56459.mo7692();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ֨ */
    public final C23679 mo7675() {
        return this.f56459.mo7675();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7682(InterfaceC6558[] interfaceC6558Arr, boolean[] zArr, InterfaceC18739[] interfaceC18739Arr, boolean[] zArr2, long j) {
        long j2;
        this.f56460 = new C21354[interfaceC18739Arr.length];
        InterfaceC18739[] interfaceC18739Arr2 = new InterfaceC18739[interfaceC18739Arr.length];
        for (int i = 0; i < interfaceC18739Arr.length; i++) {
            C21354[] c21354Arr = this.f56460;
            C21354 c21354 = (C21354) interfaceC18739Arr[i];
            c21354Arr[i] = c21354;
            interfaceC18739Arr2[i] = c21354 != null ? c21354.f69472 : null;
        }
        long jMo7682 = this.f56459.mo7682(interfaceC6558Arr, zArr, interfaceC18739Arr2, zArr2, j);
        long j3 = this.f56455;
        long jMax = Math.max(jMo7682, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (m41399()) {
            if (jMo7682 >= j) {
                if (jMo7682 != 0) {
                    int length = interfaceC6558Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            InterfaceC6558 interfaceC6558 = interfaceC6558Arr[i2];
                            if (interfaceC6558 != null) {
                                C7648 c7648Mo17795 = interfaceC6558.mo17795();
                                if (!C6632.m17980(c7648Mo17795.f25265, c7648Mo17795.f25277)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f56457 = j2;
        for (int i3 = 0; i3 < interfaceC18739Arr.length; i3++) {
            InterfaceC18739 interfaceC18739 = interfaceC18739Arr2[i3];
            if (interfaceC18739 == null) {
                this.f56460[i3] = null;
            } else {
                C21354[] c21354Arr2 = this.f56460;
                C21354 c21355 = c21354Arr2[i3];
                if (c21355 == null || c21355.f69472 != interfaceC18739) {
                    c21354Arr2[i3] = new C21354(this, interfaceC18739);
                }
            }
            interfaceC18739Arr[i3] = this.f56460[i3];
        }
        return jMax;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7685(long j, boolean z) {
        this.f56459.mo7685(j, z);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final void mo1393(long j) {
        this.f56459.mo1393(j);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۨ */
    public final long mo7694() {
        if (m41399()) {
            long j = this.f56457;
            this.f56457 = -9223372036854775807L;
            long jMo7694 = mo7694();
            return jMo7694 != -9223372036854775807L ? jMo7694 : j;
        }
        long jMo7695 = this.f56459.mo7694();
        if (jMo7695 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f56456;
        long j3 = this.f56455;
        long jMax = Math.max(jMo7695, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬ */
    public final long mo1391() {
        long jMo1391 = this.f56459.mo1391();
        if (jMo1391 != Long.MIN_VALUE) {
            long j = this.f56455;
            if (j == Long.MIN_VALUE || jMo1391 < j) {
                return jMo1391;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7680(long j) {
        this.f56457 = -9223372036854775807L;
        for (C21354 c21354 : this.f56460) {
            if (c21354 != null) {
                c21354.m47883();
            }
        }
        long jMo7680 = this.f56459.mo7680(j);
        long j2 = this.f56456;
        long j3 = this.f56455;
        long jMax = Math.max(jMo7680, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7681(long j, C6901 c6901) {
        long j2 = this.f56456;
        if (j == j2) {
            return j2;
        }
        long jM41829 = C17983.m41829(c6901.f23231, 0L, j - j2);
        long j3 = c6901.f23230;
        long j4 = this.f56455;
        long jM418210 = C17983.m41829(j3, 0L, j4 == Long.MIN_VALUE ? C17492.FOREVER_NS : j4 - j);
        if (jM41829 != c6901.f23231 || jM418210 != c6901.f23230) {
            c6901 = new C6901(jM41829, jM418210);
        }
        return this.f56459.mo7681(j, c6901);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final long mo1392() {
        long jMo1392 = this.f56459.mo1392();
        if (jMo1392 != Long.MIN_VALUE) {
            long j = this.f56455;
            if (j == Long.MIN_VALUE || jMo1392 < j) {
                return jMo1392;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1390(C14643 c14643) {
        return this.f56459.mo1390(c14643);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1389() {
        return this.f56459.mo1389();
    }

    @Override // l.InterfaceC3983
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(InterfaceC6806 interfaceC6806) {
        if (this.f56461 != null) {
            return;
        }
        InterfaceC3983 interfaceC3983 = this.f56458;
        interfaceC3983.getClass();
        interfaceC3983.mo2529((InterfaceC6806) this);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m41399() {
        return this.f56457 != -9223372036854775807L;
    }
}
