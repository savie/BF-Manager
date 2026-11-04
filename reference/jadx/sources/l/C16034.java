package l;

/* JADX INFO: renamed from: l.ܶۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16034 implements InterfaceC9147, InterfaceC0945 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC0945 f52017;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f52018;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC9147 f52019;

    @Override // l.InterfaceC22002
    /* JADX INFO: renamed from: ۙ */
    public final void mo7501(InterfaceC10813 interfaceC10813) {
        InterfaceC0945 interfaceC0945 = this.f52017;
        interfaceC0945.getClass();
        interfaceC0945.mo7501((InterfaceC10813) this);
    }

    public C16034(InterfaceC9147 interfaceC9147, long j) {
        this.f52019 = interfaceC9147;
        this.f52018 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9147 m38194() {
        return this.f52019;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6409(InterfaceC0945 interfaceC0945, long j) {
        this.f52017 = interfaceC0945;
        this.f52019.mo6409(this, j - this.f52018);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6412() {
        this.f52019.mo6412();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۫ */
    public final C3356 mo6411() {
        return this.f52019.mo6411();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6403(InterfaceC1470[] interfaceC1470Arr, boolean[] zArr, InterfaceC4848[] interfaceC4848Arr, boolean[] zArr2, long j) {
        InterfaceC4848[] interfaceC4848Arr2 = new InterfaceC4848[interfaceC4848Arr.length];
        int i = 0;
        while (true) {
            InterfaceC4848 interfaceC4848M41143 = null;
            if (i >= interfaceC4848Arr.length) {
                break;
            }
            C17526 c17526 = (C17526) interfaceC4848Arr[i];
            if (c17526 != null) {
                interfaceC4848M41143 = c17526.m41143();
            }
            interfaceC4848Arr2[i] = interfaceC4848M41143;
            i++;
        }
        InterfaceC9147 interfaceC9147 = this.f52019;
        long j2 = this.f52018;
        long jMo6403 = interfaceC9147.mo6403(interfaceC1470Arr, zArr, interfaceC4848Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC4848Arr.length; i2++) {
            InterfaceC4848 interfaceC4848 = interfaceC4848Arr2[i2];
            if (interfaceC4848 == null) {
                interfaceC4848Arr[i2] = null;
            } else {
                InterfaceC4848 interfaceC4849 = interfaceC4848Arr[i2];
                if (interfaceC4849 == null || ((C17526) interfaceC4849).m41143() != interfaceC4848) {
                    interfaceC4848Arr[i2] = new C17526(interfaceC4848, j2);
                }
            }
        }
        return jMo6403 + j2;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6405(long j, boolean z) {
        this.f52019.mo6405(j - this.f52018, z);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۤ */
    public final long mo6410() {
        long jMo6410 = this.f52019.mo6410();
        if (jMo6410 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo6410 + this.f52018;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6401(long j) {
        long j2 = this.f52018;
        return this.f52019.mo6401(j - j2) + j2;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6402(long j, C9221 c9221) {
        long j2 = this.f52018;
        return this.f52019.mo6402(j - j2, c9221) + j2;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۚ */
    public final long mo6052() {
        long jMo6052 = this.f52019.mo6052();
        if (jMo6052 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo6052 + this.f52018;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final long mo6053() {
        long jMo6053 = this.f52019.mo6053();
        if (jMo6053 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo6053 + this.f52018;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6051(C20191 c20191) {
        C3037 c3037M46433 = c20191.m46433();
        c3037M46433.m9876(c20191.f64821 - this.f52018);
        return this.f52019.mo6051(c3037M46433.m9873());
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6050() {
        return this.f52019.mo6050();
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6054(long j) {
        this.f52019.mo6054(j - this.f52018);
    }

    @Override // l.InterfaceC0945
    /* JADX INFO: renamed from: ۙ */
    public final void mo3768(InterfaceC9147 interfaceC9147) {
        InterfaceC0945 interfaceC0945 = this.f52017;
        interfaceC0945.getClass();
        interfaceC0945.mo3768((InterfaceC9147) this);
    }
}
