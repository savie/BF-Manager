package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.Selection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۫ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12359 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f41284;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f41285;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C1590 f41286;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3329 f41287;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f41288;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f41289;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Runnable f41290;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f41291;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final RectF f41292;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41293;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int[] f41294;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4555 f41295;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f41296;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f41297;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0363 f41298;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final RectF f41299;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f41300;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f41301;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Rect f41302;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f41303;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f41304;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f41305;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C3329 f41306;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f41307;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3662 f41308;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f41309;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final RectF f41310;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f41311;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int[] f41312;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41313;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6111 f41314;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15846 f41315;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41316;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f41317;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22398 f41318;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f41319;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f41320;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18667 f41321;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3662 f41322;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22398 f41323;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile C18811 f41324;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f41325;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f41326;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f41327;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f41328;

    /* JADX INFO: renamed from: ֡ */
    public abstract Throwable mo14778();

    /* JADX INFO: renamed from: ۘ */
    public abstract byte mo14781();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo14782(C16592 c16592);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14783(float f);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14784(int i, int i2, int i3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo30736(Canvas canvas, int i, float f, int i2, C4916 c4916) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo14788();

    /* JADX INFO: renamed from: ۜ */
    public abstract float mo14790();

    /* JADX INFO: renamed from: ۡ */
    public boolean mo14791() {
        return false;
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo14793() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo14794();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14797();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14798(InterfaceC2916 interfaceC2916);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo14800(C16592 c16592);

    /* JADX INFO: renamed from: ܺ */
    public abstract void mo14802();

    /* JADX INFO: renamed from: ᩹ */
    public void mo14805(int i) {
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3329 m30760() {
        C3329 c3329Mo2399;
        synchronized (this.f41303) {
            C3329 c3329 = this.f41287;
            c3329Mo2399 = c3329 == null ? this.f41297.mo2399() : c3329.m9891();
        }
        return c3329Mo2399;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m30762() {
        boolean z;
        synchronized (this.f41303) {
            z = this.f41287 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m30745() {
        return this.f41327;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m30728(int i, int i2) {
        if (i < 0) {
            i = 0;
        } else {
            int i3 = this.f41284;
            if (i > i3) {
                i = i3;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        } else {
            int i4 = this.f41284;
            if (i2 > i4) {
                i2 = i4;
            }
        }
        return m30733(i, this.f41296) == m30733(i2, this.f41296);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo30739(RectF rectF, int i) {
        float fM32047;
        float f;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f41284;
            if (i > i2) {
                i = i2;
            }
        }
        int iM30733 = m30733(i, this.f41296);
        C14435 c14435 = this.f41308.get(iM30733);
        int iM30726 = m30726(iM30733);
        int iMin = Math.min(i, c14435.m34708());
        int i3 = c14435.f47316;
        int i4 = c14435.f47317;
        C1590 c1590 = this.f41286;
        if (i3 == i4) {
            fM32047 = c1590.f6375;
            f = 0.0f;
        } else {
            C3329 c3329Mo2399 = this.f41297.mo2399();
            try {
                C12936 c12936M30714 = m30714(c14435.f47316, c14435.m34708(), c3329Mo2399);
                float fM32048 = c12936M30714.m32047(Float.POSITIVE_INFINITY, iMin);
                if (c14435.m34708() <= iMin) {
                    fM32047 = c1590.f6375 + fM32048;
                } else {
                    fM32047 = c12936M30714.m32047(Float.POSITIVE_INFINITY, C20149.m45558(iMin, c14435.m34708(), c3329Mo2399));
                }
                c3329Mo2399.close();
                f = fM32048;
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        float f2 = iM30726;
        rectF.left = f + f2;
        rectF.right = fM32047 + f2;
        float fM17870 = c1590.m17870();
        float f3 = iM30733 * fM17870;
        rectF.top = f3;
        rectF.bottom = f3 + fM17870;
    }

    /* JADX INFO: renamed from: ۚ */
    public boolean mo14789(int i, int i2) {
        int i3 = this.f41284;
        int iMax = Math.max(0, i);
        int iMin = Math.min(i3, i2);
        if (iMax < iMin && !this.f41308.isEmpty() && !this.f41315.isEmpty()) {
            int iM30733 = m30733(iMax, true);
            int iM30734 = m30733(iMin - 1, false);
            int iM10821 = this.f41308.m10821(iM30733);
            int iM10822 = this.f41308.m10821(iM30734) + 1;
            int iM10801 = this.f41308.m10801(iM30733);
            int iM17881 = this.f41286.m17881();
            C3329 c3329Mo2399 = this.f41297.mo2399();
            for (int i4 = iM10821; i4 < iM10822; i4++) {
                try {
                    iM10801 = this.f41308.m10802(i4, iM10801);
                    if (iM10801 == -1 || i4 >= this.f41315.size()) {
                        break;
                        break;
                    }
                    this.f41315.m37705(i4, this, c3329Mo2399, this.f41308.m10813(iM10801), iM17881);
                } catch (Throwable th) {
                    try {
                        c3329Mo2399.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c3329Mo2399.close();
            this.f41315.m37703(iM10821, iM10822);
            this.f41321.f60592 = Integer.MIN_VALUE;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m30746() {
        return this.f41284 == 0 && !this.f41322.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30753(RectF rectF, int i) {
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f41284;
            if (i > i2) {
                i = i2;
            }
        }
        int iM30733 = m30733(i, this.f41296);
        float fM17870 = this.f41286.m17870();
        float f = iM30733 * fM17870;
        rectF.top = f;
        rectF.bottom = f + fM17870;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m30756() {
        return this.f41284;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m30759() {
        return this.f41297 != null && this.f41327 == this.f41297.mo2395();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30755() {
        synchronized (this.f41303) {
            C3329 c3329 = this.f41287;
            if (c3329 != null) {
                c3329.close();
                this.f41287 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30741(InterfaceC2916 interfaceC2916, C3329 c3329) {
        synchronized (this.f41303) {
            m30755();
            this.f41297 = interfaceC2916;
            this.f41287 = c3329;
            this.f41327 = c3329.m9896();
            this.f41284 = c3329.length();
        }
        m30754();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30719(AbstractC12359 abstractC12359) {
        abstractC12359.f41291.set(false);
        abstractC12359.m30722();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30749() {
        int i;
        if (this instanceof C5325) {
            i = ((C5325) this).m14792() ? 1 : 2;
        } else {
            i = 0;
        }
        this.f41324 = this.f41314.m16811(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12359 m30713(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, int i) {
        if (i == 0) {
            return new C21489(c6111, interfaceC2916, c1590);
        }
        return new C5325(c6111, interfaceC2916, c1590, i == 1);
    }

    public AbstractC12359(C6111 c6111, C1590 c1590) {
        this.f41305 = C13932.m33769(10.0f);
        this.f41303 = new Object();
        this.f41309 = new AtomicInteger();
        this.f41291 = new AtomicBoolean();
        this.f41290 = new RunnableC12918(1, this);
        this.f41298 = new C0363(this);
        this.f41308 = new C3662();
        this.f41315 = new C15846();
        this.f41322 = new C3662();
        this.f41313 = -1;
        this.f41296 = true;
        this.f41310 = new RectF();
        this.f41292 = new RectF();
        this.f41299 = new RectF();
        this.f41318 = new C22398(-1);
        this.f41323 = new C22398(1);
        this.f41321 = new C18667();
        this.f41295 = new C4555();
        this.f41294 = new int[3];
        this.f41312 = new int[7];
        this.f41302 = new Rect();
        this.f41304 = new Rect();
        this.f41320 = new ArrayList(2);
        this.f41317 = false;
        this.f41325 = false;
        this.f41314 = c6111;
        this.f41286 = c1590;
        this.f41324 = c6111.m16815();
    }

    public AbstractC12359(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, C17367 c17367) {
        this.f41305 = C13932.m33769(10.0f);
        this.f41303 = new Object();
        this.f41309 = new AtomicInteger();
        this.f41291 = new AtomicBoolean();
        this.f41290 = new RunnableC12918(1, this);
        this.f41298 = new C0363(this);
        this.f41308 = new C3662();
        this.f41315 = new C15846();
        this.f41322 = new C3662();
        this.f41313 = -1;
        this.f41296 = true;
        this.f41310 = new RectF();
        this.f41292 = new RectF();
        this.f41299 = new RectF();
        this.f41318 = new C22398(-1);
        this.f41323 = new C22398(1);
        this.f41321 = new C18667();
        this.f41295 = new C4555();
        this.f41294 = new int[3];
        this.f41312 = new int[7];
        this.f41302 = new Rect();
        this.f41304 = new Rect();
        this.f41320 = new ArrayList(2);
        this.f41317 = false;
        this.f41325 = false;
        this.f41314 = c6111;
        this.f41286 = c1590;
        this.f41324 = c6111.m16815();
        this.f41316 = c17367.readInt();
        int i = c17367.readInt();
        this.f41308.getClass();
        boolean zM40447 = c17367.m40447(-249333469);
        C14435 c14435 = new C14435();
        for (int i2 = 0; i2 < i; i2++) {
            c14435.m34709(c17367.readInt(), c17367.readInt(), c17367.readInt());
            this.f41308.m10810(c14435);
            if (!zM40447) {
                c17367.skipBytes(4);
            }
        }
        if (c17367.m40447(1916422180)) {
            int i3 = c17367.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f41315.add(c17367.m40462() | ((c17367.readByte() & 255) << 16));
            }
            this.f41315.m37708();
            return;
        }
        this.f41315.m37706(this, interfaceC2916, this.f41308, c1590.m17881());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30740(InterfaceC2916 interfaceC2916) {
        synchronized (this.f41303) {
            if (this.f41287 == null || this.f41297 != interfaceC2916) {
                m30741(interfaceC2916, interfaceC2916.mo2399());
            }
        }
        m30754();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m30754() {
        if (this instanceof C21489) {
            ((C21489) this).m48128();
        }
        this.f41309.incrementAndGet();
        if (this.f41306 == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m30722();
        } else if (this.f41291.compareAndSet(false, true)) {
            C16737.m39273(this.f41290);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m30722() {
        if (this.f41326) {
            return;
        }
        if (this.f41293 == this.f41309.get() && this.f41311 == this.f41297) {
            return;
        }
        C3329 c3329 = this.f41306;
        this.f41306 = null;
        this.f41311 = null;
        if (c3329 != null) {
            c3329.close();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C3329 m30724() {
        InterfaceC2916 interfaceC2916 = this.f41297;
        int i = this.f41309.get();
        if (this.f41306 == null || this.f41311 != interfaceC2916 || this.f41293 != i || !interfaceC2916.mo2394(this.f41306)) {
            C3329 c3329 = this.f41306;
            this.f41306 = null;
            this.f41311 = null;
            if (c3329 != null) {
                c3329.close();
            }
            this.f41311 = interfaceC2916;
            this.f41293 = i;
            this.f41306 = interfaceC2916.mo2399();
            this.f41306.f12332 = true;
        }
        return this.f41306;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30727() {
        if (this.f41308.isEmpty() || this.f41308.m10803().f47317 != this.f41284) {
            System.err.println("Lines check fail. Try fix.");
            mo14798(this.f41297);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14785(String str) {
        this.f41300 = str;
        if (str == null || str.isEmpty()) {
            this.f41322.clear();
            return;
        }
        C3662 c3662 = new C3662();
        C14435 c14435 = new C14435();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int iIndexOf = this.f41314.mo16903() ? -1 : str.indexOf(10, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
                z = false;
            }
            c14435.m34709(i, iIndexOf, i2);
            c3662.m10810(c14435);
            i = iIndexOf + 1;
            i2++;
        }
        this.f41322 = c3662;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double m30743() {
        boolean zM30746 = m30746();
        C6111 c6111 = this.f41314;
        AbstractC15910 abstractC15910 = c6111.f20789;
        return (((double) this.f41286.m17870()) * ((double) (zM30746 ? this.f41322 : this.f41308).size())) + ((double) Math.max(c6111.m17062(), abstractC15910 != null ? abstractC15910.m37825() : 0));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int mo30761() {
        C1590 c1590 = this.f41286;
        boolean z = c1590.f6381;
        int i = c1590.f6420;
        if (z) {
            return c1590.f6388 ? this.f41316 + c1590.f6439 : c1590.f6416;
        }
        if (c1590.f6393) {
            return i + c1590.f6439;
        }
        return Math.max(c1590.f6439, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m30726(int i) {
        int iMo30761 = mo30761();
        return (!mo14793() || this.f41308.m10800(i)) ? iMo30761 : this.f41286.m5427() + iMo30761;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int mo30751() {
        C1590 c1590 = this.f41286;
        boolean z = c1590.f6381;
        int i = c1590.f6420;
        if (!z) {
            return c1590.f6388 ? this.f41316 + c1590.f6439 : c1590.f6416;
        }
        if (c1590.f6393) {
            return i + c1590.f6439;
        }
        return Math.max(c1590.f6439, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30731(int i) {
        float length = String.valueOf(((long) this.f41308.m10803().f47319) + 1 + ((long) i)).length() + 1;
        C1590 c1590 = this.f41286;
        return (int) ((length + c1590.f6390) * c1590.f6410);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m30750() {
        this.f41296 = true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m30747() {
        return this.f41296;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30730(float f, float f2) {
        this.f41328 = false;
        int iM30729 = m30729(f2);
        if (f <= m30726(iM30729)) {
            return m30734(this.f41297, iM30729, f);
        }
        C3329 c3329Mo2399 = this.f41297.mo2399();
        try {
            int iM30734 = m30734(c3329Mo2399, iM30729, f);
            c3329Mo2399.close();
            return iM30734;
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30729(double d) {
        int iM17870 = (int) (d / ((double) this.f41286.m17870()));
        if (iM17870 < 0) {
            this.f41328 = true;
            return 0;
        }
        if (iM17870 < this.f41308.size()) {
            return iM17870;
        }
        this.f41328 = true;
        return this.f41308.m10811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m30712(double d, boolean z) {
        int iM17870 = (int) (d / ((double) this.f41286.m17870()));
        if (iM17870 < 0) {
            return 0;
        }
        if (z) {
            return iM17870 >= this.f41322.size() ? this.f41322.m10811() : iM17870;
        }
        return iM17870 >= this.f41308.size() ? this.f41308.m10811() : iM17870;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30734(CharSequence charSequence, int i, float f) {
        float fM30726 = f - m30726(i);
        C14435 c14435 = this.f41308.get(i);
        int i2 = c14435.f47316;
        int iM34708 = c14435.m34708();
        boolean z = true;
        if (fM30726 <= 0.0f) {
            this.f41296 = true;
            return i2;
        }
        C12936 c12936M30714 = m30714(i2, iM34708, charSequence);
        int iM32048 = c12936M30714.m32048(fM30726);
        if (iM32048 == iM34708) {
            this.f41328 = fM30726 > c12936M30714.m32046();
        }
        if (iM32048 != i2 && !this.f41308.m10815(i)) {
            z = false;
        }
        this.f41296 = z;
        return iM32048;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12936 m30714(int i, int i2, CharSequence charSequence) {
        C1590 c1590 = this.f41286;
        if (c1590.f6398) {
            C6111 c6111 = this.f41314;
            if (c6111.f20770.m32642()) {
                return c6111.f20770.m32625(charSequence, i, i2, c1590);
            }
        }
        return this.f41286.m17860(charSequence, i, i2, 0.0f, (C2605) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30742(RectF rectF) {
        int selectionStart = Selection.getSelectionStart(this.f41297);
        int selectionEnd = Selection.getSelectionEnd(this.f41297);
        if (selectionStart == selectionEnd) {
            return false;
        }
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int iM30733 = m30733(selectionStart, this.f41296);
        C14435 c14435 = this.f41308.get(iM30733);
        if (c14435.f47316 >= selectionEnd || selectionEnd > c14435.f47317) {
            return false;
        }
        int iM30726 = m30726(iM30733);
        C3329 c3329Mo2399 = this.f41297.mo2399();
        try {
            C12936 c12936M30714 = m30714(c14435.f47316, c14435.m34708(), c3329Mo2399);
            float fM32047 = c12936M30714.m32047(Float.POSITIVE_INFINITY, Math.min(selectionStart, c14435.m34708()));
            float fM32048 = c12936M30714.m32047(Float.POSITIVE_INFINITY, Math.min(selectionEnd, c14435.m34708()));
            float f = iM30726;
            rectF.left = fM32047 + f;
            rectF.right = fM32048 + f;
            c3329Mo2399.close();
            float fM17870 = this.f41286.m17870();
            float f2 = iM30733 * fM17870;
            rectF.top = f2;
            rectF.bottom = f2 + fM17870;
            return true;
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m30744(int i) {
        return m30733(i, this.f41296);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30733(int i, boolean z) {
        int i2;
        C14435 c14435M24325;
        int i3;
        int i4 = 0;
        if (i <= 0) {
            return 0;
        }
        if (i >= this.f41308.m10803().f47317) {
            return this.f41308.m10811();
        }
        C3662 c3662 = this.f41308;
        int size = c3662.size();
        C9496 c9496M10817 = c3662.m10817();
        while (true) {
            i2 = (i4 + size) >>> 1;
            c14435M24325 = c9496M10817.m24325(i2);
            i3 = c14435M24325.f47316;
            if (i >= i3) {
                int i5 = c14435M24325.f47317;
                if (i >= i5) {
                    if (i4 == i2) {
                        if (i == i5) {
                            break;
                        }
                        throw new RuntimeException();
                    }
                    i4 = i2;
                } else {
                    break;
                }
            } else {
                size = i2;
            }
        }
        if (i != i3 || c3662.m10800(i2)) {
            return (i == c14435M24325.f47317 && !c3662.m10815(i2) && z) ? i2 + 1 : i2;
        }
        return z ? i2 : i2 - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1918 m30735(C3329 c3329, int i, int i2) {
        if (this.f41314.mo16903()) {
            i = i2;
        }
        return c3329.m9890(i, i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m30758() {
        return this.f41289;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m30757() {
        return this.f41307;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m30752(float f) {
        C6111 c6111 = this.f41314;
        return (f - c6111.getPaddingTop()) + (c6111.m17066() - this.f41285);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m30748(int i) {
        return (float) ((((double) i) * ((double) this.f41286.m17870())) - ((double) this.f41285));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30737(Canvas canvas, int i, int i2, int i3, int i4) {
        canvas.drawColor(this.f41286.f6403);
        m30715(canvas, i, i2, i3, i4, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30738(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, C20120 c20120, C13190 c13190, C12880 c12880, C0923 c0923) {
        C6111 c6111 = this.f41314;
        C0363 c0363 = this.f41298;
        if (this instanceof C21489) {
            ((C21489) this).m48129(i2, i4);
        }
        this.f41326 = true;
        int iSave = canvas.save();
        this.f41285 = c6111.m17066() - c6111.getScrollY();
        try {
            m30721(canvas, i, i2, i3, i4, i5, i6, c20120, c13190, c12880, c0923);
            canvas.restoreToCount(iSave);
            c0363.f1816 = null;
            c0363.f1812 = null;
            c0363.f1813 = null;
            this.f41326 = false;
            m30722();
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            c0363.f1816 = null;
            c0363.f1812 = null;
            c0363.f1813 = null;
            this.f41326 = false;
            C3329 c3329 = this.f41306;
            this.f41306 = null;
            this.f41311 = null;
            if (c3329 != null) {
                c3329.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x032d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0348  */
    /* JADX WARN: Code duplicated, block: B:121:0x035e  */
    /* JADX WARN: Code duplicated, block: B:124:0x036a  */
    /* JADX WARN: Code duplicated, block: B:126:0x036f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0375  */
    /* JADX WARN: Code duplicated, block: B:129:0x03da  */
    /* JADX WARN: Code duplicated, block: B:131:0x0410 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0412  */
    /* JADX WARN: Code duplicated, block: B:134:0x0441  */
    /* JADX WARN: Code duplicated, block: B:135:0x0446  */
    /* JADX WARN: Code duplicated, block: B:137:0x0452  */
    /* JADX WARN: Code duplicated, block: B:139:0x0487  */
    /* JADX WARN: Code duplicated, block: B:140:0x048b  */
    /* JADX WARN: Code duplicated, block: B:143:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x050e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0513  */
    /* JADX WARN: Code duplicated, block: B:162:0x0519  */
    /* JADX WARN: Code duplicated, block: B:163:0x052e  */
    /* JADX WARN: Code duplicated, block: B:166:0x054d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0558  */
    /* JADX WARN: Code duplicated, block: B:170:0x055b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0571  */
    /* JADX WARN: Code duplicated, block: B:175:0x0576 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0595  */
    /* JADX WARN: Code duplicated, block: B:184:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:185:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:188:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:189:0x0612  */
    /* JADX WARN: Code duplicated, block: B:193:0x0639  */
    /* JADX WARN: Code duplicated, block: B:195:0x0643  */
    /* JADX WARN: Code duplicated, block: B:197:0x0649  */
    /* JADX WARN: Code duplicated, block: B:198:0x064b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0654  */
    /* JADX WARN: Code duplicated, block: B:203:0x0688  */
    /* JADX WARN: Code duplicated, block: B:204:0x068f  */
    /* JADX WARN: Code duplicated, block: B:207:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:209:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:210:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:213:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:223:0x0701  */
    /* JADX WARN: Code duplicated, block: B:230:0x0756 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x0766  */
    /* JADX WARN: Code duplicated, block: B:237:0x0770  */
    /* JADX WARN: Code duplicated, block: B:239:0x0788 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:260:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:262:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:264:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:265:0x07e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:270:0x082e A[EDGE_INSN: B:270:0x082e->B:271:0x0830 BREAK  A[LOOP:1: B:261:0x07d5->B:268:0x0821], PHI: r85 r86
      0x082e: PHI (r85v11 l.ܶۜᩴ) = (r85v10 l.ܶۜᩴ), (r85v15 l.ܶۜᩴ) binds: [B:259:0x07cf, B:269:0x082c] A[DONT_GENERATE, DONT_INLINE]
      0x082e: PHI (r86v11 int) = (r86v10 int), (r86v13 int) binds: [B:259:0x07cf, B:269:0x082c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:272:0x0832  */
    /* JADX WARN: Code duplicated, block: B:273:0x084b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0858  */
    /* JADX WARN: Code duplicated, block: B:278:0x086c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0872 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0878  */
    /* JADX WARN: Code duplicated, block: B:285:0x087c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x087e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:310:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:316:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:318:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:320:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:322:0x0945  */
    /* JADX WARN: Code duplicated, block: B:352:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:355:0x0a0b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:371:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:383:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:389:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:390:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:393:0x0aea  */
    /* JADX WARN: Code duplicated, block: B:395:0x0af6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:398:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:402:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:405:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:408:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:410:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:413:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:414:0x0be4  */
    /* JADX WARN: Code duplicated, block: B:418:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:420:0x0c15  */
    /* JADX WARN: Code duplicated, block: B:422:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:423:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:427:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0c34  */
    /* JADX WARN: Code duplicated, block: B:430:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:432:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:435:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:436:0x0c70  */
    /* JADX WARN: Code duplicated, block: B:439:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:442:0x0c93  */
    /* JADX WARN: Code duplicated, block: B:444:0x0c98  */
    /* JADX WARN: Code duplicated, block: B:445:0x0c9a  */
    /* JADX WARN: Code duplicated, block: B:457:0x0cb3  */
    /* JADX WARN: Code duplicated, block: B:460:0x0cba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:462:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:465:0x0d00  */
    /* JADX WARN: Code duplicated, block: B:466:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:468:0x0d58  */
    /* JADX WARN: Code duplicated, block: B:469:0x0d86  */
    /* JADX WARN: Code duplicated, block: B:471:0x0dc4  */
    /* JADX WARN: Code duplicated, block: B:473:0x0dd3  */
    /* JADX WARN: Code duplicated, block: B:477:0x0e07  */
    /* JADX WARN: Code duplicated, block: B:479:0x0e10  */
    /* JADX WARN: Code duplicated, block: B:482:0x0e5d  */
    /* JADX WARN: Code duplicated, block: B:492:0x0e71  */
    /* JADX WARN: Code duplicated, block: B:509:0x0ea8  */
    /* JADX WARN: Code duplicated, block: B:512:0x0eb8  */
    /* JADX WARN: Code duplicated, block: B:515:0x0ec0  */
    /* JADX WARN: Code duplicated, block: B:517:0x0ec4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:520:0x0ecb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:521:0x0ecd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:522:0x0ecf  */
    /* JADX WARN: Code duplicated, block: B:523:0x0edc  */
    /* JADX WARN: Code duplicated, block: B:526:0x0efe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:527:0x0f00  */
    /* JADX WARN: Code duplicated, block: B:528:0x0f06  */
    /* JADX WARN: Code duplicated, block: B:530:0x0f21  */
    /* JADX WARN: Code duplicated, block: B:532:0x0f28  */
    /* JADX WARN: Code duplicated, block: B:535:0x0f4b  */
    /* JADX WARN: Code duplicated, block: B:536:0x0f51  */
    /* JADX WARN: Code duplicated, block: B:538:0x0f64  */
    /* JADX WARN: Code duplicated, block: B:541:0x0f6c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:546:0x0faf  */
    /* JADX WARN: Code duplicated, block: B:548:0x0fbd  */
    /* JADX WARN: Code duplicated, block: B:554:0x1042  */
    /* JADX WARN: Code duplicated, block: B:556:0x104e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:565:0x107e  */
    /* JADX WARN: Code duplicated, block: B:569:0x10b5  */
    /* JADX WARN: Code duplicated, block: B:571:0x10c2  */
    /* JADX WARN: Code duplicated, block: B:574:0x10cb  */
    /* JADX WARN: Code duplicated, block: B:577:0x10d3  */
    /* JADX WARN: Code duplicated, block: B:594:0x11b1  */
    /* JADX WARN: Code duplicated, block: B:596:0x11c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:597:0x11c8  */
    /* JADX WARN: Code duplicated, block: B:598:0x11e3  */
    /* JADX WARN: Code duplicated, block: B:601:0x1206  */
    /* JADX WARN: Code duplicated, block: B:604:0x1212  */
    /* JADX WARN: Code duplicated, block: B:605:0x1224  */
    /* JADX WARN: Code duplicated, block: B:608:0x1239  */
    /* JADX WARN: Code duplicated, block: B:609:0x123e  */
    /* JADX WARN: Code duplicated, block: B:612:0x1251 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:614:0x1266  */
    /* JADX WARN: Code duplicated, block: B:617:0x127c  */
    /* JADX WARN: Code duplicated, block: B:619:0x1285  */
    /* JADX WARN: Code duplicated, block: B:621:0x1289  */
    /* JADX WARN: Code duplicated, block: B:627:0x1299  */
    /* JADX WARN: Code duplicated, block: B:632:0x12a6  */
    /* JADX WARN: Code duplicated, block: B:635:0x12ac  */
    /* JADX WARN: Code duplicated, block: B:642:0x1314  */
    /* JADX WARN: Code duplicated, block: B:644:0x1318  */
    /* JADX WARN: Code duplicated, block: B:646:0x1334  */
    /* JADX WARN: Code duplicated, block: B:649:0x1353  */
    /* JADX WARN: Code duplicated, block: B:652:0x135a  */
    /* JADX WARN: Code duplicated, block: B:669:0x0b72 A[EDGE_INSN: B:669:0x0b72->B:400:0x0b72 BREAK  A[LOOP:0: B:191:0x062a->B:399:0x0b32], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x082c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x1006 A[EDGE_INSN: B:679:0x1006->B:552:0x1006 BREAK  A[LOOP:3: B:416:0x0bf6->B:551:0x0fcb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0979, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:571:0x10c2, please report this as an issue */
    /*  JADX ERROR: JadxRuntimeException in pass: PrepareForCodeGen
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v1 int
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.instructions.args.RegisterArg.sameCodeVar(RegisterArg.java:193)
        	at jadx.core.dex.visitors.PrepareForCodeGen.modifyArith(PrepareForCodeGen.java:242)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:88)
        */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m30721(android.graphics.Canvas r103, int r104, int r105, int r106, int r107, int r108, int r109, l.C20120 r110, l.C13190 r111, l.C12880 r112, l.C0923 r113) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC12359.m30721(android.graphics.Canvas, int, int, int, int, int, int, l.᩶ۧۖ, l.۬ܶۚ, l.۬ۙۚ, l.֨ۛۖ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30717(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6111 c6111 = this.f41314;
            if (c6111.m16816() == null) {
                ArrayList arrayList = this.f41320;
                arrayList.clear();
                int width = c6111.getWidth();
                Rect rect = this.f41302;
                if (drawable != null) {
                    rect.set(drawable.getDirtyBounds());
                    rect.offset(-c6111.getScrollX(), this.f41285 - c6111.m17066());
                    if (rect.right < 200) {
                        rect.left = 0;
                        rect.right = 200;
                        arrayList.add(rect);
                    } else {
                        int i = width - 200;
                        if (rect.left > i) {
                            rect.left = i;
                            rect.right = width;
                            arrayList.add(rect);
                        }
                    }
                } else {
                    if (drawable2 != null) {
                        rect.set(drawable2.getDirtyBounds());
                        rect.offset(-c6111.getScrollX(), this.f41285 - c6111.m17066());
                        if (rect.right < 200) {
                            rect.left = 0;
                            rect.right = 200;
                            arrayList.add(rect);
                        } else {
                            int i2 = width - 200;
                            if (rect.left > i2) {
                                rect.left = i2;
                                rect.right = width;
                                arrayList.add(rect);
                            }
                        }
                    }
                    if (drawable3 != null) {
                        Rect dirtyBounds = drawable3.getDirtyBounds();
                        Rect rect2 = this.f41304;
                        rect2.set(dirtyBounds);
                        rect2.offset(-c6111.getScrollX(), this.f41285 - c6111.m17066());
                        if (rect2.right < 200) {
                            rect2.left = 0;
                            rect2.right = 200;
                            arrayList.add(rect2);
                        } else {
                            int i3 = width - 200;
                            if (rect2.left > i3) {
                                rect2.left = i3;
                                rect2.right = width;
                                arrayList.add(rect2);
                            }
                        }
                    }
                }
                c6111.setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30718(C2147 c2147, Canvas canvas, boolean z, Drawable drawable, RectF rectF, int i) {
        if (drawable == null) {
            rectF.setEmpty();
            if (c2147 != null) {
                c2147.m6702(i, 0, 0, false);
                return;
            }
            return;
        }
        if (c2147 != null) {
            float f = rectF.left;
            C6111 c6111 = this.f41314;
            int paddingLeft = c6111.getPaddingLeft() + ((int) (f - c6111.getScrollX()));
            int paddingTop = c6111.getPaddingTop() + ((int) (rectF.top + (this.f41285 - c6111.m17066())));
            rectF.setEmpty();
            if (z) {
                c2147.m6702(i, paddingLeft, paddingTop, true);
                return;
            } else {
                c2147.m6702(i, 0, 0, false);
                return;
            }
        }
        drawable.draw(canvas);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16592 mo30725() {
        int i = this.f41313;
        if (i < 0 || !mo14799(i)) {
            return null;
        }
        C6111 c6111 = this.f41314;
        int iM16978 = c6111.m16978();
        int iM16814 = c6111.m16814();
        if (iM16978 <= 0 || iM16814 <= 0) {
            return null;
        }
        RectF rectF = new RectF();
        mo30739(rectF, this.f41313);
        return new C16592(mo14788() ? Math.max(0, ((int) rectF.right) - (iM16978 / 2)) : 0, Math.min(Math.max(0, ((int) rectF.top) - (iM16814 / 2)), Math.max(0, ((int) m30743()) - iM16814)), iM16978, iM16814);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo30732(int i, int i2) {
        return Math.max(0, Math.min(i, Math.max(0, (((int) (this.f41286.m17870() * (((long) this.f41308.size()) - 1))) - i2) - 1)));
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo14799(int i) {
        return !this.f41308.isEmpty() && i >= 0 && i <= this.f41308.m10803().f47317;
    }

    /* JADX INFO: renamed from: ۨ */
    public long mo14795(int i, int i2) {
        if (this.f41308.isEmpty()) {
            return -1L;
        }
        if (mo14804() && !this.f41314.m16995(this)) {
            return -1L;
        }
        C14435 c14435 = this.f41308.get(m30729(i));
        return (((long) this.f41308.get(m30729(i + i2)).m34708()) & 4294967295L) | (((long) c14435.f47316) << 32);
    }

    /* JADX INFO: renamed from: ܰ */
    public long mo14796(int i, int i2) {
        if (this.f41308.isEmpty()) {
            return 0L;
        }
        if (!mo14804() || this.f41314.m16995(this)) {
            return m30723(m30729(i), m30729(i + i2));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private long m30723(int i, int i2) {
        C14435 c14435 = this.f41308.get(i);
        C14435 c14436 = this.f41308.get(i2);
        int iMax = Math.max(0, c14435.f47316 - 10000);
        int iM10813 = this.f41308.m10813(Math.max(0, i - 200));
        int iMin = Math.min(this.f41284, c14436.m34712() ? c14436.m34708() : c14436.f47317 + 10000);
        C3662 c3662 = this.f41308;
        return (((long) Math.max(iMin, c3662.get(Math.min(c3662.m10811(), i2 + 200)).m34708())) & 4294967295L) | (((long) Math.min(iMax, iM10813)) << 32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30720(C13190 c13190, int i, int i2) {
        c13190.m32621(this.f41297, this.f41308.get(i).f47316, this.f41308.get(i2).m34708());
        if (this.f41284 <= 1000000 || !this.f41314.m16947()) {
            return;
        }
        if (c13190.m32662(this.f41308.get(i).f47316, this.f41308.get(i2).m34708())) {
            long jM30723 = m30723(i, i2);
            c13190.m32646(this.f41297, (int) (jM30723 >>> 32), (int) jM30723);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30715(Canvas canvas, int i, int i2, int i3, int i4, float f) {
        float f2;
        C1590 c1590 = this.f41286;
        if (c1590.f6388) {
            boolean z = c1590.f6381;
            if (c1590.f6422) {
                f2 = z ? i : i3 - this.f41316;
            } else {
                f2 = z ? 0.0f : f - this.f41316;
            }
            float f3 = i3;
            if (f3 >= f2) {
                float f4 = i;
                if (f4 > this.f41316 + f2) {
                    return;
                }
                int iSave = canvas.save();
                try {
                    canvas.translate(f2, 0.0f);
                    float f5 = i2;
                    float f6 = i4;
                    canvas.clipRect(Math.max(0.0f, f4 - f2), f5, Math.min(this.f41316, f3 - f2), f6);
                    C4916 c4916 = c1590.f6438;
                    c4916.setColor(c1590.f6413);
                    canvas.drawRect(0.0f, f5, this.f41316, f6, c4916);
                    c4916.setColor(c1590.f6377);
                    float f7 = c1590.f6381 ? this.f41316 - 1 : 1.0f;
                    canvas.drawLine(f7, f5, f7, f6, c4916);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30716(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, C1590 c1590, C4916 c4916) {
        int i7;
        int i8 = i3;
        boolean z2 = c1590.f6381;
        int i9 = this.f41316;
        boolean z3 = this.f41314.m17060() < 255;
        if (!z3) {
            c4916.setColor(c1590.f6413);
            canvas.drawRect(0.0f, i, i9, i2, c4916);
        }
        float f2 = c1590.f6410;
        InterfaceC18708 interfaceC18708 = c1590.f6389;
        if (interfaceC18708 != null) {
            interfaceC18708.mo19407(this.f41308, i3, i4, i9, canvas, c4916, c1590);
        }
        if (!z3) {
            C1590 c1591 = this.f41286;
            c4916.setColor(c1591.f6377);
            float f3 = c1591.f6381 ? this.f41316 - 1 : 1.0f;
            canvas.drawLine(f3, i, f3, i2, c4916);
        }
        float f4 = z2 ? i9 - f2 : f2;
        float fM30748 = m30748(i8) + c1590.f6372;
        c4916.setColor(c1590.f6405);
        int iM10821 = i8 > 0 ? this.f41308.m10821(i8 - 1) + 1 : 0;
        C9496 c9496M10817 = this.f41308.m10817();
        float fM30749 = fM30748;
        int i10 = iM10821;
        while (i8 <= i4) {
            int i11 = c9496M10817.m24325(i8).f47319;
            if (i11 > i6 || i5 > i11) {
                i11 = i11;
            } else {
                c4916.setColor(c1590.f6386);
                float f5 = fM30749 - c1590.f6372;
                float f6 = f5 + f;
                if (z2) {
                    canvas.drawRect(i9 - 3, f5, i9, f6, c4916);
                } else {
                    canvas.drawRect(0.0f, f5, 3.0f, f6, c4916);
                }
                c4916.setColor(c1590.f6405);
            }
            int i12 = i11 + 1;
            if (i10 != i12 && (!z || i12 == 1)) {
                String strValueOf = String.valueOf(i12);
                if (z2) {
                    int length = strValueOf.length() - 1;
                    float f7 = f4;
                    while (length >= 0) {
                        canvas.drawText(strValueOf, length, length + 1, f7, fM30749, (Paint) c4916);
                        f7 -= f2;
                        length--;
                        i12 = i12;
                    }
                    i7 = i12;
                } else {
                    i7 = i12;
                    float f8 = f4;
                    int i13 = 0;
                    for (int length2 = strValueOf.length(); i13 < length2; length2 = length2) {
                        int i14 = i13 + 1;
                        canvas.drawText(strValueOf, i13, i14, f8, fM30749, (Paint) c4916);
                        f8 += f2;
                        i13 = i14;
                    }
                }
                i10 = i7;
            }
            i8++;
            fM30749 = m30748(i8) + c1590.f6372;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14786(C11018 c11018) {
        C3662 c3662;
        c11018.writeByte(mo14781());
        c11018.writeInt(this.f41316);
        if (this.f41317 && mo14781() == 1) {
            c3662 = new C3662(this.f41308);
        } else {
            c3662 = this.f41308;
        }
        c11018.writeInt(c3662.size());
        c11018.writeInt(-249333469);
        C9496 c9496M10817 = c3662.m10817();
        for (int i = 0; i < c3662.size(); i++) {
            C14435 c14435M24325 = c9496M10817.m24325(i);
            c11018.writeInt(c14435M24325.f47316);
            c11018.writeInt(c14435M24325.f47317);
            c11018.writeInt(c14435M24325.f47319);
        }
        c11018.writeInt(1916422180);
        c11018.writeInt(this.f41315.size());
        C15846 c15846 = this.f41315;
        c15846.getClass();
        C10201 c10201 = new C10201(c15846);
        for (int i2 = 0; i2 < this.f41315.size(); i2++) {
            c10201.m25993(i2);
            c11018.mo24508(c10201.m25992());
            char cM25990 = c10201.m25990();
            if (cM25990 > 255) {
                cM25990 = 255;
            }
            c11018.writeByte(cM25990);
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo14804() {
        return this.f41317;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo14803() {
        if (m30759()) {
            this.f41315.m37706(this, this.f41314.m17000(), this.f41308, this.f41286.m17881());
        }
    }
}
