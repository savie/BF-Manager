package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14520 extends AbstractC11875 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10045 f45675;

    @Override // l.AbstractC11875
    public final void onViewCaptured(View view, int i) {
        C10045 c10045 = this.f45675;
        int childCount = c10045.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c10045.getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public C14520(C10045 c10045) {
        this.f45675 = c10045;
    }

    @Override // l.AbstractC11875
    public final boolean tryCaptureView(View view, int i) {
        if (m35036()) {
            return ((C21234) view.getLayoutParams()).f67761;
        }
        return false;
    }

    @Override // l.AbstractC11875
    public final void onViewDragStateChanged(int i) {
        C10045 c10045 = this.f45675;
        if (c10045.f32206.m56531() == 0) {
            if (c10045.f32202 == 1.0f) {
                c10045.m25947(c10045.f32207);
                c10045.m25937(c10045.f32207);
                c10045.f32196 = false;
            } else {
                c10045.m25946(c10045.f32207);
                c10045.f32196 = true;
            }
        }
    }

    @Override // l.AbstractC11875
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        C10045 c10045 = this.f45675;
        c10045.m25936(i);
        c10045.invalidate();
    }

    @Override // l.AbstractC11875
    public final void onViewReleased(View view, float f, float f2) {
        int paddingLeft;
        C21234 c21234 = (C21234) view.getLayoutParams();
        C10045 c10045 = this.f45675;
        if (c10045.m25940()) {
            int paddingRight = c10045.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c21234).rightMargin;
            if (f < 0.0f || (f == 0.0f && c10045.f32202 > 0.5f)) {
                paddingRight += c10045.f32195;
            }
            paddingLeft = (c10045.getWidth() - paddingRight) - c10045.f32207.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) c21234).leftMargin + c10045.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && c10045.f32202 > 0.5f)) {
                paddingLeft += c10045.f32195;
            }
        }
        c10045.f32206.m56547(paddingLeft, view.getTop());
        c10045.invalidate();
    }

    @Override // l.AbstractC11875
    public final int getViewHorizontalDragRange(View view) {
        return this.f45675.f32195;
    }

    @Override // l.AbstractC11875
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C10045 c10045 = this.f45675;
        C21234 c21234 = (C21234) c10045.f32207.getLayoutParams();
        if (c10045.m25940()) {
            int width = c10045.getWidth() - (c10045.f32207.getWidth() + (c10045.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c21234).rightMargin));
            return Math.max(Math.min(i, width), width - c10045.f32195);
        }
        int paddingLeft = c10045.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c21234).leftMargin;
        return Math.min(Math.max(i, paddingLeft), c10045.f32195 + paddingLeft);
    }

    @Override // l.AbstractC11875
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // l.AbstractC11875
    public final void onEdgeTouched(int i, int i2) {
        if (m35036()) {
            C10045 c10045 = this.f45675;
            c10045.f32206.m56536(i2, c10045.f32207);
        }
    }

    @Override // l.AbstractC11875
    public final void onEdgeDragStarted(int i, int i2) {
        if (m35036()) {
            C10045 c10045 = this.f45675;
            c10045.f32206.m56536(i2, c10045.f32207);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35036() {
        C10045 c10045 = this.f45675;
        if (c10045.f32193 || c10045.m25945() == 3) {
            return false;
        }
        if (c10045.m25948() && c10045.m25945() == 1) {
            return false;
        }
        return c10045.m25948() || c10045.m25945() != 2;
    }
}
