package l;

import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.۫᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12617 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42149;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42151;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f42152;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f42156;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42160;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f42161;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42165;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42166;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42167;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f42164 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2460 f42153 = new C2460(new byte[15], 2);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11634 f42150 = new C11634();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2460 f42158 = new C2460();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17555 f42148 = new C17555();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f42163 = SecP160R1Field.PInv;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f42155 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f42168 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42162 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f42159 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public double f42157 = -9.223372036854776E18d;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public double f42154 = -9.223372036854776E18d;

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f42164 = 0;
        this.f42156 = 0;
        this.f42153.m7517(2);
        this.f42166 = 0;
        this.f42167 = 0;
        this.f42163 = SecP160R1Field.PInv;
        this.f42155 = -1;
        this.f42165 = 0;
        this.f42168 = -1L;
        this.f42151 = false;
        this.f42160 = false;
        this.f42159 = true;
        this.f42162 = true;
        this.f42157 = -9.223372036854776E18d;
        this.f42154 = -9.223372036854776E18d;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f42152 = c8074.m21288();
        this.f42161 = interfaceC15690.mo7684(c8074.m21287(), 1);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f42149 = i;
        if (!this.f42162 && (this.f42167 != 0 || !this.f42159)) {
            this.f42160 = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f42160) {
                this.f42154 = j;
            } else {
                this.f42157 = j;
            }
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) throws C22861 {
        int i;
        C2023.m6508(this.f42161);
        while (c2460.m7503() > 0) {
            int i2 = this.f42164;
            int iM29039 = 0;
            if (i2 == 0) {
                int i3 = this.f42149;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (c2460.m7503() > 0) {
                            int i4 = this.f42156 << 8;
                            this.f42156 = i4;
                            int iM7516 = i4 | c2460.m7516();
                            this.f42156 = iM7516;
                            if ((iM7516 & 16777215) == 12583333) {
                                c2460.m7510(c2460.m7500() - 3);
                                this.f42156 = 0;
                            }
                        }
                    }
                    this.f42164 = 1;
                    break;
                }
                c2460.m7510(c2460.m7509());
            } else {
                C2460 c2461 = this.f42158;
                C17555 c17555 = this.f42148;
                if (i2 == 1) {
                    C2460 c2462 = this.f42153;
                    m31400(c2460, c2462, false);
                    if (c2462.m7503() != 0) {
                        this.f42159 = false;
                    } else {
                        int iM7509 = c2462.m7509();
                        byte[] bArrM7518 = c2462.m7518();
                        C11634 c11634 = this.f42150;
                        c11634.m29038(iM7509, bArrM7518);
                        boolean zM28148 = C11206.m28148(c11634, c17555);
                        if (zM28148) {
                            this.f42166 = 0;
                            this.f42167 = c17555.f55789 + iM7509 + this.f42167;
                        }
                        if (zM28148) {
                            c2462.m7510(0);
                            this.f42161.mo8112(c2462.m7509(), c2462);
                            c2462.m7517(2);
                            c2461.m7517(c17555.f55789);
                            this.f42159 = true;
                            this.f42164 = 2;
                        } else if (c2462.m7509() < 15) {
                            c2462.m7501(c2462.m7509() + 1);
                            this.f42159 = false;
                        }
                    }
                } else if (i2 == 2) {
                    int i5 = c17555.f55788;
                    if (i5 == 1 || i5 == 17) {
                        m31400(c2460, c2461, true);
                    }
                    int iMin = Math.min(c2460.m7503(), c17555.f55789 - this.f42166);
                    this.f42161.mo8112(iMin, c2460);
                    int i6 = this.f42166 + iMin;
                    this.f42166 = i6;
                    if (i6 == c17555.f55789) {
                        int i7 = c17555.f55788;
                        if (i7 == 1) {
                            byte[] bArrM7519 = c2461.m7518();
                            C6266 c6266M28147 = C11206.m28147(new C11634(bArrM7519, bArrM7519.length));
                            this.f42163 = c6266M28147.f21243;
                            this.f42155 = c6266M28147.f21241;
                            long j = this.f42168;
                            long j2 = c17555.f55787;
                            if (j != j2) {
                                this.f42168 = j2;
                                int i8 = c6266M28147.f21244;
                                String strConcat = i8 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i8))) : "mhm1";
                                byte[] bArr = c6266M28147.f21242;
                                AbstractC22433 abstractC22433Of = (bArr == null || bArr.length <= 0) ? null : AbstractC22433.of((Object) C17983.f57507, (Object) bArr);
                                C10471 c10471 = new C10471();
                                c10471.m26516(this.f42152);
                                c10471.m26521("video/mp2t");
                                c10471.m26533("audio/mhm1");
                                c10471.m26511(this.f42163);
                                c10471.m26502(strConcat);
                                c10471.m26503((List) abstractC22433Of);
                                this.f42161.mo8116(c10471.m26497());
                            }
                            this.f42151 = true;
                        } else if (i7 == 17) {
                            byte[] bArrM75110 = c2461.m7518();
                            C11634 c11635 = new C11634(bArrM75110, bArrM75110.length);
                            if (c11635.m29035()) {
                                c11635.m29034(2);
                                iM29039 = c11635.m29039(13);
                            }
                            this.f42165 = iM29039;
                        } else if (i7 == 2) {
                            if (this.f42151) {
                                this.f42162 = false;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            double d = (((double) (this.f42155 - this.f42165)) * 1000000.0d) / ((double) this.f42163);
                            long jRound = Math.round(this.f42157);
                            if (this.f42160) {
                                this.f42160 = false;
                                this.f42157 = this.f42154;
                            } else {
                                this.f42157 += d;
                            }
                            this.f42161.mo8114(jRound, i, this.f42167, 0, null);
                            this.f42151 = false;
                            this.f42165 = 0;
                            this.f42167 = 0;
                        }
                        this.f42164 = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31400(C2460 c2460, C2460 c2461, boolean z) {
        int iM7500 = c2460.m7500();
        int iMin = Math.min(c2460.m7503(), c2461.m7503());
        c2460.m7507(c2461.m7500(), iMin, c2461.m7518());
        c2461.m7535(iMin);
        if (z) {
            c2460.m7510(iM7500);
        }
    }
}
