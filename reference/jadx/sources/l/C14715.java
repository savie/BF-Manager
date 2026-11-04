package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܰܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6ZC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14715 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23667 f48080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f48081;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48085;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f48088;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f48079 = 1.0f;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f48090 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f48083 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21407 f48087 = new C21407();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4275 f48084 = new InterfaceC22592() { // from class: l.ۘܺᩴ
        @Override // l.InterfaceC22592
        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean mo13628(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, Runnable runnable) {
            return C14715.m35389(this.f15531, canvas, f, f2, f3, f4, runnable);
        }
    };

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2236 f48086 = new C2236();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2236 f48089 = new C2236();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1534 f48082 = new C1534();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35397(C23667 c23667, int i, int i2, int i3) {
        this.f48080 = c23667;
        this.f48090 = i;
        this.f48083 = i2;
        this.f48085 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35398() {
        return this.f48088;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35394(float f, int i) {
        this.f48081 = i;
        this.f48079 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35399(C1270 c1270, int i, int i2, int i3) {
        boolean z = false;
        if (c1270 == null || i2 < 0 || i2 >= i3 || i3 > c1270.m4628()) {
            return false;
        }
        synchronized (this.f48089) {
            C2236 c2236 = this.f48089;
            c2236.m7623(c1270);
            try {
                if (c2236.m7624(i2) && c2236.m7622() >= i3 && c2236.m7625().m30045() == i) {
                    z = true;
                }
                c2236.m7626();
            } catch (Throwable th) {
                c2236.m7626();
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m35401(int i, int i2, C1270 c1270) {
        C2236 c2236 = this.f48089;
        synchronized (c2236) {
            m35387(c2236, c1270);
            try {
                if (m35388(c2236, i, i)) {
                    int iM30045 = c2236.m7625().m30045();
                    c2236.m7626();
                    return iM30045;
                }
                c2236.m7626();
                return i2;
            } catch (Throwable th) {
                c2236.m7626();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35396(C1270 c1270, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint, C14540 c14540) throws Throwable {
        C2236 c2236;
        this.f48088 = false;
        C2236 c2237 = this.f48086;
        m35387(c2237, c1270);
        try {
            if (!c2237.m7624(i)) {
                c2237.m7626();
                return;
            }
            int i5 = i;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (true) {
                C11974 c11974M7625 = c2237.m7625();
                int iMin = Math.min(i2, c2237.m7622());
                boolean z = iMin < i2;
                int iM30045 = c11974M7625.m30045();
                float f4 = this.f48079;
                if (f4 < 1.0f) {
                    iM30045 = C19988.m45958(this.f48081, iM30045, f4);
                }
                paint.setColor(iM30045);
                c2236 = c2237;
                try {
                    float fM35385 = m35385(c14540, canvas, charSequence, i5, iMin, f2, f, i3, i4, f3, paint, c11974M7625.m30042(), z);
                    if (z) {
                        f2 += fM35385;
                        f3 += fM35385;
                        if (f2 > i4 || !c2236.m7628()) {
                            c2236.m7626();
                            return;
                        } else {
                            c2237 = c2236;
                            i5 = iMin;
                        }
                    } else {
                        c2236.m7626();
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c2236 = c2237;
        }
        c2236.m7626();
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m35385(C14540 c14540, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) throws Throwable {
        C21407 c21407;
        int i6;
        Paint paint2;
        int iM30045;
        int iMin;
        boolean z2;
        int i7;
        int i8;
        int i9;
        float fM16217;
        C14715 c14715 = this;
        Paint paint3 = paint;
        C23667 c23667 = c14715.f48080;
        if (c23667 != null) {
            int i10 = c23667.f76757;
            int i11 = c23667.f76756;
            if (i11 < i2 && i10 > i && (c14715.f48090 > i || i2 > c14715.f48083)) {
                int color = paint.getColor();
                C1270 c1270 = c23667.f76755;
                C21407 c21408 = c14715.f48087;
                c21408.m48710(c1270);
                int i12 = i;
                float f4 = 0.0f;
                while (i12 < i2) {
                    float f5 = f + f4;
                    if (f5 > i4) {
                        break;
                    }
                    if (i12 < i11) {
                        z2 = false;
                        iM30045 = color;
                        iMin = i11;
                    } else if (i12 < i10) {
                        try {
                            if (c14715.f48090 <= i12 && i12 < (i7 = c14715.f48083)) {
                                iMin = Math.min(i2, i7);
                                iM30045 = color;
                                z2 = false;
                            } else {
                                c21408.m48711(i12 - i11);
                                int iMin2 = Math.min(i2, c21408.m48709() + i11);
                                int i13 = c14715.f48090;
                                if (i12 < i13) {
                                    iMin2 = Math.min(iMin2, i13);
                                }
                                iM30045 = c21408.m48712().m30045();
                                iMin = iMin2;
                                z2 = (iM30045 == color || iM30045 == c14715.f48085) ? false : true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c21407 = c21408;
                            i6 = color;
                            paint2 = paint3;
                            paint2.setColor(i6);
                            c21407.m48710(C1270.m4622());
                            throw th;
                        }
                    } else {
                        z2 = false;
                        iMin = i2;
                        iM30045 = color;
                    }
                    try {
                        paint3.setColor(iM30045);
                        if (z2 && !c14715.f48088) {
                            float f6 = f3 + f4;
                            boolean z3 = z || iMin < i2;
                            C4275 c4275 = c14715.f48084;
                            i9 = iMin;
                            c21407 = c21408;
                            i8 = color;
                            try {
                                fM16217 = c14540.m16193(canvas, charSequence, i12, iMin, f5, f2, i3, i4, f6, paint, i5, z3, c4275);
                            } catch (Throwable th2) {
                                th = th2;
                                paint2 = paint;
                                i6 = i8;
                                paint2.setColor(i6);
                                c21407.m48710(C1270.m4622());
                                throw th;
                            }
                        } else {
                            i9 = iMin;
                            c21407 = c21408;
                            i8 = color;
                            fM16217 = c14540.m16217(canvas, charSequence, i12, i9, f5, f2, i3, i4, f3 + f4, paint, i5, z || i9 < i2);
                        }
                        f4 += fM16217;
                        paint3 = paint;
                        i12 = i9;
                        c21408 = c21407;
                        color = i8;
                        i11 = i11;
                        i10 = i10;
                        c14715 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c21407 = c21408;
                        i8 = color;
                    }
                }
                paint3.setColor(color);
                c21408.m48710(C1270.m4622());
                return f4;
            }
        }
        return c14540.m16217(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35389(C14715 c14715, Canvas canvas, float f, float f2, float f3, float f4, Runnable runnable) {
        runnable.run();
        int iSave = canvas.save();
        try {
            if (canvas.clipRect((float) Math.floor(f), (float) Math.floor(f2), (float) Math.ceil(f3), (float) Math.ceil(f4))) {
                c14715.f48088 = true;
            }
            return c14715.f48088;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m35393(C9736 c9736, CharSequence charSequence, int i, int i2) {
        C11974 c11974Mo4795;
        C11974 c11974M35386;
        int iM25366;
        C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C11974 c11974 = null;
        if (charSequence.length() != c9736.m25365() || i < 0 || i > i2 || i2 > charSequence.length() || !c9736.m25367(i, i2)) {
            return null;
        }
        if (i != i2) {
            C1534 c1534 = this.f48082;
            c1534.m5446(c9736, i, i2);
            C1270 c1270M25359 = c9736.m25359();
            C2236 c2236 = this.f48086;
            m35387(c2236, c1270M25359);
            int i3 = -1;
            int i4 = Integer.MAX_VALUE;
            C11974 c11975 = null;
            do {
                try {
                    int iM5447 = c1534.m5447();
                    int iM5445 = c1534.m5445();
                    int iM5449 = c1534.m5449();
                    int iM25367 = c9736.m25366(iM5449);
                    C16800 c16800M25361 = c9736.m25361(iM5449);
                    if (c16800M25361 != null) {
                        Iterator it = c16800M25361.m39681().iterator();
                        do {
                            if (it.hasNext()) {
                                c11974Mo4795 = ((InterfaceC2630) it.next()).mo4795(iM5447, iM5445, charSequence);
                            }
                        } while (c11974Mo4795 == null);
                        if (c11974Mo4795 == null && c1270M25359.m4632(iM5447, iM5445) && c2236.m7624(iM5447)) {
                            do {
                                c11974Mo4795 = m35386(c2236.m7625());
                                if (c11974Mo4795 == null || c2236.m7622() >= iM5445) {
                                    break;
                                    break;
                                }
                            } while (c2236.m7628());
                        }
                        if (c11974Mo4795 != null && (iM25367 > i3 || (iM25367 == i3 && iM5447 < i4))) {
                            i4 = iM5447;
                            i3 = iM25367;
                            c11975 = c11974Mo4795;
                        }
                    }
                    c11974Mo4795 = null;
                    if (c11974Mo4795 == null) {
                        do {
                            c11974Mo4795 = m35386(c2236.m7625());
                            if (c11974Mo4795 == null) {
                                break;
                            }
                        } while (c2236.m7628());
                    }
                    if (c11974Mo4795 != null) {
                        i4 = iM5447;
                        i3 = iM25367;
                        c11975 = c11974Mo4795;
                    }
                } finally {
                    c1534.m5448();
                    c2236.m7626();
                }
            } while (c1534.m5450());
            if (i2 < charSequence.length()) {
                int i5 = i2 + 1;
                if (c9736.m25367(i2, i5) && c1270M25359.m4632(i2, i5) && c2236.m7624(i2) && c2236.m7629() == i2 && (c11974M35386 = m35386(c2236.m7625())) != null && ((iM25366 = c9736.m25366(c9736.m25357(i2))) > i3 || (iM25366 == i3 && i2 < i4))) {
                    c11975 = c11974M35386;
                }
            }
            return c11975;
        }
        C16800 c16800M25362 = c9736.m25361(c9736.m25358(i, i));
        if (c16800M25362 != null) {
            Iterator it2 = c16800M25362.m39681().iterator();
            while (it2.hasNext()) {
                C11974 c11974Mo4796 = ((InterfaceC2630) it2.next()).mo4795(i, i, charSequence);
                if (c11974Mo4796 != null) {
                    c11974 = c11974Mo4796;
                    break;
                }
            }
        }
        if (c11974 != null || charSequence.length() == 0) {
            return c11974;
        }
        if (i >= charSequence.length()) {
            i--;
        }
        return m35386(c9736.m25359().m4631(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m35392(C1270 c1270, CharSequence charSequence, int i, int i2) {
        C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        if (c1270 != null && c1270.m4628() == charSequence.length() && i >= 0 && i <= i2 && i2 <= charSequence.length()) {
            if (i != i2) {
                if (c1270.m4632(i, i2 < charSequence.length() ? i2 + 1 : i2)) {
                    C2236 c2236 = this.f48086;
                    c2236.m7623(c1270);
                    try {
                        if (!c2236.m7624(i)) {
                            return null;
                        }
                        while (c2236.m7629() <= i2) {
                            C11974 c11974M35386 = m35386(c2236.m7625());
                            if (c11974M35386 != null) {
                                return c11974M35386;
                            }
                            if (!c2236.m7628()) {
                                break;
                            }
                        }
                        return null;
                    } finally {
                        c2236.m7626();
                    }
                }
            } else if (charSequence.length() != 0) {
                if (i >= charSequence.length()) {
                    i--;
                }
                return m35386(c1270.m4631(i));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11974 m35386(C11974 c11974) {
        if ((c11974.m30040() & (-16777216)) != 100663296) {
            return null;
        }
        return C11974.m30032(null, c11974.m30046() | (-16777216), 1447446, c11974.m30047() | (-16777216), 1447446, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m35390(C1270 c1270, CharSequence charSequence, int i, int i2, float f, C5438 c5438) {
        C2236 c2236 = this.f48086;
        m35387(c2236, c1270);
        try {
            if (c2236.m7624(i) && c2236.m7622() < i2) {
                float fM16205 = c5438.m16205(charSequence, i, c2236.m7622(), f);
                while (c2236.m7628()) {
                    if (c2236.m7622() < i2) {
                        fM16205 += c5438.m16205(charSequence, c2236.m7629(), c2236.m7622(), f + fM16205);
                    } else {
                        return fM16205 + c5438.m16205(charSequence, c2236.m7629(), i2, f + fM16205);
                    }
                }
                return fM16205;
            }
            return c5438.m16205(charSequence, i, i2, f);
        } finally {
            c2236.m7626();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m35391(int i, int i2, C1270 c1270) {
        long j;
        long j2;
        long j3;
        C2236 c2236 = this.f48086;
        m35387(c2236, c1270);
        try {
            if (m35388(c2236, i, i)) {
                int iM7629 = c2236.m7629();
                int iM7622 = c2236.m7622();
                int iM22615 = C8420.m22615(c2236.m7625().m30040(), i2);
                if (i == iM7629) {
                    if (c2236.m7627()) {
                        int iM22616 = C8420.m22615(c2236.m7625().m30040(), i2);
                        if (iM22616 == iM22615) {
                            j2 = iM22615;
                        } else {
                            j3 = iM22616;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM22615)) << 32);
                        }
                    } else {
                        if (iM22615 != i2) {
                            j3 = i2;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM22615)) << 32);
                        }
                        j2 = iM22615;
                    }
                } else if (iM22615 == i2 || i != iM7622 || c2236.m7628()) {
                    j2 = iM22615;
                } else {
                    j = ((((long) i2) & 4294967295L) << 32) | (((long) iM22615) & 4294967295L);
                }
                return j;
            }
            j2 = i2;
            j = j2 & 4294967295L;
            return j;
        } finally {
            c2236.m7626();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35395(C1270 c1270, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, Paint paint, C14540 c14540, int[] iArr) {
        float f3;
        float fM16195;
        C2236 c2236 = this.f48086;
        m35387(c2236, c1270);
        int i4 = i;
        try {
            if (c2236.m7624(i4)) {
                if (c2236.m7622() < i2 || (c2236.m7625().m30040() >>> 24) != 0) {
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    while (i4 < i2) {
                        float f6 = i3;
                        if (f5 > f6) {
                            break;
                        }
                        int iMin = Math.min(i2, c2236.m7622());
                        int iM30040 = c2236.m7625().m30040();
                        if ((iM30040 >>> 24) != 0) {
                            f3 = f6;
                            fM16195 = m35384(iM30040, canvas, charSequence, i4, iMin, f5, f, f2, f4, i3, paint, c14540, iArr);
                            iMin = iMin;
                        } else {
                            f3 = f6;
                            fM16195 = c14540.m16195(charSequence, i4, iMin, f4, Math.max(0.0f, f3 - f5));
                        }
                        f5 += fM16195;
                        f4 += fM16195;
                        if (f5 >= f3 || iMin == i2 || !c2236.m7628()) {
                            return;
                        } else {
                            i4 = iMin;
                        }
                    }
                }
            }
        } finally {
            c2236.m7626();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m35400(int i, C1270 c1270) {
        C2236 c2236 = this.f48086;
        m35387(c2236, c1270);
        try {
            if (c2236.m7624(i) && c2236.m7625().m30044()) {
                int iM7629 = c2236.m7629();
                int iM7622 = c2236.m7622();
                while (c2236.m7627() && c2236.m7625().m30044()) {
                    iM7629 = c2236.m7629();
                }
                if (!c2236.m7624(i)) {
                    return null;
                }
                while (c2236.m7628() && c2236.m7625().m30044()) {
                    iM7622 = c2236.m7622();
                }
                return new int[]{iM7629, iM7622};
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            c2236.m7626();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19213 m35402(int i, int i2, C1270 c1270) {
        C2236 c2236 = this.f48086;
        m35387(c2236, c1270);
        try {
            if (m35388(c2236, i, i2)) {
                int iM7629 = c2236.m7629();
                int iM7622 = c2236.m7622();
                C11974 c11974M7625 = c2236.m7625();
                c2236.m7630();
                return new C19213(iM7629, iM7622, c11974M7625);
            }
            return null;
        } finally {
            c2236.m7626();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35387(C2236 c2236, C1270 c1270) {
        if (c1270 == null) {
            c1270 = C1270.m4622();
        }
        c2236.m7623(c1270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35388(C2236 c2236, int i, int i2) {
        try {
            if (!c2236.m7624(i)) {
                return false;
            }
            if (i < c2236.m7622() || c2236.m7628()) {
                return i == i2 || c2236.m7622() >= i2;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m35384(int i, Canvas canvas, CharSequence charSequence, int i2, int i3, float f, float f2, float f3, float f4, int i4, Paint paint, C14540 c14540, int[] iArr) {
        paint.setColor(i);
        float fMax = Math.max(0.0f, i4 - f);
        float fM16195 = c14540.m16195(charSequence, i2, i3, f4, fMax);
        float f5 = (int) f2;
        float f6 = (int) f3;
        canvas.drawRect(f, f5, f + fM16195, f6, paint);
        C19608 c19608M16196 = null;
        int i5 = 1;
        while (i5 < iArr.length) {
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            if (i6 == i7 || i7 <= i2 || i6 >= i3) {
                f6 = f6;
                i5 = i5;
            } else {
                if (c19608M16196 == null) {
                    c19608M16196 = c14540.m16196(charSequence, i2, i3, f4, (C0568) null);
                }
                C19608 c19608 = c19608M16196;
                float fM45254 = c19608.m45254(fMax, Math.max(i2, i6));
                if (fM45254 < fM16195) {
                    float fM45255 = c19608.m45254(fMax, Math.min(i3, i7));
                    paint.setColor(C19988.m45958(i, iArr[0], 0.7f));
                    canvas.drawRect(f + fM45254, f5, f + fM45255, f6, paint);
                }
                c19608M16196 = c19608;
            }
            i5 += 2;
            f6 = f6;
        }
        return fM16195;
    }
}
