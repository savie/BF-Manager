package l;

/* JADX INFO: renamed from: l.۬۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13870 implements InterfaceC9147, InterfaceC0945 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC9147 f43993;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f43994;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f43995;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC0945 f43996;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f43997;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7159[] f43998 = new C7159[0];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10639 f43999;

    @Override // l.InterfaceC22002
    /* JADX INFO: renamed from: ۙ */
    public final void mo7501(InterfaceC10813 interfaceC10813) {
        InterfaceC0945 interfaceC0945 = this.f43996;
        interfaceC0945.getClass();
        interfaceC0945.mo7501((InterfaceC10813) this);
    }

    public C13870(InterfaceC9147 interfaceC9147, boolean z, long j, long j2) {
        this.f43993 = interfaceC9147;
        this.f43994 = z ? j : -9223372036854775807L;
        this.f43995 = j;
        this.f43997 = j2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33811(long j) {
        this.f43995 = 0L;
        this.f43997 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33810(C10639 c10639) {
        this.f43999 = c10639;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6409(InterfaceC0945 interfaceC0945, long j) {
        this.f43996 = interfaceC0945;
        this.f43993.mo6409(this, j);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6412() throws C10639 {
        C10639 c10639 = this.f43999;
        if (c10639 != null) {
            throw c10639;
        }
        this.f43993.mo6412();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۫ */
    public final C3356 mo6411() {
        return this.f43993.mo6411();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6403(InterfaceC1470[] interfaceC1470Arr, boolean[] zArr, InterfaceC4848[] interfaceC4848Arr, boolean[] zArr2, long j) {
        long j2;
        this.f43998 = new C7159[interfaceC4848Arr.length];
        InterfaceC4848[] interfaceC4848Arr2 = new InterfaceC4848[interfaceC4848Arr.length];
        for (int i = 0; i < interfaceC4848Arr.length; i++) {
            C7159[] c7159Arr = this.f43998;
            C7159 c7159 = (C7159) interfaceC4848Arr[i];
            c7159Arr[i] = c7159;
            interfaceC4848Arr2[i] = c7159 != null ? c7159.f23664 : null;
        }
        long jMo6403 = this.f43993.mo6403(interfaceC1470Arr, zArr, interfaceC4848Arr2, zArr2, j);
        long j3 = this.f43997;
        long jMax = Math.max(jMo6403, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (m33812()) {
            if (jMo6403 >= j) {
                if (jMo6403 != 0) {
                    int length = interfaceC1470Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            InterfaceC1470 interfaceC1470 = interfaceC1470Arr[i2];
                            if (interfaceC1470 != null) {
                                C15648 c15648Mo5254 = interfaceC1470.mo5254();
                                if (!C9681.m25253(c15648Mo5254.f50848, c15648Mo5254.f50836)) {
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
        this.f43994 = j2;
        for (int i3 = 0; i3 < interfaceC4848Arr.length; i3++) {
            InterfaceC4848 interfaceC4848 = interfaceC4848Arr2[i3];
            if (interfaceC4848 == null) {
                this.f43998[i3] = null;
            } else {
                C7159[] c7159Arr2 = this.f43998;
                C7159 c71510 = c7159Arr2[i3];
                if (c71510 == null || c71510.f23664 != interfaceC4848) {
                    c7159Arr2[i3] = new C7159(this, interfaceC4848);
                }
            }
            interfaceC4848Arr[i3] = this.f43998[i3];
        }
        return jMax;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6405(long j, boolean z) {
        this.f43993.mo6405(j, z);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6054(long j) {
        this.f43993.mo6054(j);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۤ */
    public final long mo6410() {
        if (m33812()) {
            long j = this.f43994;
            this.f43994 = -9223372036854775807L;
            long jMo6410 = mo6410();
            return jMo6410 != -9223372036854775807L ? jMo6410 : j;
        }
        long jMo6411 = this.f43993.mo6410();
        if (jMo6411 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f43995;
        long j3 = this.f43997;
        long jMax = Math.max(jMo6411, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۚ */
    public final long mo6052() {
        long jMo6052 = this.f43993.mo6052();
        if (jMo6052 != Long.MIN_VALUE) {
            long j = this.f43997;
            if (j == Long.MIN_VALUE || jMo6052 < j) {
                return jMo6052;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6401(long j) {
        this.f43994 = -9223372036854775807L;
        for (C7159 c7159 : this.f43998) {
            if (c7159 != null) {
                c7159.m19734();
            }
        }
        long jMo6401 = this.f43993.mo6401(j);
        long j2 = this.f43995;
        long j3 = this.f43997;
        long jMax = Math.max(jMo6401, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6402(long j, C9221 c9221) {
        long j2 = this.f43995;
        if (j == j2) {
            return j2;
        }
        long jM19476 = C7116.m19476(c9221.f30044, 0L, j - j2);
        long j3 = c9221.f30043;
        long j4 = this.f43997;
        long jM19477 = C7116.m19476(j3, 0L, j4 == Long.MIN_VALUE ? C25227.FOREVER_NS : j4 - j);
        if (jM19476 != c9221.f30044 || jM19477 != c9221.f30043) {
            c9221 = new C9221(jM19476, jM19477);
        }
        return this.f43993.mo6402(j, c9221);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final long mo6053() {
        long jMo6053 = this.f43993.mo6053();
        if (jMo6053 != Long.MIN_VALUE) {
            long j = this.f43997;
            if (j == Long.MIN_VALUE || jMo6053 < j) {
                return jMo6053;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6051(C20191 c20191) {
        return this.f43993.mo6051(c20191);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6050() {
        return this.f43993.mo6050();
    }

    @Override // l.InterfaceC0945
    /* JADX INFO: renamed from: ۙ */
    public final void mo3768(InterfaceC9147 interfaceC9147) {
        if (this.f43999 != null) {
            return;
        }
        InterfaceC0945 interfaceC0945 = this.f43996;
        interfaceC0945.getClass();
        interfaceC0945.mo3768((InterfaceC9147) this);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m33812() {
        return this.f43994 != -9223372036854775807L;
    }
}
