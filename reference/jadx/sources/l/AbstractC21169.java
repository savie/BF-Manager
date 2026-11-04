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
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21169 {
    public boolean mAutoMeasure;
    public C15507 mChildHelper;
    public int mHeight;
    public int mHeightMode;
    public C2851 mHorizontalBoundCheck;
    public final InterfaceC9562 mHorizontalBoundCheckCallback;
    public boolean mIsAttachedToWindow;
    public boolean mItemPrefetchEnabled;
    public boolean mMeasurementCacheEnabled;
    public int mPrefetchMaxCountObserved;
    public boolean mPrefetchMaxObservedInInitialPrefetch;
    public C25227 mRecyclerView;
    public boolean mRequestedSimpleAnimations;
    public AbstractC20005 mSmoothScroller;
    public C2851 mVerticalBoundCheck;
    public final InterfaceC9562 mVerticalBoundCheckCallback;
    public int mWidth;
    public int mWidthMode;

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(C18185 c18185) {
        return c18185 != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C15529 c15529, InterfaceC4015 interfaceC4015) {
    }

    public void collectInitialPrefetchPositions(int i, InterfaceC4015 interfaceC4015) {
    }

    public int computeHorizontalScrollExtent(C15529 c15529) {
        return 0;
    }

    public int computeHorizontalScrollOffset(C15529 c15529) {
        return 0;
    }

    public int computeHorizontalScrollRange(C15529 c15529) {
        return 0;
    }

    public int computeVerticalScrollExtent(C15529 c15529) {
        return 0;
    }

    public int computeVerticalScrollOffset(C15529 c15529) {
        return 0;
    }

    public int computeVerticalScrollRange(C15529 c15529) {
        return 0;
    }

    public abstract C18185 generateDefaultLayoutParams();

    public int getBaseline() {
        return -1;
    }

    public int getSelectionModeForAccessibility(C2523 c2523, C15529 c15529) {
        return 0;
    }

    public boolean isLayoutHierarchical(C2523 c2523, C15529 c15529) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public void onAdapterChanged(AbstractC12964 abstractC12964, AbstractC12964 abstractC12965) {
    }

    public boolean onAddFocusables(C25227 c25227, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow(C25227 c25227) {
    }

    @Deprecated
    public void onDetachedFromWindow(C25227 c25227) {
    }

    public View onFocusSearchFailed(View view, int i, C2523 c2523, C15529 c15529) {
        return null;
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsAdded(C25227 c25227, int i, int i2) {
    }

    public void onItemsChanged(C25227 c25227) {
    }

    public void onItemsMoved(C25227 c25227, int i, int i2, int i3) {
    }

    public void onItemsRemoved(C25227 c25227, int i, int i2) {
    }

    public void onItemsUpdated(C25227 c25227, int i, int i2) {
    }

    public void onLayoutChildren(C2523 c2523, C15529 c15529) {
    }

    public void onLayoutCompleted(C15529 c15529) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public boolean performAccessibilityActionForItem(C2523 c2523, C15529 c15529, View view, int i, Bundle bundle) {
        return false;
    }

    public int scrollHorizontallyBy(int i, C2523 c2523, C15529 c15529) {
        return 0;
    }

    public int scrollVerticallyBy(int i, C2523 c2523, C15529 c15529) {
        return 0;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public void smoothScrollToPosition(C25227 c25227, C15529 c15529, int i) {
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void removeAndRecycleScrapInt(C2523 c2523) {
        ArrayList arrayList = c2523.f8064;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC11800) arrayList.get(i)).itemView;
            AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
            if (!abstractC11800M56274.shouldIgnore()) {
                abstractC11800M56274.setIsRecyclable(false);
                if (abstractC11800M56274.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                AbstractC3269 abstractC3269 = this.mRecyclerView.mItemAnimator;
                if (abstractC3269 != null) {
                    abstractC3269.mo10767(abstractC11800M56274);
                }
                abstractC11800M56274.setIsRecyclable(true);
                AbstractC11800 abstractC11800M56275 = C25227.m56274(view);
                abstractC11800M56275.mScrapContainer = null;
                abstractC11800M56275.mInChangeScrap = false;
                abstractC11800M56275.clearReturnedFromScrapFlag();
                c2523.m8418(abstractC11800M56275);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c2523.f8066;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public AbstractC21169() {
        C6253 c6253 = new C6253(this);
        this.mHorizontalBoundCheckCallback = c6253;
        C24153 c24153 = new C24153(this);
        this.mVerticalBoundCheckCallback = c24153;
        this.mHorizontalBoundCheck = new C2851(c6253);
        this.mVerticalBoundCheck = new C2851(c24153);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public void setRecyclerView(C25227 c25227) {
        if (c25227 == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = c25227;
            this.mChildHelper = c25227.mChildHelper;
            this.mWidth = c25227.getWidth();
            this.mHeight = c25227.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !C25227.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 != 0 || C25227.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
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
        setMeasuredDimension(m48280(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), m48280(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void requestLayout() {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            c25227.requestLayout();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            c25227.assertInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48280(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public void assertNotInLayoutOrScroll(String str) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            c25227.assertNotInLayoutOrScroll(str);
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
            C25227 c25227 = this.mRecyclerView;
            if (c25227 != null) {
                c25227.mRecycler.m8423();
            }
        }
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public void dispatchAttachedToWindow(C25227 c25227) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(c25227);
    }

    public void dispatchDetachedFromWindow(C25227 c25227, C2523 c2523) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(c25227, c2523);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public void postOnAnimation(Runnable runnable) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            int i = C22666.f73603;
            c25227.postOnAnimation(runnable);
        }
    }

    public boolean removeCallbacks(Runnable runnable) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            return c25227.removeCallbacks(runnable);
        }
        return false;
    }

    public void onDetachedFromWindow(C25227 c25227, C2523 c2523) {
        onDetachedFromWindow(c25227);
    }

    public boolean getClipToPadding() {
        C25227 c25227 = this.mRecyclerView;
        return c25227 != null && c25227.mClipToPadding;
    }

    public C18185 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C18185) {
            return new C18185((C18185) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C18185((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C18185(layoutParams);
    }

    public C18185 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C18185(context, attributeSet);
    }

    public void scrollToPosition(int i) {
        int i2 = C25227.HORIZONTAL;
    }

    public void startSmoothScroll(AbstractC20005 abstractC20005) {
        AbstractC20005 abstractC20006 = this.mSmoothScroller;
        if (abstractC20006 != null && abstractC20005 != abstractC20006 && abstractC20006.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = abstractC20005;
        abstractC20005.start(this.mRecyclerView, this);
    }

    public boolean isSmoothScrolling() {
        AbstractC20005 abstractC20005 = this.mSmoothScroller;
        return abstractC20005 != null && abstractC20005.isRunning();
    }

    public int getLayoutDirection() {
        return this.mRecyclerView.getLayoutDirection();
    }

    public void endAnimation(View view) {
        AbstractC3269 abstractC3269 = this.mRecyclerView.mItemAnimator;
        if (abstractC3269 != null) {
            abstractC3269.mo10767(C25227.m56274(view));
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addDisappearingView(View view, int i) {
        m48285(view, i, true);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void addView(View view, int i) {
        m48285(view, i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48285(View view, int i, boolean z) {
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        if (z || abstractC11800M56274.isRemoved()) {
            C9086 c9086 = this.mRecyclerView.mViewInfoStore.f44482;
            C8817 c8817M23658 = (C8817) c9086.get(abstractC11800M56274);
            if (c8817M23658 == null) {
                c8817M23658 = C8817.m23658();
                c9086.put(abstractC11800M56274, c8817M23658);
            }
            c8817M23658.f28820 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m34203(abstractC11800M56274);
        }
        C18185 c18185 = (C18185) view.getLayoutParams();
        if (abstractC11800M56274.wasReturnedFromScrap() || abstractC11800M56274.isScrap()) {
            if (abstractC11800M56274.isScrap()) {
                abstractC11800M56274.unScrap();
            } else {
                abstractC11800M56274.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.m37153(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iM37159 = this.mChildHelper.m37159(view);
            if (i == -1) {
                i = this.mChildHelper.m37150();
            }
            if (iM37159 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
            }
            if (iM37159 != i) {
                this.mRecyclerView.mLayout.moveView(iM37159, i);
            }
        } else {
            this.mChildHelper.m37154(view, i, false);
            c18185.f59427 = true;
            AbstractC20005 abstractC20005 = this.mSmoothScroller;
            if (abstractC20005 != null && abstractC20005.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (c18185.f59426) {
            if (C25227.sVerboseLoggingEnabled) {
                C17359.toString(c18185.f59428);
            }
            abstractC11800M56274.itemView.invalidate();
            c18185.f59426 = false;
        }
    }

    public void removeView(View view) {
        this.mChildHelper.m37156(view);
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.m37161(i);
        }
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                this.mChildHelper.m37161(childCount);
            }
        }
    }

    public int getPosition(View view) {
        return ((C18185) view.getLayoutParams()).f59428.getLayoutPosition();
    }

    public int getItemViewType(View view) {
        return C25227.m56274(view).getItemViewType();
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null || (viewFindContainingItemView = c25227.findContainingItemView(view)) == null || this.mChildHelper.f50473.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC11800 abstractC11800M56274 = C25227.m56274(childAt);
            if (abstractC11800M56274 != null && abstractC11800M56274.getLayoutPosition() == i && !abstractC11800M56274.shouldIgnore() && (this.mRecyclerView.mState.f50525 || !abstractC11800M56274.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public void detachView(View view) {
        int iM37159 = this.mChildHelper.m37159(view);
        if (iM37159 >= 0) {
            m48284(iM37159, view);
        }
    }

    public void detachViewAt(int i) {
        m48284(i, getChildAt(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48284(int i, View view) {
        this.mChildHelper.m37151(i);
    }

    public void attachView(View view, int i, C18185 c18185) {
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        if (abstractC11800M56274.isRemoved()) {
            C9086 c9086 = this.mRecyclerView.mViewInfoStore.f44482;
            C8817 c8817M23658 = (C8817) c9086.get(abstractC11800M56274);
            if (c8817M23658 == null) {
                c8817M23658 = C8817.m23658();
                c9086.put(abstractC11800M56274, c8817M23658);
            }
            c8817M23658.f28820 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m34203(abstractC11800M56274);
        }
        this.mChildHelper.m37153(view, i, c18185, abstractC11800M56274.isRemoved());
    }

    public void attachView(View view, int i) {
        attachView(view, i, (C18185) view.getLayoutParams());
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

    public void detachAndScrapView(View view, C2523 c2523) {
        m48286(c2523, this.mChildHelper.m37159(view), view);
    }

    public void detachAndScrapViewAt(int i, C2523 c2523) {
        m48286(c2523, i, getChildAt(i));
    }

    public void removeAndRecycleView(View view, C2523 c2523) {
        removeView(view);
        c2523.m8416(view);
    }

    public void removeAndRecycleViewAt(int i, C2523 c2523) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        c2523.m8416(childAt);
    }

    public int getChildCount() {
        C15507 c15507 = this.mChildHelper;
        if (c15507 != null) {
            return c15507.m37150();
        }
        return 0;
    }

    public View getChildAt(int i) {
        C15507 c15507 = this.mChildHelper;
        if (c15507 != null) {
            return c15507.m37160(i);
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
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            return c25227.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingTop() {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            return c25227.getPaddingTop();
        }
        return 0;
    }

    public int getPaddingRight() {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            return c25227.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingBottom() {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            return c25227.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingStart() {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null) {
            return 0;
        }
        int i = C22666.f73603;
        return c25227.getPaddingStart();
    }

    public int getPaddingEnd() {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null) {
            return 0;
        }
        int i = C22666.f73603;
        return c25227.getPaddingEnd();
    }

    public boolean isFocused() {
        C25227 c25227 = this.mRecyclerView;
        return c25227 != null && c25227.isFocused();
    }

    public boolean hasFocus() {
        C25227 c25227 = this.mRecyclerView;
        return c25227 != null && c25227.hasFocus();
    }

    public View getFocusedChild() {
        View focusedChild;
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null || (focusedChild = c25227.getFocusedChild()) == null || this.mChildHelper.f50473.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getItemCount() {
        C25227 c25227 = this.mRecyclerView;
        AbstractC12964 adapter = c25227 != null ? c25227.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public void offsetChildrenHorizontal(int i) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            c25227.offsetChildrenHorizontal(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 != null) {
            c25227.offsetChildrenVertical(i);
        }
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        C25227 c25227 = this.mRecyclerView;
        if (parent != c25227 || c25227.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
        }
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        abstractC11800M56274.addFlags(128);
        this.mRecyclerView.mViewInfoStore.m34205(abstractC11800M56274);
    }

    public void stopIgnoringView(View view) {
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        abstractC11800M56274.stopIgnoring();
        abstractC11800M56274.resetInternal();
        abstractC11800M56274.addFlags(4);
    }

    public void detachAndScrapAttachedViews(C2523 c2523) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                m48286(c2523, childCount, getChildAt(childCount));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48286(C2523 c2523, int i, View view) {
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        if (abstractC11800M56274.shouldIgnore()) {
            if (C25227.sVerboseLoggingEnabled) {
                abstractC11800M56274.toString();
            }
        } else if (abstractC11800M56274.isInvalid() && !abstractC11800M56274.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i);
            c2523.m8418(abstractC11800M56274);
        } else {
            detachViewAt(i);
            c2523.m8427(view);
            this.mRecyclerView.mViewInfoStore.m34203(abstractC11800M56274);
        }
    }

    public void measureChild(View view, int i, int i2) {
        C18185 c18185 = (C18185) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM48281 = m48281(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) c18185).width, canScrollHorizontally());
        int iM48282 = m48281(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) c18185).height, canScrollVertically());
        if (shouldMeasureChild(view, iM48281, iM48282, c18185)) {
            view.measure(iM48281, iM48282);
        }
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, C18185 c18185) {
        return (this.mMeasurementCacheEnabled && m48289(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c18185).width) && m48289(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c18185).height)) ? false : true;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, C18185 c18185) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m48289(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c18185).width) && m48289(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c18185).height)) ? false : true;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m48289(int i, int i2, int i3) {
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
        C18185 c18185 = (C18185) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM48281 = m48281(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c18185).leftMargin + ((ViewGroup.MarginLayoutParams) c18185).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c18185).width, canScrollHorizontally());
        int iM48282 = m48281(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c18185).topMargin + ((ViewGroup.MarginLayoutParams) c18185).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c18185).height, canScrollVertically());
        if (shouldMeasureChild(view, iM48281, iM48282, c18185)) {
            view.measure(iM48281, iM48282);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48282(int i, int i2, int i3, boolean z) {
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
    public static int m48281(int i, int i2, int i3, int i4, boolean z) {
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
        Rect rect = ((C18185) view.getLayoutParams()).f59425;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((C18185) view.getLayoutParams()).f59425;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((C18185) view.getLayoutParams()).f59425;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        C18185 c18185 = (C18185) view.getLayoutParams();
        Rect rect = c18185.f59425;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c18185).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c18185).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c18185).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c18185).bottomMargin);
    }

    public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C18185) view.getLayoutParams()).f59425;
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
        C25227.m56243(view, rect);
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
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(c25227.getItemDecorInsetsForChild(view));
        }
    }

    public int getTopDecorationHeight(View view) {
        return ((C18185) view.getLayoutParams()).f59425.top;
    }

    public int getBottomDecorationHeight(View view) {
        return ((C18185) view.getLayoutParams()).f59425.bottom;
    }

    public int getLeftDecorationWidth(View view) {
        return ((C18185) view.getLayoutParams()).f59425.left;
    }

    public int getRightDecorationWidth(View view) {
        return ((C18185) view.getLayoutParams()).f59425.right;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m48288(View view, Rect rect) {
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

    public boolean requestChildRectangleOnScreen(C25227 c25227, View view, Rect rect, boolean z) {
        return requestChildRectangleOnScreen(c25227, view, rect, z, false);
    }

    public boolean requestChildRectangleOnScreen(C25227 c25227, View view, Rect rect, boolean z, boolean z2) {
        int[] iArrM48288 = m48288(view, rect);
        int i = iArrM48288[0];
        int i2 = iArrM48288[1];
        if ((z2 && !m48287(c25227, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            c25227.scrollBy(i, i2);
        } else {
            c25227.smoothScrollBy(i, i2);
        }
        return true;
    }

    public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.m9410(view) && this.mVerticalBoundCheck.m9410(view);
        return z ? z3 : !z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48287(C25227 c25227, int i, int i2) {
        View focusedChild = c25227.getFocusedChild();
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
    public boolean onRequestChildFocus(C25227 c25227, View view, View view2) {
        return isSmoothScrolling() || c25227.isComputingLayout();
    }

    public boolean onRequestChildFocus(C25227 c25227, C15529 c15529, View view, View view2) {
        return onRequestChildFocus(c25227, view, view2);
    }

    public void onItemsUpdated(C25227 c25227, int i, int i2, Object obj) {
        onItemsUpdated(c25227, i, i2);
    }

    public void onMeasure(C2523 c2523, C15529 c15529, int i, int i2) {
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    public int getMinimumWidth() {
        C25227 c25227 = this.mRecyclerView;
        int i = C22666.f73603;
        return c25227.getMinimumWidth();
    }

    public int getMinimumHeight() {
        C25227 c25227 = this.mRecyclerView;
        int i = C22666.f73603;
        return c25227.getMinimumHeight();
    }

    public void stopSmoothScroller() {
        AbstractC20005 abstractC20005 = this.mSmoothScroller;
        if (abstractC20005 != null) {
            abstractC20005.stop();
        }
    }

    public void onSmoothScrollerStopped(AbstractC20005 abstractC20005) {
        if (this.mSmoothScroller == abstractC20005) {
            this.mSmoothScroller = null;
        }
    }

    public void removeAndRecycleAllViews(C2523 c2523) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            if (!C25227.m56274(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c2523);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(C19835 c19835) {
        C25227 c25227 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(c25227.mRecycler, c25227.mState, c19835);
    }

    public void onInitializeAccessibilityNodeInfo(C2523 c2523, C15529 c15529, C19835 c19835) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            c19835.m45633(8192);
            c19835.m45670(true);
            c19835.m45631();
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            c19835.m45633(4096);
            c19835.m45670(true);
            c19835.m45631();
        }
        c19835.m45643(C22073.m49904(getRowCountForAccessibility(c2523, c15529), getColumnCountForAccessibility(c2523, c15529), getSelectionModeForAccessibility(c2523, c15529), isLayoutHierarchical(c2523, c15529)));
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C25227 c25227 = this.mRecyclerView;
        onInitializeAccessibilityEvent(c25227.mRecycler, c25227.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(C2523 c2523, C15529 c15529, AccessibilityEvent accessibilityEvent) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!c25227.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC12964 abstractC12964 = this.mRecyclerView.mAdapter;
        if (abstractC12964 != null) {
            accessibilityEvent.setItemCount(abstractC12964.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C19835 c19835) {
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        if (abstractC11800M56274 == null || abstractC11800M56274.isRemoved()) {
            return;
        }
        C15507 c15507 = this.mChildHelper;
        if (c15507.f50473.contains(abstractC11800M56274.itemView)) {
            return;
        }
        C25227 c25227 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(c25227.mRecycler, c25227.mState, view, c19835);
    }

    public void onInitializeAccessibilityNodeInfoForItem(C2523 c2523, C15529 c15529, View view, C19835 c19835) {
        c19835.m45642(C10884.m27635(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public int getRowCountForAccessibility(C2523 c2523, C15529 c15529) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null || c25227.mAdapter == null || !canScrollVertically()) {
            return 1;
        }
        return this.mRecyclerView.mAdapter.getItemCount();
    }

    public int getColumnCountForAccessibility(C2523 c2523, C15529 c15529) {
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null || c25227.mAdapter == null || !canScrollHorizontally()) {
            return 1;
        }
        return this.mRecyclerView.mAdapter.getItemCount();
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        C25227 c25227 = this.mRecyclerView;
        return performAccessibilityAction(c25227.mRecycler, c25227.mState, i, bundle);
    }

    public boolean performAccessibilityAction(C2523 c2523, C15529 c15529, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
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
        if (i != 4096) {
            if (i != 8192) {
                paddingTop = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                }
            }
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            paddingLeft = this.mRecyclerView.canScrollHorizontally(1) ? (width - getPaddingLeft()) - getPaddingRight() : 0;
        }
        if (paddingTop == 0 && paddingLeft == 0) {
            return false;
        }
        if (bundle != null) {
            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f < 0.0f) {
                if (!C25227.sDebugAssertionsEnabled) {
                    return false;
                }
                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + MotionUtils.EASING_TYPE_FORMAT_END);
            }
        } else {
            f = 1.0f;
        }
        if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
            C25227 c25227 = this.mRecyclerView;
            AbstractC12964 abstractC12964 = c25227.mAdapter;
            if (abstractC12964 == null) {
                return false;
            }
            if (i == 4096) {
                c25227.smoothScrollToPosition(abstractC12964.getItemCount() - 1);
            } else if (i == 8192) {
                c25227.smoothScrollToPosition(0);
            }
            return true;
        }
        if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
            paddingLeft = (int) (paddingLeft * f);
            paddingTop = (int) (paddingTop * f);
        }
        this.mRecyclerView.smoothScrollBy(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        C25227 c25227 = this.mRecyclerView;
        return performAccessibilityActionForItem(c25227.mRecycler, c25227.mState, view, i, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14455 m48283(Context context, AttributeSet attributeSet, int i, int i2) {
        C14455 c14455 = new C14455();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14103.f44613, i, i2);
        c14455.f45483 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c14455.f45484 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c14455.f45485 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c14455.f45486 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c14455;
    }

    public void setExactMeasureSpecsFrom(C25227 c25227) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(c25227.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c25227.getHeight(), 1073741824));
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
