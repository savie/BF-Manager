package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.֨ۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0913 extends AbstractC2324 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final int f3645;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f3646;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f3647;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C1536 f3648;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean f3649;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f3650;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f3651;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f3652;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f3653;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f3654;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f3655;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f3656;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f3657;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int f3658;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f3659;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f3660;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int f3661;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f3662;

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3635(AbstractC2324 abstractC2324) {
        C0913 c0913 = (C0913) abstractC2324;
        if (!this.f3656 && !C13638.equals(this.f8252.f25265, c0913.f8252.f25265)) {
            return false;
        }
        if (this.f3648.f6242) {
            return true;
        }
        return this.f3649 == c0913.f3649 && this.f3657 == c0913.f3657;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:139:0x018e  */
    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:51:0x007c  */
    public C0913(int i, C17216 c17216, int i2, C1536 c1536, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iM31987;
        int i6;
        int i7;
        C7648 c7648;
        int i8;
        int i9;
        int i10;
        C7648 c7649;
        int i11;
        int i12;
        int i13;
        super(i, c17216, i2);
        this.f3648 = c1536;
        boolean z4 = c1536.f6236;
        AbstractC22433 abstractC22433 = c1536.f47186;
        AbstractC22433 abstractC22434 = c1536.f47166;
        int i14 = z4 ? 24 : 16;
        int i15 = 1;
        this.f3656 = c1536.f6251 && (i4 & i14) != 0;
        if (!z || (((i11 = (c7649 = this.f8252).f25246) != -1 && i11 > c1536.f47193) || ((i12 = c7649.f25253) != -1 && i12 > c1536.f47184))) {
            z2 = false;
        } else {
            float f = c7649.f25273;
            if ((f == -1.0f || f <= c1536.f47195) && ((i13 = c7649.f25242) == -1 || i13 <= c1536.f47173)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f3659 = z2;
        if (!z || (((i8 = (c7648 = this.f8252).f25246) != -1 && i8 < c1536.f47190) || ((i9 = c7648.f25253) != -1 && i9 < c1536.f47175))) {
            z3 = false;
        } else {
            float f2 = c7648.f25273;
            if ((f2 == -1.0f || f2 >= c1536.f47189) && ((i10 = c7648.f25242) == -1 || i10 >= c1536.f47188)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f3646 = z3;
        this.f3653 = C13958.m33815(i3, false);
        C7648 c76410 = this.f8252;
        float f3 = c76410.f25273;
        this.f3662 = f3 != -1.0f && f3 >= 10.0f;
        this.f3660 = c76410.f25242;
        int i16 = c76410.f25246;
        this.f3650 = (i16 == -1 || (i7 = c76410.f25253) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= abstractC22434.size()) {
                i17 = Integer.MAX_VALUE;
                iM31987 = 0;
                break;
            } else {
                iM31987 = C12909.m31987(this.f8252, (String) abstractC22434.get(i17), false);
                if (iM31987 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f3658 = i17;
        this.f3655 = iM31987;
        int i18 = this.f8252.f25244;
        int i19 = c1536.f47180;
        int i20 = C12909.f42906;
        this.f3651 = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        int i21 = this.f8252.f25244;
        this.f3654 = i21 == 0 || (i21 & 1) != 0;
        this.f3661 = C12909.m31987(this.f8252, str, C12909.m31989(str) == null);
        for (int i22 = 0; i22 < abstractC22433.size(); i22++) {
            String str2 = this.f8252.f25265;
            if (str2 != null && str2.equals(abstractC22433.get(i22))) {
                i5 = i22;
                break;
            }
        }
        this.f3647 = i5;
        this.f3649 = (i3 & MLKEMEngine.KyberPolyBytes) == 128;
        this.f3657 = (i3 & 64) == 64;
        C7648 c76411 = this.f8252;
        String str3 = c76411.f25265;
        if (str3 != null) {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.f3652 = i6;
        boolean z5 = this.f3659;
        C1536 c1537 = this.f3648;
        if ((c76411.f25244 & 16384) != 0 || !C13958.m33815(i3, c1537.f6243) || (!z5 && !c1537.f6252)) {
            i15 = 0;
        } else if (C13958.m33815(i3, false) && this.f3646 && z5 && c76411.f25242 != -1 && !c1537.f47179 && !c1537.f47168 && (i14 & i3) != 0) {
            i15 = 2;
        }
        this.f3645 = i15;
    }

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3634() {
        return this.f3645;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m3633(C0913 c0913, C0913 c0914) {
        AbstractC13116 abstractC13116Mo4145 = AbstractC13116.m32469().mo4146(c0913.f3653, c0914.f3653).mo4145(Integer.valueOf(c0913.f3658), Integer.valueOf(c0914.f3658), AbstractC10959.m27714().mo27718()).mo4143(c0913.f3655, c0914.f3655).mo4143(c0913.f3651, c0914.f3651).mo4146(c0913.f3654, c0914.f3654).mo4143(c0913.f3661, c0914.f3661).mo4146(c0913.f3662, c0914.f3662).mo4146(c0913.f3659, c0914.f3659).mo4146(c0913.f3646, c0914.f3646).mo4145(Integer.valueOf(c0913.f3647), Integer.valueOf(c0914.f3647), AbstractC10959.m27714().mo27718());
        boolean z = c0913.f3649;
        AbstractC13116 abstractC13116Mo4146 = abstractC13116Mo4145.mo4146(z, c0914.f3649);
        boolean z2 = c0913.f3657;
        AbstractC13116 abstractC13116Mo4147 = abstractC13116Mo4146.mo4146(z2, c0914.f3657);
        if (z && z2) {
            abstractC13116Mo4147 = abstractC13116Mo4147.mo4143(c0913.f3652, c0914.f3652);
        }
        return abstractC13116Mo4147.mo4142();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3632(C0913 c0913, C0913 c0914) {
        AbstractC10959 abstractC10959Mo27718;
        boolean z = c0913.f3659;
        int i = c0913.f3660;
        if (z && c0913.f3653) {
            abstractC10959Mo27718 = C12909.f42905;
        } else {
            abstractC10959Mo27718 = C12909.f42905.mo27718();
        }
        AbstractC13116 abstractC13116M32469 = AbstractC13116.m32469();
        if (c0913.f3648.f47168) {
            abstractC13116M32469 = abstractC13116M32469.mo4145(Integer.valueOf(i), Integer.valueOf(c0914.f3660), C12909.f42905.mo27718());
        }
        return abstractC13116M32469.mo4145(Integer.valueOf(c0913.f3650), Integer.valueOf(c0914.f3650), abstractC10959Mo27718).mo4145(Integer.valueOf(i), Integer.valueOf(c0914.f3660), abstractC10959Mo27718).mo4142();
    }
}
