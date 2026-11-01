package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8U5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2572 implements InterfaceC6806, InterfaceC3983 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15274 f10136;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f10137 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f10138;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC18095 f10139;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15732 f10140;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC6806 f10141;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10142;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC3983 f10143;

    @Override // l.InterfaceC8156
    /* JADX INFO: renamed from: ۙ */
    public final void mo2532(InterfaceC19445 interfaceC19445) {
        InterfaceC3983 interfaceC3983 = this.f10143;
        String str = C17983.f57504;
        interfaceC3983.mo2532((InterfaceC19445) this);
    }

    public C2572(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        this.f10136 = c15274;
        this.f10140 = interfaceC15732;
        this.f10138 = j;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m8027() {
        return this.f10138;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m8026(long j) {
        this.f10137 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m8022() {
        return this.f10137;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8025(InterfaceC18095 interfaceC18095) {
        C2023.m6510(this.f10139 == null);
        this.f10139 = interfaceC18095;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m8023() {
        if (this.f10141 != null) {
            InterfaceC18095 interfaceC18095 = this.f10139;
            interfaceC18095.getClass();
            interfaceC18095.mo4108(this.f10141);
        }
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7689(InterfaceC3983 interfaceC3983, long j) {
        this.f10143 = interfaceC3983;
        InterfaceC6806 interfaceC6806 = this.f10141;
        if (interfaceC6806 != null) {
            long j2 = this.f10137;
            if (j2 == -9223372036854775807L) {
                j2 = this.f10138;
            }
            interfaceC6806.mo7689(this, j2);
        }
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۚ */
    public final void mo7692() throws IOException {
        try {
            InterfaceC6806 interfaceC6806 = this.f10141;
            if (interfaceC6806 != null) {
                interfaceC6806.mo7692();
                return;
            }
            InterfaceC18095 interfaceC18095 = this.f10139;
            if (interfaceC18095 != null) {
                interfaceC18095.mo4111();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ֨ */
    public final C23679 mo7675() {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        return interfaceC6806.mo7675();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7682(InterfaceC6558[] interfaceC6558Arr, boolean[] zArr, InterfaceC18739[] interfaceC18739Arr, boolean[] zArr2, long j) {
        long j2 = this.f10137;
        long j3 = (j2 == -9223372036854775807L || j != this.f10138) ? j : j2;
        this.f10137 = -9223372036854775807L;
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        return interfaceC6806.mo7682(interfaceC6558Arr, zArr, interfaceC18739Arr, zArr2, j3);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7685(long j, boolean z) {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        interfaceC6806.mo7685(j, z);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۨ */
    public final long mo7694() {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        return interfaceC6806.mo7694();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬ */
    public final long mo1391() {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        return interfaceC6806.mo1391();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7680(long j) {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        return interfaceC6806.mo7680(j);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7681(long j, C6901 c6901) {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        return interfaceC6806.mo7681(j, c6901);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final long mo1392() {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        return interfaceC6806.mo1392();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final void mo1393(long j) {
        InterfaceC6806 interfaceC6806 = this.f10141;
        String str = C17983.f57504;
        interfaceC6806.mo1393(j);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1390(C14643 c14643) {
        InterfaceC6806 interfaceC6806 = this.f10141;
        return interfaceC6806 != null && interfaceC6806.mo1390(c14643);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1389() {
        InterfaceC6806 interfaceC6806 = this.f10141;
        return interfaceC6806 != null && interfaceC6806.mo1389();
    }

    @Override // l.InterfaceC3983
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(InterfaceC6806 interfaceC6806) {
        InterfaceC3983 interfaceC3983 = this.f10143;
        String str = C17983.f57504;
        interfaceC3983.mo2529((InterfaceC6806) this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8024(C15274 c15274) {
        long j = this.f10137;
        if (j == -9223372036854775807L) {
            j = this.f10138;
        }
        InterfaceC18095 interfaceC18095 = this.f10139;
        interfaceC18095.getClass();
        InterfaceC6806 interfaceC6806Mo4105 = interfaceC18095.mo4105(c15274, this.f10140, j);
        this.f10141 = interfaceC6806Mo4105;
        if (this.f10143 != null) {
            interfaceC6806Mo4105.mo7689(this, j);
        }
    }
}
