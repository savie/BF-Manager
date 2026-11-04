package l;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.᩶ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6IU */
/* JADX INFO: loaded from: classes.dex */
public final class C21403 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f68172;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68174;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f68176;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2012 f68177;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1310 f68178;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4249 f68179;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public volatile boolean f68180;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23115 f68181;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AccessibilityService f68182;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile int f68183;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC5961 f68184;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C24387 f68185;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5763 f68186;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0292 f68187;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Handler f68175 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f68173 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m48680(boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m48689();

    static {
        ApplicationC23172.m52091(EnumC24309.f78687);
        f68172 = Executors.newSingleThreadExecutor();
    }

    public C21403(ContextThemeWrapper contextThemeWrapper, C0292 c0292, C5763 c5763, C17695 c17695) {
        this.f68176 = contextThemeWrapper;
        this.f68181 = new C23115(contextThemeWrapper);
        this.f68187 = c0292;
        this.f68186 = c5763;
        this.f68179 = c17695;
        this.f68182 = ((C17695) c0292.f1609).m41440();
        this.f68177 = new C2012(contextThemeWrapper, this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2012 m48692() {
        return this.f68177;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m48700() {
        ((C17695) this.f68179).m41430();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m48695() {
        return ((C17695) this.f68179).m41438();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m48694() {
        ((C17695) this.f68179).m41439();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18452 m48688(TextView textView) {
        return ((C17695) this.f68179).m41418(textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48690(C8723 c8723) {
        ((C17695) this.f68179).m41421(c8723);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m48696() {
        C1310 c1310 = this.f68178;
        if (c1310 != null) {
            c1310.setAlpha(((C17695) this.f68179).m41429());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48687() {
        if (!this.f68180) {
            C11750 c11750M41440 = ((C17695) this.f68187.f1609).m41440();
            AccessibilityService accessibilityService = this.f68182;
            if (c11750M41440 == accessibilityService && C7543.m20616(accessibilityService)) {
                ((C17695) this.f68179).m41428(false);
                if (this.f68173) {
                    m48680(false);
                    return;
                } else {
                    if (this.f68174) {
                        return;
                    }
                    m48683(2);
                    return;
                }
            }
        }
        m48698();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m48697() {
        return this.f68180;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1310 m48699() {
        return this.f68178;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AccessibilityService m48670(C21403 c21403) {
        C11750 c11750M41440 = ((C17695) c21403.f68187.f1609).m41440();
        AccessibilityService accessibilityService = c21403.f68182;
        if (c11750M41440 == accessibilityService) {
            return accessibilityService;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48674(C21403 c21403, int i, Exception exc, boolean z) {
        if (c21403.m48681(i)) {
            c21403.f68174 = false;
            c21403.f68173 = exc != null;
            c21403.m48683(exc == null ? 2 : 3);
            if (c21403.m48681(i)) {
                c21403.f68177.m6922(false);
                ((C17695) c21403.f68179).m41428(false);
                if (exc != null) {
                    c21403.m48682();
                    c21403.m48671(R.string.MT_Protector);
                } else if (z) {
                    c21403.m48689();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48676(final C21403 c21403, final int i, final C24387 c24387, final C14689 c14689, final long j) {
        if (c21403.m48681(i)) {
            f68172.execute(new Runnable() { // from class: l.ۗܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C21403.m48685(this.f12081, i, c24387, c14689, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48685(final C21403 c21403, final int i, final C24387 c24387, final C14689 c14689, final long j) {
        Handler handler = c21403.f68175;
        try {
            final C15655 c15655M17344 = c21403.f68184.m17344();
            handler.post(new Runnable(i, c24387, c14689, c15655M17344, j) { // from class: l.᩵ܶܳ

                /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
                public final /* synthetic */ C14689 f66246;

                /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
                public final /* synthetic */ C15655 f66247;

                /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
                public final /* synthetic */ C24387 f66249;

                /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                public final /* synthetic */ int f66250;

                @Override // java.lang.Runnable
                public final void run() {
                    C21403.m48677(this.f66248, this.f66250, this.f66249, this.f66246, this.f66247);
                }
            });
        } catch (Exception e) {
            handler.post(new Runnable(i, e) { // from class: l.ۨܶܳ

                /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                public final /* synthetic */ int f40018;

                @Override // java.lang.Runnable
                public final void run() {
                    C21403.m48673(this.f40017, this.f40018);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48677(final C21403 c21403, final int i, C24387 c24387, C14689 c14689, final C15655 c15655) {
        String str;
        InterfaceC4249 interfaceC4249 = c21403.f68179;
        C2012 c2012 = c21403.f68177;
        if (c21403.m48681(i)) {
            c21403.f68174 = false;
            c21403.m48683(2);
            if (c21403.m48681(i)) {
                c2012.m6922(false);
                ((C17695) interfaceC4249).m41428(false);
                Display defaultDisplay = ((WindowManager) c21403.f68176.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                if (c24387.f79110 != defaultDisplay.getRotation() || !c24387.f79111.equals(point)) {
                    c21403.m48671(R.string.MT_Protector);
                    return;
                }
                c21403.f68185 = c24387;
                C14689 c14689M41406 = C17695.m41406(c21403.f68186.f19811);
                if (c14689 != null) {
                    str = c14689.f48009;
                    String str2 = c14689.f48010;
                    if (c14689M41406 == null || !str2.equals(c14689M41406.f48010) || !C17359.equals(str, c14689M41406.f48009) || !c15655.f50879.contains(str2)) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                try {
                    c21403.m48672(c15655);
                    c2012.m6920(c15655, str);
                    ((C17695) interfaceC4249).m41428(true);
                    c15655.f50877.size();
                    SystemClock.elapsedRealtime();
                    f68172.execute(new Runnable() { // from class: l.ۛܶܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21403.m48679(this.f21803, c15655, i);
                        }
                    });
                } catch (RuntimeException unused) {
                    c21403.m48682();
                    c21403.m48671(R.string.MT_Protector);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48673(C21403 c21403, int i) {
        if (c21403.m48681(i)) {
            c21403.f68174 = false;
            c21403.f68173 = true;
            c21403.m48683(3);
            if (c21403.m48681(i)) {
                c21403.f68177.m6922(false);
                ((C17695) c21403.f68179).m41428(false);
                c21403.m48682();
                c21403.m48671(R.string.MT_Protector);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m48681(int i) {
        return !this.f68180 && i == this.f68183 && ((C17695) this.f68187.f1609).m41440() == this.f68182;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48679(final C21403 c21403, final C15655 c15655, final int i) {
        try {
            final Map mapM52049 = c21403.f68181.m52049(c15655, new C25133(c21403, i));
            c21403.f68175.post(new Runnable() { // from class: l.ܺܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C21403.m48675(this.f55318, i, c15655, mapM52049);
                }
            });
        } catch (InterruptedIOException | RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m48686(C21403 c21403, int i) {
        return c21403.f68180 || i != c21403.f68183;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48675(C21403 c21403, int i, C15655 c15655, Map map) {
        if (c21403.m48681(i)) {
            c21403.f68177.m6921(c15655, map);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48672(C15655 c15655) {
        C2012 c2012 = this.f68177;
        C17359.requireNonNull(c2012);
        RunnableC11706 runnableC11706 = new RunnableC11706(c2012);
        ContextThemeWrapper contextThemeWrapper = this.f68176;
        this.f68178 = new C1310(contextThemeWrapper, c15655, runnableC11706);
        m48696();
        int i = Build.VERSION.SDK_INT;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, i >= 26 ? 2038 : 2003, 264, -3);
        layoutParams.gravity = 51;
        if (i >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        ((WindowManager) contextThemeWrapper.getSystemService("window")).addView(this.f68178, layoutParams);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48693() {
        if (this.f68180) {
            return;
        }
        int i = this.f68183 + 1;
        this.f68183 = i;
        this.f68174 = false;
        m48682();
        this.f68177.m6918();
        ((C17695) this.f68179).m41428(true);
        if (m48681(i)) {
            m48683(this.f68173 ? 0 : 2);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48682() {
        C1310 c1310 = this.f68178;
        if (c1310 != null && c1310.getParent() != null) {
            ((WindowManager) this.f68176.getSystemService("window")).removeView(this.f68178);
        }
        this.f68178 = null;
        this.f68185 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48683(int i) {
        ((C17695) this.f68179).m41426(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48671(int i) {
        this.f68183++;
        this.f68177.m6919(i);
        ((C17695) this.f68179).m41428(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m48691() {
        C24387 c24387 = this.f68185;
        if (c24387 != null) {
            Display defaultDisplay = ((WindowManager) this.f68176.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (c24387.f79110 == defaultDisplay.getRotation() && c24387.f79111.equals(point)) {
                return;
            }
            m48682();
            m48671(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48678(final C21403 c21403, final int i, final boolean z) {
        final Exception exc;
        try {
            AbstractC5961 abstractC5961 = c21403.f68184;
            exc = null;
            c21403.f68184 = null;
            if (abstractC5961 != null) {
                abstractC5961.close();
            }
            C8022 c8022 = new C8022(new C6338(c21403));
            c21403.f68184 = c8022;
            c8022.m17346();
        } catch (Exception e) {
            exc = e;
        }
        c21403.f68175.post(new Runnable() { // from class: l.᩹ܶܳ
            @Override // java.lang.Runnable
            public final void run() {
                C21403.m48674(this.f76695, i, exc, z);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48684(C21403 c21403) {
        c21403.f68181.m52050();
        try {
            AbstractC5961 abstractC5961 = c21403.f68184;
            c21403.f68184 = null;
            if (abstractC5961 != null) {
                abstractC5961.close();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48698() {
        if (this.f68180) {
            return;
        }
        this.f68180 = true;
        this.f68183++;
        this.f68174 = false;
        m48682();
        this.f68177.m6918();
        ((C17695) this.f68179).m41425(this);
        f68172.execute(new RunnableC24725(4, this));
    }
}
