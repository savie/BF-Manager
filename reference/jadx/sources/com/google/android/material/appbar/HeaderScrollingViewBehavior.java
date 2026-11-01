package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import l.C15844;
import l.C2746;
import l.C4449;
import l.C5031;
import l.C9679;

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

    @Override // l.AbstractC23790
    public boolean onMeasureChild(C2746 c2746, View view, int i, int i2, int i3, int i4) {
        View viewFindFirstDependency;
        C15844 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewFindFirstDependency = findFirstDependency(c2746.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            int i6 = C5031.f17539;
            if (viewFindFirstDependency.getFitsSystemWindows() && (lastWindowInsets = c2746.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m37670() + lastWindowInsets.m37681();
            }
        } else {
            size = c2746.getHeight();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        c2746.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(C2746 c2746, View view, int i) {
        View viewFindFirstDependency = findFirstDependency(c2746.getDependencies(view));
        if (viewFindFirstDependency != null) {
            C9679 c9679 = (C9679) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(c2746.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c9679).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c9679).topMargin, (c2746.getWidth() - c2746.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c9679).rightMargin, ((viewFindFirstDependency.getBottom() + c2746.getHeight()) - c2746.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c9679).bottomMargin);
            C15844 lastWindowInsets = c2746.getLastWindowInsets();
            if (lastWindowInsets != null) {
                int i2 = C5031.f17539;
                if (c2746.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.m37683() + rect.left;
                    rect.right -= lastWindowInsets.m37672();
                }
            }
            Rect rect2 = this.tempRect2;
            Gravity.apply(resolveGravity(c9679.f32632), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
            return;
        }
        super.layoutChild(c2746, view, i);
        this.verticalLayoutGap = 0;
    }

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return C4449.m12402((int) (overlapRatioForOffset * i), 0, i);
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
