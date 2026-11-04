package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.o;
import java.util.List;

/* JADX INFO: renamed from: l.֡֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes3.dex */
public class C0067 extends AbstractC21169 implements InterfaceC20204, InterfaceC22989 {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final float MAX_SCROLL_FACTOR = 0.33333334f;
    public static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final C23934 mAnchorInfo;
    public int mInitialPrefetchItemCount;
    public boolean mLastStackFromEnd;
    public final C3796 mLayoutChunkResult;
    public C14236 mLayoutState;
    public int mOrientation;
    public AbstractC9016 mOrientationHelper;
    public C17966 mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public boolean mRecycleChildrenOnDetach;
    public int[] mReusableIntPair;
    public boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    public boolean mSmoothScrollbarEnabled;
    public boolean mStackFromEnd;

    @Override // l.AbstractC21169
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(C2523 c2523, C15529 c15529, C23934 c23934, int i) {
    }

    public C0067(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    public C0067(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C23934();
        this.mLayoutChunkResult = new C3796();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public C0067(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C23934();
        this.mLayoutChunkResult = new C3796();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C14455 c14455M48283 = AbstractC21169.m48283(context, attributeSet, i, i2);
        setOrientation(c14455M48283.f45483);
        setReverseLayout(c14455M48283.f45485);
        setStackFromEnd(c14455M48283.f45486);
    }

    @Override // l.AbstractC21169
    public C18185 generateDefaultLayoutParams() {
        return new C18185(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    @Override // l.AbstractC21169
    public void onDetachedFromWindow(C25227 c25227, C2523 c2523) {
        super.onDetachedFromWindow(c25227, c2523);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c2523);
            c2523.f8064.clear();
            c2523.m8424();
        }
    }

    @Override // l.AbstractC21169
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // l.AbstractC21169
    public void onInitializeAccessibilityNodeInfo(C2523 c2523, C15529 c15529, C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(c2523, c15529, c19835);
        AbstractC12964 abstractC12964 = this.mRecyclerView.mAdapter;
        if (abstractC12964 == null || abstractC12964.getItemCount() <= 0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        c19835.m45641(C8451.f27636);
    }

    @Override // l.AbstractC21169
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                C25227 c25227 = this.mRecyclerView;
                iMin = Math.min(i2, getRowCountForAccessibility(c25227.mRecycler, c25227.mState) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                C25227 c25228 = this.mRecyclerView;
                iMin = Math.min(i3, getColumnCountForAccessibility(c25228.mRecycler, c25228.mState) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC21169
    public Parcelable onSaveInstanceState() {
        C17966 c17966 = this.mPendingSavedState;
        if (c17966 == null) {
            C17966 c17967 = new C17966();
            if (getChildCount() > 0) {
                ensureLayoutState();
                boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
                c17967.f58884 = z;
                if (z) {
                    View childClosestToEnd = getChildClosestToEnd();
                    c17967.f58886 = this.mOrientationHelper.mo3277() - this.mOrientationHelper.mo3268(childClosestToEnd);
                    c17967.f58885 = getPosition(childClosestToEnd);
                    return c17967;
                }
                View childClosestToStart = getChildClosestToStart();
                c17967.f58885 = getPosition(childClosestToStart);
                c17967.f58886 = this.mOrientationHelper.mo3280(childClosestToStart) - this.mOrientationHelper.mo3273();
                return c17967;
            }
            c17967.f58885 = -1;
            return c17967;
        }
        C17966 c17968 = new C17966();
        c17968.f58885 = c17966.f58885;
        c17968.f58886 = c17966.f58886;
        c17968.f58884 = c17966.f58884;
        return c17968;
    }

    @Override // l.AbstractC21169
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C17966) {
            C17966 c17966 = (C17966) parcelable;
            this.mPendingSavedState = c17966;
            if (this.mPendingScrollPosition != -1) {
                c17966.f58885 = -1;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC21169
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // l.AbstractC21169
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // l.AbstractC21169
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C13645.m33382(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC9016 abstractC9016M24071 = AbstractC9016.m24071(this, i);
            this.mOrientationHelper = abstractC9016M24071;
            this.mAnchorInfo.f77488 = abstractC9016M24071;
            this.mOrientation = i;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m1115() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    @Override // l.AbstractC21169
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public void calculateExtraLayoutSpace(C15529 c15529, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c15529);
        if (this.mLayoutState.f44981 == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // l.AbstractC21169
    public void smoothScrollToPosition(C25227 c25227, C15529 c15529, int i) {
        C7525 c7525 = new C7525(c25227.getContext());
        c7525.setTargetPosition(i);
        startSmoothScroll(c7525);
    }

    @Override // l.InterfaceC22989
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        if (this.mOrientation == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // l.AbstractC21169
    public void onLayoutChildren(C2523 c2523, C15529 c15529) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM1101;
        int i5;
        View viewFindViewByPosition;
        int iMo3280;
        int iMo3277;
        int i6;
        int i7 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && c15529.m37184() == 0) {
            removeAndRecycleAllViews(c2523);
            return;
        }
        C17966 c17966 = this.mPendingSavedState;
        if (c17966 != null && (i6 = c17966.f58885) >= 0) {
            this.mPendingScrollPosition = i6;
        }
        ensureLayoutState();
        this.mLayoutState.f44980 = false;
        m1115();
        View focusedChild = getFocusedChild();
        C23934 c23934 = this.mAnchorInfo;
        if (!c23934.f77489 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c23934.m53458();
            C23934 c23935 = this.mAnchorInfo;
            c23935.f77490 = this.mShouldReverseLayout ^ this.mStackFromEnd;
            m1122(c2523, c15529, c23935);
            this.mAnchorInfo.f77489 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo3280(focusedChild) >= this.mOrientationHelper.mo3277() || this.mOrientationHelper.mo3268(focusedChild) <= this.mOrientationHelper.mo3273())) {
            this.mAnchorInfo.m53459(getPosition(focusedChild), focusedChild);
        }
        C14236 c14236 = this.mLayoutState;
        c14236.f44981 = c14236.f44982 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c15529, iArr);
        int iMo3273 = this.mOrientationHelper.mo3273() + Math.max(0, this.mReusableIntPair[0]);
        int iMo3270 = this.mOrientationHelper.mo3270() + Math.max(0, this.mReusableIntPair[1]);
        if (c15529.f50525 && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                iMo3277 = this.mOrientationHelper.mo3277() - this.mOrientationHelper.mo3268(viewFindViewByPosition);
                iMo3280 = this.mPendingScrollPositionOffset;
            } else {
                iMo3280 = this.mOrientationHelper.mo3280(viewFindViewByPosition) - this.mOrientationHelper.mo3273();
                iMo3277 = this.mPendingScrollPositionOffset;
            }
            int i8 = iMo3277 - iMo3280;
            if (i8 > 0) {
                iMo3273 += i8;
            } else {
                iMo3270 -= i8;
            }
        }
        C23934 c23936 = this.mAnchorInfo;
        if (!c23936.f77490 ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(c2523, c15529, c23936, i7);
        detachAndScrapAttachedViews(c2523);
        this.mLayoutState.f44986 = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f44978 = 0;
        C23934 c23937 = this.mAnchorInfo;
        if (c23937.f77490) {
            m1123(c23937);
            C14236 c14237 = this.mLayoutState;
            c14237.f44979 = iMo3273;
            fill(c2523, c14237, c15529, false);
            C14236 c14238 = this.mLayoutState;
            i2 = c14238.f44976;
            int i9 = c14238.f44985;
            int i10 = c14238.f44977;
            if (i10 > 0) {
                iMo3270 += i10;
            }
            m1109(this.mAnchorInfo);
            C14236 c14239 = this.mLayoutState;
            c14239.f44979 = iMo3270;
            c14239.f44985 += c14239.f44984;
            fill(c2523, c14239, c15529, false);
            C14236 c142310 = this.mLayoutState;
            i = c142310.f44976;
            int i11 = c142310.f44977;
            if (i11 > 0) {
                m1120(i9, i2);
                C14236 c142311 = this.mLayoutState;
                c142311.f44979 = i11;
                fill(c2523, c142311, c15529, false);
                i2 = this.mLayoutState.f44976;
            }
        } else {
            m1109(c23937);
            C14236 c142312 = this.mLayoutState;
            c142312.f44979 = iMo3270;
            fill(c2523, c142312, c15529, false);
            C14236 c142313 = this.mLayoutState;
            int i12 = c142313.f44976;
            int i13 = c142313.f44985;
            int i14 = c142313.f44977;
            if (i14 > 0) {
                iMo3273 += i14;
            }
            m1123(this.mAnchorInfo);
            C14236 c142314 = this.mLayoutState;
            c142314.f44979 = iMo3273;
            c142314.f44985 += c142314.f44984;
            fill(c2523, c142314, c15529, false);
            C14236 c142315 = this.mLayoutState;
            int i15 = c142315.f44976;
            int i16 = c142315.f44977;
            if (i16 > 0) {
                m1104(i13, i12);
                C14236 c142316 = this.mLayoutState;
                c142316.f44979 = i16;
                fill(c2523, c142316, c15529, false);
                i = this.mLayoutState.f44976;
            } else {
                i = i12;
            }
            i2 = i15;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM1102 = m1101(i, c2523, c15529, true);
                i3 = i2 + iM1102;
                i4 = i + iM1102;
                iM1101 = m1117(i3, c2523, c15529, false);
            } else {
                int iM1117 = m1117(i2, c2523, c15529, true);
                i3 = i2 + iM1117;
                i4 = i + iM1117;
                iM1101 = m1101(i4, c2523, c15529, false);
            }
            i2 = i3 + iM1101;
            i = i4 + iM1101;
        }
        m1108(c2523, c15529, i2, i);
        if (!c15529.f50525) {
            this.mOrientationHelper.m24072();
        } else {
            this.mAnchorInfo.m53458();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // l.AbstractC21169
    public void onLayoutCompleted(C15529 c15529) {
        super.onLayoutCompleted(c15529);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m53458();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m1122(C2523 c2523, C15529 c15529, C23934 c23934) {
        if (m1111(c15529, c23934) || m1110(c2523, c15529, c23934)) {
            return;
        }
        c23934.m53456();
        c23934.f77491 = this.mStackFromEnd ? c15529.m37184() - 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1110(C2523 c2523, C15529 c15529, C23934 c23934) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                c23934.getClass();
                C18185 c18185 = (C18185) focusedChild.getLayoutParams();
                if (!c18185.f59428.isRemoved() && c18185.f59428.getLayoutPosition() >= 0 && c18185.f59428.getLayoutPosition() < c15529.m37184()) {
                    c23934.m53459(getPosition(focusedChild), focusedChild);
                    return true;
                }
            }
            boolean z2 = this.mLastStackFromEnd;
            boolean z3 = this.mStackFromEnd;
            if (z2 == z3 && (viewFindReferenceChild = findReferenceChild(c2523, c15529, c23934.f77490, z3)) != null) {
                c23934.m53457(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                if (!c15529.f50525 && supportsPredictiveItemAnimations()) {
                    int iMo3280 = this.mOrientationHelper.mo3280(viewFindReferenceChild);
                    int iMo3268 = this.mOrientationHelper.mo3268(viewFindReferenceChild);
                    int iMo3273 = this.mOrientationHelper.mo3273();
                    int iMo3277 = this.mOrientationHelper.mo3277();
                    boolean z4 = iMo3268 <= iMo3273 && iMo3280 < iMo3273;
                    if (iMo3280 >= iMo3277 && iMo3268 > iMo3277) {
                        z = true;
                    }
                    if (z4 || z) {
                        if (c23934.f77490) {
                            iMo3273 = iMo3277;
                        }
                        c23934.f77487 = iMo3273;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m1101(int i, C2523 c2523, C15529 c15529, boolean z) {
        int iMo3277;
        int iMo3278 = this.mOrientationHelper.mo3277() - i;
        if (iMo3278 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo3278, c2523, c15529);
        int i3 = i + i2;
        if (!z || (iMo3277 = this.mOrientationHelper.mo3277() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo3269(iMo3277);
        return iMo3277 + i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m1117(int i, C2523 c2523, C15529 c15529, boolean z) {
        int iMo3273;
        int iMo3274 = i - this.mOrientationHelper.mo3273();
        if (iMo3274 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo3274, c2523, c15529);
        int i3 = i + i2;
        if (!z || (iMo3273 = i3 - this.mOrientationHelper.mo3273()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo3269(-iMo3273);
        return i2 - iMo3273;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1109(C23934 c23934) {
        m1104(c23934.f77491, c23934.f77487);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1104(int i, int i2) {
        this.mLayoutState.f44977 = this.mOrientationHelper.mo3277() - i2;
        C14236 c14236 = this.mLayoutState;
        c14236.f44984 = this.mShouldReverseLayout ? -1 : 1;
        c14236.f44985 = i;
        c14236.f44981 = 1;
        c14236.f44976 = i2;
        c14236.f44983 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m1123(C23934 c23934) {
        m1120(c23934.f77491, c23934.f77487);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m1120(int i, int i2) {
        this.mLayoutState.f44977 = i2 - this.mOrientationHelper.mo3273();
        C14236 c14236 = this.mLayoutState;
        c14236.f44985 = i;
        c14236.f44984 = this.mShouldReverseLayout ? 1 : -1;
        c14236.f44981 = -1;
        c14236.f44976 = i2;
        c14236.f44983 = Integer.MIN_VALUE;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public C14236 createLayoutState() {
        C14236 c14236 = new C14236();
        c14236.f44980 = true;
        c14236.f44979 = 0;
        c14236.f44978 = 0;
        c14236.f44987 = null;
        return c14236;
    }

    @Override // l.AbstractC21169
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C17966 c17966 = this.mPendingSavedState;
        if (c17966 != null) {
            c17966.f58885 = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        C17966 c17966 = this.mPendingSavedState;
        if (c17966 != null) {
            c17966.f58885 = -1;
        }
        requestLayout();
    }

    @Override // l.AbstractC21169
    public int scrollHorizontallyBy(int i, C2523 c2523, C15529 c15529) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c2523, c15529);
    }

    @Override // l.AbstractC21169
    public int scrollVerticallyBy(int i, C2523 c2523, C15529 c15529) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c2523, c15529);
    }

    @Override // l.AbstractC21169
    public int computeHorizontalScrollOffset(C15529 c15529) {
        return m1118(c15529);
    }

    @Override // l.AbstractC21169
    public int computeVerticalScrollOffset(C15529 c15529) {
        return m1118(c15529);
    }

    @Override // l.AbstractC21169
    public int computeHorizontalScrollExtent(C15529 c15529) {
        return m1102(c15529);
    }

    @Override // l.AbstractC21169
    public int computeVerticalScrollExtent(C15529 c15529) {
        return m1102(c15529);
    }

    @Override // l.AbstractC21169
    public int computeHorizontalScrollRange(C15529 c15529) {
        return m1112(c15529);
    }

    @Override // l.AbstractC21169
    public int computeVerticalScrollRange(C15529 c15529) {
        return m1112(c15529);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m1118(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C16275.m38609(c15529, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m1102(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C16275.m38608(c15529, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m1112(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C16275.m38610(c15529, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1105(int i, int i2, boolean z, C15529 c15529) {
        int iMo3273;
        this.mLayoutState.f44986 = resolveIsInfinite();
        this.mLayoutState.f44981 = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c15529, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C14236 c14236 = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c14236.f44979 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c14236.f44978 = iMax;
        if (z2) {
            c14236.f44979 = this.mOrientationHelper.mo3270() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            C14236 c14237 = this.mLayoutState;
            c14237.f44984 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C14236 c14238 = this.mLayoutState;
            c14237.f44985 = position + c14238.f44984;
            c14238.f44976 = this.mOrientationHelper.mo3268(childClosestToEnd);
            iMo3273 = this.mOrientationHelper.mo3268(childClosestToEnd) - this.mOrientationHelper.mo3277();
        } else {
            View childClosestToStart = getChildClosestToStart();
            C14236 c14239 = this.mLayoutState;
            c14239.f44979 = this.mOrientationHelper.mo3273() + c14239.f44979;
            C14236 c142310 = this.mLayoutState;
            c142310.f44984 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C14236 c142311 = this.mLayoutState;
            c142310.f44985 = position2 + c142311.f44984;
            c142311.f44976 = this.mOrientationHelper.mo3280(childClosestToStart);
            iMo3273 = (-this.mOrientationHelper.mo3280(childClosestToStart)) + this.mOrientationHelper.mo3273();
        }
        C14236 c142312 = this.mLayoutState;
        c142312.f44977 = i2;
        if (z) {
            c142312.f44977 = i2 - iMo3273;
        }
        c142312.f44983 = iMo3273;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo3279() == 0 && this.mOrientationHelper.mo3267() == 0;
    }

    public void collectPrefetchPositionsForLayoutState(C15529 c15529, C14236 c14236, InterfaceC4015 interfaceC4015) {
        int i = c14236.f44985;
        if (i < 0 || i >= c15529.m37184()) {
            return;
        }
        ((C7304) interfaceC4015).m19987(i, Math.max(0, c14236.f44983));
    }

    @Override // l.AbstractC21169
    public void collectInitialPrefetchPositions(int i, InterfaceC4015 interfaceC4015) {
        boolean z;
        int i2;
        C17966 c17966 = this.mPendingSavedState;
        if (c17966 != null && (i2 = c17966.f58885) >= 0) {
            z = c17966.f58884;
        } else {
            m1115();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((C7304) interfaceC4015).m19987(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    @Override // l.AbstractC21169
    public void collectAdjacentPrefetchPositions(int i, int i2, C15529 c15529, InterfaceC4015 interfaceC4015) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m1105(i > 0 ? 1 : -1, Math.abs(i), true, c15529);
        collectPrefetchPositionsForLayoutState(c15529, this.mLayoutState, interfaceC4015);
    }

    public int scrollBy(int i, C2523 c2523, C15529 c15529) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f44980 = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m1105(i2, iAbs, true, c15529);
        C14236 c14236 = this.mLayoutState;
        int iFill = c14236.f44983 + fill(c2523, c14236, c15529, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo3269(-i);
        this.mLayoutState.f44982 = i;
        return i;
    }

    @Override // l.AbstractC21169
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1106(C2523 c2523, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c2523);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    removeAndRecycleViewAt(i2, c2523);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m1114(C2523 c2523, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo3268(childAt) > i3 || this.mOrientationHelper.mo3276(childAt) > i3) {
                    m1106(c2523, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo3268(childAt2) > i3 || this.mOrientationHelper.mo3276(childAt2) > i3) {
                m1106(c2523, i5, i6);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m1121(C2523 c2523, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iMo3267 = (this.mOrientationHelper.mo3267() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo3280(childAt) < iMo3267 || this.mOrientationHelper.mo3274(childAt) < iMo3267) {
                    m1106(c2523, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo3280(childAt2) < iMo3267 || this.mOrientationHelper.mo3274(childAt2) < iMo3267) {
                m1106(c2523, i4, i5);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1107(C2523 c2523, C14236 c14236) {
        if (!c14236.f44980 || c14236.f44986) {
            return;
        }
        int i = c14236.f44983;
        int i2 = c14236.f44978;
        if (c14236.f44981 == -1) {
            m1121(c2523, i, i2);
        } else {
            m1114(c2523, i, i2);
        }
    }

    public int fill(C2523 c2523, C14236 c14236, C15529 c15529, boolean z) {
        int i;
        int i2 = c14236.f44977;
        int i3 = c14236.f44983;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c14236.f44983 = i3 + i2;
            }
            m1107(c2523, c14236);
        }
        int i4 = c14236.f44977 + c14236.f44979;
        C3796 c3796 = this.mLayoutChunkResult;
        while (true) {
            if ((!c14236.f44986 && i4 <= 0) || (i = c14236.f44985) < 0 || i >= c15529.m37184()) {
                break;
            }
            c3796.f12987 = 0;
            c3796.f12989 = false;
            c3796.f12990 = false;
            c3796.f12988 = false;
            layoutChunk(c2523, c15529, c14236, c3796);
            if (!c3796.f12989) {
                int i5 = c14236.f44976;
                int i6 = c3796.f12987;
                c14236.f44976 = (c14236.f44981 * i6) + i5;
                if (!c3796.f12990 || c14236.f44987 != null || !c15529.f50525) {
                    c14236.f44977 -= i6;
                    i4 -= i6;
                }
                int i7 = c14236.f44983;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c14236.f44983 = i8;
                    int i9 = c14236.f44977;
                    if (i9 < 0) {
                        c14236.f44983 = i8 + i9;
                    }
                    m1107(c2523, c14236);
                }
                if (z && c3796.f12988) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c14236.f44977;
    }

    public void layoutChunk(C2523 c2523, C15529 c15529, C14236 c14236, C3796 c3796) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int paddingLeft;
        int iMo3271;
        int i6;
        int i7;
        View viewM34557 = c14236.m34557(c2523);
        if (viewM34557 == null) {
            c3796.f12989 = true;
            return;
        }
        C18185 c18185 = (C18185) viewM34557.getLayoutParams();
        if (c14236.f44987 == null) {
            if (this.mShouldReverseLayout == (c14236.f44981 == -1)) {
                addView(viewM34557);
            } else {
                addView(viewM34557, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c14236.f44981 == -1)) {
                addDisappearingView(viewM34557);
            } else {
                addDisappearingView(viewM34557, 0);
            }
        }
        measureChildWithMargins(viewM34557, 0, 0);
        c3796.f12987 = this.mOrientationHelper.mo3278(viewM34557);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo3271 = getWidth() - getPaddingRight();
                paddingLeft = iMo3271 - this.mOrientationHelper.mo3271(viewM34557);
            } else {
                paddingLeft = getPaddingLeft();
                iMo3271 = this.mOrientationHelper.mo3271(viewM34557) + paddingLeft;
            }
            if (c14236.f44981 == -1) {
                i7 = c14236.f44976;
                i6 = i7 - c3796.f12987;
            } else {
                i6 = c14236.f44976;
                i7 = c3796.f12987 + i6;
            }
            i5 = i7;
            i3 = iMo3271;
            i4 = i6;
        } else {
            int paddingTop = getPaddingTop();
            int iMo3272 = this.mOrientationHelper.mo3271(viewM34557) + paddingTop;
            if (c14236.f44981 == -1) {
                i2 = c14236.f44976;
                i = i2 - c3796.f12987;
            } else {
                i = c14236.f44976;
                i2 = c3796.f12987 + i;
            }
            i3 = i2;
            i4 = paddingTop;
            i5 = iMo3272;
            paddingLeft = i;
        }
        layoutDecoratedWithMargins(viewM34557, paddingLeft, i4, i3, i5);
        if (c18185.f59428.isRemoved() || c18185.f59428.isUpdated()) {
            c3796.f12990 = true;
        }
        c3796.f12988 = viewM34557.hasFocusable();
    }

    @Override // l.AbstractC21169
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(C2523 c2523, C15529 c15529, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i2 = -1;
            i = -1;
        } else {
            i = 1;
            i2 = childCount2;
            childCount = 0;
        }
        int iM37184 = c15529.m37184();
        int iMo3273 = this.mOrientationHelper.mo3273();
        int iMo3277 = this.mOrientationHelper.mo3277();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i2) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo3280 = this.mOrientationHelper.mo3280(childAt);
            int iMo3268 = this.mOrientationHelper.mo3268(childAt);
            if (position >= 0 && position < iM37184) {
                if (!((C18185) childAt.getLayoutParams()).f59428.isRemoved()) {
                    boolean z3 = iMo3268 <= iMo3273 && iMo3280 < iMo3273;
                    boolean z4 = iMo3280 >= iMo3277 && iMo3268 > iMo3277;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z3) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private View m1113() {
        return this.mShouldReverseLayout ? m1103() : m1119();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private View m1124() {
        return this.mShouldReverseLayout ? m1119() : m1103();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private View m1103() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private View m1119() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m9409(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m9409(i, i2, i3, i4);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo3280(getChildAt(i)) < this.mOrientationHelper.mo3273()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = o.a.a;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m9409(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m9409(i, i2, i3, i4);
    }

    @Override // l.AbstractC21169
    public View onFocusSearchFailed(View view, int i, C2523 c2523, C15529 c15529) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewM1113;
        View childClosestToEnd;
        m1115();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m1105(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo3272() * 0.33333334f), false, c15529);
        C14236 c14236 = this.mLayoutState;
        c14236.f44983 = Integer.MIN_VALUE;
        c14236.f44980 = false;
        fill(c2523, c14236, c15529, true);
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            viewM1113 = m1124();
        } else {
            viewM1113 = m1113();
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (!childClosestToEnd.hasFocusable()) {
            return viewM1113;
        }
        if (viewM1113 == null) {
            return null;
        }
        return childClosestToEnd;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m1116() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo3280(childAt);
        }
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo3280 = this.mOrientationHelper.mo3280(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo3281 = this.mOrientationHelper.mo3280(childAt);
                if (position2 < position) {
                    m1116();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo3281 < iMo3280);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo3281 > iMo3280) {
                    m1116();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo3282 = this.mOrientationHelper.mo3280(childAt2);
            if (position3 < position) {
                m1116();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo3282 < iMo3280);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo3282 < iMo3280) {
                m1116();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // l.AbstractC21169
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    @Override // l.InterfaceC20204
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m1115();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3277() - (this.mOrientationHelper.mo3278(view) + this.mOrientationHelper.mo3280(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3277() - this.mOrientationHelper.mo3268(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3280(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3268(view2) - this.mOrientationHelper.mo3278(view));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1111(C15529 c15529, C23934 c23934) {
        int i;
        int iMo3280;
        if (!c15529.f50525 && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= c15529.m37184()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                int i2 = this.mPendingScrollPosition;
                c23934.f77491 = i2;
                C17966 c17966 = this.mPendingSavedState;
                if (c17966 != null && c17966.f58885 >= 0) {
                    boolean z = c17966.f58884;
                    c23934.f77490 = z;
                    if (z) {
                        c23934.f77487 = this.mOrientationHelper.mo3277() - this.mPendingSavedState.f58886;
                        return true;
                    }
                    c23934.f77487 = this.mOrientationHelper.mo3273() + this.mPendingSavedState.f58886;
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition = findViewByPosition(i2);
                    if (viewFindViewByPosition != null) {
                        if (this.mOrientationHelper.mo3278(viewFindViewByPosition) > this.mOrientationHelper.mo3272()) {
                            c23934.m53456();
                            return true;
                        }
                        if (this.mOrientationHelper.mo3280(viewFindViewByPosition) - this.mOrientationHelper.mo3273() < 0) {
                            c23934.f77487 = this.mOrientationHelper.mo3273();
                            c23934.f77490 = false;
                            return true;
                        }
                        if (this.mOrientationHelper.mo3277() - this.mOrientationHelper.mo3268(viewFindViewByPosition) < 0) {
                            c23934.f77487 = this.mOrientationHelper.mo3277();
                            c23934.f77490 = true;
                            return true;
                        }
                        if (c23934.f77490) {
                            iMo3280 = this.mOrientationHelper.m24073() + this.mOrientationHelper.mo3268(viewFindViewByPosition);
                        } else {
                            iMo3280 = this.mOrientationHelper.mo3280(viewFindViewByPosition);
                        }
                        c23934.f77487 = iMo3280;
                        return true;
                    }
                    if (getChildCount() > 0) {
                        c23934.f77490 = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c23934.m53456();
                    return true;
                }
                boolean z2 = this.mShouldReverseLayout;
                c23934.f77490 = z2;
                if (z2) {
                    c23934.f77487 = this.mOrientationHelper.mo3277() - this.mPendingScrollPositionOffset;
                    return true;
                }
                c23934.f77487 = this.mOrientationHelper.mo3273() + this.mPendingScrollPositionOffset;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1108(C2523 c2523, C15529 c15529, int i, int i2) {
        if (!c15529.f50519 || getChildCount() == 0 || c15529.f50525 || !supportsPredictiveItemAnimations()) {
            return;
        }
        List listM8426 = c2523.m8426();
        int size = listM8426.size();
        int position = getPosition(getChildAt(0));
        int iMo3278 = 0;
        int iMo3279 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC11800 abstractC11800 = (AbstractC11800) listM8426.get(i3);
            if (!abstractC11800.isRemoved()) {
                if ((abstractC11800.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iMo3278 += this.mOrientationHelper.mo3278(abstractC11800.itemView);
                } else {
                    iMo3279 += this.mOrientationHelper.mo3278(abstractC11800.itemView);
                }
            }
        }
        this.mLayoutState.f44987 = listM8426;
        if (iMo3278 > 0) {
            m1120(getPosition(getChildClosestToStart()), i);
            C14236 c14236 = this.mLayoutState;
            c14236.f44979 = iMo3278;
            c14236.f44977 = 0;
            c14236.m34558((View) null);
            fill(c2523, this.mLayoutState, c15529, false);
        }
        if (iMo3279 > 0) {
            m1104(getPosition(getChildClosestToEnd()), i2);
            C14236 c14237 = this.mLayoutState;
            c14237.f44979 = iMo3279;
            c14237.f44977 = 0;
            c14237.m34558((View) null);
            fill(c2523, this.mLayoutState, c15529, false);
        }
        this.mLayoutState.f44987 = null;
    }

    @Deprecated
    public int getExtraLayoutSpace(C15529 c15529) {
        if (c15529.f50524 != -1) {
            return this.mOrientationHelper.mo3272();
        }
        return 0;
    }
}
