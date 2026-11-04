package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8O5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7853 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C9343 f26150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0395 f26151;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f26152;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f26153;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f26155;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f26157;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f26158;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f26160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f26161;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f26163;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21287 f26149 = new C21287(4);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21287 f26162 = new C21287(9);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21287 f26159 = new C21287(11);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21287 f26164 = new C21287();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19040 f26156 = new C19040();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f26154 = 1;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) throws EOFException, InterruptedIOException {
        C21287 c21287 = this.f26149;
        C9169 c9169 = (C9169) interfaceC19502;
        c9169.mo10078(false, 0, 3, c21287.m48497());
        c21287.m48510(0);
        if (c21287.m48501() == 4607062) {
            c9169.mo10078(false, 0, 2, c21287.m48497());
            c21287.m48510(0);
            if ((c21287.m48494() & 250) == 0) {
                c9169.mo10078(false, 0, 4, c21287.m48497());
                c21287.m48510(0);
                int iM48500 = c21287.m48500();
                c9169.mo10076();
                c9169.mo10077(iM48500, false);
                c9169.mo10078(false, 0, 4, c21287.m48497());
                c21287.m48510(0);
                if (c21287.m48500() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f26153 = interfaceC12789;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        if (j == 0) {
            this.f26154 = 1;
            this.f26155 = false;
        } else {
            this.f26154 = 3;
        }
        this.f26161 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0005 A[SYNTHETIC] */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        long j;
        boolean zM2204;
        boolean z;
        long j2;
        C20782.m47566(this.f26153);
        while (true) {
            int i = this.f26154;
            if (i == 1) {
                C21287 c21287 = this.f26162;
                if (!interfaceC19502.mo10071(true, 0, 9, c21287.m48497())) {
                    return -1;
                }
                c21287.m48510(0);
                c21287.m48503(4);
                int iM48493 = c21287.m48493();
                boolean z2 = (iM48493 & 4) != 0;
                boolean z3 = (iM48493 & 1) != 0;
                if (z2 && this.f26151 == null) {
                    this.f26151 = new C0395(this.f26153.mo16658(8, 1));
                }
                if (z3 && this.f26150 == null) {
                    this.f26150 = new C9343(this.f26153.mo16658(9, 2));
                }
                this.f26153.mo16661();
                this.f26161 = c21287.m48500() - 5;
                this.f26154 = 2;
            } else if (i == 2) {
                interfaceC19502.mo10073(this.f26161);
                this.f26161 = 0;
                this.f26154 = 3;
            } else if (i == 3) {
                C21287 c21288 = this.f26159;
                if (!interfaceC19502.mo10071(true, 0, 11, c21288.m48497())) {
                    return -1;
                }
                c21288.m48510(0);
                this.f26163 = c21288.m48493();
                this.f26158 = c21288.m48501();
                this.f26157 = c21288.m48501();
                this.f26157 = (((long) (c21288.m48493() << 24)) | this.f26157) * 1000;
                c21288.m48503(3);
                this.f26154 = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z4 = this.f26155;
                C19040 c19040 = this.f26156;
                if (z4) {
                    j = this.f26160 + this.f26157;
                } else {
                    j = c19040.m44138() == -9223372036854775807L ? 0L : this.f26157;
                }
                int i2 = this.f26163;
                if (i2 != 8 || this.f26151 == null) {
                    if (i2 != 9 || this.f26150 == null) {
                        if (i2 == 18 && !this.f26152) {
                            C21287 c21287M21374 = m21374(interfaceC19502);
                            c19040.getClass();
                            c19040.m44139(j, c21287M21374);
                            long jM44138 = c19040.m44138();
                            if (jM44138 != -9223372036854775807L) {
                                this.f26153.mo16659(new C20994(jM44138, c19040.m44141(), c19040.m44140()));
                                this.f26152 = true;
                            }
                        } else {
                            interfaceC19502.mo10073(this.f26158);
                            zM2204 = false;
                            z = false;
                        }
                        if (!this.f26155 && zM2204) {
                            this.f26155 = true;
                            if (c19040.m44138() == -9223372036854775807L) {
                                j2 = -this.f26157;
                            } else {
                                j2 = 0;
                            }
                            this.f26160 = j2;
                        }
                        this.f26161 = 4;
                        this.f26154 = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        if (!this.f26152) {
                            this.f26153.mo16659(new C0857(-9223372036854775807L));
                            this.f26152 = true;
                        }
                        C9343 c9343 = this.f26150;
                        C21287 c21287M21375 = m21374(interfaceC19502);
                        if (c9343.m24628(c21287M21375) && c9343.m24627(j, c21287M21375)) {
                            zM2204 = true;
                        }
                    }
                    zM2204 = false;
                } else {
                    if (!this.f26152) {
                        this.f26153.mo16659(new C0857(-9223372036854775807L));
                        this.f26152 = true;
                    }
                    C0395 c0395 = this.f26151;
                    C21287 c21287M21376 = m21374(interfaceC19502);
                    c0395.m2205(c21287M21376);
                    zM2204 = c0395.m2204(j, c21287M21376);
                }
                z = true;
                if (!this.f26155) {
                    this.f26155 = true;
                    if (c19040.m44138() == -9223372036854775807L) {
                        j2 = -this.f26157;
                    } else {
                        j2 = 0;
                    }
                    this.f26160 = j2;
                }
                this.f26161 = 4;
                this.f26154 = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C21287 m21374(InterfaceC19502 interfaceC19502) {
        int i = this.f26158;
        C21287 c21287 = this.f26164;
        if (i > c21287.m48513()) {
            c21287.m48491(0, new byte[Math.max(c21287.m48513() * 2, this.f26158)]);
        } else {
            c21287.m48510(0);
        }
        c21287.m48517(this.f26158);
        interfaceC19502.readFully(c21287.m48497(), 0, this.f26158);
        return c21287;
    }
}
