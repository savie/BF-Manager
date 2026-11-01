package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩵᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19785 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f63544;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f63545;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f63546;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f63547;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object f63548;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f63549;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f63550;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f63551;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63552 = -1;

    public C19785(int i, int i2) {
        this.f63545 = i;
        this.f63550 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45001(View view, int i, float f, float f2, boolean z) {
        m45000();
        if (!z || view == null) {
            return;
        }
        this.f63548 = view;
        this.f63552 = i;
        this.f63547 = f;
        this.f63551 = f2;
        this.f63544 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC8496 m44999(View view, float f, float f2, int i) {
        if (!this.f63544 || this.f63546) {
            return EnumC8496.NONE;
        }
        if (view == null || view != this.f63548 || i != this.f63552) {
            m45000();
            return EnumC8496.NONE;
        }
        float f3 = f - this.f63547;
        float f4 = f2 - this.f63551;
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        int i2 = this.f63545;
        if (f3 < 0.0f && fAbs > i2 && fAbs > fAbs2) {
            m45000();
            return EnumC8496.NONE;
        }
        float f5 = i2;
        if (fAbs2 > f5 && fAbs2 > fAbs) {
            m45000();
            return EnumC8496.NONE;
        }
        boolean z = f3 > f5 && f3 > fAbs2;
        if (f3 >= this.f63550 && f3 > fAbs2) {
            this.f63549 = true;
            this.f63546 = true;
            return EnumC8496.TRIGGER_LONG_CLICK;
        }
        if (z && !this.f63549) {
            this.f63549 = true;
            return EnumC8496.REQUEST_DISALLOW_INTERCEPT;
        }
        return EnumC8496.NONE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45000() {
        this.f63548 = null;
        this.f63552 = -1;
        this.f63547 = 0.0f;
        this.f63551 = 0.0f;
        this.f63544 = false;
        this.f63549 = false;
        this.f63546 = false;
    }
}
