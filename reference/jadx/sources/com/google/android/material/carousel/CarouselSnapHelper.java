package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import l.AbstractC21020;
import l.AbstractC3380;
import l.AbstractC5498;
import l.C10438;
import l.C16082;
import l.C17492;
import l.C3941;
import l.InterfaceC7615;

/* JADX INFO: loaded from: classes.dex */
public class CarouselSnapHelper extends AbstractC3380 {
    public static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    public static final float VERTICAL_SNAP_SPEED = 50.0f;
    public final boolean disableFling;
    public C17492 recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }

    @Override // l.AbstractC3380
    public void attachToRecyclerView(C17492 c17492) {
        super.attachToRecyclerView(c17492);
        this.recyclerView = c17492;
    }

    @Override // l.AbstractC3380
    public int[] calculateDistanceToFinalSnap(AbstractC5498 abstractC5498, View view) {
        return calculateDistanceToSnap(abstractC5498, view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(AbstractC5498 abstractC5498, View view, boolean z) {
        if (!(abstractC5498 instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) abstractC5498, z);
        if (abstractC5498.canScrollHorizontally()) {
            return new int[]{iDistanceToFirstFocalKeyline, 0};
        }
        if (abstractC5498.canScrollVertically()) {
            return new int[]{0, iDistanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    @Override // l.AbstractC3380
    public View findSnapView(AbstractC5498 abstractC5498) {
        return findViewNearestFirstKeyline(abstractC5498);
    }

    private View findViewNearestFirstKeyline(AbstractC5498 abstractC5498) {
        int childCount = abstractC5498.getChildCount();
        View view = null;
        if (childCount != 0 && (abstractC5498 instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) abstractC5498;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = abstractC5498.getChildAt(i2);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(abstractC5498.getPosition(childAt), false));
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    @Override // l.AbstractC3380
    public int findTargetSnapPosition(AbstractC5498 abstractC5498, int i, int i2) {
        int itemCount;
        if (!this.disableFling || (itemCount = abstractC5498.getItemCount()) == 0) {
            return -1;
        }
        int childCount = abstractC5498.getChildCount();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC5498.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) abstractC5498, false);
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
        boolean zIsForwardFling = isForwardFling(abstractC5498, i, i2);
        if (zIsForwardFling && view != null) {
            return abstractC5498.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return abstractC5498.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC5498.getPosition(view) + (isReverseLayout(abstractC5498) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private boolean isForwardFling(AbstractC5498 abstractC5498, int i, int i2) {
        if (abstractC5498.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(AbstractC5498 abstractC5498) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC5498.getItemCount();
        if (!(abstractC5498 instanceof InterfaceC7615) || (pointFComputeScrollVectorForPosition = ((InterfaceC7615) abstractC5498).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // l.AbstractC3380
    public AbstractC21020 createScroller(final AbstractC5498 abstractC5498) {
        if (abstractC5498 instanceof InterfaceC7615) {
            return new C3941(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // l.C3941, l.AbstractC21020
                public void onTargetFound(View view, C16082 c16082, C10438 c10438) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = iArrCalculateDistanceToSnap[0];
                        int i2 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                        if (iCalculateTimeForDeceleration > 0) {
                            c10438.m26352(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                        }
                    }
                }

                @Override // l.C3941
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (abstractC5498.canScrollVertically()) {
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
