package l;

import com.alipay.sdk.m.y.l;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes.dex */
public final class C24618 extends C14174 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public int f79730 = 0;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79732 = true;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public int f79733 = 0;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public boolean f79731 = false;

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20496() {
        return true;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final int m54949() {
        return this.f79730;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m54948(int i) {
        this.f79730 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54952(boolean z) {
        this.f79732 = z;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54946() {
        return this.f79732;
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo20499() {
        return this.f79731;
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo20493() {
        return this.f79731;
    }

    @Override // l.C14174, l.C10445
    /* JADX INFO: renamed from: ۙ */
    public final void mo9735(C10445 c10445, HashMap map) {
        super.mo9735(c10445, map);
        C24618 c24618 = (C24618) c10445;
        this.f79730 = c24618.f79730;
        this.f79732 = c24618.f79732;
        this.f79733 = c24618.f79733;
    }

    @Override // l.C10445
    public final String toString() {
        String string = "[Barrier] " + m26841() + " {";
        for (int i = 0; i < this.f44822; i++) {
            C10445 c10445 = this.f44823[i];
            if (i > 0) {
                string = C14483.m34972(string, ", ");
            }
            StringBuilder sbM27333 = C10732.m27333(string);
            sbM27333.append(c10445.m26841());
            string = sbM27333.toString();
        }
        return C14483.m34972(string, l.d);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m54951() {
        for (int i = 0; i < this.f44822; i++) {
            C10445 c10445 = this.f44823[i];
            int i2 = this.f79730;
            if (i2 == 0 || i2 == 1) {
                c10445.m26810(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c10445.m26810(1, true);
            }
        }
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ */
    public final void mo9736(C17158 c17158, boolean z) {
        boolean z2;
        int i;
        int i2;
        C0751[] c0751Arr = this.f33190;
        C0751 c0751 = this.f33212;
        c0751Arr[0] = c0751;
        int i3 = 2;
        C0751 c0752 = this.f33197;
        c0751Arr[2] = c0752;
        C0751 c0753 = this.f33248;
        c0751Arr[1] = c0753;
        C0751 c0754 = this.f33216;
        c0751Arr[3] = c0754;
        for (C0751 c0755 : c0751Arr) {
            c0755.f2746 = c17158.m40319(c0755);
        }
        int i4 = this.f79730;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0751 c0756 = c0751Arr[i4];
        if (!this.f79731) {
            m54947();
        }
        if (this.f79731) {
            this.f79731 = false;
            int i5 = this.f79730;
            if (i5 == 0 || i5 == 1) {
                c17158.m40321(c0751.f2746, this.f33234);
                c17158.m40321(c0753.f2746, this.f33234);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c17158.m40321(c0752.f2746, this.f33189);
                    c17158.m40321(c0754.f2746, this.f33189);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f44822) {
                z2 = false;
                break;
            }
            C10445 c10445 = this.f44823[i6];
            if ((this.f79732 || c10445.mo20496()) && ((((i2 = this.f79730) == 0 || i2 == 1) && c10445.f33210[0] == EnumC19396.MATCH_CONSTRAINT && c10445.f33212.f2744 != null && c10445.f33248.f2744 != null) || ((i2 == 2 || i2 == 3) && c10445.f33210[1] == EnumC19396.MATCH_CONSTRAINT && c10445.f33197.f2744 != null && c10445.f33216.f2744 != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c0751.m3111() || c0753.m3111();
        boolean z4 = c0752.m3111() || c0754.m3111();
        int i7 = !(!z2 && (((i = this.f79730) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f44822) {
            C10445 c10446 = this.f44823[i8];
            if (this.f79732 || c10446.mo20496()) {
                C6718 c6718M40319 = c17158.m40319(c10446.f33190[this.f79730]);
                C0751[] c0751Arr2 = c10446.f33190;
                int i9 = this.f79730;
                C0751 c0757 = c0751Arr2[i9];
                c0757.f2746 = c6718M40319;
                C0751 c0758 = c0757.f2744;
                int i10 = (c0758 == null || c0758.f2747 != this) ? 0 : c0757.f2748;
                if (i9 == 0 || i9 == i3) {
                    C6718 c6718 = c0756.f2746;
                    int i11 = this.f79733 - i10;
                    C2243 c2243M40317 = c17158.m40317();
                    C6718 c6718M40328 = c17158.m40328();
                    c6718M40328.f22348 = 0;
                    c2243M40317.m7660(c6718, c6718M40319, c6718M40328, i11);
                    c17158.m40320(c2243M40317);
                } else {
                    C6718 c6719 = c0756.f2746;
                    int i12 = this.f79733 + i10;
                    C2243 c2243M40318 = c17158.m40317();
                    C6718 c6718M40329 = c17158.m40328();
                    c6718M40329.f22348 = 0;
                    c2243M40318.m7653(c6719, c6718M40319, c6718M40329, i12);
                    c17158.m40320(c2243M40318);
                }
                c17158.m40323(c0756.f2746, c6718M40319, this.f79733 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f79730;
        if (i13 == 0) {
            c17158.m40323(c0753.f2746, c0751.f2746, 0, 8);
            c17158.m40323(c0751.f2746, this.f33252.f33248.f2746, 0, 4);
            c17158.m40323(c0751.f2746, this.f33252.f33212.f2746, 0, 0);
            return;
        }
        if (i13 == 1) {
            c17158.m40323(c0751.f2746, c0753.f2746, 0, 8);
            c17158.m40323(c0751.f2746, this.f33252.f33212.f2746, 0, 4);
            c17158.m40323(c0751.f2746, this.f33252.f33248.f2746, 0, 0);
        } else if (i13 == 2) {
            c17158.m40323(c0754.f2746, c0752.f2746, 0, 8);
            c17158.m40323(c0752.f2746, this.f33252.f33216.f2746, 0, 4);
            c17158.m40323(c0752.f2746, this.f33252.f33197.f2746, 0, 0);
        } else if (i13 == 3) {
            c17158.m40323(c0752.f2746, c0754.f2746, 0, 8);
            c17158.m40323(c0752.f2746, this.f33252.f33197.f2746, 0, 4);
            c17158.m40323(c0752.f2746, this.f33252.f33216.f2746, 0, 0);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m54953(int i) {
        this.f79733 = i;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int m54954() {
        return this.f79733;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final int m54950() {
        int i = this.f79730;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54947() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f44822;
            if (i4 >= i) {
                break;
            }
            C10445 c10445 = this.f44823[i4];
            if ((this.f79732 || c10445.mo20496()) && ((((i2 = this.f79730) == 0 || i2 == 1) && !c10445.mo20499()) || (((i3 = this.f79730) == 2 || i3 == 3) && !c10445.mo20493()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f44822; i5++) {
            C10445 c10446 = this.f44823[i5];
            if (this.f79732 || c10446.mo20496()) {
                if (!z2) {
                    int i6 = this.f79730;
                    if (i6 == 0) {
                        iMax = c10446.mo20495(EnumC18650.LEFT).m3114();
                    } else if (i6 == 1) {
                        iMax = c10446.mo20495(EnumC18650.RIGHT).m3114();
                    } else if (i6 == 2) {
                        iMax = c10446.mo20495(EnumC18650.TOP).m3114();
                    } else if (i6 == 3) {
                        iMax = c10446.mo20495(EnumC18650.BOTTOM).m3114();
                    }
                    z2 = true;
                }
                int i7 = this.f79730;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c10446.mo20495(EnumC18650.LEFT).m3114());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c10446.mo20495(EnumC18650.RIGHT).m3114());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c10446.mo20495(EnumC18650.TOP).m3114());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c10446.mo20495(EnumC18650.BOTTOM).m3114());
                }
            }
        }
        int i8 = iMax + this.f79733;
        int i9 = this.f79730;
        if (i9 == 0 || i9 == 1) {
            m26809(i8, i8);
        } else {
            m26860(i8, i8);
        }
        this.f79731 = true;
        return true;
    }
}
