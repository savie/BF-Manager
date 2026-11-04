package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes.dex */
public final class C23934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77487;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC9016 f77488;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f77489;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f77490;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f77491;

    public C23934() {
        m53458();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53458() {
        this.f77491 = -1;
        this.f77487 = Integer.MIN_VALUE;
        this.f77490 = false;
        this.f77489 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53456() {
        int iMo3273;
        if (this.f77490) {
            iMo3273 = this.f77488.mo3277();
        } else {
            iMo3273 = this.f77488.mo3273();
        }
        this.f77487 = iMo3273;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f77491 + ", mCoordinate=" + this.f77487 + ", mLayoutFromEnd=" + this.f77490 + ", mValid=" + this.f77489 + '}';
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53459(int i, View view) {
        int iM24073 = this.f77488.m24073();
        if (iM24073 >= 0) {
            m53457(i, view);
            return;
        }
        this.f77491 = i;
        if (this.f77490) {
            int iMo3277 = (this.f77488.mo3277() - iM24073) - this.f77488.mo3268(view);
            this.f77487 = this.f77488.mo3277() - iMo3277;
            if (iMo3277 > 0) {
                int iMo3278 = this.f77487 - this.f77488.mo3278(view);
                int iMo3273 = this.f77488.mo3273();
                int iMin = iMo3278 - (Math.min(this.f77488.mo3280(view) - iMo3273, 0) + iMo3273);
                if (iMin < 0) {
                    this.f77487 = Math.min(iMo3277, -iMin) + this.f77487;
                    return;
                }
                return;
            }
            return;
        }
        int iMo3280 = this.f77488.mo3280(view);
        int iMo3274 = iMo3280 - this.f77488.mo3273();
        this.f77487 = iMo3280;
        if (iMo3274 > 0) {
            int iMo3279 = (this.f77488.mo3277() - Math.min(0, (this.f77488.mo3277() - iM24073) - this.f77488.mo3268(view))) - (this.f77488.mo3278(view) + iMo3280);
            if (iMo3279 < 0) {
                this.f77487 -= Math.min(iMo3274, -iMo3279);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53457(int i, View view) {
        if (this.f77490) {
            this.f77487 = this.f77488.m24073() + this.f77488.mo3268(view);
        } else {
            this.f77487 = this.f77488.mo3280(view);
        }
        this.f77491 = i;
    }
}
