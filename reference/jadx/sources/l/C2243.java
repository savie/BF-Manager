package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KI */
/* JADX INFO: loaded from: classes3.dex */
public class C2243 implements InterfaceC25364 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC5972 f7343;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6718 f7340 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f7339 = 0.0f;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f7341 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f7342 = false;

    public C2243() {
    }

    public C2243(C11937 c11937) {
        this.f7343 = new C13429(this, c11937);
    }

    public String toString() {
        boolean z;
        String str;
        String strM34972 = C14483.m34972(this.f7340 == null ? "0" : "" + this.f7340, " = ");
        if (this.f7339 != 0.0f) {
            StringBuilder sbM27333 = C10732.m27333(strM34972);
            sbM27333.append(this.f7339);
            strM34972 = sbM27333.toString();
            z = true;
        } else {
            z = false;
        }
        int iMo17403 = this.f7343.mo17403();
        for (int i = 0; i < iMo17403; i++) {
            C6718 c6718Mo17397 = this.f7343.mo17397(i);
            if (c6718Mo17397 != null) {
                float fMo17402 = this.f7343.mo17402(i);
                if (fMo17402 != 0.0f) {
                    String string = c6718Mo17397.toString();
                    if (z) {
                        if (fMo17402 > 0.0f) {
                            strM34972 = C14483.m34972(strM34972, " + ");
                        } else {
                            str = " - ";
                            strM34972 = C14483.m34972(strM34972, str);
                            fMo17402 *= -1.0f;
                        }
                    } else if (fMo17402 < 0.0f) {
                        str = "- ";
                        strM34972 = C14483.m34972(strM34972, str);
                        fMo17402 *= -1.0f;
                    }
                    strM34972 = fMo17402 == 1.0f ? C14483.m34972(strM34972, string) : strM34972 + fMo17402 + " " + string;
                    z = true;
                }
            }
        }
        return !z ? C14483.m34972(strM34972, "0.0") : strM34972;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7653(C6718 c6718, C6718 c6719, C6718 c67110, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7339 = i;
        }
        if (!z) {
            this.f7343.mo17400(c6718, -1.0f);
            this.f7343.mo17400(c6719, 1.0f);
            this.f7343.mo17400(c67110, 1.0f);
        } else {
            this.f7343.mo17400(c6718, 1.0f);
            this.f7343.mo17400(c6719, -1.0f);
            this.f7343.mo17400(c67110, -1.0f);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7660(C6718 c6718, C6718 c6719, C6718 c67110, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7339 = i;
        }
        if (!z) {
            this.f7343.mo17400(c6718, -1.0f);
            this.f7343.mo17400(c6719, 1.0f);
            this.f7343.mo17400(c67110, -1.0f);
        } else {
            this.f7343.mo17400(c6718, 1.0f);
            this.f7343.mo17400(c6719, -1.0f);
            this.f7343.mo17400(c67110, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7652(float f, float f2, float f3, C6718 c6718, C6718 c6719, C6718 c67110, C6718 c67111) {
        this.f7339 = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f7343.mo17400(c6718, 1.0f);
            this.f7343.mo17400(c6719, -1.0f);
            this.f7343.mo17400(c67111, 1.0f);
            this.f7343.mo17400(c67110, -1.0f);
            return;
        }
        if (f == 0.0f) {
            this.f7343.mo17400(c6718, 1.0f);
            this.f7343.mo17400(c6719, -1.0f);
        } else {
            if (f3 == 0.0f) {
                this.f7343.mo17400(c67110, 1.0f);
                this.f7343.mo17400(c67111, -1.0f);
                return;
            }
            float f4 = (f / f2) / (f3 / f2);
            this.f7343.mo17400(c6718, 1.0f);
            this.f7343.mo17400(c6719, -1.0f);
            this.f7343.mo17400(c67111, f4);
            this.f7343.mo17400(c67110, -f4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7655(C17158 c17158, int i) {
        this.f7343.mo17400(c17158.m40318(i), 1.0f);
        this.f7343.mo17400(c17158.m40318(i), -1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7654(C6718 c6718, C6718 c6719, C6718 c67110, C6718 c67111, float f) {
        this.f7343.mo17400(c67110, 0.5f);
        this.f7343.mo17400(c67111, 0.5f);
        this.f7343.mo17400(c6718, -0.5f);
        this.f7343.mo17400(c6719, -0.5f);
        this.f7339 = -f;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7659(C6718 c6718) {
        C6718 c6719 = this.f7340;
        if (c6719 != null) {
            this.f7343.mo17400(c6719, -1.0f);
            this.f7340.f22353 = -1;
            this.f7340 = null;
        }
        float fMo17396 = this.f7343.mo17396(c6718, true) * (-1.0f);
        this.f7340 = c6718;
        if (fMo17396 == 1.0f) {
            return;
        }
        this.f7339 /= fMo17396;
        this.f7343.mo17399(fMo17396);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo7658() {
        return this.f7340 == null && this.f7339 == 0.0f && this.f7343.mo17403() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo7656(C17158 c17158, C2243 c2243, boolean z) {
        float fMo17394 = this.f7343.mo17394(c2243, z);
        this.f7339 = (c2243.f7339 * fMo17394) + this.f7339;
        if (z) {
            c2243.f7340.m18758(this);
        }
        if (this.f7340 == null || this.f7343.mo17403() != 0) {
            return;
        }
        this.f7342 = true;
        c17158.f55944 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7657(C17158 c17158, C6718 c6718, boolean z) {
        if (c6718.f22350) {
            float fMo17395 = this.f7343.mo17395(c6718);
            this.f7339 = (c6718.f22345 * fMo17395) + this.f7339;
            this.f7343.mo17396(c6718, z);
            if (z) {
                c6718.m18758(this);
            }
            if (this.f7343.mo17403() == 0) {
                this.f7342 = true;
                c17158.f55944 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6718 m7649(boolean[] zArr, C6718 c6718) {
        EnumC12683 enumC12683;
        int iMo17403 = this.f7343.mo17403();
        C6718 c6719 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo17403; i++) {
            float fMo17402 = this.f7343.mo17402(i);
            if (fMo17402 < 0.0f) {
                C6718 c6718Mo17397 = this.f7343.mo17397(i);
                if ((zArr == null || !zArr[c6718Mo17397.f22354]) && c6718Mo17397 != c6718 && (((enumC12683 = c6718Mo17397.f22344) == EnumC12683.SLACK || enumC12683 == EnumC12683.ERROR) && fMo17402 < f)) {
                    f = fMo17402;
                    c6719 = c6718Mo17397;
                }
            }
        }
        return c6719;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6718 m7650(C6718 c6718) {
        return m7649((boolean[]) null, c6718);
    }

    @Override // l.InterfaceC25364
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6718 mo7651(boolean[] zArr) {
        return m7649(zArr, (C6718) null);
    }
}
