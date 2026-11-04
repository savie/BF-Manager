package l;

import android.content.Context;
import android.widget.OverScroller;

/* JADX INFO: renamed from: l.֨ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0865 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OverScroller f3243;

    public C0865(Context context) {
        this.f3243 = new OverScroller(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3526() {
        return this.f3243.computeScrollOffset();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3525(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f3243.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3529() {
        this.f3243.forceFinished(true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m3528() {
        return this.f3243.isFinished();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m3527() {
        return this.f3243.getCurrX();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m3530() {
        return this.f3243.getCurrY();
    }
}
