package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۗۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6ZC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3063 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17175 f11531;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f11535;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f11536;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11538;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f11530 = 1.0f;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f11539 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f11533 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2793 f11532 = new C2793();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9415 f11528 = new InterfaceC0940() { // from class: l.ۢۜۚ
        @Override // l.InterfaceC0940
        /* JADX INFO: renamed from: ۙ */
        public final boolean mo3700(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, Runnable runnable) {
            return C3063.m9178(this.f31912, canvas, f, f2, f3, f4, runnable);
        }
    };

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C0676 f11537 = new C0676();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0676 f11529 = new C0676();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0946 f11534 = new C0946();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9186(C17175 c17175, int i, int i2, int i3) {
        this.f11531 = c17175;
        this.f11539 = i;
        this.f11533 = i2;
        this.f11538 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9187() {
        return this.f11536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9183(float f, int i) {
        this.f11535 = i;
        this.f11530 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9188(C7027 c7027, int i, int i2, int i3) {
        boolean z = false;
        if (c7027 == null || i2 < 0 || i2 >= i3 || i3 > c7027.m18860()) {
            return false;
        }
        synchronized (this.f11529) {
            C0676 c0676 = this.f11529;
            c0676.m3036(c7027);
            try {
                if (c0676.m3037(i2) && c0676.m3035() >= i3 && c0676.m3039().m37379() == i) {
                    z = true;
                }
                c0676.m3033();
            } catch (Throwable th) {
                c0676.m3033();
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m9190(int i, int i2, C7027 c7027) {
        C0676 c0676 = this.f11529;
        synchronized (c0676) {
            m9176(c0676, c7027);
            try {
                if (m9177(c0676, i, i)) {
                    int iM37379 = c0676.m3039().m37379();
                    c0676.m3033();
                    return iM37379;
                }
                c0676.m3033();
                return i2;
            } catch (Throwable th) {
                c0676.m3033();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9185(C7027 c7027, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint, C1590 c1590) throws Throwable {
        C0676 c0676;
        this.f11536 = false;
        C0676 c0677 = this.f11537;
        m9176(c0677, c7027);
        try {
            if (!c0677.m3037(i)) {
                c0677.m3033();
                return;
            }
            int i5 = i;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (true) {
                C15682 c15682M3039 = c0677.m3039();
                int iMin = Math.min(i2, c0677.m3035());
                boolean z = iMin < i2;
                int iM37379 = c15682M3039.m37379();
                float f4 = this.f11530;
                if (f4 < 1.0f) {
                    iM37379 = C3224.m9662(this.f11535, iM37379, f4);
                }
                paint.setColor(iM37379);
                c0676 = c0677;
                try {
                    float fM9174 = m9174(c1590, canvas, charSequence, i5, iMin, f2, f, i3, i4, f3, paint, c15682M3039.m37367(), z);
                    if (z) {
                        f2 += fM9174;
                        f3 += fM9174;
                        if (f2 > i4 || !c0676.m3038()) {
                            c0676.m3033();
                            return;
                        } else {
                            c0677 = c0676;
                            i5 = iMin;
                        }
                    } else {
                        c0676.m3033();
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c0676 = c0677;
        }
        c0676.m3033();
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m9174(C1590 c1590, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) throws Throwable {
        C2793 c2793;
        int i6;
        Paint paint2;
        int iM37379;
        int iMin;
        boolean z2;
        int i7;
        int i8;
        int i9;
        float fM17856;
        C3063 c3063 = this;
        Paint paint3 = paint;
        C17175 c17175 = c3063.f11531;
        if (c17175 != null) {
            int i10 = c17175.f54750;
            int i11 = c17175.f54749;
            if (i11 < i2 && i10 > i && (c3063.f11539 > i || i2 > c3063.f11533)) {
                int color = paint.getColor();
                C7027 c7027 = c17175.f54748;
                C2793 c2794 = c3063.f11532;
                c2794.m8488(c7027);
                int i12 = i;
                float f4 = 0.0f;
                while (i12 < i2) {
                    float f5 = f + f4;
                    if (f5 > i4) {
                        break;
                    }
                    if (i12 < i11) {
                        z2 = false;
                        iM37379 = color;
                        iMin = i11;
                    } else if (i12 < i10) {
                        try {
                            if (c3063.f11539 <= i12 && i12 < (i7 = c3063.f11533)) {
                                iMin = Math.min(i2, i7);
                                iM37379 = color;
                                z2 = false;
                            } else {
                                c2794.m8489(i12 - i11);
                                int iMin2 = Math.min(i2, c2794.m8487() + i11);
                                int i13 = c3063.f11539;
                                if (i12 < i13) {
                                    iMin2 = Math.min(iMin2, i13);
                                }
                                iM37379 = c2794.m8491().m37379();
                                iMin = iMin2;
                                z2 = (iM37379 == color || iM37379 == c3063.f11538) ? false : true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c2793 = c2794;
                            i6 = color;
                            paint2 = paint3;
                            paint2.setColor(i6);
                            c2793.m8488(C7027.m18855());
                            throw th;
                        }
                    } else {
                        z2 = false;
                        iMin = i2;
                        iM37379 = color;
                    }
                    try {
                        paint3.setColor(iM37379);
                        if (z2 && !c3063.f11536) {
                            float f6 = f3 + f4;
                            boolean z3 = z || iMin < i2;
                            C9415 c9415 = c3063.f11528;
                            i9 = iMin;
                            c2793 = c2794;
                            i8 = color;
                            try {
                                fM17856 = c1590.m17857(canvas, charSequence, i12, iMin, f5, f2, i3, i4, f6, paint, i5, z3, c9415);
                            } catch (Throwable th2) {
                                th = th2;
                                paint2 = paint;
                                i6 = i8;
                                paint2.setColor(i6);
                                c2793.m8488(C7027.m18855());
                                throw th;
                            }
                        } else {
                            i9 = iMin;
                            c2793 = c2794;
                            i8 = color;
                            fM17856 = c1590.m17856(canvas, charSequence, i12, i9, f5, f2, i3, i4, f3 + f4, paint, i5, z || i9 < i2);
                        }
                        f4 += fM17856;
                        paint3 = paint;
                        i12 = i9;
                        c2794 = c2793;
                        color = i8;
                        i11 = i11;
                        i10 = i10;
                        c3063 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c2793 = c2794;
                        i8 = color;
                    }
                }
                paint3.setColor(color);
                c2794.m8488(C7027.m18855());
                return f4;
            }
        }
        return c1590.m17856(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9178(C3063 c3063, Canvas canvas, float f, float f2, float f3, float f4, Runnable runnable) {
        runnable.run();
        int iSave = canvas.save();
        try {
            if (canvas.clipRect((float) Math.floor(f), (float) Math.floor(f2), (float) Math.ceil(f3), (float) Math.ceil(f4))) {
                c3063.f11536 = true;
            }
            return c3063.f11536;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m9182(C12942 c12942, CharSequence charSequence, int i, int i2) {
        C15682 c15682Mo10853;
        C15682 c15682M9175;
        int iM32074;
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C15682 c15682 = null;
        if (charSequence.length() != c12942.m32073() || i < 0 || i > i2 || i2 > charSequence.length() || !c12942.m32075(i, i2)) {
            return null;
        }
        if (i != i2) {
            C0946 c0946 = this.f11534;
            c0946.m3710(c12942, i, i2);
            C7027 c7027M32068 = c12942.m32068();
            C0676 c0676 = this.f11537;
            m9176(c0676, c7027M32068);
            int i3 = -1;
            int i4 = Integer.MAX_VALUE;
            C15682 c15683 = null;
            do {
                try {
                    int iM3712 = c0946.m3712();
                    int iM3709 = c0946.m3709();
                    int iM3713 = c0946.m3713();
                    int iM32075 = c12942.m32074(iM3713);
                    C20889 c20889M32071 = c12942.m32071(iM3713);
                    if (c20889M32071 != null) {
                        Iterator it = c20889M32071.m46961().iterator();
                        do {
                            if (it.hasNext()) {
                                c15682Mo10853 = ((InterfaceC3685) it.next()).mo10853(iM3712, iM3709, charSequence);
                            }
                        } while (c15682Mo10853 == null);
                        if (c15682Mo10853 == null && c7027M32068.m18864(iM3712, iM3709) && c0676.m3037(iM3712)) {
                            do {
                                c15682Mo10853 = m9175(c0676.m3039());
                                if (c15682Mo10853 == null || c0676.m3035() >= iM3709) {
                                    break;
                                    break;
                                }
                            } while (c0676.m3038());
                        }
                        if (c15682Mo10853 != null && (iM32075 > i3 || (iM32075 == i3 && iM3712 < i4))) {
                            i4 = iM3712;
                            i3 = iM32075;
                            c15683 = c15682Mo10853;
                        }
                    }
                    c15682Mo10853 = null;
                    if (c15682Mo10853 == null) {
                        do {
                            c15682Mo10853 = m9175(c0676.m3039());
                            if (c15682Mo10853 == null) {
                                break;
                            }
                        } while (c0676.m3038());
                    }
                    if (c15682Mo10853 != null) {
                        i4 = iM3712;
                        i3 = iM32075;
                        c15683 = c15682Mo10853;
                    }
                } finally {
                    c0946.m3711();
                    c0676.m3033();
                }
            } while (c0946.m3708());
            if (i2 < charSequence.length()) {
                int i5 = i2 + 1;
                if (c12942.m32075(i2, i5) && c7027M32068.m18864(i2, i5) && c0676.m3037(i2) && c0676.m3040() == i2 && (c15682M9175 = m9175(c0676.m3039())) != null && ((iM32074 = c12942.m32074(c12942.m32066(i2))) > i3 || (iM32074 == i3 && i2 < i4))) {
                    c15683 = c15682M9175;
                }
            }
            return c15683;
        }
        C20889 c20889M32072 = c12942.m32071(c12942.m32067(i, i));
        if (c20889M32072 != null) {
            Iterator it2 = c20889M32072.m46961().iterator();
            while (it2.hasNext()) {
                C15682 c15682Mo10854 = ((InterfaceC3685) it2.next()).mo10853(i, i, charSequence);
                if (c15682Mo10854 != null) {
                    c15682 = c15682Mo10854;
                    break;
                }
            }
        }
        if (c15682 != null || charSequence.length() == 0) {
            return c15682;
        }
        if (i >= charSequence.length()) {
            i--;
        }
        return m9175(c12942.m32068().m18863(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m9181(C7027 c7027, CharSequence charSequence, int i, int i2) {
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        if (c7027 != null && c7027.m18860() == charSequence.length() && i >= 0 && i <= i2 && i2 <= charSequence.length()) {
            if (i != i2) {
                if (c7027.m18864(i, i2 < charSequence.length() ? i2 + 1 : i2)) {
                    C0676 c0676 = this.f11537;
                    c0676.m3036(c7027);
                    try {
                        if (!c0676.m3037(i)) {
                            return null;
                        }
                        while (c0676.m3040() <= i2) {
                            C15682 c15682M9175 = m9175(c0676.m3039());
                            if (c15682M9175 != null) {
                                return c15682M9175;
                            }
                            if (!c0676.m3038()) {
                                break;
                            }
                        }
                        return null;
                    } finally {
                        c0676.m3033();
                    }
                }
            } else if (charSequence.length() != 0) {
                if (i >= charSequence.length()) {
                    i--;
                }
                return m9175(c7027.m18863(i));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15682 m9175(C15682 c15682) {
        if ((c15682.m37376() & (-16777216)) != 100663296) {
            return null;
        }
        return C15682.m37365(null, c15682.m37375() | (-16777216), 1447446, c15682.m37378() | (-16777216), 1447446, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m9179(C7027 c7027, CharSequence charSequence, int i, int i2, float f, C6585 c6585) {
        C0676 c0676 = this.f11537;
        m9176(c0676, c7027);
        try {
            if (c0676.m3037(i) && c0676.m3035() < i2) {
                float fM17871 = c6585.m17871(charSequence, i, c0676.m3035(), f);
                while (c0676.m3038()) {
                    if (c0676.m3035() < i2) {
                        fM17871 += c6585.m17871(charSequence, c0676.m3040(), c0676.m3035(), f + fM17871);
                    } else {
                        return fM17871 + c6585.m17871(charSequence, c0676.m3040(), i2, f + fM17871);
                    }
                }
                return fM17871;
            }
            return c6585.m17871(charSequence, i, i2, f);
        } finally {
            c0676.m3033();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9180(int i, int i2, C7027 c7027) {
        long j;
        long j2;
        long j3;
        C0676 c0676 = this.f11537;
        m9176(c0676, c7027);
        try {
            if (m9177(c0676, i, i)) {
                int iM3040 = c0676.m3040();
                int iM3035 = c0676.m3035();
                int iM9163 = C3057.m9163(c0676.m3039().m37376(), i2);
                if (i == iM3040) {
                    if (c0676.m3041()) {
                        int iM9164 = C3057.m9163(c0676.m3039().m37376(), i2);
                        if (iM9164 == iM9163) {
                            j2 = iM9163;
                        } else {
                            j3 = iM9164;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM9163)) << 32);
                        }
                    } else {
                        if (iM9163 != i2) {
                            j3 = i2;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM9163)) << 32);
                        }
                        j2 = iM9163;
                    }
                } else if (iM9163 == i2 || i != iM3035 || c0676.m3038()) {
                    j2 = iM9163;
                } else {
                    j = ((((long) i2) & 4294967295L) << 32) | (((long) iM9163) & 4294967295L);
                }
                return j;
            }
            j2 = i2;
            j = j2 & 4294967295L;
            return j;
        } finally {
            c0676.m3033();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9184(C7027 c7027, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, Paint paint, C1590 c1590, int[] iArr) {
        float f3;
        float fM17859;
        C0676 c0676 = this.f11537;
        m9176(c0676, c7027);
        int i4 = i;
        try {
            if (c0676.m3037(i4)) {
                if (c0676.m3035() < i2 || (c0676.m3039().m37376() >>> 24) != 0) {
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    while (i4 < i2) {
                        float f6 = i3;
                        if (f5 > f6) {
                            break;
                        }
                        int iMin = Math.min(i2, c0676.m3035());
                        int iM37376 = c0676.m3039().m37376();
                        if ((iM37376 >>> 24) != 0) {
                            f3 = f6;
                            fM17859 = m9173(iM37376, canvas, charSequence, i4, iMin, f5, f, f2, f4, i3, paint, c1590, iArr);
                            iMin = iMin;
                        } else {
                            f3 = f6;
                            fM17859 = c1590.m17859(charSequence, i4, iMin, f4, Math.max(0.0f, f3 - f5));
                        }
                        f5 += fM17859;
                        f4 += fM17859;
                        if (f5 >= f3 || iMin == i2 || !c0676.m3038()) {
                            return;
                        } else {
                            i4 = iMin;
                        }
                    }
                }
            }
        } finally {
            c0676.m3033();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m9189(int i, C7027 c7027) {
        C0676 c0676 = this.f11537;
        m9176(c0676, c7027);
        try {
            if (c0676.m3037(i) && c0676.m3039().m37377()) {
                int iM3040 = c0676.m3040();
                int iM3035 = c0676.m3035();
                while (c0676.m3041() && c0676.m3039().m37377()) {
                    iM3040 = c0676.m3040();
                }
                if (!c0676.m3037(i)) {
                    return null;
                }
                while (c0676.m3038() && c0676.m3039().m37377()) {
                    iM3035 = c0676.m3035();
                }
                return new int[]{iM3040, iM3035};
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            c0676.m3033();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22362 m9191(int i, int i2, C7027 c7027) {
        C0676 c0676 = this.f11537;
        m9176(c0676, c7027);
        try {
            if (m9177(c0676, i, i2)) {
                int iM3040 = c0676.m3040();
                int iM3035 = c0676.m3035();
                C15682 c15682M3039 = c0676.m3039();
                c0676.m3034();
                return new C22362(iM3040, iM3035, c15682M3039);
            }
            return null;
        } finally {
            c0676.m3033();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9176(C0676 c0676, C7027 c7027) {
        if (c7027 == null) {
            c7027 = C7027.m18855();
        }
        c0676.m3036(c7027);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9177(C0676 c0676, int i, int i2) {
        try {
            if (!c0676.m3037(i)) {
                return false;
            }
            if (i < c0676.m3035() || c0676.m3038()) {
                return i == i2 || c0676.m3035() >= i2;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m9173(int i, Canvas canvas, CharSequence charSequence, int i2, int i3, float f, float f2, float f3, float f4, int i4, Paint paint, C1590 c1590, int[] iArr) {
        paint.setColor(i);
        float fMax = Math.max(0.0f, i4 - f);
        float fM17859 = c1590.m17859(charSequence, i2, i3, f4, fMax);
        float f5 = (int) f2;
        float f6 = (int) f3;
        canvas.drawRect(f, f5, f + fM17859, f6, paint);
        C12936 c12936M17860 = null;
        int i5 = 1;
        while (i5 < iArr.length) {
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            if (i6 == i7 || i7 <= i2 || i6 >= i3) {
                f6 = f6;
                i5 = i5;
            } else {
                if (c12936M17860 == null) {
                    c12936M17860 = c1590.m17860(charSequence, i2, i3, f4, (C2605) null);
                }
                C12936 c12936 = c12936M17860;
                float fM32047 = c12936.m32047(fMax, Math.max(i2, i6));
                if (fM32047 < fM17859) {
                    float fM32048 = c12936.m32047(fMax, Math.min(i3, i7));
                    paint.setColor(C3224.m9662(i, iArr[0], 0.7f));
                    canvas.drawRect(f + fM32047, f5, f + fM32048, f6, paint);
                }
                c12936M17860 = c12936;
            }
            i5 += 2;
            f6 = f6;
        }
        return fM17859;
    }
}
