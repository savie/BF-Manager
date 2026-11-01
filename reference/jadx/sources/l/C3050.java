package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۗۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3050 extends AbstractC23026 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22246 f11433;

    @Override // l.AbstractC23026
    public final void onViewCaptured(View view, int i) {
        C22246 c22246 = this.f11433;
        int childCount = c22246.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c22246.getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public C3050(C22246 c22246) {
        this.f11433 = c22246;
    }

    @Override // l.AbstractC23026
    public final boolean tryCaptureView(View view, int i) {
        if (m9143()) {
            return ((C4606) view.getLayoutParams()).f16311;
        }
        return false;
    }

    @Override // l.AbstractC23026
    public final void onViewDragStateChanged(int i) {
        C22246 c22246 = this.f11433;
        if (c22246.f72732.m36553() == 0) {
            if (c22246.f72720 == 1.0f) {
                c22246.m49385(c22246.f72727);
                c22246.m49389(c22246.f72727);
                c22246.f72723 = false;
            } else {
                c22246.m49396(c22246.f72727);
                c22246.f72723 = true;
            }
        }
    }

    @Override // l.AbstractC23026
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        C22246 c22246 = this.f11433;
        c22246.m49388(i);
        c22246.invalidate();
    }

    @Override // l.AbstractC23026
    public final void onViewReleased(View view, float f, float f2) {
        int paddingLeft;
        C4606 c4606 = (C4606) view.getLayoutParams();
        C22246 c22246 = this.f11433;
        if (c22246.m49393()) {
            int paddingRight = c22246.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c4606).rightMargin;
            if (f < 0.0f || (f == 0.0f && c22246.f72720 > 0.5f)) {
                paddingRight += c22246.f72721;
            }
            paddingLeft = (c22246.getWidth() - paddingRight) - c22246.f72727.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) c4606).leftMargin + c22246.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && c22246.f72720 > 0.5f)) {
                paddingLeft += c22246.f72721;
            }
        }
        c22246.f72732.m36567(paddingLeft, view.getTop());
        c22246.invalidate();
    }

    @Override // l.AbstractC23026
    public final int getViewHorizontalDragRange(View view) {
        return this.f11433.f72721;
    }

    @Override // l.AbstractC23026
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C22246 c22246 = this.f11433;
        C4606 c4606 = (C4606) c22246.f72727.getLayoutParams();
        if (c22246.m49393()) {
            int width = c22246.getWidth() - (c22246.f72727.getWidth() + (c22246.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c4606).rightMargin));
            return Math.max(Math.min(i, width), width - c22246.f72721);
        }
        int paddingLeft = c22246.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c4606).leftMargin;
        return Math.min(Math.max(i, paddingLeft), c22246.f72721 + paddingLeft);
    }

    @Override // l.AbstractC23026
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // l.AbstractC23026
    public final void onEdgeTouched(int i, int i2) {
        if (m9143()) {
            C22246 c22246 = this.f11433;
            c22246.f72732.m36558(i2, c22246.f72727);
        }
    }

    @Override // l.AbstractC23026
    public final void onEdgeDragStarted(int i, int i2) {
        if (m9143()) {
            C22246 c22246 = this.f11433;
            c22246.f72732.m36558(i2, c22246.f72727);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9143() {
        C22246 c22246 = this.f11433;
        if (c22246.f72724 || c22246.m49395() == 3) {
            return false;
        }
        if (c22246.m49386() && c22246.m49395() == 1) {
            return false;
        }
        return c22246.m49386() || c22246.m49395() != 2;
    }
}
