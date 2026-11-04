package l;

import android.view.View;

/* JADX INFO: renamed from: l.֡᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0689 extends AbstractC11875 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2582;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f2583 = new RunnableC18588(this);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C25302 f2584;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8147 f2585;

    @Override // l.AbstractC11875
    public final boolean onEdgeLock(int i) {
        return false;
    }

    public C0689(C8147 c8147, int i) {
        this.f2585 = c8147;
        this.f2582 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2987(C25302 c25302) {
        this.f2584 = c25302;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2988() {
        this.f2585.removeCallbacks(this.f2583);
    }

    @Override // l.AbstractC11875
    public final boolean tryCaptureView(View view, int i) {
        if (!C8147.m22029(view)) {
            return false;
        }
        int i2 = this.f2582;
        C8147 c8147 = this.f2585;
        return c8147.m22043(i2, view) && c8147.m22034(view) == 0;
    }

    @Override // l.AbstractC11875
    public final void onViewDragStateChanged(int i) {
        this.f2585.m22046(i, this.f2584.m56544());
    }

    @Override // l.AbstractC11875
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        C8147 c8147 = this.f2585;
        float width2 = (c8147.m22043(3, view) ? i + width : c8147.getWidth() - i) / width;
        c8147.m22054(width2, view);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        c8147.invalidate();
    }

    @Override // l.AbstractC11875
    public final void onViewCaptured(View view, int i) {
        ((C24556) view.getLayoutParams()).f79594 = false;
        int i2 = this.f2582 == 3 ? 5 : 3;
        C8147 c8147 = this.f2585;
        View viewM22053 = c8147.m22053(i2);
        if (viewM22053 != null) {
            c8147.m22039(viewM22053, true);
        }
    }

    @Override // l.AbstractC11875
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int[] iArr = C8147.f26866;
        float f3 = ((C24556) view.getLayoutParams()).f79593;
        int width = view.getWidth();
        C8147 c8147 = this.f2585;
        if (c8147.m22043(3, view)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = c8147.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f2584.m56547(i, view.getTop());
        c8147.invalidate();
    }

    @Override // l.AbstractC11875
    public final void onEdgeTouched(int i, int i2) {
        this.f2585.postDelayed(this.f2583, 160L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2986() {
        View viewM22053;
        int width;
        int iM56542 = this.f2584.m56542();
        int i = this.f2582;
        boolean z = i == 3;
        C8147 c8147 = this.f2585;
        if (z) {
            viewM22053 = c8147.m22053(3);
            width = (viewM22053 != null ? -viewM22053.getWidth() : 0) + iM56542;
        } else {
            viewM22053 = c8147.m22053(5);
            width = c8147.getWidth() - iM56542;
        }
        if (viewM22053 != null) {
            if (((!z || viewM22053.getLeft() >= width) && (z || viewM22053.getLeft() <= width)) || c8147.m22034(viewM22053) != 0) {
                return;
            }
            C24556 c24556 = (C24556) viewM22053.getLayoutParams();
            this.f2584.m56538(viewM22053, width, viewM22053.getTop());
            c24556.f79594 = true;
            c8147.invalidate();
            View viewM22054 = c8147.m22053(i == 3 ? 5 : 3);
            if (viewM22054 != null) {
                c8147.m22039(viewM22054, true);
            }
            c8147.m22035();
        }
    }

    @Override // l.AbstractC11875
    public final void onEdgeDragStarted(int i, int i2) {
        View viewM22053;
        int i3 = i & 1;
        C8147 c8147 = this.f2585;
        if (i3 == 1) {
            viewM22053 = c8147.m22053(3);
        } else {
            viewM22053 = c8147.m22053(5);
        }
        if (viewM22053 == null || c8147.m22034(viewM22053) != 0) {
            return;
        }
        this.f2584.m56536(i2, viewM22053);
    }

    @Override // l.AbstractC11875
    public final int getViewHorizontalDragRange(View view) {
        if (C8147.m22029(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // l.AbstractC11875
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C8147 c8147 = this.f2585;
        if (c8147.m22043(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = c8147.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // l.AbstractC11875
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }
}
