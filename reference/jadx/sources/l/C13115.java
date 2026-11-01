package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.o;
import java.util.List;

/* JADX INFO: renamed from: l.۬۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes4.dex */
public class C13115 extends AbstractC5498 implements InterfaceC3360, InterfaceC7615 {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final float MAX_SCROLL_FACTOR = 0.33333334f;
    public static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final C11704 mAnchorInfo;
    public int mInitialPrefetchItemCount;
    public boolean mLastStackFromEnd;
    public final C2530 mLayoutChunkResult;
    public C5353 mLayoutState;
    public int mOrientation;
    public AbstractC21581 mOrientationHelper;
    public C1119 mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public boolean mRecycleChildrenOnDetach;
    public int[] mReusableIntPair;
    public boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    public boolean mSmoothScrollbarEnabled;
    public boolean mStackFromEnd;

    @Override // l.AbstractC5498
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(C21726 c21726, C16082 c16082, C11704 c11704, int i) {
    }

    public C13115(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    public C13115(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C11704();
        this.mLayoutChunkResult = new C2530();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public C13115(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C11704();
        this.mLayoutChunkResult = new C2530();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C2675 c2675M15190 = AbstractC5498.m15190(context, attributeSet, i, i2);
        setOrientation(c2675M15190.f10343);
        setReverseLayout(c2675M15190.f10345);
        setStackFromEnd(c2675M15190.f10342);
    }

    @Override // l.AbstractC5498
    public C22432 generateDefaultLayoutParams() {
        return new C22432(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    @Override // l.AbstractC5498
    public void onDetachedFromWindow(C17492 c17492, C21726 c21726) {
        super.onDetachedFromWindow(c17492, c21726);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c21726);
            c21726.f70436.clear();
            c21726.m48482();
        }
    }

    @Override // l.AbstractC5498
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // l.AbstractC5498
    public Parcelable onSaveInstanceState() {
        C1119 c1119 = this.mPendingSavedState;
        if (c1119 == null) {
            C1119 c11110 = new C1119();
            if (getChildCount() > 0) {
                ensureLayoutState();
                boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
                c11110.f5044 = z;
                if (z) {
                    View childClosestToEnd = getChildClosestToEnd();
                    c11110.f5045 = this.mOrientationHelper.mo36481() - this.mOrientationHelper.mo36475(childClosestToEnd);
                    c11110.f5043 = getPosition(childClosestToEnd);
                    return c11110;
                }
                View childClosestToStart = getChildClosestToStart();
                c11110.f5043 = getPosition(childClosestToStart);
                c11110.f5045 = this.mOrientationHelper.mo36473(childClosestToStart) - this.mOrientationHelper.mo36483();
                return c11110;
            }
            c11110.f5043 = -1;
            return c11110;
        }
        C1119 c11111 = new C1119();
        c11111.f5043 = c1119.f5043;
        c11111.f5045 = c1119.f5045;
        c11111.f5044 = c1119.f5044;
        return c11111;
    }

    @Override // l.AbstractC5498
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C1119) {
            C1119 c1119 = (C1119) parcelable;
            this.mPendingSavedState = c1119;
            if (this.mPendingScrollPosition != -1) {
                c1119.f5043 = -1;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC5498
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // l.AbstractC5498
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
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
            throw new IllegalArgumentException(C8479.m22141(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC21581 abstractC21581M48293 = AbstractC21581.m48293(this, i);
            this.mOrientationHelper = abstractC21581M48293;
            this.mAnchorInfo.f39341 = abstractC21581M48293;
            this.mOrientation = i;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m32467() {
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

    @Override // l.AbstractC5498
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

    public void calculateExtraLayoutSpace(C16082 c16082, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c16082);
        if (this.mLayoutState.f18485 == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // l.AbstractC5498
    public void smoothScrollToPosition(C17492 c17492, C16082 c16082, int i) {
        C3941 c3941 = new C3941(c17492.getContext());
        c3941.setTargetPosition(i);
        startSmoothScroll(c3941);
    }

    @Override // l.InterfaceC7615
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

    @Override // l.AbstractC5498
    public void onLayoutChildren(C21726 c21726, C16082 c16082) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM32445;
        int i5;
        View viewFindViewByPosition;
        int iMo36473;
        int iMo36481;
        int i6;
        int i7 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && c16082.m38108() == 0) {
            removeAndRecycleAllViews(c21726);
            return;
        }
        C1119 c1119 = this.mPendingSavedState;
        if (c1119 != null && (i6 = c1119.f5043) >= 0) {
            this.mPendingScrollPosition = i6;
        }
        ensureLayoutState();
        this.mLayoutState.f18490 = false;
        m32467();
        View focusedChild = getFocusedChild();
        C11704 c11704 = this.mAnchorInfo;
        if (!c11704.f39340 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c11704.m29218();
            C11704 c11705 = this.mAnchorInfo;
            c11705.f39342 = this.mShouldReverseLayout ^ this.mStackFromEnd;
            m32466(c21726, c16082, c11705);
            this.mAnchorInfo.f39340 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo36473(focusedChild) >= this.mOrientationHelper.mo36481() || this.mOrientationHelper.mo36475(focusedChild) <= this.mOrientationHelper.mo36483())) {
            this.mAnchorInfo.m29219(getPosition(focusedChild), focusedChild);
        }
        C5353 c5353 = this.mLayoutState;
        c5353.f18485 = c5353.f18495 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c16082, iArr);
        int iMo36483 = this.mOrientationHelper.mo36483() + Math.max(0, this.mReusableIntPair[0]);
        int iMo36479 = this.mOrientationHelper.mo36479() + Math.max(0, this.mReusableIntPair[1]);
        if (c16082.f52015 && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                iMo36481 = this.mOrientationHelper.mo36481() - this.mOrientationHelper.mo36475(viewFindViewByPosition);
                iMo36473 = this.mPendingScrollPositionOffset;
            } else {
                iMo36473 = this.mOrientationHelper.mo36473(viewFindViewByPosition) - this.mOrientationHelper.mo36483();
                iMo36481 = this.mPendingScrollPositionOffset;
            }
            int i8 = iMo36481 - iMo36473;
            if (i8 > 0) {
                iMo36483 += i8;
            } else {
                iMo36479 -= i8;
            }
        }
        C11704 c11706 = this.mAnchorInfo;
        if (!c11706.f39342 ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(c21726, c16082, c11706, i7);
        detachAndScrapAttachedViews(c21726);
        this.mLayoutState.f18486 = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f18492 = 0;
        C11704 c11707 = this.mAnchorInfo;
        if (c11707.f39342) {
            m32464(c11707);
            C5353 c5354 = this.mLayoutState;
            c5354.f18491 = iMo36483;
            fill(c21726, c5354, c16082, false);
            C5353 c5355 = this.mLayoutState;
            i2 = c5355.f18487;
            int i9 = c5355.f18493;
            int i10 = c5355.f18488;
            if (i10 > 0) {
                iMo36479 += i10;
            }
            m32450(this.mAnchorInfo);
            C5353 c5356 = this.mLayoutState;
            c5356.f18491 = iMo36479;
            c5356.f18493 += c5356.f18489;
            fill(c21726, c5356, c16082, false);
            C5353 c5357 = this.mLayoutState;
            i = c5357.f18487;
            int i11 = c5357.f18488;
            if (i11 > 0) {
                m32463(i9, i2);
                C5353 c5358 = this.mLayoutState;
                c5358.f18491 = i11;
                fill(c21726, c5358, c16082, false);
                i2 = this.mLayoutState.f18487;
            }
        } else {
            m32450(c11707);
            C5353 c5359 = this.mLayoutState;
            c5359.f18491 = iMo36479;
            fill(c21726, c5359, c16082, false);
            C5353 c53510 = this.mLayoutState;
            int i12 = c53510.f18487;
            int i13 = c53510.f18493;
            int i14 = c53510.f18488;
            if (i14 > 0) {
                iMo36483 += i14;
            }
            m32464(this.mAnchorInfo);
            C5353 c53511 = this.mLayoutState;
            c53511.f18491 = iMo36483;
            c53511.f18493 += c53511.f18489;
            fill(c21726, c53511, c16082, false);
            C5353 c53512 = this.mLayoutState;
            int i15 = c53512.f18487;
            int i16 = c53512.f18488;
            if (i16 > 0) {
                m32448(i13, i12);
                C5353 c53513 = this.mLayoutState;
                c53513.f18491 = i16;
                fill(c21726, c53513, c16082, false);
                i = this.mLayoutState.f18487;
            } else {
                i = i12;
            }
            i2 = i15;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM32446 = m32445(i, c21726, c16082, true);
                i3 = i2 + iM32446;
                i4 = i + iM32446;
                iM32445 = m32460(i3, c21726, c16082, false);
            } else {
                int iM32460 = m32460(i2, c21726, c16082, true);
                i3 = i2 + iM32460;
                i4 = i + iM32460;
                iM32445 = m32445(i4, c21726, c16082, false);
            }
            i2 = i3 + iM32445;
            i = i4 + iM32445;
        }
        m32453(c21726, c16082, i2, i);
        if (!c16082.f52015) {
            this.mOrientationHelper.m48294();
        } else {
            this.mAnchorInfo.m29218();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // l.AbstractC5498
    public void onLayoutCompleted(C16082 c16082) {
        super.onLayoutCompleted(c16082);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m29218();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m32466(C21726 c21726, C16082 c16082, C11704 c11704) {
        if (m32454(c16082, c11704) || m32455(c21726, c16082, c11704)) {
            return;
        }
        c11704.m29216();
        c11704.f39338 = this.mStackFromEnd ? c16082.m38108() - 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32455(C21726 c21726, C16082 c16082, C11704 c11704) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                c11704.getClass();
                C22432 c22432 = (C22432) focusedChild.getLayoutParams();
                if (!c22432.f73212.isRemoved() && c22432.f73212.getLayoutPosition() >= 0 && c22432.f73212.getLayoutPosition() < c16082.m38108()) {
                    c11704.m29219(getPosition(focusedChild), focusedChild);
                    return true;
                }
            }
            boolean z2 = this.mLastStackFromEnd;
            boolean z3 = this.mStackFromEnd;
            if (z2 == z3 && (viewFindReferenceChild = findReferenceChild(c21726, c16082, c11704.f39342, z3)) != null) {
                c11704.m29217(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                if (!c16082.f52015 && supportsPredictiveItemAnimations()) {
                    int iMo36473 = this.mOrientationHelper.mo36473(viewFindReferenceChild);
                    int iMo36475 = this.mOrientationHelper.mo36475(viewFindReferenceChild);
                    int iMo36483 = this.mOrientationHelper.mo36483();
                    int iMo36481 = this.mOrientationHelper.mo36481();
                    boolean z4 = iMo36475 <= iMo36483 && iMo36473 < iMo36483;
                    if (iMo36473 >= iMo36481 && iMo36475 > iMo36481) {
                        z = true;
                    }
                    if (z4 || z) {
                        if (c11704.f39342) {
                            iMo36483 = iMo36481;
                        }
                        c11704.f39339 = iMo36483;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m32445(int i, C21726 c21726, C16082 c16082, boolean z) {
        int iMo36481;
        int iMo36482 = this.mOrientationHelper.mo36481() - i;
        if (iMo36482 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo36482, c21726, c16082);
        int i3 = i + i2;
        if (!z || (iMo36481 = this.mOrientationHelper.mo36481() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo36476(iMo36481);
        return iMo36481 + i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m32460(int i, C21726 c21726, C16082 c16082, boolean z) {
        int iMo36483;
        int iMo36484 = i - this.mOrientationHelper.mo36483();
        if (iMo36484 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo36484, c21726, c16082);
        int i3 = i + i2;
        if (!z || (iMo36483 = i3 - this.mOrientationHelper.mo36483()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo36476(-iMo36483);
        return i2 - iMo36483;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32450(C11704 c11704) {
        m32448(c11704.f39338, c11704.f39339);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32448(int i, int i2) {
        this.mLayoutState.f18488 = this.mOrientationHelper.mo36481() - i2;
        C5353 c5353 = this.mLayoutState;
        c5353.f18489 = this.mShouldReverseLayout ? -1 : 1;
        c5353.f18493 = i;
        c5353.f18485 = 1;
        c5353.f18487 = i2;
        c5353.f18494 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m32464(C11704 c11704) {
        m32463(c11704.f39338, c11704.f39339);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m32463(int i, int i2) {
        this.mLayoutState.f18488 = i2 - this.mOrientationHelper.mo36483();
        C5353 c5353 = this.mLayoutState;
        c5353.f18493 = i;
        c5353.f18489 = this.mShouldReverseLayout ? 1 : -1;
        c5353.f18485 = -1;
        c5353.f18487 = i2;
        c5353.f18494 = Integer.MIN_VALUE;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public C5353 createLayoutState() {
        C5353 c5353 = new C5353();
        c5353.f18490 = true;
        c5353.f18491 = 0;
        c5353.f18492 = 0;
        c5353.f18496 = null;
        return c5353;
    }

    @Override // l.AbstractC5498
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C1119 c1119 = this.mPendingSavedState;
        if (c1119 != null) {
            c1119.f5043 = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        C1119 c1119 = this.mPendingSavedState;
        if (c1119 != null) {
            c1119.f5043 = -1;
        }
        requestLayout();
    }

    @Override // l.AbstractC5498
    public int scrollHorizontallyBy(int i, C21726 c21726, C16082 c16082) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c21726, c16082);
    }

    @Override // l.AbstractC5498
    public int scrollVerticallyBy(int i, C21726 c21726, C16082 c16082) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c21726, c16082);
    }

    @Override // l.AbstractC5498
    public int computeHorizontalScrollOffset(C16082 c16082) {
        return m32461(c16082);
    }

    @Override // l.AbstractC5498
    public int computeVerticalScrollOffset(C16082 c16082) {
        return m32461(c16082);
    }

    @Override // l.AbstractC5498
    public int computeHorizontalScrollExtent(C16082 c16082) {
        return m32446(c16082);
    }

    @Override // l.AbstractC5498
    public int computeVerticalScrollExtent(C16082 c16082) {
        return m32446(c16082);
    }

    @Override // l.AbstractC5498
    public int computeHorizontalScrollRange(C16082 c16082) {
        return m32457(c16082);
    }

    @Override // l.AbstractC5498
    public int computeVerticalScrollRange(C16082 c16082) {
        return m32457(c16082);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m32461(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C23843.m52563(c16082, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m32446(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C23843.m52562(c16082, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m32457(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C23843.m52564(c16082, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32449(int i, int i2, boolean z, C16082 c16082) {
        int iMo36483;
        this.mLayoutState.f18486 = resolveIsInfinite();
        this.mLayoutState.f18485 = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c16082, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C5353 c5353 = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c5353.f18491 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c5353.f18492 = iMax;
        if (z2) {
            c5353.f18491 = this.mOrientationHelper.mo36479() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            C5353 c5354 = this.mLayoutState;
            c5354.f18489 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C5353 c5355 = this.mLayoutState;
            c5354.f18493 = position + c5355.f18489;
            c5355.f18487 = this.mOrientationHelper.mo36475(childClosestToEnd);
            iMo36483 = this.mOrientationHelper.mo36475(childClosestToEnd) - this.mOrientationHelper.mo36481();
        } else {
            View childClosestToStart = getChildClosestToStart();
            C5353 c5356 = this.mLayoutState;
            c5356.f18491 = this.mOrientationHelper.mo36483() + c5356.f18491;
            C5353 c5357 = this.mLayoutState;
            c5357.f18489 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C5353 c5358 = this.mLayoutState;
            c5357.f18493 = position2 + c5358.f18489;
            c5358.f18487 = this.mOrientationHelper.mo36473(childClosestToStart);
            iMo36483 = (-this.mOrientationHelper.mo36473(childClosestToStart)) + this.mOrientationHelper.mo36483();
        }
        C5353 c5359 = this.mLayoutState;
        c5359.f18488 = i2;
        if (z) {
            c5359.f18488 = i2 - iMo36483;
        }
        c5359.f18494 = iMo36483;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo36472() == 0 && this.mOrientationHelper.mo36474() == 0;
    }

    public void collectPrefetchPositionsForLayoutState(C16082 c16082, C5353 c5353, InterfaceC11849 interfaceC11849) {
        int i = c5353.f18493;
        if (i < 0 || i >= c16082.m38108()) {
            return;
        }
        ((C8301) interfaceC11849).m21733(i, Math.max(0, c5353.f18494));
    }

    @Override // l.AbstractC5498
    public void collectInitialPrefetchPositions(int i, InterfaceC11849 interfaceC11849) {
        boolean z;
        int i2;
        C1119 c1119 = this.mPendingSavedState;
        if (c1119 != null && (i2 = c1119.f5043) >= 0) {
            z = c1119.f5044;
        } else {
            m32467();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((C8301) interfaceC11849).m21733(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    @Override // l.AbstractC5498
    public void collectAdjacentPrefetchPositions(int i, int i2, C16082 c16082, InterfaceC11849 interfaceC11849) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m32449(i > 0 ? 1 : -1, Math.abs(i), true, c16082);
        collectPrefetchPositionsForLayoutState(c16082, this.mLayoutState, interfaceC11849);
    }

    public int scrollBy(int i, C21726 c21726, C16082 c16082) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f18490 = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m32449(i2, iAbs, true, c16082);
        C5353 c5353 = this.mLayoutState;
        int iFill = c5353.f18494 + fill(c21726, c5353, c16082, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo36476(-i);
        this.mLayoutState.f18495 = i;
        return i;
    }

    @Override // l.AbstractC5498
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32451(C21726 c21726, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c21726);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    removeAndRecycleViewAt(i2, c21726);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m32459(C21726 c21726, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo36475(childAt) > i3 || this.mOrientationHelper.mo36478(childAt) > i3) {
                    m32451(c21726, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo36475(childAt2) > i3 || this.mOrientationHelper.mo36478(childAt2) > i3) {
                m32451(c21726, i5, i6);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m32465(C21726 c21726, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iMo36474 = (this.mOrientationHelper.mo36474() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo36473(childAt) < iMo36474 || this.mOrientationHelper.mo36484(childAt) < iMo36474) {
                    m32451(c21726, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo36473(childAt2) < iMo36474 || this.mOrientationHelper.mo36484(childAt2) < iMo36474) {
                m32451(c21726, i4, i5);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32452(C21726 c21726, C5353 c5353) {
        if (!c5353.f18490 || c5353.f18486) {
            return;
        }
        int i = c5353.f18494;
        int i2 = c5353.f18492;
        if (c5353.f18485 == -1) {
            m32465(c21726, i, i2);
        } else {
            m32459(c21726, i, i2);
        }
    }

    public int fill(C21726 c21726, C5353 c5353, C16082 c16082, boolean z) {
        int i;
        int i2 = c5353.f18488;
        int i3 = c5353.f18494;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c5353.f18494 = i3 + i2;
            }
            m32452(c21726, c5353);
        }
        int i4 = c5353.f18488 + c5353.f18491;
        C2530 c2530 = this.mLayoutChunkResult;
        while (true) {
            if ((!c5353.f18486 && i4 <= 0) || (i = c5353.f18493) < 0 || i >= c16082.m38108()) {
                break;
            }
            c2530.f10035 = 0;
            c2530.f10037 = false;
            c2530.f10034 = false;
            c2530.f10036 = false;
            layoutChunk(c21726, c16082, c5353, c2530);
            if (!c2530.f10037) {
                int i5 = c5353.f18487;
                int i6 = c2530.f10035;
                c5353.f18487 = (c5353.f18485 * i6) + i5;
                if (!c2530.f10034 || c5353.f18496 != null || !c16082.f52015) {
                    c5353.f18488 -= i6;
                    i4 -= i6;
                }
                int i7 = c5353.f18494;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c5353.f18494 = i8;
                    int i9 = c5353.f18488;
                    if (i9 < 0) {
                        c5353.f18494 = i8 + i9;
                    }
                    m32452(c21726, c5353);
                }
                if (z && c2530.f10036) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c5353.f18488;
    }

    public void layoutChunk(C21726 c21726, C16082 c16082, C5353 c5353, C2530 c2530) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int paddingLeft;
        int iMo36480;
        int i6;
        int i7;
        View viewM14852 = c5353.m14852(c21726);
        if (viewM14852 == null) {
            c2530.f10037 = true;
            return;
        }
        C22432 c22432 = (C22432) viewM14852.getLayoutParams();
        if (c5353.f18496 == null) {
            if (this.mShouldReverseLayout == (c5353.f18485 == -1)) {
                addView(viewM14852);
            } else {
                addView(viewM14852, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c5353.f18485 == -1)) {
                addDisappearingView(viewM14852);
            } else {
                addDisappearingView(viewM14852, 0);
            }
        }
        measureChildWithMargins(viewM14852, 0, 0);
        c2530.f10035 = this.mOrientationHelper.mo36482(viewM14852);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo36480 = getWidth() - getPaddingRight();
                paddingLeft = iMo36480 - this.mOrientationHelper.mo36480(viewM14852);
            } else {
                paddingLeft = getPaddingLeft();
                iMo36480 = this.mOrientationHelper.mo36480(viewM14852) + paddingLeft;
            }
            if (c5353.f18485 == -1) {
                i7 = c5353.f18487;
                i6 = i7 - c2530.f10035;
            } else {
                i6 = c5353.f18487;
                i7 = c2530.f10035 + i6;
            }
            i5 = i7;
            i3 = iMo36480;
            i4 = i6;
        } else {
            int paddingTop = getPaddingTop();
            int iMo36481 = this.mOrientationHelper.mo36480(viewM14852) + paddingTop;
            if (c5353.f18485 == -1) {
                i2 = c5353.f18487;
                i = i2 - c2530.f10035;
            } else {
                i = c5353.f18487;
                i2 = c2530.f10035 + i;
            }
            i3 = i2;
            i4 = paddingTop;
            i5 = iMo36481;
            paddingLeft = i;
        }
        layoutDecoratedWithMargins(viewM14852, paddingLeft, i4, i3, i5);
        if (c22432.f73212.isRemoved() || c22432.f73212.isUpdated()) {
            c2530.f10034 = true;
        }
        c2530.f10036 = viewM14852.hasFocusable();
    }

    @Override // l.AbstractC5498
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
    public View findReferenceChild(C21726 c21726, C16082 c16082, boolean z, boolean z2) {
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
        int iM38108 = c16082.m38108();
        int iMo36483 = this.mOrientationHelper.mo36483();
        int iMo36481 = this.mOrientationHelper.mo36481();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i2) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo36473 = this.mOrientationHelper.mo36473(childAt);
            int iMo36475 = this.mOrientationHelper.mo36475(childAt);
            if (position >= 0 && position < iM38108) {
                if (!((C22432) childAt.getLayoutParams()).f73212.isRemoved()) {
                    boolean z3 = iMo36475 <= iMo36483 && iMo36473 < iMo36483;
                    boolean z4 = iMo36473 >= iMo36481 && iMo36475 > iMo36481;
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private View m32458() {
        return this.mShouldReverseLayout ? m32447() : m32462();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private View m32444() {
        return this.mShouldReverseLayout ? m32462() : m32447();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private View m32447() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private View m32462() {
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
            return this.mHorizontalBoundCheck.m47943(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m47943(i, i2, i3, i4);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo36473(getChildAt(i)) < this.mOrientationHelper.mo36483()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = o.a.a;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m47943(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m47943(i, i2, i3, i4);
    }

    @Override // l.AbstractC5498
    public View onFocusSearchFailed(View view, int i, C21726 c21726, C16082 c16082) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewM32458;
        View childClosestToEnd;
        m32467();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m32449(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo36471() * 0.33333334f), false, c16082);
        C5353 c5353 = this.mLayoutState;
        c5353.f18494 = Integer.MIN_VALUE;
        c5353.f18490 = false;
        fill(c21726, c5353, c16082, true);
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            viewM32458 = m32444();
        } else {
            viewM32458 = m32458();
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (!childClosestToEnd.hasFocusable()) {
            return viewM32458;
        }
        if (viewM32458 == null) {
            return null;
        }
        return childClosestToEnd;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m32456() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo36473(childAt);
        }
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo36473 = this.mOrientationHelper.mo36473(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo36474 = this.mOrientationHelper.mo36473(childAt);
                if (position2 < position) {
                    m32456();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo36474 < iMo36473);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo36474 > iMo36473) {
                    m32456();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo36475 = this.mOrientationHelper.mo36473(childAt2);
            if (position3 < position) {
                m32456();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo36475 < iMo36473);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo36475 < iMo36473) {
                m32456();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // l.AbstractC5498
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    @Override // l.InterfaceC3360
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m32467();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo36481() - (this.mOrientationHelper.mo36482(view) + this.mOrientationHelper.mo36473(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo36481() - this.mOrientationHelper.mo36475(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo36473(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo36475(view2) - this.mOrientationHelper.mo36482(view));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32454(C16082 c16082, C11704 c11704) {
        int i;
        int iMo36473;
        if (!c16082.f52015 && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= c16082.m38108()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                int i2 = this.mPendingScrollPosition;
                c11704.f39338 = i2;
                C1119 c1119 = this.mPendingSavedState;
                if (c1119 != null && c1119.f5043 >= 0) {
                    boolean z = c1119.f5044;
                    c11704.f39342 = z;
                    if (z) {
                        c11704.f39339 = this.mOrientationHelper.mo36481() - this.mPendingSavedState.f5045;
                        return true;
                    }
                    c11704.f39339 = this.mOrientationHelper.mo36483() + this.mPendingSavedState.f5045;
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition = findViewByPosition(i2);
                    if (viewFindViewByPosition != null) {
                        if (this.mOrientationHelper.mo36482(viewFindViewByPosition) > this.mOrientationHelper.mo36471()) {
                            c11704.m29216();
                            return true;
                        }
                        if (this.mOrientationHelper.mo36473(viewFindViewByPosition) - this.mOrientationHelper.mo36483() < 0) {
                            c11704.f39339 = this.mOrientationHelper.mo36483();
                            c11704.f39342 = false;
                            return true;
                        }
                        if (this.mOrientationHelper.mo36481() - this.mOrientationHelper.mo36475(viewFindViewByPosition) < 0) {
                            c11704.f39339 = this.mOrientationHelper.mo36481();
                            c11704.f39342 = true;
                            return true;
                        }
                        if (c11704.f39342) {
                            iMo36473 = this.mOrientationHelper.m48295() + this.mOrientationHelper.mo36475(viewFindViewByPosition);
                        } else {
                            iMo36473 = this.mOrientationHelper.mo36473(viewFindViewByPosition);
                        }
                        c11704.f39339 = iMo36473;
                        return true;
                    }
                    if (getChildCount() > 0) {
                        c11704.f39342 = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c11704.m29216();
                    return true;
                }
                boolean z2 = this.mShouldReverseLayout;
                c11704.f39342 = z2;
                if (z2) {
                    c11704.f39339 = this.mOrientationHelper.mo36481() - this.mPendingScrollPositionOffset;
                    return true;
                }
                c11704.f39339 = this.mOrientationHelper.mo36483() + this.mPendingScrollPositionOffset;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32453(C21726 c21726, C16082 c16082, int i, int i2) {
        if (!c16082.f52016 || getChildCount() == 0 || c16082.f52015 || !supportsPredictiveItemAnimations()) {
            return;
        }
        List listM48486 = c21726.m48486();
        int size = listM48486.size();
        int position = getPosition(getChildAt(0));
        int iMo36482 = 0;
        int iMo36483 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC12554 abstractC12554 = (AbstractC12554) listM48486.get(i3);
            if (!abstractC12554.isRemoved()) {
                if ((abstractC12554.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iMo36482 += this.mOrientationHelper.mo36482(abstractC12554.itemView);
                } else {
                    iMo36483 += this.mOrientationHelper.mo36482(abstractC12554.itemView);
                }
            }
        }
        this.mLayoutState.f18496 = listM48486;
        if (iMo36482 > 0) {
            m32463(getPosition(getChildClosestToStart()), i);
            C5353 c5353 = this.mLayoutState;
            c5353.f18491 = iMo36482;
            c5353.f18488 = 0;
            c5353.m14853((View) null);
            fill(c21726, this.mLayoutState, c16082, false);
        }
        if (iMo36483 > 0) {
            m32448(getPosition(getChildClosestToEnd()), i2);
            C5353 c5354 = this.mLayoutState;
            c5354.f18491 = iMo36483;
            c5354.f18488 = 0;
            c5354.m14853((View) null);
            fill(c21726, this.mLayoutState, c16082, false);
        }
        this.mLayoutState.f18496 = null;
    }

    @Deprecated
    public int getExtraLayoutSpace(C16082 c16082) {
        if (c16082.f52022 != -1) {
            return this.mOrientationHelper.mo36471();
        }
        return 0;
    }
}
