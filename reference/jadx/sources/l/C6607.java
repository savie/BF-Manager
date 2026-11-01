package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6607 extends C13664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15075[] f22258;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C15075[] f22259;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f22260;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3784 f22261;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17941() {
        this.f22260 = 0;
        this.f45056 = 0.0f;
    }

    public C6607(C11547 c11547) {
        super(c11547);
        this.f22258 = new C15075[128];
        this.f22259 = new C15075[128];
        this.f22260 = 0;
        this.f22261 = new C3784(this);
    }

    @Override // l.C13664
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo17939() {
        return this.f22260 == 0;
    }

    @Override // l.C13664, l.InterfaceC2373
    /* JADX INFO: renamed from: ۙ */
    public final C15075 mo7224(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f22260; i2++) {
            C15075[] c15075Arr = this.f22258;
            C15075 c15075 = c15075Arr[i2];
            if (!zArr[c15075.f49146]) {
                C3784 c3784 = this.f22261;
                c3784.f13661 = c15075;
                int i3 = 8;
                if (i != -1) {
                    C15075 c15076 = c15075Arr[i];
                    while (i3 >= 0) {
                        float f = c15076.f49151[i3];
                        float f2 = c3784.f13661.f49151[i3];
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
                        float f3 = c3784.f13661.f49151[i3];
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
        return this.f22258[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m17940(C15075 c15075) {
        this.f22261.f13661 = c15075;
        float[] fArr = c15075.f49151;
        Arrays.fill(fArr, 0.0f);
        fArr[c15075.f49150] = 1.0f;
        m17936(c15075);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private final void m17936(C15075 c15075) {
        int i;
        int i2 = this.f22260 + 1;
        C15075[] c15075Arr = this.f22258;
        if (i2 > c15075Arr.length) {
            C15075[] c15075Arr2 = (C15075[]) Arrays.copyOf(c15075Arr, c15075Arr.length * 2);
            this.f22258 = c15075Arr2;
            this.f22259 = (C15075[]) Arrays.copyOf(c15075Arr2, c15075Arr2.length * 2);
        }
        C15075[] c15075Arr3 = this.f22258;
        int i3 = this.f22260;
        c15075Arr3[i3] = c15075;
        int i4 = i3 + 1;
        this.f22260 = i4;
        if (i4 > 1 && c15075Arr3[i3].f49146 > c15075.f49146) {
            int i5 = 0;
            while (true) {
                i = this.f22260;
                if (i5 >= i) {
                    break;
                }
                this.f22259[i5] = this.f22258[i5];
                i5++;
            }
            Arrays.sort(this.f22259, 0, i, new C12958());
            for (int i6 = 0; i6 < this.f22260; i6++) {
                this.f22258[i6] = this.f22259[i6];
            }
        }
        c15075.f49149 = true;
        c15075.m36154(this);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final void m17937(C15075 c15075) {
        int i = 0;
        while (i < this.f22260) {
            if (this.f22258[i] == c15075) {
                while (true) {
                    int i2 = this.f22260;
                    if (i < i2 - 1) {
                        C15075[] c15075Arr = this.f22258;
                        int i3 = i + 1;
                        c15075Arr[i] = c15075Arr[i3];
                        i = i3;
                    } else {
                        this.f22260 = i2 - 1;
                        c15075.f49149 = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // l.C13664
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17938(C5196 c5196, C13664 c13664, boolean z) {
        C15075 c15075 = c13664.f45058;
        if (c15075 == null) {
            return;
        }
        float[] fArr = c15075.f49151;
        InterfaceC4490 interfaceC4490 = c13664.f45055;
        int iMo9562 = interfaceC4490.mo9562();
        for (int i = 0; i < iMo9562; i++) {
            C15075 c15075Mo9556 = interfaceC4490.mo9556(i);
            float fMo9561 = interfaceC4490.mo9561(i);
            C3784 c3784 = this.f22261;
            c3784.f13661 = c15075Mo9556;
            if (c15075Mo9556.f49149) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c3784.f13661.f49151;
                    float f = (fArr[i2] * fMo9561) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c3784.f13661.f49151[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c3784.f13660.m17937(c3784.f13661);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo9561;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c3784.f13661.f49151[i3] = f3;
                    } else {
                        c3784.f13661.f49151[i3] = 0.0f;
                    }
                }
                m17936(c15075Mo9556);
            }
            this.f45056 = (c13664.f45056 * fMo9561) + this.f45056;
        }
        m17937(c15075);
    }

    @Override // l.C13664
    public final String toString() {
        String str = " goal -> (" + this.f45056 + ") : ";
        for (int i = 0; i < this.f22260; i++) {
            C15075 c15075 = this.f22258[i];
            C3784 c3784 = this.f22261;
            c3784.f13661 = c15075;
            str = str + c3784 + " ";
        }
        return str;
    }
}
