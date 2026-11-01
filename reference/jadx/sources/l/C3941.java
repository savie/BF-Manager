package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: l.ۘ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33LY */
/* JADX INFO: loaded from: classes2.dex */
public class C3941 extends AbstractC21020 {
    public static final boolean DEBUG = false;
    public static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    public static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    public static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    public final DisplayMetrics mDisplayMetrics;
    public float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    public PointF mTargetVector;
    public final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    public final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    public boolean mHasCalculatedMillisPerPixel = false;
    public int mInterimTargetDx = 0;
    public int mInterimTargetDy = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m11419(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    @Override // l.AbstractC21020
    public void onStart() {
    }

    public C3941(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    @Override // l.AbstractC21020
    public void onTargetFound(View view, C16082 c16082, C10438 c10438) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDyToMakeVisible * iCalculateDyToMakeVisible) + (iCalculateDxToMakeVisible * iCalculateDxToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            c10438.m26352(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
        }
    }

    @Override // l.AbstractC21020
    public void onSeekTargetStep(int i, int i2, C16082 c16082, C10438 c10438) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = m11419(this.mInterimTargetDx, i);
        int iM11419 = m11419(this.mInterimTargetDy, i2);
        this.mInterimTargetDy = iM11419;
        if (this.mInterimTargetDx == 0 && iM11419 == 0) {
            updateActionForInterimTarget(c10438);
        }
    }

    @Override // l.AbstractC21020
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m11418() {
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return this.mMillisPerPixel;
    }

    public int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3356d);
    }

    public int calculateTimeForScrolling(int i) {
        return (int) Math.ceil(Math.abs(i) * m11418());
    }

    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public void updateActionForInterimTarget(C10438 c10438) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            c10438.m26351(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        c10438.m26352((int) (this.mInterimTargetDx * 1.2f), (int) (this.mInterimTargetDy * 1.2f), this.mLinearInterpolator, (int) (calculateTimeForScrolling(10000) * 1.2f));
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int calculateDyToMakeVisible(View view, int i) {
        AbstractC5498 layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        C22432 c22432 = (C22432) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) c22432).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) c22432).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    public int calculateDxToMakeVisible(View view, int i) {
        AbstractC5498 layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        C22432 c22432 = (C22432) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) c22432).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) c22432).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }
}
