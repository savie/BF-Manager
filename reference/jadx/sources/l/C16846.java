package l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: renamed from: l.ܺ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16846 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f54303;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f54304;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54305;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f54306;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f54307;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f54308;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f54309;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f54310;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f54311;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Surface f54312;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f54313;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23625 f54314 = new C23625();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ChoreographerFrameCallbackC25052 f54315;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11625 f54316;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f54317;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f54318;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f54319;

    public C16846(Context context) {
        DisplayManager displayManager;
        C11625 c11625 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C11625(this, displayManager);
        this.f54316 = c11625;
        this.f54315 = c11625 != null ? ChoreographerFrameCallbackC25052.m55876() : null;
        this.f54318 = -9223372036854775807L;
        this.f54304 = -9223372036854775807L;
        this.f54307 = -1.0f;
        this.f54308 = 1.0f;
        this.f54305 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39759(int i) {
        if (this.f54305 == i) {
            return;
        }
        this.f54305 = i;
        m39753(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39762() {
        this.f54319 = true;
        this.f54317 = 0L;
        this.f54310 = -1L;
        this.f54306 = -1L;
        C11625 c11625 = this.f54316;
        if (c11625 != null) {
            ChoreographerFrameCallbackC25052 choreographerFrameCallbackC25052 = this.f54315;
            choreographerFrameCallbackC25052.getClass();
            choreographerFrameCallbackC25052.m55877();
            c11625.m29195();
        }
        m39753(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39760(Surface surface) {
        if (this.f54312 == surface) {
            return;
        }
        m39755();
        this.f54312 = surface;
        m39753(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39763(float f) {
        this.f54308 = f;
        this.f54317 = 0L;
        this.f54310 = -1L;
        this.f54306 = -1L;
        m39753(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39758(float f) {
        this.f54307 = f;
        this.f54314.m52873();
        m39754();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39764(long j) {
        long j2 = this.f54306;
        if (j2 != -1) {
            this.f54310 = j2;
            this.f54309 = this.f54303;
        }
        this.f54317++;
        this.f54314.m52871(j * 1000);
        m39754();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39761() {
        this.f54319 = false;
        C11625 c11625 = this.f54316;
        if (c11625 != null) {
            c11625.m29196();
            ChoreographerFrameCallbackC25052 choreographerFrameCallbackC25052 = this.f54315;
            choreographerFrameCallbackC25052.getClass();
            choreographerFrameCallbackC25052.m55878();
        }
        m39755();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m39756(long j) {
        long j2;
        if (this.f54310 != -1 && this.f54314.m52874()) {
            long jM52870 = this.f54309 + ((long) (((this.f54317 - this.f54310) * this.f54314.m52870()) / this.f54308));
            if (Math.abs(j - jM52870) <= 20000000) {
                j = jM52870;
            } else {
                this.f54317 = 0L;
                this.f54310 = -1L;
                this.f54306 = -1L;
            }
        }
        this.f54306 = this.f54317;
        this.f54303 = j;
        ChoreographerFrameCallbackC25052 choreographerFrameCallbackC25052 = this.f54315;
        if (choreographerFrameCallbackC25052 != null && this.f54318 != -9223372036854775807L) {
            long j3 = choreographerFrameCallbackC25052.f81034;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f54318;
                long j5 = (((j - j3) / j4) * j4) + j3;
                if (j <= j5) {
                    j2 = j5 - j4;
                } else {
                    j2 = j5;
                    j5 = j4 + j5;
                }
                if (j5 - j >= j - j2) {
                    j5 = j2;
                }
                return j5 - this.f54304;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39757() {
        this.f54317 = 0L;
        this.f54310 = -1L;
        this.f54306 = -1L;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m39754() {
        if (Build.VERSION.SDK_INT < 30 || this.f54312 == null) {
            return;
        }
        C23625 c23625 = this.f54314;
        float fM52875 = c23625.m52874() ? c23625.m52875() : this.f54307;
        float f = this.f54313;
        if (fM52875 == f) {
            return;
        }
        if (fM52875 != -1.0f && f != -1.0f) {
            if (Math.abs(fM52875 - this.f54313) < ((!c23625.m52874() || c23625.m52876() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fM52875 == -1.0f && c23625.m52872() < 30) {
            return;
        }
        this.f54313 = fM52875;
        m39753(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39753(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f54312) == null || this.f54305 == Integer.MIN_VALUE) {
            return;
        }
        if (this.f54319) {
            float f2 = this.f54313;
            if (f2 != -1.0f) {
                f = f2 * this.f54308;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f54311 != f) {
            this.f54311 = f;
            C1931.m6632(surface, f);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m39755() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f54312) == null || this.f54305 == Integer.MIN_VALUE || this.f54311 == 0.0f) {
            return;
        }
        this.f54311 = 0.0f;
        C1931.m6632(surface, 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39752(C16846 c16846, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c16846.f54318 = refreshRate;
            c16846.f54304 = (refreshRate * 80) / 100;
        } else {
            C1896.m6517("Unable to query display refresh rate");
            c16846.f54318 = -9223372036854775807L;
            c16846.f54304 = -9223372036854775807L;
        }
    }
}
