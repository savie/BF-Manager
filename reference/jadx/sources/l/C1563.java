package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1563 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f5392;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f5393;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f5394;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f5395;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f5396;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f5397 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object f5398;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f5399;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f5400;

    public C1563(int i, int i2) {
        this.f5400 = i;
        this.f5394 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5505(View view, int i, float f, float f2, boolean z) {
        m5504();
        if (!z || view == null) {
            return;
        }
        this.f5398 = view;
        this.f5397 = i;
        this.f5393 = f;
        this.f5399 = f2;
        this.f5396 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5292 m5503(View view, float f, float f2, int i) {
        if (!this.f5396 || this.f5392) {
            return EnumC5292.NONE;
        }
        if (view == null || view != this.f5398 || i != this.f5397) {
            m5504();
            return EnumC5292.NONE;
        }
        float f3 = f - this.f5393;
        float f4 = f2 - this.f5399;
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        int i2 = this.f5400;
        if (f3 < 0.0f && fAbs > i2 && fAbs > fAbs2) {
            m5504();
            return EnumC5292.NONE;
        }
        float f5 = i2;
        if (fAbs2 > f5 && fAbs2 > fAbs) {
            m5504();
            return EnumC5292.NONE;
        }
        boolean z = f3 > f5 && f3 > fAbs2;
        if (f3 >= this.f5394 && f3 > fAbs2) {
            this.f5395 = true;
            this.f5392 = true;
            return EnumC5292.TRIGGER_LONG_CLICK;
        }
        if (z && !this.f5395) {
            this.f5395 = true;
            return EnumC5292.REQUEST_DISALLOW_INTERCEPT;
        }
        return EnumC5292.NONE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5504() {
        this.f5398 = null;
        this.f5397 = -1;
        this.f5393 = 0.0f;
        this.f5399 = 0.0f;
        this.f5396 = false;
        this.f5395 = false;
        this.f5392 = false;
    }
}
