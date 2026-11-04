package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import l.AbstractC12546;
import l.AbstractC20005;
import l.AbstractC21169;
import l.C11054;
import l.C15529;
import l.C25227;
import l.C7525;
import l.InterfaceC22989;

/* JADX INFO: loaded from: classes.dex */
public class CarouselSnapHelper extends AbstractC12546 {
    public static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    public static final float VERTICAL_SNAP_SPEED = 50.0f;
    public final boolean disableFling;
    public C25227 recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }

    @Override // l.AbstractC12546
    public void attachToRecyclerView(C25227 c25227) {
        super.attachToRecyclerView(c25227);
        this.recyclerView = c25227;
    }

    @Override // l.AbstractC12546
    public int[] calculateDistanceToFinalSnap(AbstractC21169 abstractC21169, View view) {
        return calculateDistanceToSnap(abstractC21169, view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(AbstractC21169 abstractC21169, View view, boolean z) {
        if (!(abstractC21169 instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) abstractC21169, z);
        if (abstractC21169.canScrollHorizontally()) {
            return new int[]{iDistanceToFirstFocalKeyline, 0};
        }
        if (abstractC21169.canScrollVertically()) {
            return new int[]{0, iDistanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    @Override // l.AbstractC12546
    public View findSnapView(AbstractC21169 abstractC21169) {
        return findViewNearestFirstKeyline(abstractC21169);
    }

    private View findViewNearestFirstKeyline(AbstractC21169 abstractC21169) {
        int childCount = abstractC21169.getChildCount();
        View view = null;
        if (childCount != 0 && (abstractC21169 instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) abstractC21169;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = abstractC21169.getChildAt(i2);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(abstractC21169.getPosition(childAt), false));
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    @Override // l.AbstractC12546
    public int findTargetSnapPosition(AbstractC21169 abstractC21169, int i, int i2) {
        int itemCount;
        if (!this.disableFling || (itemCount = abstractC21169.getItemCount()) == 0) {
            return -1;
        }
        int childCount = abstractC21169.getChildCount();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC21169.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) abstractC21169, false);
                if (iDistanceToFirstFocalKeyline <= 0 && iDistanceToFirstFocalKeyline > i3) {
                    view2 = childAt;
                    i3 = iDistanceToFirstFocalKeyline;
                }
                if (iDistanceToFirstFocalKeyline >= 0 && iDistanceToFirstFocalKeyline < i4) {
                    view = childAt;
                    i4 = iDistanceToFirstFocalKeyline;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(abstractC21169, i, i2);
        if (zIsForwardFling && view != null) {
            return abstractC21169.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return abstractC21169.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC21169.getPosition(view) + (isReverseLayout(abstractC21169) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private boolean isForwardFling(AbstractC21169 abstractC21169, int i, int i2) {
        if (abstractC21169.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(AbstractC21169 abstractC21169) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC21169.getItemCount();
        if (!(abstractC21169 instanceof InterfaceC22989) || (pointFComputeScrollVectorForPosition = ((InterfaceC22989) abstractC21169).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // l.AbstractC12546
    public AbstractC20005 createScroller(final AbstractC21169 abstractC21169) {
        if (abstractC21169 instanceof InterfaceC22989) {
            return new C7525(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // l.C7525, l.AbstractC20005
                public void onTargetFound(View view, C15529 c15529, C11054 c11054) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = iArrCalculateDistanceToSnap[0];
                        int i2 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                        if (iCalculateTimeForDeceleration > 0) {
                            c11054.m27938(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                        }
                    }
                }

                @Override // l.C7525
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (abstractC21169.canScrollVertically()) {
                        f = displayMetrics.densityDpi;
                        f2 = 50.0f;
                    } else {
                        f = displayMetrics.densityDpi;
                        f2 = 100.0f;
                    }
                    return f2 / f;
                }
            };
        }
        return null;
    }
}
