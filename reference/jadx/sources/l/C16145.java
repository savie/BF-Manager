package l;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ܺ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16145 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22185 f52162;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f52163;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f52166;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21083 f52167;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52168;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f52171;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean[] f52172 = new boolean[3];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23906 f52170 = new C23906(32);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23906 f52173 = new C23906(33);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23906 f52164 = new C23906(34);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23906 f52160 = new C23906(39);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23906 f52169 = new C23906(40);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f52161 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2460 f52165 = new C2460();

    public C16145(C22185 c22185) {
        this.f52162 = c22185;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f52171 = 0L;
        this.f52161 = -9223372036854775807L;
        C11551.m28855(this.f52172);
        this.f52170.m52733();
        this.f52173.m52733();
        this.f52164.m52733();
        this.f52160.m52733();
        this.f52169.m52733();
        this.f52162.m49210();
        C21083 c21083 = this.f52167;
        if (c21083 != null) {
            c21083.m47493();
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f52163 = c8074.m21288();
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 2);
        this.f52166 = interfaceC8011Mo7684;
        this.f52167 = new C21083(interfaceC8011Mo7684);
        this.f52162.m49213(interfaceC15690, c8074);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f52161 = j;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m38218(int i, int i2, long j, long j2) {
        this.f52167.m47494(i, i2, j, j2, this.f52168);
        if (!this.f52168) {
            this.f52170.m52734(i2);
            this.f52173.m52734(i2);
            this.f52164.m52734(i2);
        }
        this.f52160.m52734(i2);
        this.f52169.m52734(i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38217(int i, int i2, byte[] bArr) {
        this.f52167.m47495(i, i2, bArr);
        if (!this.f52168) {
            this.f52170.m52730(i, i2, bArr);
            this.f52173.m52730(i, i2, bArr);
            this.f52164.m52730(i, i2, bArr);
        }
        this.f52160.m52730(i, i2, bArr);
        this.f52169.m52730(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38216(int i, int i2, long j, long j2) {
        this.f52167.m47496(j, i, this.f52168);
        boolean z = this.f52168;
        C22185 c22185 = this.f52162;
        if (!z) {
            C23906 c23906 = this.f52170;
            c23906.m52732(i2);
            C23906 c23907 = this.f52173;
            c23907.m52732(i2);
            C23906 c23908 = this.f52164;
            c23908.m52732(i2);
            if (c23906.m52731() && c23907.m52731() && c23908.m52731()) {
                String str = this.f52163;
                int i3 = c23906.f77457;
                byte[] bArr = new byte[c23907.f77457 + i3 + c23908.f77457];
                System.arraycopy(c23906.f77460, 0, bArr, 0, i3);
                System.arraycopy(c23907.f77460, 0, bArr, c23906.f77457, c23907.f77457);
                System.arraycopy(c23908.f77460, 0, bArr, c23906.f77457 + c23907.f77457, c23908.f77457);
                String strM7350 = null;
                C14457 c14457M28852 = C11551.m28852(c23907.f77460, 3, c23907.f77457, (C3166) null);
                C12340 c12340 = c14457M28852.f47417;
                if (c12340 != null) {
                    strM7350 = C2419.m7350(c12340.f41238, c12340.f41236, c12340.f41239, c12340.f41237, c12340.f41241, c12340.f41240);
                }
                C10471 c10471 = new C10471();
                c10471.m26516(str);
                c10471.m26521("video/mp2t");
                c10471.m26533("video/hevc");
                c10471.m26502(strM7350);
                c10471.m26525(c14457M28852.f47418);
                c10471.m26534(c14457M28852.f47415);
                c10471.m26517(c14457M28852.f47408);
                c10471.m26493(c14457M28852.f47419);
                C13293 c13293 = new C13293();
                c13293.m32777(c14457M28852.f47409);
                c13293.m32778(c14457M28852.f47414);
                c13293.m32772(c14457M28852.f47412);
                c13293.m32776(c14457M28852.f47416 + 8);
                c13293.m32774(c14457M28852.f47411 + 8);
                c10471.m26505(c13293.m32773());
                c10471.m26519(c14457M28852.f47420);
                c10471.m26526(c14457M28852.f47410);
                c10471.m26527(c14457M28852.f47413 + 1);
                c10471.m26503(Collections.singletonList(bArr));
                C7648 c7648M26497 = c10471.m26497();
                int i4 = c7648M26497.f25270;
                this.f52166.mo8116(c7648M26497);
                C18304.m42523(i4 != -1);
                c22185.m49211(i4);
                this.f52168 = true;
            }
        }
        C23906 c23909 = this.f52160;
        boolean zM52732 = c23909.m52732(i2);
        C2460 c2460 = this.f52165;
        if (zM52732) {
            c2460.m7508(C11551.m28848(c23909.f77457, c23909.f77460), c23909.f77460);
            c2460.m7535(5);
            c22185.m49212(j2, c2460);
        }
        C23906 c239010 = this.f52169;
        if (c239010.m52732(i2)) {
            c2460.m7508(C11551.m28848(c239010.f77457, c239010.f77460), c239010.f77460);
            c2460.m7535(5);
            c22185.m49212(j2, c2460);
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        int i;
        int i2;
        C2023.m6508(this.f52166);
        String str = C17983.f57504;
        while (c2460.m7503() > 0) {
            int iM7500 = c2460.m7500();
            int iM7509 = c2460.m7509();
            byte[] bArrM7518 = c2460.m7518();
            this.f52171 += (long) c2460.m7503();
            this.f52166.mo8112(c2460.m7503(), c2460);
            while (iM7500 < iM7509) {
                int iM28847 = C11551.m28847(iM7500, iM7509, bArrM7518, this.f52172);
                if (iM28847 == iM7509) {
                    m38217(iM7500, iM7509, bArrM7518);
                    return;
                }
                int i3 = (bArrM7518[iM28847 + 3] & 126) >> 1;
                if (iM28847 <= 0 || bArrM7518[iM28847 - 1] != 0) {
                    i = iM28847;
                    i2 = 3;
                } else {
                    i = iM28847 - 1;
                    i2 = 4;
                }
                int i4 = i - iM7500;
                if (i4 > 0) {
                    m38217(iM7500, i, bArrM7518);
                }
                int i5 = iM7509 - i;
                long j = this.f52171 - ((long) i5);
                m38216(i5, i4 < 0 ? -i4 : 0, j, this.f52161);
                m38218(i5, i3, j, this.f52161);
                iM7500 = i + i2;
            }
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
        C2023.m6508(this.f52166);
        String str = C17983.f57504;
        if (z) {
            this.f52162.m49214();
            m38216(0, 0, this.f52171, this.f52161);
            m38218(0, 48, this.f52171, this.f52161);
        }
    }
}
