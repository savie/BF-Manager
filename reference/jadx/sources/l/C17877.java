package l;

import android.text.TextUtils;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ܽ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17877 extends AbstractC21607 implements Comparable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f58580;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final int f58581;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f58582;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f58583;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f58584;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f58585;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f58586;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f58587;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f58588;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f58589;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C20861 f58590;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean f58591;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int f58592;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f58593;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final int f58594;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f58595;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int f58596;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f58597;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int f58598;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f58599;

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14151(AbstractC21607 abstractC21607) {
        int i;
        String str;
        int i2;
        C17877 c17877 = (C17877) abstractC21607;
        C15648 c15648 = c17877.f69019;
        C20861 c20861 = this.f58590;
        boolean z = c20861.f66770;
        C15648 c15649 = this.f69019;
        if (!z && ((i2 = c15649.f50843) == -1 || i2 != c15648.f50843)) {
            return false;
        }
        if (!this.f58586 && ((str = c15649.f50848) == null || !TextUtils.equals(str, c15648.f50848))) {
            return false;
        }
        if (!c20861.f66767 && ((i = c15649.f50829) == -1 || i != c15648.f50829)) {
            return false;
        }
        if (c20861.f66769) {
            return true;
        }
        return this.f58599 == c17877.f58599 && this.f58591 == c17877.f58591;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    public C17877(int i, C16549 c16549, int i2, C20861 c20861, int i3, boolean z, C17131 c17131, int i4) {
        int i5;
        int iM44786;
        boolean z2;
        int iM44787;
        boolean z3;
        boolean z4;
        boolean z5;
        C15803 c15803;
        super(i, c16549, i2);
        this.f58590 = c20861;
        boolean z6 = c20861.f66780;
        AbstractC1928 abstractC1928 = c20861.f10134;
        AbstractC1928 abstractC1929 = c20861.f10113;
        int i6 = z6 ? 24 : 16;
        int i7 = 1;
        this.f58586 = c20861.f66774 && (i4 & i6) != 0;
        this.f58593 = C19369.m44788(this.f69019.f50811);
        this.f58585 = C14442.m34867(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= abstractC1929.size()) {
                i8 = Integer.MAX_VALUE;
                iM44786 = 0;
                break;
            } else {
                iM44786 = C19369.m44786(this.f69019, (String) abstractC1929.get(i8), false);
                if (iM44786 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f58598 = i8;
        this.f58596 = iM44786;
        int i9 = this.f69019.f50834;
        int i10 = c20861.f10110;
        this.f58592 = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        C15648 c15648 = this.f69019;
        int i11 = c15648.f50834;
        this.f58580 = i11 == 0 || (i11 & 1) != 0;
        this.f58588 = (c15648.f50850 & 1) != 0;
        String str = c15648.f50848;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.f58582 = z2;
        int i12 = c15648.f50843;
        this.f58589 = i12;
        this.f58584 = c15648.f50829;
        int i13 = c15648.f50849;
        this.f58595 = i13;
        this.f58587 = (i13 == -1 || i13 <= c20861.f10112) && (i12 == -1 || i12 <= c20861.f10107) && c17131.apply(c15648);
        String[] strArrM19513 = C7116.m19513();
        int i14 = 0;
        while (true) {
            if (i14 < strArrM19513.length) {
                iM44787 = C19369.m44786(this.f69019, strArrM19513[i14], false);
                if (iM44787 <= 0) {
                    i14++;
                }
            } else {
                i14 = Integer.MAX_VALUE;
                iM44787 = 0;
            }
        }
        this.f58583 = i14;
        this.f58597 = iM44787;
        for (int i15 = 0; i15 < abstractC1928.size(); i15++) {
            String str2 = this.f69019.f50848;
            if (str2 != null && str2.equals(abstractC1928.get(i15))) {
                i5 = i15;
                this.f58594 = i5;
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f58599 = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f58591 = z4;
                boolean z7 = this.f58587;
                C20861 c20862 = this.f58590;
                z5 = c20862.f66772;
                c15803 = c20862.f10111;
                if (!C14442.m34867(i3, z5) && (z7 || c20862.f66766)) {
                    c15803.getClass();
                    if (C14442.m34867(i3, false) && z7 && this.f69019.f50849 != -1 && !c20862.f10117 && !c20862.f10132 && ((c20862.f66781 || !z) && (i6 & i3) != 0)) {
                        i7 = 2;
                    }
                } else {
                    i7 = 0;
                }
                this.f58581 = i7;
            }
        }
        this.f58594 = i5;
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f58599 = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f58591 = z4;
        boolean z8 = this.f58587;
        C20861 c20863 = this.f58590;
        z5 = c20863.f66772;
        c15803 = c20863.f10111;
        if (C14442.m34867(i3, z5)) {
            i7 = 0;
        } else {
            c15803.getClass();
            if (C14442.m34867(i3, false)) {
                i7 = 2;
            }
        }
        this.f58581 = i7;
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ */
    public final int mo14149() {
        return this.f58581;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C17877 c17877) {
        AbstractC18753 abstractC18753Mo1214;
        boolean z = this.f58585;
        boolean z2 = this.f58587;
        if (z2 && z) {
            abstractC18753Mo1214 = C19369.f62578;
        } else {
            abstractC18753Mo1214 = C19369.f62578.mo1214();
        }
        AbstractC25114 abstractC25114M55993 = AbstractC25114.m55993();
        boolean z3 = c17877.f58585;
        int i = c17877.f58595;
        AbstractC25114 abstractC25114Mo6827 = abstractC25114M55993.mo6828(z, z3).mo6827(Integer.valueOf(this.f58598), Integer.valueOf(c17877.f58598), AbstractC18753.m43550().mo1214()).mo6825(this.f58596, c17877.f58596).mo6825(this.f58592, c17877.f58592).mo6828(this.f58588, c17877.f58588).mo6828(this.f58580, c17877.f58580).mo6827(Integer.valueOf(this.f58583), Integer.valueOf(c17877.f58583), AbstractC18753.m43550().mo1214()).mo6825(this.f58597, c17877.f58597).mo6828(z2, c17877.f58587).mo6827(Integer.valueOf(this.f58594), Integer.valueOf(c17877.f58594), AbstractC18753.m43550().mo1214());
        boolean z4 = this.f58590.f10132;
        int i2 = this.f58595;
        if (z4) {
            abstractC25114Mo6827 = abstractC25114Mo6827.mo6827(Integer.valueOf(i2), Integer.valueOf(i), C19369.f62578.mo1214());
        }
        AbstractC25114 abstractC25114Mo6828 = abstractC25114Mo6827.mo6828(this.f58599, c17877.f58599).mo6828(this.f58591, c17877.f58591).mo6828(this.f58582, c17877.f58582).mo6827(Integer.valueOf(this.f58589), Integer.valueOf(c17877.f58589), abstractC18753Mo1214).mo6827(Integer.valueOf(this.f58584), Integer.valueOf(c17877.f58584), abstractC18753Mo1214);
        if (C17359.equals(this.f58593, c17877.f58593)) {
            abstractC25114Mo6828 = abstractC25114Mo6828.mo6827(Integer.valueOf(i2), Integer.valueOf(i), abstractC18753Mo1214);
        }
        return abstractC25114Mo6828.mo6824();
    }
}
