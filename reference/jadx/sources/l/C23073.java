package l;

import android.graphics.RectF;

/* JADX INFO: renamed from: l.᩸᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAJU */
/* JADX INFO: loaded from: classes.dex */
public final class C23073 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f74850;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f74851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final RectF f74852 = new RectF();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f74853;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f74854;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f74855;

    public C23073(int i) {
        this.f74851 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51985(float f, float f2, float f3, float f4) {
        m51986(this.f74851, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51986(int i, float f, float f2, float f3, float f4) {
        this.f74854 = f;
        this.f74853 = f2;
        this.f74855 = f3;
        this.f74850 = f4;
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (i == -1) {
            throw new IllegalStateException();
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    f3 += f5 * 2.5f;
                } else if (i == 3) {
                    f -= f5 * 2.5f;
                }
                float f7 = f6 / 2.0f;
                f2 -= f7;
                f4 += f7;
            } else {
                f2 -= f6 * 2.5f;
            }
            this.f74852.set(f, f2, f3, f4);
        }
        f4 += f6 * 2.5f;
        float f8 = f5 / 2.0f;
        f -= f8;
        f3 += f8;
        this.f74852.set(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51984() {
        this.f74850 = 0.0f;
        this.f74853 = 0.0f;
        this.f74855 = 0.0f;
        this.f74854 = 0.0f;
        this.f74852.setEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51987(float f, float f2) {
        return this.f74852.contains(f, f2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51988(float f, float f2) {
        return f >= this.f74854 && f <= this.f74855 && f2 >= this.f74853 && f2 <= this.f74850;
    }
}
