package l;

import android.graphics.Canvas;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17243 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static List f56170 = Arrays.asList("{}", "[]", "()");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56171;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56172;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f56173;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24132 f56174;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56175;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f56176;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f56177;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56178;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2020 f56179;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f56180;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f56181;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2020 f56182;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f56183;

    public C17243(C24132 c24132) {
        List list = f56170;
        this.f56182 = new C2020(list.size());
        this.f56179 = new C2020(list.size());
        this.f56174 = c24132;
        m40504(list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40504(List list) {
        m40506();
        if (list == null) {
            list = f56170;
        }
        C2020 c2020 = this.f56182;
        c2020.clear();
        C2020 c2021 = this.f56179;
        c2021.clear();
        for (String str : list) {
            if (str.length() != 2) {
                throw new IllegalArgumentException(str);
            }
            c2020.mo6943(str.charAt(0), str.charAt(1));
            c2021.mo6943(str.charAt(1), str.charAt(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40498(int i) {
        if (!this.f56176 || this.f56178) {
            return -1;
        }
        int i2 = this.f56175;
        if (i == i2) {
            return this.f56183 + 1;
        }
        int i3 = this.f56183;
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] m40511(int i) {
        if (!this.f56176 || this.f56178) {
            return null;
        }
        int i2 = this.f56175;
        if (i != i2) {
            int i3 = this.f56183;
            if (i != i3 + 1 && i != i2 + 1 && i != i3) {
                return null;
            }
        }
        return new int[]{i2, this.f56183};
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40510(int i, int i2) {
        m40495(i, i2, 0, this.f56174.m54099());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40501(int i, int i2, int i3, int i4) {
        int iM54099 = this.f56174.m54099();
        if (i3 >= 0 && i3 <= i4 && i4 <= iM54099) {
            m40495(i, i2, i3, i4);
        } else {
            StringBuilder sbM5126 = C1402.m5126("Invalid syntax coverage [", i3, ", ", ") for length ", i4);
            sbM5126.append(iM54099);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m40495(int i, int i2, int i3, int i4) {
        C24132 c24132 = this.f56174;
        if (!c24132.f78066.f45751) {
            if (this.f56176) {
                this.f56176 = false;
                return;
            }
            return;
        }
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        C9736 c9736M4819 = c24132.f78066.f45755 ? c24132.f78033.m4819() : null;
        try {
            C15508 c15508Mo15350 = interfaceC19106M54021.mo15350();
            try {
                int length = c15508Mo15350.length();
                if (i == i2 && i >= 0 && i <= length) {
                    boolean zM40494 = i < length ? m40494(c15508Mo15350, i, i3, i4, c9736M4819) : false;
                    if (!zM40494 && i > 0) {
                        zM40494 = m40496(c15508Mo15350, i - 1, i3, i4, c9736M4819);
                    }
                    if (!zM40494 && i > 0) {
                        zM40494 = m40494(c15508Mo15350, i - 1, i3, i4, c9736M4819);
                    }
                    if (!zM40494 && i < length) {
                        zM40494 = m40496(c15508Mo15350, i, i3, i4, c9736M4819);
                    }
                    if (zM40494) {
                        boolean z = (this.f56176 && this.f56175 == this.f56173 && this.f56183 == this.f56171) ? false : true;
                        this.f56176 = true;
                        this.f56178 = false;
                        this.f56181 = interfaceC19106M54021;
                        this.f56172 = c15508Mo15350.m37177();
                        int i5 = this.f56173;
                        int i6 = this.f56171;
                        if (i5 <= i6) {
                            this.f56175 = i5;
                            this.f56183 = i6;
                        } else {
                            this.f56175 = i6;
                            this.f56183 = i5;
                        }
                        this.f56180 = c15508Mo15350.m37179(this.f56175);
                        this.f56177 = c15508Mo15350.m37179(this.f56183);
                        if (z) {
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                c24132.postInvalidate();
                            } else {
                                c24132.invalidate();
                            }
                        }
                        c15508Mo15350.close();
                        return;
                    }
                }
                c15508Mo15350.close();
            } catch (Throwable th) {
                try {
                    c15508Mo15350.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
        if (this.f56176) {
            this.f56176 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c24132.postInvalidate();
            } else {
                c24132.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40494(C15508 c15508, int i, int i2, int i3, C9736 c9736) {
        char cMo6946;
        int iM25357;
        int iM53891;
        int iMin;
        C16800 c16800M25361;
        if (i >= i2 && i < i3) {
            char cCharAt = c15508.charAt(i);
            if (c9736 != null) {
                if (c9736.m25367(i, i + 1) && (c16800M25361 = c9736.m25361((iM25357 = c9736.m25357(i)))) != null) {
                    cMo6946 = m40492(c16800M25361, cCharAt, true);
                    Math.max(i2, c9736.m25364(iM25357));
                    iMin = Math.min(i3, c9736.m25368(iM25357));
                    iM53891 = c9736.m25363(i);
                }
            } else {
                cMo6946 = this.f56182.mo6946(cCharAt);
                iM25357 = -1;
                iM53891 = this.f56174.m53891(i);
                iMin = i3;
            }
            if (cMo6946 != 0) {
                int i4 = i + 1;
                int iIndexOf = c15508.indexOf(cMo6946, i4, iMin);
                int i5 = 0;
                while (iIndexOf != -1) {
                    if (m40493(c9736, iM25357, iIndexOf, iM53891)) {
                        int iIndexOf2 = c15508.indexOf(cCharAt, i4, iIndexOf);
                        int i6 = 0;
                        while (iIndexOf2 != -1) {
                            if (m40493(c9736, iM25357, iIndexOf2, iM53891)) {
                                i6++;
                            }
                            iIndexOf2 = c15508.indexOf(cCharAt, iIndexOf2 + 1, iIndexOf);
                        }
                        int i7 = i5 + i6;
                        if (i7 == 0) {
                            this.f56173 = i;
                            this.f56171 = iIndexOf;
                            return true;
                        }
                        i4 = iIndexOf + 1;
                        i5 = i7 - 1;
                    }
                    iIndexOf = c15508.indexOf(cMo6946, iIndexOf + 1, iMin);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m40496(C15508 c15508, int i, int i2, int i3, C9736 c9736) {
        char cMo6946;
        int iM53891;
        int iM25357;
        C16800 c16800M25361;
        int iMax = i2;
        if (i >= iMax && i < i3) {
            char cCharAt = c15508.charAt(i);
            if (c9736 != null) {
                if (c9736.m25367(i, i + 1) && (c16800M25361 = c9736.m25361((iM25357 = c9736.m25357(i)))) != null) {
                    cMo6946 = m40492(c16800M25361, cCharAt, false);
                    iMax = Math.max(iMax, c9736.m25364(iM25357));
                    Math.min(i3, c9736.m25368(iM25357));
                    iM53891 = c9736.m25363(i);
                }
            } else {
                cMo6946 = this.f56179.mo6946(cCharAt);
                iM53891 = this.f56174.m53891(i);
                iM25357 = -1;
            }
            if (cMo6946 != 0) {
                int iLastIndexOf = c15508.lastIndexOf(cMo6946, iMax, i);
                int i4 = i - 1;
                int i5 = 0;
                while (iLastIndexOf != -1) {
                    if (m40493(c9736, iM25357, iLastIndexOf, iM53891)) {
                        int i6 = i4 + 1;
                        int iIndexOf = c15508.indexOf(cCharAt, iLastIndexOf + 1, i6);
                        int i7 = 0;
                        while (iIndexOf != -1) {
                            if (m40493(c9736, iM25357, iIndexOf, iM53891)) {
                                i7++;
                            }
                            iIndexOf = c15508.indexOf(cCharAt, iIndexOf + 1, i6);
                        }
                        int i8 = i5 + i7;
                        if (i8 == 0) {
                            this.f56173 = iLastIndexOf;
                            this.f56171 = i;
                            return true;
                        }
                        i4 = iLastIndexOf - 1;
                        i5 = i8 - 1;
                    }
                    iLastIndexOf = c15508.lastIndexOf(cMo6946, iMax, iLastIndexOf);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40493(C9736 c9736, int i, int i2, int i3) {
        if (c9736 == null) {
            return this.f56174.m53891(i2) == i3;
        }
        return c9736.m25357(i2) == i && c9736.m25363(i2) == i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char m40492(C16800 c16800, char c, boolean z) {
        String str;
        List listM39682 = c16800.m39682();
        if (listM39682 == null) {
            listM39682 = f56170;
        }
        int i = !z ? 1 : 0;
        int size = listM39682.size();
        do {
            size--;
            if (size < 0) {
                return (char) 0;
            }
            str = (String) listM39682.get(size);
        } while (str.charAt(i) != c);
        return str.charAt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40499(int i, int i2, int i3) {
        InterfaceC19106 interfaceC19106M54021 = this.f56174.m54021();
        if (!this.f56176 || this.f56181 != interfaceC19106M54021 || this.f56172 + 1 != interfaceC19106M54021.mo15344()) {
            return -1L;
        }
        if (i2 == 0 && i3 == 0) {
            return -1L;
        }
        int i4 = i + i2;
        int i5 = this.f56175;
        if (i <= i5 && i5 < i4) {
            return -1L;
        }
        int i6 = this.f56183;
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
    public final void m40502(long j) {
        if (j < 0) {
            return;
        }
        this.f56175 = (int) (j >>> 32);
        this.f56183 = (int) j;
        C24132 c24132 = this.f56174;
        this.f56172 = c24132.m54021().mo15344();
        this.f56178 = true;
        this.f56176 = true;
        m40500(c24132.m53968(), c24132.m53882());
        if (this.f56176) {
            this.f56180 = c24132.m54067(this.f56175);
            this.f56177 = c24132.m54067(this.f56183);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40500(int i, int i2) {
        int i3;
        int i4;
        if (this.f56178) {
            InterfaceC19106 interfaceC19106 = this.f56181;
            C24132 c24132 = this.f56174;
            if (interfaceC19106 == c24132.m54021() && this.f56172 == c24132.m54021().mo15344() && c24132.f78066.f45751 && c24132.isAttachedToWindow() && c24132.m53878() && !c24132.f78013 && i == i2 && (i == (i3 = this.f56175) || i == i3 + 1 || i == (i4 = this.f56183) || i == i4 + 1)) {
                return;
            }
        }
        m40506();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m40508() {
        return this.f56176;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40507() {
        this.f56178 = false;
        this.f56176 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m40506() {
        this.f56178 = false;
        InterfaceC19106 interfaceC19106 = this.f56181;
        C24132 c24132 = this.f56174;
        if (interfaceC19106 != c24132.m54021()) {
            this.f56181 = null;
        }
        if (this.f56176) {
            this.f56176 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c24132.postInvalidate();
            } else {
                c24132.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40497() {
        return this.f56180;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m40509() {
        return this.f56177;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m40505() {
        return this.f56175;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m40512() {
        return this.f56183;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40503(Canvas canvas, int i, int i2, float f, float f2, C10232 c10232, C14540 c14540, InterfaceC7829 interfaceC7829) {
        if (this.f56176 && this.f56174.isFocused()) {
            int i3 = this.f56175;
            if (i <= i3 && i3 < i2) {
                C8533 c8533 = (C8533) interfaceC7829;
                float fM22846 = c8533.m22846(i, 0.0f, i3);
                int i4 = this.f56175;
                float fM22847 = c8533.m22846(i4, 0.0f, i4 + 1);
                c10232.setColor(c14540.f45798);
                canvas.drawRect(fM22846 + 0.0f, f, fM22846 + fM22847, f2, c10232);
            }
            int i5 = this.f56183;
            if (i > i5 || i5 >= i2) {
                return;
            }
            C8533 c8534 = (C8533) interfaceC7829;
            float fM22848 = c8534.m22846(i, 0.0f, i5);
            int i6 = this.f56183;
            float fM22849 = c8534.m22846(i6, 0.0f, i6 + 1);
            c10232.setColor(c14540.f45798);
            canvas.drawRect(fM22848 + 0.0f, f, fM22848 + fM22849, f2, c10232);
        }
    }
}
