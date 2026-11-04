package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20888 extends C2243 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6718[] f66853;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f66854;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6718[] f66855;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3734 f66856;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47730() {
        this.f66854 = 0;
        this.f7339 = 0.0f;
    }

    public C20888(C11937 c11937) {
        super(c11937);
        this.f66855 = new C6718[128];
        this.f66853 = new C6718[128];
        this.f66854 = 0;
        this.f66856 = new C3734(this);
    }

    @Override // l.C2243
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7658() {
        return this.f66854 == 0;
    }

    @Override // l.C2243, l.InterfaceC25364
    /* JADX INFO: renamed from: ۙ */
    public final C6718 mo7651(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f66854; i2++) {
            C6718[] c6718Arr = this.f66855;
            C6718 c6718 = c6718Arr[i2];
            if (!zArr[c6718.f22354]) {
                C3734 c3734 = this.f66856;
                c3734.f12819 = c6718;
                int i3 = 8;
                if (i != -1) {
                    C6718 c6719 = c6718Arr[i];
                    while (i3 >= 0) {
                        float f = c6719.f22347[i3];
                        float f2 = c3734.f12819.f22347[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = c3734.f12819.f22347[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f66855[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47729(C6718 c6718) {
        this.f66856.f12819 = c6718;
        float[] fArr = c6718.f22347;
        Arrays.fill(fArr, 0.0f);
        fArr[c6718.f22348] = 1.0f;
        m47728(c6718);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private final void m47728(C6718 c6718) {
        int i;
        int i2 = this.f66854 + 1;
        C6718[] c6718Arr = this.f66855;
        if (i2 > c6718Arr.length) {
            C6718[] c6718Arr2 = (C6718[]) Arrays.copyOf(c6718Arr, c6718Arr.length * 2);
            this.f66855 = c6718Arr2;
            this.f66853 = (C6718[]) Arrays.copyOf(c6718Arr2, c6718Arr2.length * 2);
        }
        C6718[] c6718Arr3 = this.f66855;
        int i3 = this.f66854;
        c6718Arr3[i3] = c6718;
        int i4 = i3 + 1;
        this.f66854 = i4;
        if (i4 > 1 && c6718Arr3[i3].f22354 > c6718.f22354) {
            int i5 = 0;
            while (true) {
                i = this.f66854;
                if (i5 >= i) {
                    break;
                }
                this.f66853[i5] = this.f66855[i5];
                i5++;
            }
            Arrays.sort(this.f66853, 0, i, new C23872());
            for (int i6 = 0; i6 < this.f66854; i6++) {
                this.f66855[i6] = this.f66853[i6];
            }
        }
        c6718.f22352 = true;
        c6718.m18755(this);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private final void m47727(C6718 c6718) {
        int i = 0;
        while (i < this.f66854) {
            if (this.f66855[i] == c6718) {
                while (true) {
                    int i2 = this.f66854;
                    if (i < i2 - 1) {
                        C6718[] c6718Arr = this.f66855;
                        int i3 = i + 1;
                        c6718Arr[i] = c6718Arr[i3];
                        i = i3;
                    } else {
                        this.f66854 = i2 - 1;
                        c6718.f22352 = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // l.C2243
    /* JADX INFO: renamed from: ۙ */
    public final void mo7656(C17158 c17158, C2243 c2243, boolean z) {
        C6718 c6718 = c2243.f7340;
        if (c6718 == null) {
            return;
        }
        float[] fArr = c6718.f22347;
        InterfaceC5972 interfaceC5972 = c2243.f7343;
        int iMo17403 = interfaceC5972.mo17403();
        for (int i = 0; i < iMo17403; i++) {
            C6718 c6718Mo17397 = interfaceC5972.mo17397(i);
            float fMo17402 = interfaceC5972.mo17402(i);
            C3734 c3734 = this.f66856;
            c3734.f12819 = c6718Mo17397;
            if (c6718Mo17397.f22352) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c3734.f12819.f22347;
                    float f = (fArr[i2] * fMo17402) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c3734.f12819.f22347[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c3734.f12818.m47727(c3734.f12819);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo17402;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c3734.f12819.f22347[i3] = f3;
                    } else {
                        c3734.f12819.f22347[i3] = 0.0f;
                    }
                }
                m47728(c6718Mo17397);
            }
            this.f7339 = (c2243.f7339 * fMo17402) + this.f7339;
        }
        m47727(c6718);
    }

    @Override // l.C2243
    public final String toString() {
        String str = " goal -> (" + this.f7339 + ") : ";
        for (int i = 0; i < this.f66854; i++) {
            C6718 c6718 = this.f66855[i];
            C3734 c3734 = this.f66856;
            c3734.f12819 = c6718;
            str = str + c3734 + " ";
        }
        return str;
    }
}
