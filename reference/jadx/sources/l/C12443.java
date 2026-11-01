package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12443 extends AbstractC23026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17381 f41501;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41502;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f41503 = new RunnableC16676(this);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15265 f41504;

    @Override // l.AbstractC23026
    public final boolean onEdgeLock(int i) {
        return false;
    }

    public C12443(C17381 c17381, int i) {
        this.f41501 = c17381;
        this.f41502 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30919(C15265 c15265) {
        this.f41504 = c15265;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30920() {
        this.f41501.removeCallbacks(this.f41503);
    }

    @Override // l.AbstractC23026
    public final boolean tryCaptureView(View view, int i) {
        if (!C17381.m40466(view)) {
            return false;
        }
        int i2 = this.f41502;
        C17381 c17381 = this.f41501;
        return c17381.m40483(i2, view) && c17381.m40474(view) == 0;
    }

    @Override // l.AbstractC23026
    public final void onViewDragStateChanged(int i) {
        this.f41501.m40486(i, this.f41504.m36561());
    }

    @Override // l.AbstractC23026
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        C17381 c17381 = this.f41501;
        float width2 = (c17381.m40483(3, view) ? i + width : c17381.getWidth() - i) / width;
        c17381.m40492(width2, view);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        c17381.invalidate();
    }

    @Override // l.AbstractC23026
    public final void onViewCaptured(View view, int i) {
        ((C20909) view.getLayoutParams()).f67945 = false;
        int i2 = this.f41502 == 3 ? 5 : 3;
        C17381 c17381 = this.f41501;
        View viewM40491 = c17381.m40491(i2);
        if (viewM40491 != null) {
            c17381.m40479(viewM40491, true);
        }
    }

    @Override // l.AbstractC23026
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int[] iArr = C17381.f55283;
        float f3 = ((C20909) view.getLayoutParams()).f67944;
        int width = view.getWidth();
        C17381 c17381 = this.f41501;
        if (c17381.m40483(3, view)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = c17381.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f41504.m36567(i, view.getTop());
        c17381.invalidate();
    }

    @Override // l.AbstractC23026
    public final void onEdgeTouched(int i, int i2) {
        this.f41501.postDelayed(this.f41503, 160L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30918() {
        View viewM40491;
        int width;
        int iM36551 = this.f41504.m36551();
        int i = this.f41502;
        boolean z = i == 3;
        C17381 c17381 = this.f41501;
        if (z) {
            viewM40491 = c17381.m40491(3);
            width = (viewM40491 != null ? -viewM40491.getWidth() : 0) + iM36551;
        } else {
            viewM40491 = c17381.m40491(5);
            width = c17381.getWidth() - iM36551;
        }
        if (viewM40491 != null) {
            if (((!z || viewM40491.getLeft() >= width) && (z || viewM40491.getLeft() <= width)) || c17381.m40474(viewM40491) != 0) {
                return;
            }
            C20909 c20909 = (C20909) viewM40491.getLayoutParams();
            this.f41504.m36560(viewM40491, width, viewM40491.getTop());
            c20909.f67945 = true;
            c17381.invalidate();
            View viewM40492 = c17381.m40491(i == 3 ? 5 : 3);
            if (viewM40492 != null) {
                c17381.m40479(viewM40492, true);
            }
            c17381.m40475();
        }
    }

    @Override // l.AbstractC23026
    public final void onEdgeDragStarted(int i, int i2) {
        View viewM40491;
        int i3 = i & 1;
        C17381 c17381 = this.f41501;
        if (i3 == 1) {
            viewM40491 = c17381.m40491(3);
        } else {
            viewM40491 = c17381.m40491(5);
        }
        if (viewM40491 == null || c17381.m40474(viewM40491) != 0) {
            return;
        }
        this.f41504.m36558(i2, viewM40491);
    }

    @Override // l.AbstractC23026
    public final int getViewHorizontalDragRange(View view) {
        if (C17381.m40466(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // l.AbstractC23026
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C17381 c17381 = this.f41501;
        if (c17381.m40483(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = c17381.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // l.AbstractC23026
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }
}
