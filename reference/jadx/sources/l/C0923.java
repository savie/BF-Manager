package l;

import android.graphics.Canvas;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0923 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List f3694 = Arrays.asList("{}", "[]", "()");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f3695;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14447 f3696;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f3697;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3698;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f3699;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f3700;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6111 f3701;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f3702;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f3703;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f3704;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14447 f3705;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f3706;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f3707;

    public C0923(C6111 c6111) {
        List list = f3694;
        this.f3696 = new C14447(list.size());
        this.f3705 = new C14447(list.size());
        this.f3701 = c6111;
        m3667(list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3667(List list) {
        m3658();
        if (list == null) {
            list = f3694;
        }
        C14447 c14447 = this.f3696;
        c14447.clear();
        C14447 c14448 = this.f3705;
        c14448.clear();
        for (String str : list) {
            if (str.length() != 2) {
                throw new IllegalArgumentException(str);
            }
            c14447.mo24344(str.charAt(0), str.charAt(1));
            c14448.mo24344(str.charAt(1), str.charAt(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3661(int i) {
        if (!this.f3695 || this.f3704) {
            return -1;
        }
        int i2 = this.f3700;
        if (i == i2) {
            return this.f3707 + 1;
        }
        int i3 = this.f3707;
        int i4 = i3 + 1;
        if (i != i4) {
            if (i == i2 + 1) {
                return i4;
            }
            if (i != i3) {
                return -1;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] m3672(int i) {
        if (!this.f3695 || this.f3704) {
            return null;
        }
        int i2 = this.f3700;
        if (i != i2) {
            int i3 = this.f3707;
            if (i != i3 + 1 && i != i2 + 1 && i != i3) {
                return null;
            }
        }
        return new int[]{i2, this.f3707};
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3671(int i, int i2) {
        m3656(i, i2, 0, this.f3701.m16842());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3664(int i, int i2, int i3, int i4) {
        int iM16842 = this.f3701.m16842();
        if (i3 >= 0 && i3 <= i4 && i4 <= iM16842) {
            m3656(i, i2, i3, i4);
        } else {
            StringBuilder sbM2791 = C0589.m2791("Invalid syntax coverage [", i3, ", ", ") for length ", i4);
            sbM2791.append(iM16842);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m3656(int i, int i2, int i3, int i4) {
        C6111 c6111 = this.f3701;
        if (!c6111.f20794.f6424) {
            if (this.f3695) {
                this.f3695 = false;
                return;
            }
            return;
        }
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        C12942 c12942M32660 = c6111.f20794.f6398 ? c6111.f20770.m32660() : null;
        try {
            C3329 c3329Mo2399 = interfaceC2916M17000.mo2399();
            try {
                int length = c3329Mo2399.length();
                if (i == i2 && i >= 0 && i <= length) {
                    boolean zM3654 = i < length ? m3654(c3329Mo2399, i, i3, i4, c12942M32660) : false;
                    if (!zM3654 && i > 0) {
                        zM3654 = m3657(c3329Mo2399, i - 1, i3, i4, c12942M32660);
                    }
                    if (!zM3654 && i > 0) {
                        zM3654 = m3654(c3329Mo2399, i - 1, i3, i4, c12942M32660);
                    }
                    if (!zM3654 && i < length) {
                        zM3654 = m3657(c3329Mo2399, i, i3, i4, c12942M32660);
                    }
                    if (zM3654) {
                        boolean z = (this.f3695 && this.f3700 == this.f3702 && this.f3707 == this.f3697) ? false : true;
                        this.f3695 = true;
                        this.f3704 = false;
                        this.f3703 = interfaceC2916M17000;
                        this.f3698 = c3329Mo2399.m9896();
                        int i5 = this.f3702;
                        int i6 = this.f3697;
                        if (i5 <= i6) {
                            this.f3700 = i5;
                            this.f3707 = i6;
                        } else {
                            this.f3700 = i6;
                            this.f3707 = i5;
                        }
                        this.f3699 = c3329Mo2399.m9893(this.f3700);
                        this.f3706 = c3329Mo2399.m9893(this.f3707);
                        if (z) {
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                c6111.postInvalidate();
                            } else {
                                c6111.invalidate();
                            }
                        }
                        c3329Mo2399.close();
                        return;
                    }
                }
                c3329Mo2399.close();
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
        if (this.f3695) {
            this.f3695 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c6111.postInvalidate();
            } else {
                c6111.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m3654(C3329 c3329, int i, int i2, int i3, C12942 c12942) {
        char cMo9552;
        int iM32066;
        int iM16844;
        int iMin;
        C20889 c20889M32071;
        if (i >= i2 && i < i3) {
            char cCharAt = c3329.charAt(i);
            if (c12942 != null) {
                if (c12942.m32075(i, i + 1) && (c20889M32071 = c12942.m32071((iM32066 = c12942.m32066(i)))) != null) {
                    cMo9552 = m3653(c20889M32071, cCharAt, true);
                    Math.max(i2, c12942.m32070(iM32066));
                    iMin = Math.min(i3, c12942.m32065(iM32066));
                    iM16844 = c12942.m32076(i);
                }
            } else {
                cMo9552 = this.f3696.mo9552(cCharAt);
                iM32066 = -1;
                iM16844 = this.f3701.m16844(i);
                iMin = i3;
            }
            if (cMo9552 != 0) {
                int i4 = i + 1;
                int iIndexOf = c3329.indexOf(cMo9552, i4, iMin);
                int i5 = 0;
                while (iIndexOf != -1) {
                    if (m3655(c12942, iM32066, iIndexOf, iM16844)) {
                        int iIndexOf2 = c3329.indexOf(cCharAt, i4, iIndexOf);
                        int i6 = 0;
                        while (iIndexOf2 != -1) {
                            if (m3655(c12942, iM32066, iIndexOf2, iM16844)) {
                                i6++;
                            }
                            iIndexOf2 = c3329.indexOf(cCharAt, iIndexOf2 + 1, iIndexOf);
                        }
                        int i7 = i5 + i6;
                        if (i7 == 0) {
                            this.f3702 = i;
                            this.f3697 = iIndexOf;
                            return true;
                        }
                        i4 = iIndexOf + 1;
                        i5 = i7 - 1;
                    }
                    iIndexOf = c3329.indexOf(cMo9552, iIndexOf + 1, iMin);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m3657(C3329 c3329, int i, int i2, int i3, C12942 c12942) {
        char cMo9552;
        int iM16844;
        int iM32066;
        C20889 c20889M32071;
        int iMax = i2;
        if (i >= iMax && i < i3) {
            char cCharAt = c3329.charAt(i);
            if (c12942 != null) {
                if (c12942.m32075(i, i + 1) && (c20889M32071 = c12942.m32071((iM32066 = c12942.m32066(i)))) != null) {
                    cMo9552 = m3653(c20889M32071, cCharAt, false);
                    iMax = Math.max(iMax, c12942.m32070(iM32066));
                    Math.min(i3, c12942.m32065(iM32066));
                    iM16844 = c12942.m32076(i);
                }
            } else {
                cMo9552 = this.f3705.mo9552(cCharAt);
                iM16844 = this.f3701.m16844(i);
                iM32066 = -1;
            }
            if (cMo9552 != 0) {
                int iLastIndexOf = c3329.lastIndexOf(cMo9552, iMax, i);
                int i4 = i - 1;
                int i5 = 0;
                while (iLastIndexOf != -1) {
                    if (m3655(c12942, iM32066, iLastIndexOf, iM16844)) {
                        int i6 = i4 + 1;
                        int iIndexOf = c3329.indexOf(cCharAt, iLastIndexOf + 1, i6);
                        int i7 = 0;
                        while (iIndexOf != -1) {
                            if (m3655(c12942, iM32066, iIndexOf, iM16844)) {
                                i7++;
                            }
                            iIndexOf = c3329.indexOf(cCharAt, iIndexOf + 1, i6);
                        }
                        int i8 = i5 + i7;
                        if (i8 == 0) {
                            this.f3702 = iLastIndexOf;
                            this.f3697 = i;
                            return true;
                        }
                        i4 = iLastIndexOf - 1;
                        i5 = i8 - 1;
                    }
                    iLastIndexOf = c3329.lastIndexOf(cMo9552, iMax, iLastIndexOf);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m3655(C12942 c12942, int i, int i2, int i3) {
        if (c12942 == null) {
            return this.f3701.m16844(i2) == i3;
        }
        return c12942.m32066(i2) == i && c12942.m32076(i2) == i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char m3653(C20889 c20889, char c, boolean z) {
        String str;
        List listM46960 = c20889.m46960();
        if (listM46960 == null) {
            listM46960 = f3694;
        }
        int i = !z ? 1 : 0;
        int size = listM46960.size();
        do {
            size--;
            if (size < 0) {
                return (char) 0;
            }
            str = (String) listM46960.get(size);
        } while (str.charAt(i) != c);
        return str.charAt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m3662(int i, int i2, int i3) {
        InterfaceC2916 interfaceC2916M17000 = this.f3701.m17000();
        if (!this.f3695 || this.f3703 != interfaceC2916M17000 || this.f3698 + 1 != interfaceC2916M17000.mo2395()) {
            return -1L;
        }
        if (i2 == 0 && i3 == 0) {
            return -1L;
        }
        int i4 = i + i2;
        int i5 = this.f3700;
        if (i <= i5 && i5 < i4) {
            return -1L;
        }
        int i6 = this.f3707;
        if (i <= i6 && i6 < i4) {
            return -1L;
        }
        int i7 = i3 - i2;
        if (i5 >= i4) {
            i5 += i7;
        }
        if (i6 >= i4) {
            i6 += i7;
        }
        return (((long) i5) << 32) | (((long) i6) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3665(long j) {
        if (j < 0) {
            return;
        }
        this.f3700 = (int) (j >>> 32);
        this.f3707 = (int) j;
        C6111 c6111 = this.f3701;
        this.f3698 = c6111.m17000().mo2395();
        this.f3704 = true;
        this.f3695 = true;
        m3663(c6111.m16916(), c6111.m17020());
        if (this.f3695) {
            this.f3699 = c6111.m16981(this.f3700);
            this.f3706 = c6111.m16981(this.f3707);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3663(int i, int i2) {
        int i3;
        int i4;
        if (this.f3704) {
            InterfaceC2916 interfaceC2916 = this.f3703;
            C6111 c6111 = this.f3701;
            if (interfaceC2916 == c6111.m17000() && this.f3698 == c6111.m17000().mo2395() && c6111.f20794.f6424 && c6111.isAttachedToWindow() && c6111.m16968() && !c6111.f20787 && i == i2 && (i == (i3 = this.f3700) || i == i3 + 1 || i == (i4 = this.f3707) || i == i4 + 1)) {
                return;
            }
        }
        m3658();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m3668() {
        return this.f3695;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m3673() {
        this.f3704 = false;
        this.f3695 = false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m3658() {
        this.f3704 = false;
        InterfaceC2916 interfaceC2916 = this.f3703;
        C6111 c6111 = this.f3701;
        if (interfaceC2916 != c6111.m17000()) {
            this.f3703 = null;
        }
        if (this.f3695) {
            this.f3695 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c6111.postInvalidate();
            } else {
                c6111.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3660() {
        return this.f3699;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m3670() {
        return this.f3706;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m3669() {
        return this.f3700;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m3659() {
        return this.f3707;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3666(Canvas canvas, int i, int i2, float f, float f2, C4916 c4916, C1590 c1590, InterfaceC13855 interfaceC13855) {
        if (this.f3695 && this.f3701.isFocused()) {
            int i3 = this.f3700;
            if (i <= i3 && i3 < i2) {
                C0363 c0363 = (C0363) interfaceC13855;
                float fM2080 = c0363.m2080(i, 0.0f, i3);
                int i4 = this.f3700;
                float fM2081 = c0363.m2080(i4, 0.0f, i4 + 1);
                c4916.setColor(c1590.f6421);
                canvas.drawRect(fM2080 + 0.0f, f, fM2080 + fM2081, f2, c4916);
            }
            int i5 = this.f3707;
            if (i > i5 || i5 >= i2) {
                return;
            }
            C0363 c0364 = (C0363) interfaceC13855;
            float fM2082 = c0364.m2080(i, 0.0f, i5);
            int i6 = this.f3707;
            float fM2083 = c0364.m2080(i6, 0.0f, i6 + 1);
            c4916.setColor(c1590.f6421);
            canvas.drawRect(fM2082 + 0.0f, f, fM2082 + fM2083, f2, c4916);
        }
    }
}
