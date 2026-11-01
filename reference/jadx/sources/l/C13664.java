package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KI */
/* JADX INFO: loaded from: classes4.dex */
public class C13664 implements InterfaceC2373 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC4490 f45055;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15075 f45058 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f45056 = 0.0f;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f45057 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f45059 = false;

    public C13664() {
    }

    public C13664(C11547 c11547) {
        this.f45055 = new C3162(this, c11547);
    }

    public String toString() {
        boolean z;
        String str;
        String strM37076 = C15489.m37076(this.f45058 == null ? "0" : "" + this.f45058, " = ");
        if (this.f45056 != 0.0f) {
            StringBuilder sbM23356 = C9023.m23356(strM37076);
            sbM23356.append(this.f45056);
            strM37076 = sbM23356.toString();
            z = true;
        } else {
            z = false;
        }
        int iMo9562 = this.f45055.mo9562();
        for (int i = 0; i < iMo9562; i++) {
            C15075 c15075Mo9556 = this.f45055.mo9556(i);
            if (c15075Mo9556 != null) {
                float fMo9561 = this.f45055.mo9561(i);
                if (fMo9561 != 0.0f) {
                    String string = c15075Mo9556.toString();
                    if (z) {
                        if (fMo9561 > 0.0f) {
                            strM37076 = C15489.m37076(strM37076, " + ");
                        } else {
                            str = " - ";
                            strM37076 = C15489.m37076(strM37076, str);
                            fMo9561 *= -1.0f;
                        }
                    } else if (fMo9561 < 0.0f) {
                        str = "- ";
                        strM37076 = C15489.m37076(strM37076, str);
                        fMo9561 *= -1.0f;
                    }
                    strM37076 = fMo9561 == 1.0f ? C15489.m37076(strM37076, string) : strM37076 + fMo9561 + " " + string;
                    z = true;
                }
            }
        }
        return !z ? C15489.m37076(strM37076, "0.0") : strM37076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33373(C15075 c15075, C15075 c15076, C15075 c15077, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f45056 = i;
        }
        if (!z) {
            this.f45055.mo9559(c15075, -1.0f);
            this.f45055.mo9559(c15076, 1.0f);
            this.f45055.mo9559(c15077, 1.0f);
        } else {
            this.f45055.mo9559(c15075, 1.0f);
            this.f45055.mo9559(c15076, -1.0f);
            this.f45055.mo9559(c15077, -1.0f);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33376(C15075 c15075, C15075 c15076, C15075 c15077, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f45056 = i;
        }
        if (!z) {
            this.f45055.mo9559(c15075, -1.0f);
            this.f45055.mo9559(c15076, 1.0f);
            this.f45055.mo9559(c15077, -1.0f);
        } else {
            this.f45055.mo9559(c15075, 1.0f);
            this.f45055.mo9559(c15076, -1.0f);
            this.f45055.mo9559(c15077, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33370(float f, float f2, float f3, C15075 c15075, C15075 c15076, C15075 c15077, C15075 c15078) {
        this.f45056 = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f45055.mo9559(c15075, 1.0f);
            this.f45055.mo9559(c15076, -1.0f);
            this.f45055.mo9559(c15078, 1.0f);
            this.f45055.mo9559(c15077, -1.0f);
            return;
        }
        if (f == 0.0f) {
            this.f45055.mo9559(c15075, 1.0f);
            this.f45055.mo9559(c15076, -1.0f);
        } else {
            if (f3 == 0.0f) {
                this.f45055.mo9559(c15077, 1.0f);
                this.f45055.mo9559(c15078, -1.0f);
                return;
            }
            float f4 = (f / f2) / (f3 / f2);
            this.f45055.mo9559(c15075, 1.0f);
            this.f45055.mo9559(c15076, -1.0f);
            this.f45055.mo9559(c15078, f4);
            this.f45055.mo9559(c15077, -f4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33371(C5196 c5196, int i) {
        this.f45055.mo9559(c5196.m14363(i), 1.0f);
        this.f45055.mo9559(c5196.m14363(i), -1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33374(C15075 c15075, C15075 c15076, C15075 c15077, C15075 c15078, float f) {
        this.f45055.mo9559(c15077, 0.5f);
        this.f45055.mo9559(c15078, 0.5f);
        this.f45055.mo9559(c15075, -0.5f);
        this.f45055.mo9559(c15076, -0.5f);
        this.f45056 = -f;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33375(C15075 c15075) {
        C15075 c15076 = this.f45058;
        if (c15076 != null) {
            this.f45055.mo9559(c15076, -1.0f);
            this.f45058.f49153 = -1;
            this.f45058 = null;
        }
        float fMo9555 = this.f45055.mo9555(c15075, true) * (-1.0f);
        this.f45058 = c15075;
        if (fMo9555 == 1.0f) {
            return;
        }
        this.f45056 /= fMo9555;
        this.f45055.mo9558(fMo9555);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo17939() {
        return this.f45058 == null && this.f45056 == 0.0f && this.f45055.mo9562() == 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo17938(C5196 c5196, C13664 c13664, boolean z) {
        float fMo9553 = this.f45055.mo9553(c13664, z);
        this.f45056 = (c13664.f45056 * fMo9553) + this.f45056;
        if (z) {
            c13664.f45058.m36155(this);
        }
        if (this.f45058 == null || this.f45055.mo9562() != 0) {
            return;
        }
        this.f45059 = true;
        c5196.f18022 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33372(C5196 c5196, C15075 c15075, boolean z) {
        if (c15075.f49155) {
            float fMo9554 = this.f45055.mo9554(c15075);
            this.f45056 = (c15075.f49148 * fMo9554) + this.f45056;
            this.f45055.mo9555(c15075, z);
            if (z) {
                c15075.m36155(this);
            }
            if (this.f45055.mo9562() == 0) {
                this.f45059 = true;
                c5196.f18022 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15075 m33368(boolean[] zArr, C15075 c15075) {
        EnumC22836 enumC22836;
        int iMo9562 = this.f45055.mo9562();
        C15075 c15076 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo9562; i++) {
            float fMo9561 = this.f45055.mo9561(i);
            if (fMo9561 < 0.0f) {
                C15075 c15075Mo9556 = this.f45055.mo9556(i);
                if ((zArr == null || !zArr[c15075Mo9556.f49146]) && c15075Mo9556 != c15075 && (((enumC22836 = c15075Mo9556.f49147) == EnumC22836.SLACK || enumC22836 == EnumC22836.ERROR) && fMo9561 < f)) {
                    f = fMo9561;
                    c15076 = c15075Mo9556;
                }
            }
        }
        return c15076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15075 m33369(C15075 c15075) {
        return m33368((boolean[]) null, c15075);
    }

    @Override // l.InterfaceC2373
    /* JADX INFO: renamed from: ۙ */
    public C15075 mo7224(boolean[] zArr) {
        return m33368(zArr, (C15075) null);
    }
}
