package l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: renamed from: l.᩻֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23369 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f75700;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f75701;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f75702;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75703;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14818 f75704 = new C14818();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f75705;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f75706;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f75707;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f75708;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5729 f75709;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Surface f75710;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f75711;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f75712;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ChoreographerFrameCallbackC10669 f75713;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f75714;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f75715;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f75716;

    public C23369(Context context) {
        DisplayManager displayManager;
        C5729 c5729 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C5729(this, displayManager);
        this.f75709 = c5729;
        this.f75713 = c5729 != null ? ChoreographerFrameCallbackC10669.m26870() : null;
        this.f75712 = -9223372036854775807L;
        this.f75706 = -9223372036854775807L;
        this.f75707 = -1.0f;
        this.f75705 = 1.0f;
        this.f75703 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51488(int i) {
        if (this.f75703 == i) {
            return;
        }
        this.f75703 = i;
        m51483(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51491() {
        this.f75716 = true;
        this.f75701 = 0L;
        this.f75715 = -1L;
        this.f75708 = -1L;
        C5729 c5729 = this.f75709;
        if (c5729 != null) {
            ChoreographerFrameCallbackC10669 choreographerFrameCallbackC10669 = this.f75713;
            choreographerFrameCallbackC10669.getClass();
            choreographerFrameCallbackC10669.m26871();
            c5729.m15781();
        }
        m51483(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51489(Surface surface) {
        if (this.f75710 == surface) {
            return;
        }
        m51481();
        this.f75710 = surface;
        m51483(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51492(float f) {
        this.f75705 = f;
        this.f75701 = 0L;
        this.f75715 = -1L;
        this.f75708 = -1L;
        m51483(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51487(float f) {
        this.f75707 = f;
        this.f75704.m35503();
        m51484();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51493(long j) {
        long j2 = this.f75708;
        if (j2 != -1) {
            this.f75715 = j2;
            this.f75700 = this.f75702;
        }
        this.f75701++;
        this.f75704.m35499(j * 1000);
        m51484();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m51490() {
        this.f75716 = false;
        C5729 c5729 = this.f75709;
        if (c5729 != null) {
            c5729.m15782();
            ChoreographerFrameCallbackC10669 choreographerFrameCallbackC10669 = this.f75713;
            choreographerFrameCallbackC10669.getClass();
            choreographerFrameCallbackC10669.m26872();
        }
        m51481();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m51485(long j) {
        long j2;
        if (this.f75715 != -1 && this.f75704.m35500()) {
            long jM35498 = this.f75700 + ((long) (((this.f75701 - this.f75715) * this.f75704.m35498()) / this.f75705));
            if (Math.abs(j - jM35498) <= 20000000) {
                j = jM35498;
            } else {
                this.f75701 = 0L;
                this.f75715 = -1L;
                this.f75708 = -1L;
            }
        }
        this.f75708 = this.f75701;
        this.f75702 = j;
        ChoreographerFrameCallbackC10669 choreographerFrameCallbackC10669 = this.f75713;
        if (choreographerFrameCallbackC10669 != null && this.f75712 != -9223372036854775807L) {
            long j3 = choreographerFrameCallbackC10669.f36392;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f75712;
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
                return j5 - this.f75706;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51486() {
        this.f75701 = 0L;
        this.f75715 = -1L;
        this.f75708 = -1L;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m51484() {
        if (Build.VERSION.SDK_INT < 30 || this.f75710 == null) {
            return;
        }
        C14818 c14818 = this.f75704;
        float fM35502 = c14818.m35500() ? c14818.m35502() : this.f75707;
        float f = this.f75714;
        if (fM35502 == f) {
            return;
        }
        if (fM35502 != -1.0f && f != -1.0f) {
            if (Math.abs(fM35502 - this.f75714) < ((!c14818.m35500() || c14818.m35497() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fM35502 == -1.0f && c14818.m35501() < 30) {
            return;
        }
        this.f75714 = fM35502;
        m51483(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51483(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f75710) == null || this.f75703 == Integer.MIN_VALUE) {
            return;
        }
        if (this.f75716) {
            float f2 = this.f75714;
            if (f2 != -1.0f) {
                f = f2 * this.f75705;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f75711 != f) {
            this.f75711 = f;
            C17018.m39784(surface, f);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m51481() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f75710) == null || this.f75703 == Integer.MIN_VALUE || this.f75711 == 0.0f) {
            return;
        }
        this.f75711 = 0.0f;
        C17018.m39784(surface, 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51482(C23369 c23369, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c23369.f75712 = refreshRate;
            c23369.f75706 = (refreshRate * 80) / 100;
        } else {
            C0303.m1848("Unable to query display refresh rate");
            c23369.f75712 = -9223372036854775807L;
            c23369.f75706 = -9223372036854775807L;
        }
    }
}
