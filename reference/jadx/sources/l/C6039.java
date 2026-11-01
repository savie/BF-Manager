package l;

/* JADX INFO: renamed from: l.ۛۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6039 implements InterfaceC6806, InterfaceC3983 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f20506;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC3983 f20507;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6806 f20508;

    @Override // l.InterfaceC8156
    /* JADX INFO: renamed from: ۙ */
    public final void mo2532(InterfaceC19445 interfaceC19445) {
        InterfaceC3983 interfaceC3983 = this.f20507;
        interfaceC3983.getClass();
        interfaceC3983.mo2532((InterfaceC19445) this);
    }

    public C6039(InterfaceC6806 interfaceC6806, long j) {
        this.f20508 = interfaceC6806;
        this.f20506 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6806 m16378() {
        return this.f20508;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7689(InterfaceC3983 interfaceC3983, long j) {
        this.f20507 = interfaceC3983;
        this.f20508.mo7689(this, j - this.f20506);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۚ */
    public final void mo7692() {
        this.f20508.mo7692();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ֨ */
    public final C23679 mo7675() {
        return this.f20508.mo7675();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7682(InterfaceC6558[] interfaceC6558Arr, boolean[] zArr, InterfaceC18739[] interfaceC18739Arr, boolean[] zArr2, long j) {
        InterfaceC18739[] interfaceC18739Arr2 = new InterfaceC18739[interfaceC18739Arr.length];
        int i = 0;
        while (true) {
            InterfaceC18739 interfaceC18739M40290 = null;
            if (i >= interfaceC18739Arr.length) {
                break;
            }
            C17328 c17328 = (C17328) interfaceC18739Arr[i];
            if (c17328 != null) {
                interfaceC18739M40290 = c17328.m40290();
            }
            interfaceC18739Arr2[i] = interfaceC18739M40290;
            i++;
        }
        InterfaceC6806 interfaceC6806 = this.f20508;
        long j2 = this.f20506;
        long jMo7682 = interfaceC6806.mo7682(interfaceC6558Arr, zArr, interfaceC18739Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC18739Arr.length; i2++) {
            InterfaceC18739 interfaceC18739 = interfaceC18739Arr2[i2];
            if (interfaceC18739 == null) {
                interfaceC18739Arr[i2] = null;
            } else {
                InterfaceC18739 interfaceC187310 = interfaceC18739Arr[i2];
                if (interfaceC187310 == null || ((C17328) interfaceC187310).m40290() != interfaceC18739) {
                    interfaceC18739Arr[i2] = new C17328(interfaceC18739, j2);
                }
            }
        }
        return jMo7682 + j2;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7685(long j, boolean z) {
        this.f20508.mo7685(j - this.f20506, z);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۨ */
    public final long mo7694() {
        long jMo7694 = this.f20508.mo7694();
        if (jMo7694 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo7694 + this.f20506;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7680(long j) {
        long j2 = this.f20506;
        return this.f20508.mo7680(j - j2) + j2;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7681(long j, C6901 c6901) {
        long j2 = this.f20506;
        return this.f20508.mo7681(j - j2, c6901) + j2;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬ */
    public final long mo1391() {
        long jMo1391 = this.f20508.mo1391();
        if (jMo1391 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo1391 + this.f20506;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final long mo1392() {
        long jMo1392 = this.f20508.mo1392();
        if (jMo1392 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo1392 + this.f20506;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1390(C14643 c14643) {
        C23815 c23815M35155 = c14643.m35155();
        c23815M35155.m52494(c14643.f47886 - this.f20506);
        return this.f20508.mo1390(c23815M35155.m52491());
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1389() {
        return this.f20508.mo1389();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final void mo1393(long j) {
        this.f20508.mo1393(j - this.f20506);
    }

    @Override // l.InterfaceC3983
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(InterfaceC6806 interfaceC6806) {
        InterfaceC3983 interfaceC3983 = this.f20507;
        interfaceC3983.getClass();
        interfaceC3983.mo2529((InterfaceC6806) this);
    }
}
