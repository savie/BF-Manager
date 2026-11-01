package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5498 {
    public boolean mAutoMeasure;
    public C19820 mChildHelper;
    public int mHeight;
    public int mHeightMode;
    public C21395 mHorizontalBoundCheck;
    public final InterfaceC15046 mHorizontalBoundCheckCallback;
    public boolean mIsAttachedToWindow;
    public boolean mItemPrefetchEnabled;
    public boolean mMeasurementCacheEnabled;
    public int mPrefetchMaxCountObserved;
    public boolean mPrefetchMaxObservedInInitialPrefetch;
    public C17492 mRecyclerView;
    public boolean mRequestedSimpleAnimations;
    public AbstractC21020 mSmoothScroller;
    public C21395 mVerticalBoundCheck;
    public final InterfaceC15046 mVerticalBoundCheckCallback;
    public int mWidth;
    public int mWidthMode;

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(C22432 c22432) {
        return c22432 != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C16082 c16082, InterfaceC11849 interfaceC11849) {
    }

    public void collectInitialPrefetchPositions(int i, InterfaceC11849 interfaceC11849) {
    }

    public int computeHorizontalScrollExtent(C16082 c16082) {
        return 0;
    }

    public int computeHorizontalScrollOffset(C16082 c16082) {
        return 0;
    }

    public int computeHorizontalScrollRange(C16082 c16082) {
        return 0;
    }

    public int computeVerticalScrollExtent(C16082 c16082) {
        return 0;
    }

    public int computeVerticalScrollOffset(C16082 c16082) {
        return 0;
    }

    public int computeVerticalScrollRange(C16082 c16082) {
        return 0;
    }

    public abstract C22432 generateDefaultLayoutParams();

    public int getBaseline() {
        return -1;
    }

    public int getColumnCountForAccessibility(C21726 c21726, C16082 c16082) {
        return -1;
    }

    public int getRowCountForAccessibility(C21726 c21726, C16082 c16082) {
        return -1;
    }

    public int getSelectionModeForAccessibility(C21726 c21726, C16082 c16082) {
        return 0;
    }

    public boolean isLayoutHierarchical(C21726 c21726, C16082 c16082) {
        return false;
    }

    public void onAdapterChanged(AbstractC0414 abstractC0414, AbstractC0414 abstractC0415) {
    }

    public boolean onAddFocusables(C17492 c17492, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow(C17492 c17492) {
    }

    @Deprecated
    public void onDetachedFromWindow(C17492 c17492) {
    }

    public View onFocusSearchFailed(View view, int i, C21726 c21726, C16082 c16082) {
        return null;
    }

    public void onInitializeAccessibilityNodeInfoForItem(C21726 c21726, C16082 c16082, View view, C22006 c22006) {
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsAdded(C17492 c17492, int i, int i2) {
    }

    public void onItemsChanged(C17492 c17492) {
    }

    public void onItemsMoved(C17492 c17492, int i, int i2, int i3) {
    }

    public void onItemsRemoved(C17492 c17492, int i, int i2) {
    }

    public void onItemsUpdated(C17492 c17492, int i, int i2) {
    }

    public void onLayoutChildren(C21726 c21726, C16082 c16082) {
    }

    public void onLayoutCompleted(C16082 c16082) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public boolean performAccessibilityActionForItem(C21726 c21726, C16082 c16082, View view, int i, Bundle bundle) {
        return false;
    }

    public int scrollHorizontallyBy(int i, C21726 c21726, C16082 c16082) {
        return 0;
    }

    public int scrollVerticallyBy(int i, C21726 c21726, C16082 c16082) {
        return 0;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public void smoothScrollToPosition(C17492 c17492, C16082 c16082, int i) {
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void removeAndRecycleScrapInt(C21726 c21726) {
        ArrayList arrayList = c21726.f70436;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC12554) arrayList.get(i)).itemView;
            AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
            if (!abstractC12554M40745.shouldIgnore()) {
                abstractC12554M40745.setIsRecyclable(false);
                if (abstractC12554M40745.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                AbstractC1825 abstractC1825 = this.mRecyclerView.mItemAnimator;
                if (abstractC1825 != null) {
                    abstractC1825.mo5965(abstractC12554M40745);
                }
                abstractC12554M40745.setIsRecyclable(true);
                AbstractC12554 abstractC12554M40746 = C17492.m40745(view);
                abstractC12554M40746.mScrapContainer = null;
                abstractC12554M40746.mInChangeScrap = false;
                abstractC12554M40746.clearReturnedFromScrapFlag();
                c21726.m48479(abstractC12554M40746);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c21726.f70438;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public AbstractC5498() {
        C4792 c4792 = new C4792(this);
        this.mHorizontalBoundCheckCallback = c4792;
        C13966 c13966 = new C13966(this);
        this.mVerticalBoundCheckCallback = c13966;
        this.mHorizontalBoundCheck = new C21395(c4792);
        this.mVerticalBoundCheck = new C21395(c13966);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public void setRecyclerView(C17492 c17492) {
        if (c17492 == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = c17492;
            this.mChildHelper = c17492.mChildHelper;
            this.mWidth = c17492.getWidth();
            this.mHeight = c17492.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !C17492.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 != 0 || C17492.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimensionFromChildren(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.mRecyclerView.mTempRect.set(i5, i6, i3, i4);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        setMeasuredDimension(m15187(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), m15187(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void requestLayout() {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            c17492.requestLayout();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            c17492.assertInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15187(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public void assertNotInLayoutOrScroll(String str) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            c17492.assertNotInLayoutOrScroll(str);
        }
    }

    @Deprecated
    public void setAutoMeasureEnabled(boolean z) {
        this.mAutoMeasure = z;
    }

    public boolean isAutoMeasureEnabled() {
        return this.mAutoMeasure;
    }

    public final void setItemPrefetchEnabled(boolean z) {
        if (z != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z;
            this.mPrefetchMaxCountObserved = 0;
            C17492 c17492 = this.mRecyclerView;
            if (c17492 != null) {
                c17492.mRecycler.m48489();
            }
        }
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public void dispatchAttachedToWindow(C17492 c17492) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(c17492);
    }

    public void dispatchDetachedFromWindow(C17492 c17492, C21726 c21726) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(c17492, c21726);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public void postOnAnimation(Runnable runnable) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            int i = C5031.f17539;
            c17492.postOnAnimation(runnable);
        }
    }

    public boolean removeCallbacks(Runnable runnable) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            return c17492.removeCallbacks(runnable);
        }
        return false;
    }

    public void onDetachedFromWindow(C17492 c17492, C21726 c21726) {
        onDetachedFromWindow(c17492);
    }

    public boolean getClipToPadding() {
        C17492 c17492 = this.mRecyclerView;
        return c17492 != null && c17492.mClipToPadding;
    }

    public C22432 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C22432) {
            return new C22432((C22432) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C22432((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C22432(layoutParams);
    }

    public C22432 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C22432(context, attributeSet);
    }

    public void scrollToPosition(int i) {
        int i2 = C17492.HORIZONTAL;
    }

    public void startSmoothScroll(AbstractC21020 abstractC21020) {
        AbstractC21020 abstractC21021 = this.mSmoothScroller;
        if (abstractC21021 != null && abstractC21020 != abstractC21021 && abstractC21021.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = abstractC21020;
        abstractC21020.start(this.mRecyclerView, this);
    }

    public boolean isSmoothScrolling() {
        AbstractC21020 abstractC21020 = this.mSmoothScroller;
        return abstractC21020 != null && abstractC21020.isRunning();
    }

    public int getLayoutDirection() {
        C17492 c17492 = this.mRecyclerView;
        int i = C5031.f17539;
        return c17492.getLayoutDirection();
    }

    public void endAnimation(View view) {
        AbstractC1825 abstractC1825 = this.mRecyclerView.mItemAnimator;
        if (abstractC1825 != null) {
            abstractC1825.mo5965(C17492.m40745(view));
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addDisappearingView(View view, int i) {
        m15192(view, i, true);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void addView(View view, int i) {
        m15192(view, i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15192(View view, int i, boolean z) {
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        if (z || abstractC12554M40745.isRemoved()) {
            C12274 c12274 = this.mRecyclerView.mViewInfoStore.f26225;
            C17867 c17867M41454 = (C17867) c12274.getOrDefault(abstractC12554M40745, null);
            if (c17867M41454 == null) {
                c17867M41454 = C17867.m41454();
                c12274.put(abstractC12554M40745, c17867M41454);
            }
            c17867M41454.f56570 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m21052(abstractC12554M40745);
        }
        C22432 c22432 = (C22432) view.getLayoutParams();
        if (abstractC12554M40745.wasReturnedFromScrap() || abstractC12554M40745.isScrap()) {
            if (abstractC12554M40745.isScrap()) {
                abstractC12554M40745.unScrap();
            } else {
                abstractC12554M40745.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.m45065(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iM45071 = this.mChildHelper.m45071(view);
            if (i == -1) {
                i = this.mChildHelper.m45062();
            }
            if (iM45071 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
            }
            if (iM45071 != i) {
                this.mRecyclerView.mLayout.moveView(iM45071, i);
            }
        } else {
            this.mChildHelper.m45066(view, i, false);
            c22432.f73215 = true;
            AbstractC21020 abstractC21020 = this.mSmoothScroller;
            if (abstractC21020 != null && abstractC21020.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (c22432.f73214) {
            if (C17492.sVerboseLoggingEnabled) {
                C13638.toString(c22432.f73212);
            }
            abstractC12554M40745.itemView.invalidate();
            c22432.f73214 = false;
        }
    }

    public void removeView(View view) {
        this.mChildHelper.m45069(view);
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.m45060(i);
        }
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                this.mChildHelper.m45060(childCount);
            }
        }
    }

    public int getPosition(View view) {
        return ((C22432) view.getLayoutParams()).f73212.getLayoutPosition();
    }

    public int getItemViewType(View view) {
        return C17492.m40745(view).getItemViewType();
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        C17492 c17492 = this.mRecyclerView;
        if (c17492 == null || (viewFindContainingItemView = c17492.findContainingItemView(view)) == null || this.mChildHelper.f63624.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC12554 abstractC12554M40745 = C17492.m40745(childAt);
            if (abstractC12554M40745 != null && abstractC12554M40745.getLayoutPosition() == i && !abstractC12554M40745.shouldIgnore() && (this.mRecyclerView.mState.f52015 || !abstractC12554M40745.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public void detachView(View view) {
        int iM45071 = this.mChildHelper.m45071(view);
        if (iM45071 >= 0) {
            m15191(iM45071, view);
        }
    }

    public void detachViewAt(int i) {
        m15191(i, getChildAt(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15191(int i, View view) {
        this.mChildHelper.m45063(i);
    }

    public void attachView(View view, int i, C22432 c22432) {
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        if (abstractC12554M40745.isRemoved()) {
            C12274 c12274 = this.mRecyclerView.mViewInfoStore.f26225;
            C17867 c17867M41454 = (C17867) c12274.getOrDefault(abstractC12554M40745, null);
            if (c17867M41454 == null) {
                c17867M41454 = C17867.m41454();
                c12274.put(abstractC12554M40745, c17867M41454);
            }
            c17867M41454.f56570 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m21052(abstractC12554M40745);
        }
        this.mChildHelper.m45065(view, i, c22432, abstractC12554M40745.isRemoved());
    }

    public void attachView(View view, int i) {
        attachView(view, i, (C22432) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    public void moveView(int i, int i2) {
        View childAt = getChildAt(i);
        if (childAt == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }
        detachViewAt(i);
        attachView(childAt, i2);
    }

    public void detachAndScrapView(View view, C21726 c21726) {
        m15193(c21726, this.mChildHelper.m45071(view), view);
    }

    public void detachAndScrapViewAt(int i, C21726 c21726) {
        m15193(c21726, i, getChildAt(i));
    }

    public void removeAndRecycleView(View view, C21726 c21726) {
        removeView(view);
        c21726.m48477(view);
    }

    public void removeAndRecycleViewAt(int i, C21726 c21726) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        c21726.m48477(childAt);
    }

    public int getChildCount() {
        C19820 c19820 = this.mChildHelper;
        if (c19820 != null) {
            return c19820.m45062();
        }
        return 0;
    }

    public View getChildAt(int i) {
        C19820 c19820 = this.mChildHelper;
        if (c19820 != null) {
            return c19820.m45072(i);
        }
        return null;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getPaddingLeft() {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            return c17492.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingTop() {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            return c17492.getPaddingTop();
        }
        return 0;
    }

    public int getPaddingRight() {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            return c17492.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingBottom() {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            return c17492.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingStart() {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 == null) {
            return 0;
        }
        int i = C5031.f17539;
        return c17492.getPaddingStart();
    }

    public int getPaddingEnd() {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 == null) {
            return 0;
        }
        int i = C5031.f17539;
        return c17492.getPaddingEnd();
    }

    public boolean isFocused() {
        C17492 c17492 = this.mRecyclerView;
        return c17492 != null && c17492.isFocused();
    }

    public boolean hasFocus() {
        C17492 c17492 = this.mRecyclerView;
        return c17492 != null && c17492.hasFocus();
    }

    public View getFocusedChild() {
        View focusedChild;
        C17492 c17492 = this.mRecyclerView;
        if (c17492 == null || (focusedChild = c17492.getFocusedChild()) == null || this.mChildHelper.f63624.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getItemCount() {
        C17492 c17492 = this.mRecyclerView;
        AbstractC0414 adapter = c17492 != null ? c17492.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public void offsetChildrenHorizontal(int i) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            c17492.offsetChildrenHorizontal(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 != null) {
            c17492.offsetChildrenVertical(i);
        }
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        C17492 c17492 = this.mRecyclerView;
        if (parent != c17492 || c17492.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
        }
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        abstractC12554M40745.addFlags(128);
        this.mRecyclerView.mViewInfoStore.m21049(abstractC12554M40745);
    }

    public void stopIgnoringView(View view) {
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        abstractC12554M40745.stopIgnoring();
        abstractC12554M40745.resetInternal();
        abstractC12554M40745.addFlags(4);
    }

    public void detachAndScrapAttachedViews(C21726 c21726) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                m15193(c21726, childCount, getChildAt(childCount));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15193(C21726 c21726, int i, View view) {
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        if (abstractC12554M40745.shouldIgnore()) {
            if (C17492.sVerboseLoggingEnabled) {
                abstractC12554M40745.toString();
            }
        } else if (abstractC12554M40745.isInvalid() && !abstractC12554M40745.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i);
            c21726.m48479(abstractC12554M40745);
        } else {
            detachViewAt(i);
            c21726.m48487(view);
            this.mRecyclerView.mViewInfoStore.m21052(abstractC12554M40745);
        }
    }

    public void measureChild(View view, int i, int i2) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM15188 = m15188(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) c22432).width, canScrollHorizontally());
        int iM15189 = m15188(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) c22432).height, canScrollVertically());
        if (shouldMeasureChild(view, iM15188, iM15189, c22432)) {
            view.measure(iM15188, iM15189);
        }
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, C22432 c22432) {
        return (this.mMeasurementCacheEnabled && m15196(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c22432).width) && m15196(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c22432).height)) ? false : true;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, C22432 c22432) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m15196(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c22432).width) && m15196(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c22432).height)) ? false : true;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m15196(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM15188 = m15188(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c22432).leftMargin + ((ViewGroup.MarginLayoutParams) c22432).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c22432).width, canScrollHorizontally());
        int iM15189 = m15188(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c22432).topMargin + ((ViewGroup.MarginLayoutParams) c22432).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c22432).height, canScrollVertically());
        if (shouldMeasureChild(view, iM15188, iM15189, c22432)) {
            view.measure(iM15188, iM15189);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15189(int i, int i2, int i3, boolean z) {
        int i4 = i - i2;
        int i5 = 0;
        int iMax = Math.max(0, i4);
        if (z) {
            if (i3 >= 0) {
                i5 = 1073741824;
            } else {
                i3 = 0;
            }
        } else if (i3 >= 0) {
            i5 = 1073741824;
        } else {
            if (i3 == -1) {
                i5 = 1073741824;
            } else if (i3 == -2) {
                i5 = Integer.MIN_VALUE;
            } else {
                i3 = 0;
            }
            i3 = iMax;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, i5);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15188(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i5 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i5 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
                i5 = i2;
            }
        } else if (i4 >= 0) {
            i5 = 1073741824;
        } else {
            if (i4 != -1) {
                if (i4 == -2) {
                    i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
            }
            i4 = iMax;
            i5 = i2;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i5);
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((C22432) view.getLayoutParams()).f73213;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((C22432) view.getLayoutParams()).f73213;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((C22432) view.getLayoutParams()).f73213;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        Rect rect = c22432.f73213;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c22432).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c22432).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c22432).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c22432).bottomMargin);
    }

    public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C22432) view.getLayoutParams()).f73213;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        C17492.m40720(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(c17492.getItemDecorInsetsForChild(view));
        }
    }

    public int getTopDecorationHeight(View view) {
        return ((C22432) view.getLayoutParams()).f73213.top;
    }

    public int getBottomDecorationHeight(View view) {
        return ((C22432) view.getLayoutParams()).f73213.bottom;
    }

    public int getLeftDecorationWidth(View view) {
        return ((C22432) view.getLayoutParams()).f73213.left;
    }

    public int getRightDecorationWidth(View view) {
        return ((C22432) view.getLayoutParams()).f73213.right;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m15195(View view, Rect rect) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - width;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - height);
        if (getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        return new int[]{iMax, iMin2};
    }

    public boolean requestChildRectangleOnScreen(C17492 c17492, View view, Rect rect, boolean z) {
        return requestChildRectangleOnScreen(c17492, view, rect, z, false);
    }

    public boolean requestChildRectangleOnScreen(C17492 c17492, View view, Rect rect, boolean z, boolean z2) {
        int[] iArrM15195 = m15195(view, rect);
        int i = iArrM15195[0];
        int i2 = iArrM15195[1];
        if ((z2 && !m15194(c17492, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            c17492.scrollBy(i, i2);
        } else {
            c17492.smoothScrollBy(i, i2);
        }
        return true;
    }

    public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.m47944(view) && this.mVerticalBoundCheck.m47944(view);
        return z ? z3 : !z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m15194(C17492 c17492, int i, int i2) {
        View focusedChild = c17492.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Rect rect = this.mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(focusedChild, rect);
        return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
    }

    @Deprecated
    public boolean onRequestChildFocus(C17492 c17492, View view, View view2) {
        return isSmoothScrolling() || c17492.isComputingLayout();
    }

    public boolean onRequestChildFocus(C17492 c17492, C16082 c16082, View view, View view2) {
        return onRequestChildFocus(c17492, view, view2);
    }

    public void onItemsUpdated(C17492 c17492, int i, int i2, Object obj) {
        onItemsUpdated(c17492, i, i2);
    }

    public void onMeasure(C21726 c21726, C16082 c16082, int i, int i2) {
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    public int getMinimumWidth() {
        C17492 c17492 = this.mRecyclerView;
        int i = C5031.f17539;
        return c17492.getMinimumWidth();
    }

    public int getMinimumHeight() {
        C17492 c17492 = this.mRecyclerView;
        int i = C5031.f17539;
        return c17492.getMinimumHeight();
    }

    public void stopSmoothScroller() {
        AbstractC21020 abstractC21020 = this.mSmoothScroller;
        if (abstractC21020 != null) {
            abstractC21020.stop();
        }
    }

    public void onSmoothScrollerStopped(AbstractC21020 abstractC21020) {
        if (this.mSmoothScroller == abstractC21020) {
            this.mSmoothScroller = null;
        }
    }

    public void removeAndRecycleAllViews(C21726 c21726) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            if (!C17492.m40745(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c21726);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(C22006 c22006) {
        C17492 c17492 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(c17492.mRecycler, c17492.mState, c22006);
    }

    public void onInitializeAccessibilityNodeInfo(C21726 c21726, C16082 c16082, C22006 c22006) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            c22006.m48838(8192);
            c22006.m48878(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            c22006.m48838(4096);
            c22006.m48878(true);
        }
        c22006.m48849(C11423.m28533(getRowCountForAccessibility(c21726, c16082), getColumnCountForAccessibility(c21726, c16082), getSelectionModeForAccessibility(c21726, c16082), isLayoutHierarchical(c21726, c16082)));
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C17492 c17492 = this.mRecyclerView;
        onInitializeAccessibilityEvent(c17492.mRecycler, c17492.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(C21726 c21726, C16082 c16082, AccessibilityEvent accessibilityEvent) {
        C17492 c17492 = this.mRecyclerView;
        if (c17492 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!c17492.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC0414 abstractC0414 = this.mRecyclerView.mAdapter;
        if (abstractC0414 != null) {
            accessibilityEvent.setItemCount(abstractC0414.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C22006 c22006) {
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        if (abstractC12554M40745 == null || abstractC12554M40745.isRemoved()) {
            return;
        }
        C19820 c19820 = this.mChildHelper;
        if (c19820.f63624.contains(abstractC12554M40745.itemView)) {
            return;
        }
        C17492 c17492 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(c17492.mRecycler, c17492.mState, view, c22006);
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        C17492 c17492 = this.mRecyclerView;
        return performAccessibilityAction(c17492.mRecycler, c17492.mState, i, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[PHI: r10
      0x0095: PHI (r10v9 int) = (r10v5 int), (r10v13 int) binds: [B:27:0x0084, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean performAccessibilityAction(C21726 c21726, C16082 c16082, int i, Bundle bundle) {
        int paddingTop;
        int i2;
        int paddingLeft;
        int i3;
        int i4;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                i2 = paddingTop;
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i4 = paddingLeft;
                i3 = i2;
            } else {
                i3 = paddingTop;
                i4 = 0;
            }
        } else if (i != 8192) {
            i4 = 0;
            i3 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                i2 = paddingTop;
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i4 = paddingLeft;
                i3 = i2;
            } else {
                i3 = paddingTop;
                i4 = 0;
            }
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i4, i3, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        C17492 c17492 = this.mRecyclerView;
        return performAccessibilityActionForItem(c17492.mRecycler, c17492.mState, view, i, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2675 m15190(Context context, AttributeSet attributeSet, int i, int i2) {
        C2675 c2675 = new C2675();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19114.f61753, i, i2);
        c2675.f10343 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c2675.f10344 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c2675.f10345 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c2675.f10342 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c2675;
    }

    public void setExactMeasureSpecsFrom(C17492 c17492) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(c17492.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c17492.getHeight(), 1073741824));
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }
}
