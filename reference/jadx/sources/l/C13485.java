package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: E43E */
/* JADX INFO: loaded from: classes3.dex */
public final class C13485 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4518 f44571;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23195 f44572;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19003 f44573 = new C19003();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f44570 = new HashMap();

    public C13485(C23195 c23195, InterfaceC4518 interfaceC4518) {
        this.f44572 = c23195;
        this.f44571 = interfaceC4518;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32992(Object obj, int i, int i2, int i3) {
        C9873 c9873 = new C9873();
        c9873.f33718 = obj;
        c9873.f33721 = i;
        c9873.f33720 = i2;
        c9873.f33719 = i3;
        this.f44573.m43723(c9873);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32991(C20809 c20809, InterfaceC9831 interfaceC9831, C20414 c20414) {
        int iM32988;
        int iM32989;
        new C3521(this).m10382(this.f44572);
        int i = 0;
        for (C21825 c21825M43726 = this.f44573.m43726(); c21825M43726.m48595(); c21825M43726 = c21825M43726.f70877) {
            C9873 c9873 = (C9873) c21825M43726.f70876;
            int i2 = c9873.f33720;
            int i3 = c9873.f33719;
            if (i2 != i3) {
                C4311 c4311 = (C4311) this.f44570.get(c9873.f33718);
                if (c4311 != null) {
                    int i4 = c4311.f15486;
                    if (i4 != -1 && c4311.f15485 != -1 && (iM32988 = m32988(i4, interfaceC9831, c20414)) != -1 && (iM32989 = m32988(c4311.f15485, interfaceC9831, c20414)) != -1) {
                        c20809.m46798(c9873.f33720);
                        c20809.m46798(i3 - 1);
                        c20809.m46797(iM32988);
                        c20809.m46797(iM32989);
                        c20809.m46798(c9873.f33721);
                        i++;
                    }
                } else {
                    C6171.m17174("CRT: tree source positions are undefined");
                    throw null;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m32988(int i, InterfaceC9831 interfaceC9831, C20414 c20414) {
        int iMo10209 = interfaceC9831.mo10209(i);
        int iMo10211 = interfaceC9831.mo10211(i);
        if (iMo10209 < 1) {
            throw new IllegalArgumentException("line must be greater than 0");
        }
        if (iMo10211 < 1) {
            throw new IllegalArgumentException("column must be greater than 0");
        }
        int i2 = (iMo10209 > 4194303 || iMo10211 > 1023) ? -1 : (iMo10209 << 10) + iMo10211;
        if (i2 == -1) {
            C14065 c14065 = C9768.f32836;
            c20414.m48190(i, new C14065("compiler", "position.overflow", Integer.valueOf(iMo10209)));
        }
        return i2;
    }
}
