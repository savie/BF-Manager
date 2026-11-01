package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5F4 */
/* JADX INFO: loaded from: classes5.dex */
public class C16062 extends C13115 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f51957;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f51958;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f51959;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f51960;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f51961;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C10418 f51962;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Rect f51963;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View[] f51964;

    public C16062(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f51961 = false;
        this.f51957 = -1;
        this.f51960 = new SparseIntArray();
        this.f51958 = new SparseIntArray();
        this.f51962 = new C10418();
        this.f51963 = new Rect();
        m38063(AbstractC5498.m15190(context, attributeSet, i, i2).f10344);
    }

    public C16062(Context context, int i) {
        super(context);
        this.f51961 = false;
        this.f51957 = -1;
        this.f51960 = new SparseIntArray();
        this.f51958 = new SparseIntArray();
        this.f51962 = new C10418();
        this.f51963 = new Rect();
        m38063(i);
    }

    public C16062(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.f51961 = false;
        this.f51957 = -1;
        this.f51960 = new SparseIntArray();
        this.f51958 = new SparseIntArray();
        this.f51962 = new C10418();
        this.f51963 = new Rect();
        m38063(i);
    }

    @Override // l.C13115
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // l.AbstractC5498
    public final int getRowCountForAccessibility(C21726 c21726, C16082 c16082) {
        if (this.mOrientation == 0) {
            return this.f51957;
        }
        if (c16082.m38108() < 1) {
            return 0;
        }
        return m38054(c16082.m38108() - 1, c21726, c16082) + 1;
    }

    @Override // l.AbstractC5498
    public final int getColumnCountForAccessibility(C21726 c21726, C16082 c16082) {
        if (this.mOrientation == 1) {
            return this.f51957;
        }
        if (c16082.m38108() < 1) {
            return 0;
        }
        return m38054(c16082.m38108() - 1, c21726, c16082) + 1;
    }

    @Override // l.AbstractC5498
    public final void onInitializeAccessibilityNodeInfoForItem(C21726 c21726, C16082 c16082, View view, C22006 c22006) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C7595)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c22006);
            return;
        }
        C7595 c7595 = (C7595) layoutParams;
        int iM38054 = m38054(c7595.f73212.getLayoutPosition(), c21726, c16082);
        if (this.mOrientation == 0) {
            c22006.m48846(C2249.m6904(c7595.f25143, c7595.f25144, iM38054, 1, false, false));
        } else {
            c22006.m48846(C2249.m6904(iM38054, 1, c7595.f25143, c7595.f25144, false, false));
        }
    }

    @Override // l.AbstractC5498
    public final void onInitializeAccessibilityNodeInfo(C21726 c21726, C16082 c16082, C22006 c22006) {
        super.onInitializeAccessibilityNodeInfo(c21726, c16082, c22006);
        c22006.m48844((CharSequence) GridView.class.getName());
    }

    @Override // l.C13115, l.AbstractC5498
    public final void onLayoutCompleted(C16082 c16082) {
        super.onLayoutCompleted(c16082);
        this.f51961 = false;
    }

    @Override // l.AbstractC5498
    public final void onItemsAdded(C17492 c17492, int i, int i2) {
        C10418 c10418 = this.f51962;
        c10418.m47160();
        c10418.f68373.clear();
    }

    @Override // l.AbstractC5498
    public final void onItemsChanged(C17492 c17492) {
        C10418 c10418 = this.f51962;
        c10418.m47160();
        c10418.f68373.clear();
    }

    @Override // l.AbstractC5498
    public final void onItemsRemoved(C17492 c17492, int i, int i2) {
        C10418 c10418 = this.f51962;
        c10418.m47160();
        c10418.f68373.clear();
    }

    @Override // l.AbstractC5498
    public final void onItemsUpdated(C17492 c17492, int i, int i2, Object obj) {
        C10418 c10418 = this.f51962;
        c10418.m47160();
        c10418.f68373.clear();
    }

    @Override // l.AbstractC5498
    public final void onItemsMoved(C17492 c17492, int i, int i2, int i3) {
        C10418 c10418 = this.f51962;
        c10418.m47160();
        c10418.f68373.clear();
    }

    @Override // l.C13115, l.AbstractC5498
    public final C22432 generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C7595(-2, -1);
        }
        return new C7595(-1, -2);
    }

    @Override // l.AbstractC5498
    public final C22432 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C7595(context, attributeSet);
    }

    @Override // l.AbstractC5498
    public final C22432 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C7595 c7595;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c7595 = new C7595((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c7595 = new C7595(layoutParams);
        }
        c7595.f25143 = -1;
        c7595.f25144 = 0;
        return c7595;
    }

    @Override // l.AbstractC5498
    public final boolean checkLayoutParams(C22432 c22432) {
        return c22432 instanceof C7595;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m38057() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m38060(height - paddingTop);
    }

    @Override // l.AbstractC5498
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM15187;
        int iM15188;
        if (this.f51959 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iM15188 = AbstractC5498.m15187(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f51959;
            iM15187 = AbstractC5498.m15187(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iM15187 = AbstractC5498.m15187(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f51959;
            iM15188 = AbstractC5498.m15187(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM15187, iM15188);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m38060(int i) {
        int i2;
        int[] iArr = this.f51959;
        int i3 = this.f51957;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f51959 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38062(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.f51959;
            int i3 = this.f51957;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f51959;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // l.C13115
    public final void onAnchorReady(C21726 c21726, C16082 c16082, C11704 c11704, int i) {
        super.onAnchorReady(c21726, c16082, c11704, i);
        m38057();
        if (c16082.m38108() > 0 && !c16082.f52015) {
            boolean z = i == 1;
            int iM38058 = m38058(c11704.f39338, c21726, c16082);
            if (z) {
                while (iM38058 > 0) {
                    int i2 = c11704.f39338;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c11704.f39338 = i3;
                    iM38058 = m38058(i3, c21726, c16082);
                }
            } else {
                int iM38108 = c16082.m38108() - 1;
                int i4 = c11704.f39338;
                while (i4 < iM38108) {
                    int i5 = i4 + 1;
                    int iM38059 = m38058(i5, c21726, c16082);
                    if (iM38059 <= iM38058) {
                        break;
                    }
                    i4 = i5;
                    iM38058 = iM38059;
                }
                c11704.f39338 = i4;
            }
        }
        m38059();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m38059() {
        View[] viewArr = this.f51964;
        if (viewArr == null || viewArr.length != this.f51957) {
            this.f51964 = new View[this.f51957];
        }
    }

    @Override // l.C13115, l.AbstractC5498
    public final int scrollHorizontallyBy(int i, C21726 c21726, C16082 c16082) {
        m38057();
        m38059();
        return super.scrollHorizontallyBy(i, c21726, c16082);
    }

    @Override // l.C13115, l.AbstractC5498
    public final int scrollVerticallyBy(int i, C21726 c21726, C16082 c16082) {
        m38057();
        m38059();
        return super.scrollVerticallyBy(i, c21726, c16082);
    }

    @Override // l.C13115
    public final View findReferenceChild(C21726 c21726, C16082 c16082, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iM38108 = c16082.m38108();
        ensureLayoutState();
        int iMo36483 = this.mOrientationHelper.mo36483();
        int iMo36481 = this.mOrientationHelper.mo36481();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM38108 && m38058(position, c21726, c16082) == 0) {
                if (((C22432) childAt.getLayoutParams()).f73212.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo36473(childAt) < iMo36481 && this.mOrientationHelper.mo36475(childAt) >= iMo36483) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // l.C13115
    public final void collectPrefetchPositionsForLayoutState(C16082 c16082, C5353 c5353, InterfaceC11849 interfaceC11849) {
        int i;
        int i2 = this.f51957;
        for (int i3 = 0; i3 < this.f51957 && (i = c5353.f18493) >= 0 && i < c16082.m38108() && i2 > 0; i3++) {
            ((C8301) interfaceC11849).m21733(c5353.f18493, Math.max(0, c5353.f18494));
            this.f51962.getClass();
            i2--;
            c5353.f18493 += c5353.f18489;
        }
    }

    @Override // l.C13115
    public final void layoutChunk(C21726 c21726, C16082 c16082, C5353 c5353, C2530 c2530) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iMo36480;
        int i9;
        int i10;
        int paddingLeft;
        int iMo36481;
        int iM15188;
        int iM15189;
        boolean z;
        int i11;
        View viewM14852;
        int iMo36477 = this.mOrientationHelper.mo36477();
        boolean z2 = iMo36477 != 1073741824;
        int i12 = getChildCount() > 0 ? this.f51959[this.f51957] : 0;
        if (z2) {
            m38057();
        }
        boolean z3 = c5353.f18489 == 1;
        int iM38058 = this.f51957;
        if (!z3) {
            iM38058 = m38058(c5353.f18493, c21726, c16082) + m38056(c5353.f18493, c21726, c16082);
        }
        int i13 = 0;
        while (i13 < this.f51957 && (i11 = c5353.f18493) >= 0 && i11 < c16082.m38108() && iM38058 > 0) {
            int i14 = c5353.f18493;
            int iM38056 = m38056(i14, c21726, c16082);
            if (iM38056 > this.f51957) {
                throw new IllegalArgumentException(C12441.m30911(this.f51957, " spans.", C0589.m2791("Item at position ", i14, " requires ", " spans but GridLayoutManager has only ", iM38056)));
            }
            iM38058 -= iM38056;
            if (iM38058 < 0 || (viewM14852 = c5353.m14852(c21726)) == null) {
                break;
            }
            this.f51964[i13] = viewM14852;
            i13++;
        }
        if (i13 == 0) {
            c2530.f10037 = true;
            return;
        }
        if (z3) {
            i = 0;
            i2 = i13;
            i3 = 1;
        } else {
            i = i13 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i15 = 0;
        while (i != i2) {
            View view = this.f51964[i];
            C7595 c7595 = (C7595) view.getLayoutParams();
            int iM38057 = m38056(getPosition(view), c21726, c16082);
            c7595.f25144 = iM38057;
            c7595.f25143 = i15;
            i15 += iM38057;
            i += i3;
        }
        float f = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            View view2 = this.f51964[i17];
            if (c5353.f18496 != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f51963);
            m38055(view2, iMo36477, z);
            int iMo36482 = this.mOrientationHelper.mo36482(view2);
            if (iMo36482 > i16) {
                i16 = iMo36482;
            }
            float fMo36480 = (this.mOrientationHelper.mo36480(view2) * 1.0f) / ((C7595) view2.getLayoutParams()).f25144;
            if (fMo36480 > f) {
                f = fMo36480;
            }
        }
        if (z2) {
            m38060(Math.max(Math.round(f * this.f51957), i12));
            i16 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                View view3 = this.f51964[i18];
                m38055(view3, 1073741824, true);
                int iMo36483 = this.mOrientationHelper.mo36482(view3);
                if (iMo36483 > i16) {
                    i16 = iMo36483;
                }
            }
        }
        for (int i19 = 0; i19 < i13; i19++) {
            View view4 = this.f51964[i19];
            if (this.mOrientationHelper.mo36482(view4) != i16) {
                C7595 c7596 = (C7595) view4.getLayoutParams();
                Rect rect = c7596.f73213;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c7596).topMargin + ((ViewGroup.MarginLayoutParams) c7596).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c7596).leftMargin + ((ViewGroup.MarginLayoutParams) c7596).rightMargin;
                int iM38062 = m38062(c7596.f25143, c7596.f25144);
                if (this.mOrientation == 1) {
                    iM15189 = AbstractC5498.m15188(iM38062, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c7596).width, false);
                    iM15188 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iM15188 = AbstractC5498.m15188(iM38062, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c7596).height, false);
                    iM15189 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, iM15189, iM15188, (C22432) view4.getLayoutParams())) {
                    view4.measure(iM15189, iM15188);
                }
            }
        }
        c2530.f10035 = i16;
        if (this.mOrientation != 1) {
            if (c5353.f18485 == -1) {
                int i22 = c5353.f18487;
                int i23 = i22 - i16;
                i4 = i22;
                i5 = i23;
            } else {
                int i24 = c5353.f18487;
                i4 = i16 + i24;
                i5 = i24;
            }
            i6 = 0;
            i7 = 0;
        } else if (c5353.f18485 == -1) {
            i7 = c5353.f18487;
            i6 = i7 - i16;
            i5 = 0;
            i4 = 0;
        } else {
            i6 = c5353.f18487;
            i7 = i6 + i16;
            i4 = 0;
            i5 = 0;
        }
        int i25 = 0;
        while (i25 < i13) {
            View view5 = this.f51964[i25];
            C7595 c7597 = (C7595) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    iMo36481 = this.f51959[this.f51957 - c7597.f25143] + getPaddingLeft();
                    paddingLeft = iMo36481 - this.mOrientationHelper.mo36480(view5);
                } else {
                    paddingLeft = getPaddingLeft() + this.f51959[c7597.f25143];
                    iMo36481 = this.mOrientationHelper.mo36480(view5) + paddingLeft;
                }
                i9 = paddingLeft;
                iMo36480 = i7;
                i8 = i6;
                i10 = iMo36481;
            } else {
                int paddingTop = getPaddingTop() + this.f51959[c7597.f25143];
                i8 = paddingTop;
                iMo36480 = this.mOrientationHelper.mo36480(view5) + paddingTop;
                i9 = i5;
                i10 = i4;
            }
            layoutDecoratedWithMargins(view5, i9, i8, i10, iMo36480);
            if (c7597.f73212.isRemoved() || c7597.f73212.isUpdated()) {
                c2530.f10034 = true;
            }
            c2530.f10036 |= view5.hasFocusable();
            i25++;
            i7 = iMo36480;
            i6 = i8;
            i5 = i9;
            i4 = i10;
        }
        Arrays.fill(this.f51964, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38055(View view, int i, boolean z) {
        int iM15188;
        int iM15189;
        boolean zShouldMeasureChild;
        C7595 c7595 = (C7595) view.getLayoutParams();
        Rect rect = c7595.f73213;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c7595).topMargin + ((ViewGroup.MarginLayoutParams) c7595).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c7595).leftMargin + ((ViewGroup.MarginLayoutParams) c7595).rightMargin;
        int iM38062 = m38062(c7595.f25143, c7595.f25144);
        if (this.mOrientation == 1) {
            iM15189 = AbstractC5498.m15188(iM38062, i, i3, ((ViewGroup.MarginLayoutParams) c7595).width, false);
            iM15188 = AbstractC5498.m15188(this.mOrientationHelper.mo36471(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c7595).height, true);
        } else {
            int iM151810 = AbstractC5498.m15188(iM38062, i, i2, ((ViewGroup.MarginLayoutParams) c7595).height, false);
            int iM151811 = AbstractC5498.m15188(this.mOrientationHelper.mo36471(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c7595).width, true);
            iM15188 = iM151810;
            iM15189 = iM151811;
        }
        C22432 c22432 = (C22432) view.getLayoutParams();
        if (z) {
            zShouldMeasureChild = shouldReMeasureChild(view, iM15189, iM15188, c22432);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, iM15189, iM15188, c22432);
        }
        if (zShouldMeasureChild) {
            view.measure(iM15189, iM15188);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38061() {
        return this.f51957;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38063(int i) {
        if (i == this.f51957) {
            return;
        }
        this.f51961 = true;
        if (i < 1) {
            throw new IllegalArgumentException(C8479.m22141(i, "Span count should be at least 1. Provided "));
        }
        this.f51957 = i;
        this.f51962.m47160();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[PHI: r17 r18 r19
      0x00e8: PHI (r17v6 int) = (r17v5 int), (r17v5 int), (r17v7 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r18v2 int) = (r18v1 int), (r18v1 int), (r18v3 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r19v1 int) = (r19v0 int), (r19v0 int), (r19v2 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    @Override // l.C13115, l.AbstractC5498
    public final View onFocusSearchFailed(View view, int i, C21726 c21726, C16082 c16082) {
        int childCount;
        int childCount2;
        int i2;
        View view2;
        int i3;
        int i4;
        int i5;
        C21726 c21727 = c21726;
        C16082 c16083 = c16082;
        View viewFindContainingItemView = findContainingItemView(view);
        View view3 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        C7595 c7595 = (C7595) viewFindContainingItemView.getLayoutParams();
        int i6 = c7595.f25143;
        int i7 = c7595.f25144 + i6;
        if (super.onFocusSearchFailed(view, i, c21726, c16082) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            childCount2 = 0;
            i2 = 1;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int iM38054 = m38054(childCount2, c21727, c16083);
        int i8 = childCount2;
        int i9 = i2;
        int iMin = 0;
        int iMin2 = 0;
        int i10 = -1;
        int i11 = -1;
        View view4 = null;
        while (i8 != childCount) {
            int i12 = childCount;
            int iM38055 = m38054(i8, c21727, c16083);
            View childAt = getChildAt(i8);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iM38055 == iM38054) {
                C7595 c7596 = (C7595) childAt.getLayoutParams();
                int i13 = c7596.f25143;
                view2 = viewFindContainingItemView;
                int i14 = c7596.f25144 + i13;
                if (childAt.hasFocusable() && i13 == i6 && i14 == i7) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view3 == null) && (childAt.hasFocusable() || view4 != null)) {
                    i3 = iM38054;
                    int iMin3 = Math.min(i14, i7) - Math.max(i13, i6);
                    if (!childAt.hasFocusable()) {
                        if (view3 == null) {
                            i4 = iMin2;
                            i5 = i10;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                        if (z == (i13 > i11)) {
                                            if (childAt.hasFocusable()) {
                                                int i15 = c7596.f25143;
                                                iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                                i10 = i15;
                                                view3 = childAt;
                                            } else {
                                                i11 = c7596.f25143;
                                                iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                                view4 = childAt;
                                            }
                                        }
                                    }
                                } else if (childAt.hasFocusable()) {
                                    int i16 = c7596.f25143;
                                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                    i10 = i16;
                                    view3 = childAt;
                                } else {
                                    i11 = c7596.f25143;
                                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                    view4 = childAt;
                                }
                                i8 += i9;
                                childCount = i12;
                                c21727 = c21726;
                                c16083 = c16082;
                                viewFindContainingItemView = view2;
                                iM38054 = i3;
                            }
                        }
                        iMin2 = i4;
                        i10 = i5;
                        i8 += i9;
                        childCount = i12;
                        c21727 = c21726;
                        c16083 = c16082;
                        viewFindContainingItemView = view2;
                        iM38054 = i3;
                    } else if (iMin3 <= iMin2) {
                        if (iMin3 == iMin2) {
                            if (z == (i13 > i10)) {
                            }
                            iMin2 = i4;
                            i10 = i5;
                            i8 += i9;
                            childCount = i12;
                            c21727 = c21726;
                            c16083 = c16082;
                            viewFindContainingItemView = view2;
                            iM38054 = i3;
                        }
                    }
                } else {
                    i3 = iM38054;
                }
                i4 = iMin2;
                i5 = i10;
                if (childAt.hasFocusable()) {
                    int i17 = c7596.f25143;
                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                    i10 = i17;
                    view3 = childAt;
                } else {
                    i11 = c7596.f25143;
                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                    view4 = childAt;
                    iMin2 = i4;
                    i10 = i5;
                }
                i8 += i9;
                childCount = i12;
                c21727 = c21726;
                c16083 = c16082;
                viewFindContainingItemView = view2;
                iM38054 = i3;
            } else {
                if (view3 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                i3 = iM38054;
            }
            i4 = iMin2;
            i5 = i10;
            iMin2 = i4;
            i10 = i5;
            i8 += i9;
            childCount = i12;
            c21727 = c21726;
            c16083 = c16082;
            viewFindContainingItemView = view2;
            iM38054 = i3;
        }
        return view3 != null ? view3 : view4;
    }

    @Override // l.C13115, l.AbstractC5498
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f51961;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38054(int i, C21726 c21726, C16082 c16082) {
        boolean z = c16082.f52015;
        C10418 c10418 = this.f51962;
        if (z && (i = c21726.m48474(i)) == -1) {
            return 0;
        }
        int i2 = this.f51957;
        c10418.getClass();
        return AbstractC21000.m47159(i, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m38056(int i, C21726 c21726, C16082 c16082) {
        boolean z = c16082.f52015;
        C10418 c10418 = this.f51962;
        if (!z) {
            c10418.getClass();
            return 1;
        }
        int i2 = this.f51960.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c21726.m48474(i) == -1) {
            return 1;
        }
        c10418.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m38058(int i, C21726 c21726, C16082 c16082) {
        int i2;
        boolean z = c16082.f52015;
        C10418 c10418 = this.f51962;
        if (!z) {
            i2 = this.f51957;
            c10418.getClass();
        } else {
            int i3 = this.f51958.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i = c21726.m48474(i);
            if (i == -1) {
                return 0;
            }
            i2 = this.f51957;
            c10418.getClass();
        }
        return i % i2;
    }

    @Override // l.C13115, l.AbstractC5498
    public final void onLayoutChildren(C21726 c21726, C16082 c16082) {
        boolean z = c16082.f52015;
        SparseIntArray sparseIntArray = this.f51958;
        SparseIntArray sparseIntArray2 = this.f51960;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C7595 c7595 = (C7595) getChildAt(i).getLayoutParams();
                int layoutPosition = c7595.f73212.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c7595.f25144);
                sparseIntArray.put(layoutPosition, c7595.f25143);
            }
        }
        super.onLayoutChildren(c21726, c16082);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }
}
