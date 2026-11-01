package l;

import android.graphics.RectF;

/* JADX INFO: renamed from: l.᩹ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: EAJU */
/* JADX INFO: loaded from: classes.dex */
public final class C22398 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f73105;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f73106;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f73107;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f73108;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f73109;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final RectF f73110 = new RectF();

    public C22398(int i) {
        this.f73108 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49669(float f, float f2, float f3, float f4) {
        m49670(this.f73108, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49670(int i, float f, float f2, float f3, float f4) {
        this.f73109 = f;
        this.f73107 = f2;
        this.f73105 = f3;
        this.f73106 = f4;
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
            this.f73110.set(f, f2, f3, f4);
        }
        f4 += f6 * 2.5f;
        float f8 = f5 / 2.0f;
        f -= f8;
        f3 += f8;
        this.f73110.set(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49668() {
        this.f73106 = 0.0f;
        this.f73107 = 0.0f;
        this.f73105 = 0.0f;
        this.f73109 = 0.0f;
        this.f73110.setEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49671(float f, float f2) {
        return this.f73110.contains(f, f2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m49672(float f, float f2) {
        return f >= this.f73109 && f <= this.f73105 && f2 >= this.f73107 && f2 <= this.f73106;
    }
}
