package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 41JE */
/* JADX INFO: loaded from: classes4.dex */
public final class C7463 extends C10445 {

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public boolean f24594;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public float f24596 = -1.0f;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f24595 = -1;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public int f24591 = -1;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C0751 f24593 = this.f33197;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f24592 = 0;

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo20496() {
        return true;
    }

    public C7463() {
        this.f33220.clear();
        this.f33220.add(this.f24593);
        int length = this.f33190.length;
        for (int i = 0; i < length; i++) {
            this.f33190[i] = this.f24593;
        }
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ */
    public final void mo9735(C10445 c10445, HashMap map) {
        super.mo9735(c10445, map);
        C7463 c7463 = (C7463) c10445;
        this.f24596 = c7463.f24596;
        this.f24595 = c7463.f24595;
        this.f24591 = c7463.f24591;
        m20503(c7463.f24592);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20503(int i) {
        if (this.f24592 == i) {
            return;
        }
        this.f24592 = i;
        ArrayList arrayList = this.f33220;
        arrayList.clear();
        if (this.f24592 == 1) {
            this.f24593 = this.f33212;
        } else {
            this.f24593 = this.f33197;
        }
        arrayList.add(this.f24593);
        C0751[] c0751Arr = this.f33190;
        int length = c0751Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0751Arr[i2] = this.f24593;
        }
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C0751 m20504() {
        return this.f24593;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int m20502() {
        return this.f24592;
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0751 mo20495(EnumC18650 enumC18650) {
        switch (C8954.f29208[enumC18650.ordinal()]) {
            case 1:
            case 2:
                if (this.f24592 == 1) {
                    return this.f24593;
                }
                break;
            case 3:
            case 4:
                if (this.f24592 == 0) {
                    return this.f24593;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC18650.name());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20500(float f) {
        if (f > -1.0f) {
            this.f24596 = f;
            this.f24595 = -1;
            this.f24591 = -1;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m20506(int i) {
        if (i > -1) {
            this.f24596 = -1.0f;
            this.f24595 = i;
            this.f24591 = -1;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m20494(int i) {
        if (i > -1) {
            this.f24596 = -1.0f;
            this.f24595 = -1;
            this.f24591 = i;
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final float m20501() {
        return this.f24596;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int m20497() {
        return this.f24595;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final int m20492() {
        return this.f24591;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m20498(int i) {
        this.f24593.m3102(i);
        this.f24594 = true;
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean mo20499() {
        return this.f24594;
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo20493() {
        return this.f24594;
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ */
    public final void mo9736(C17158 c17158, boolean z) {
        C1497 c1497 = (C1497) this.f33252;
        if (c1497 == null) {
            return;
        }
        C0751 c0751Mo20495 = c1497.mo20495(EnumC18650.LEFT);
        C0751 c0751Mo20496 = c1497.mo20495(EnumC18650.RIGHT);
        C10445 c10445 = this.f33252;
        boolean z2 = c10445 != null && c10445.f33210[0] == EnumC19396.WRAP_CONTENT;
        if (this.f24592 == 0) {
            c0751Mo20495 = c1497.mo20495(EnumC18650.TOP);
            c0751Mo20496 = c1497.mo20495(EnumC18650.BOTTOM);
            C10445 c10446 = this.f33252;
            z2 = c10446 != null && c10446.f33210[1] == EnumC19396.WRAP_CONTENT;
        }
        if (this.f24594 && this.f24593.m3107()) {
            C6718 c6718M40319 = c17158.m40319(this.f24593);
            c17158.m40321(c6718M40319, this.f24593.m3114());
            if (this.f24595 != -1) {
                if (z2) {
                    c17158.m40329(c17158.m40319(c0751Mo20496), c6718M40319, 0, 5);
                }
            } else if (this.f24591 != -1 && z2) {
                C6718 c6718M403110 = c17158.m40319(c0751Mo20496);
                c17158.m40329(c6718M40319, c17158.m40319(c0751Mo20495), 0, 5);
                c17158.m40329(c6718M403110, c6718M40319, 0, 5);
            }
            this.f24594 = false;
            return;
        }
        if (this.f24595 != -1) {
            C6718 c6718M403111 = c17158.m40319(this.f24593);
            c17158.m40323(c6718M403111, c17158.m40319(c0751Mo20495), this.f24595, 8);
            if (z2) {
                c17158.m40329(c17158.m40319(c0751Mo20496), c6718M403111, 0, 5);
                return;
            }
            return;
        }
        if (this.f24591 != -1) {
            C6718 c6718M403112 = c17158.m40319(this.f24593);
            C6718 c6718M403113 = c17158.m40319(c0751Mo20496);
            c17158.m40323(c6718M403112, c6718M403113, -this.f24591, 8);
            if (z2) {
                c17158.m40329(c6718M403112, c17158.m40319(c0751Mo20495), 0, 5);
                c17158.m40329(c6718M403113, c6718M403112, 0, 5);
                return;
            }
            return;
        }
        if (this.f24596 != -1.0f) {
            C6718 c6718M403114 = c17158.m40319(this.f24593);
            C6718 c6718M403115 = c17158.m40319(c0751Mo20496);
            float f = this.f24596;
            C2243 c2243M40317 = c17158.m40317();
            c2243M40317.f7343.mo17400(c6718M403114, -1.0f);
            c2243M40317.f7343.mo17400(c6718M403115, f);
            c17158.m40320(c2243M40317);
        }
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo20505(C17158 c17158, boolean z) {
        if (this.f33252 == null) {
            return;
        }
        C0751 c0751 = this.f24593;
        c17158.getClass();
        int iM40315 = C17158.m40315(c0751);
        if (this.f24592 == 1) {
            this.f33234 = iM40315;
            this.f33189 = 0;
            m26824(this.f33252.m26823());
            m26805(0);
            return;
        }
        this.f33234 = 0;
        this.f33189 = iM40315;
        m26805(this.f33252.m26806());
        m26824(0);
    }
}
