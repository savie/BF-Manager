package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۨ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C11704 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f39338;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39339;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f39340;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC21581 f39341;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39342;

    public C11704() {
        m29218();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29218() {
        this.f39338 = -1;
        this.f39339 = Integer.MIN_VALUE;
        this.f39342 = false;
        this.f39340 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29216() {
        int iMo36483;
        if (this.f39342) {
            iMo36483 = this.f39341.mo36481();
        } else {
            iMo36483 = this.f39341.mo36483();
        }
        this.f39339 = iMo36483;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f39338 + ", mCoordinate=" + this.f39339 + ", mLayoutFromEnd=" + this.f39342 + ", mValid=" + this.f39340 + '}';
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29219(int i, View view) {
        int iM48295 = this.f39341.m48295();
        if (iM48295 >= 0) {
            m29217(i, view);
            return;
        }
        this.f39338 = i;
        if (this.f39342) {
            int iMo36481 = (this.f39341.mo36481() - iM48295) - this.f39341.mo36475(view);
            this.f39339 = this.f39341.mo36481() - iMo36481;
            if (iMo36481 > 0) {
                int iMo36482 = this.f39339 - this.f39341.mo36482(view);
                int iMo36483 = this.f39341.mo36483();
                int iMin = iMo36482 - (Math.min(this.f39341.mo36473(view) - iMo36483, 0) + iMo36483);
                if (iMin < 0) {
                    this.f39339 = Math.min(iMo36481, -iMin) + this.f39339;
                    return;
                }
                return;
            }
            return;
        }
        int iMo36473 = this.f39341.mo36473(view);
        int iMo36484 = iMo36473 - this.f39341.mo36483();
        this.f39339 = iMo36473;
        if (iMo36484 > 0) {
            int iMo36485 = (this.f39341.mo36481() - Math.min(0, (this.f39341.mo36481() - iM48295) - this.f39341.mo36475(view))) - (this.f39341.mo36482(view) + iMo36473);
            if (iMo36485 < 0) {
                this.f39339 -= Math.min(iMo36484, -iMo36485);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29217(int i, View view) {
        if (this.f39342) {
            this.f39339 = this.f39341.m48295() + this.f39341.mo36475(view);
        } else {
            this.f39339 = this.f39341.mo36473(view);
        }
        this.f39338 = i;
    }
}
