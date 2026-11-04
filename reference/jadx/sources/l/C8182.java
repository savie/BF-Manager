package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.۟᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C8182 extends AbstractC21607 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f26981;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f26982;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f26983;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f26984;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean f26985;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f26986;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f26987;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f26988;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f26989;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f26990;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f26991;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int f26992;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20861 f26993;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final int f26994;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f26995;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int f26996;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f26997;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int f26998;

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14151(AbstractC21607 abstractC21607) {
        C8182 c8182 = (C8182) abstractC21607;
        if (!this.f26987 && !C17359.equals(this.f69019.f50848, c8182.f69019.f50848)) {
            return false;
        }
        if (this.f26993.f66779) {
            return true;
        }
        return this.f26982 == c8182.f26982 && this.f26985 == c8182.f26985;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:139:0x018e  */
    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:51:0x007c  */
    public C8182(int i, C16549 c16549, int i2, C20861 c20861, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iM44786;
        int i6;
        int i7;
        C15648 c15648;
        int i8;
        int i9;
        int i10;
        C15648 c15649;
        int i11;
        int i12;
        int i13;
        super(i, c16549, i2);
        this.f26993 = c20861;
        boolean z4 = c20861.f66773;
        AbstractC1928 abstractC1928 = c20861.f10105;
        AbstractC1928 abstractC1929 = c20861.f10126;
        int i14 = z4 ? 24 : 16;
        int i15 = 1;
        this.f26987 = c20861.f66775 && (i4 & i14) != 0;
        if (!z || (((i11 = (c15649 = this.f69019).f50814) != -1 && i11 > c20861.f10125) || ((i12 = c15649.f50852) != -1 && i12 > c20861.f10124))) {
            z2 = false;
        } else {
            float f = c15649.f50845;
            if ((f == -1.0f || f <= c20861.f10135) && ((i13 = c15649.f50849) == -1 || i13 <= c20861.f10118)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f26983 = z2;
        if (!z || (((i8 = (c15648 = this.f69019).f50814) != -1 && i8 < c20861.f10129) || ((i9 = c15648.f50852) != -1 && i9 < c20861.f10109))) {
            z3 = false;
        } else {
            float f2 = c15648.f50845;
            if ((f2 == -1.0f || f2 >= c20861.f10133) && ((i10 = c15648.f50849) == -1 || i10 >= c20861.f10123)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f26988 = z3;
        this.f26986 = C14442.m34867(i3, false);
        C15648 c156410 = this.f69019;
        float f3 = c156410.f50845;
        this.f26989 = f3 != -1.0f && f3 >= 10.0f;
        this.f26995 = c156410.f50849;
        int i16 = c156410.f50814;
        this.f26984 = (i16 == -1 || (i7 = c156410.f50852) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= abstractC1929.size()) {
                i17 = Integer.MAX_VALUE;
                iM44786 = 0;
                break;
            } else {
                iM44786 = C19369.m44786(this.f69019, (String) abstractC1929.get(i17), false);
                if (iM44786 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f26997 = i17;
        this.f26991 = iM44786;
        int i18 = this.f69019.f50834;
        int i19 = c20861.f10114;
        int i20 = C19369.f62579;
        this.f26996 = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        int i21 = this.f69019.f50834;
        this.f26981 = i21 == 0 || (i21 & 1) != 0;
        this.f26994 = C19369.m44786(this.f69019, str, C19369.m44788(str) == null);
        for (int i22 = 0; i22 < abstractC1928.size(); i22++) {
            String str2 = this.f69019.f50848;
            if (str2 != null && str2.equals(abstractC1928.get(i22))) {
                i5 = i22;
                break;
            }
        }
        this.f26998 = i5;
        this.f26982 = (i3 & MLKEMEngine.KyberPolyBytes) == 128;
        this.f26985 = (i3 & 64) == 64;
        C15648 c156411 = this.f69019;
        String str3 = c156411.f50848;
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
        this.f26990 = i6;
        boolean z5 = this.f26983;
        C20861 c20862 = this.f26993;
        if ((c156411.f50834 & 16384) != 0 || !C14442.m34867(i3, c20862.f66772) || (!z5 && !c20862.f66782)) {
            i15 = 0;
        } else if (C14442.m34867(i3, false) && this.f26988 && z5 && c156411.f50849 != -1 && !c20862.f10117 && !c20862.f10132 && (i14 & i3) != 0) {
            i15 = 2;
        }
        this.f26992 = i15;
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ */
    public final int mo14149() {
        return this.f26992;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22095(C8182 c8182, C8182 c8183) {
        AbstractC25114 abstractC25114Mo6827 = AbstractC25114.m55993().mo6828(c8182.f26986, c8183.f26986).mo6827(Integer.valueOf(c8182.f26997), Integer.valueOf(c8183.f26997), AbstractC18753.m43550().mo1214()).mo6825(c8182.f26991, c8183.f26991).mo6825(c8182.f26996, c8183.f26996).mo6828(c8182.f26981, c8183.f26981).mo6825(c8182.f26994, c8183.f26994).mo6828(c8182.f26989, c8183.f26989).mo6828(c8182.f26983, c8183.f26983).mo6828(c8182.f26988, c8183.f26988).mo6827(Integer.valueOf(c8182.f26998), Integer.valueOf(c8183.f26998), AbstractC18753.m43550().mo1214());
        boolean z = c8182.f26982;
        AbstractC25114 abstractC25114Mo6828 = abstractC25114Mo6827.mo6828(z, c8183.f26982);
        boolean z2 = c8182.f26985;
        AbstractC25114 abstractC25114Mo6829 = abstractC25114Mo6828.mo6828(z2, c8183.f26985);
        if (z && z2) {
            abstractC25114Mo6829 = abstractC25114Mo6829.mo6825(c8182.f26990, c8183.f26990);
        }
        return abstractC25114Mo6829.mo6824();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22094(C8182 c8182, C8182 c8183) {
        AbstractC18753 abstractC18753Mo1214;
        boolean z = c8182.f26983;
        int i = c8182.f26995;
        if (z && c8182.f26986) {
            abstractC18753Mo1214 = C19369.f62578;
        } else {
            abstractC18753Mo1214 = C19369.f62578.mo1214();
        }
        AbstractC25114 abstractC25114M55993 = AbstractC25114.m55993();
        if (c8182.f26993.f10132) {
            abstractC25114M55993 = abstractC25114M55993.mo6827(Integer.valueOf(i), Integer.valueOf(c8183.f26995), C19369.f62578.mo1214());
        }
        return abstractC25114M55993.mo6827(Integer.valueOf(c8182.f26984), Integer.valueOf(c8183.f26984), abstractC18753Mo1214).mo6827(Integer.valueOf(i), Integer.valueOf(c8183.f26995), abstractC18753Mo1214).mo6824();
    }
}
