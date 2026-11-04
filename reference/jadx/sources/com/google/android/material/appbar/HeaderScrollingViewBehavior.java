package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import l.C15578;
import l.C16973;
import l.C22666;
import l.C25276;
import l.C3977;

/* JADX INFO: loaded from: classes.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int overlayTop;
    public final Rect tempRect1;
    public final Rect tempRect2;
    public int verticalLayoutGap;

    public static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    public abstract View findFirstDependency(List list);

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    @Override // l.AbstractC11103
    public boolean onMeasureChild(C25276 c25276, View view, int i, int i2, int i3, int i4) {
        View viewFindFirstDependency;
        C3977 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewFindFirstDependency = findFirstDependency(c25276.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            int i6 = C22666.f73603;
            if (viewFindFirstDependency.getFitsSystemWindows() && (lastWindowInsets = c25276.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m12825() + lastWindowInsets.m12824();
            }
        } else {
            size = c25276.getHeight();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        c25276.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(C25276 c25276, View view, int i) {
        View viewFindFirstDependency = findFirstDependency(c25276.getDependencies(view));
        if (viewFindFirstDependency != null) {
            C15578 c15578 = (C15578) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(c25276.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c15578).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c15578).topMargin, (c25276.getWidth() - c25276.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c15578).rightMargin, ((viewFindFirstDependency.getBottom() + c25276.getHeight()) - c25276.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c15578).bottomMargin);
            C3977 lastWindowInsets = c25276.getLastWindowInsets();
            if (lastWindowInsets != null) {
                int i2 = C22666.f73603;
                if (c25276.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.m12822() + rect.left;
                    rect.right -= lastWindowInsets.m12814();
                }
            }
            Rect rect2 = this.tempRect2;
            Gravity.apply(resolveGravity(c15578.f50661), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
            return;
        }
        super.layoutChild(c25276, view, i);
        this.verticalLayoutGap = 0;
    }

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return C16973.m40021((int) (overlapRatioForOffset * i), 0, i);
    }

    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }
}
