package l;

import android.content.Context;
import android.widget.OverScroller;

/* JADX INFO: renamed from: l.۟ܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 14SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7589 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OverScroller f25133;

    public C7589(Context context) {
        this.f25133 = new OverScroller(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20119() {
        return this.f25133.computeScrollOffset();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20118(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f25133.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20122() {
        this.f25133.forceFinished(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20120() {
        return this.f25133.isFinished();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m20121() {
        return this.f25133.getCurrX();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m20117() {
        return this.f25133.getCurrY();
    }
}
