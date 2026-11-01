package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.᩸ۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21312 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f69340;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f69341;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C10917 f69342;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Rect f69343;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f69344;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17492 f69345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16561 f69346;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f69347;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12328 f69348;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Rect f69349;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Parcelable f69350;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0850 f69351;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16561 f69352;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13115 f69353;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69354;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18759 f69355;

    public C21312(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69349 = new Rect();
        this.f69343 = new Rect();
        this.f69352 = new C16561();
        this.f69340 = false;
        new C23617(this);
        this.f69341 = -1;
        this.f69347 = true;
        this.f69344 = -1;
        m47794(context, attributeSet);
    }

    public C21312(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69349 = new Rect();
        this.f69343 = new Rect();
        this.f69352 = new C16561();
        this.f69340 = false;
        new C23617(this);
        this.f69341 = -1;
        this.f69347 = true;
        this.f69344 = -1;
        m47794(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47794(Context context, AttributeSet attributeSet) {
        this.f69351 = new C0850(this);
        C3672 c3672 = new C3672(this, context);
        this.f69345 = c3672;
        int i = C5031.f17539;
        c3672.setId(View.generateViewId());
        this.f69345.setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        C13552 c13552 = new C13552(this, context);
        this.f69353 = c13552;
        this.f69345.setLayoutManager(c13552);
        this.f69345.setScrollingTouchSlop(1);
        int[] iArr = C8800.f30279;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C5031.m13983(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            this.f69353.setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            this.f69351.m3462();
            typedArrayObtainStyledAttributes.recycle();
            this.f69345.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f69345.addOnChildAttachStateChangeListener(new C9506());
            this.f69342 = new C10917(this);
            this.f69348 = new C12328();
            C12846 c12846 = new C12846(this);
            this.f69355 = c12846;
            c12846.attachToRecyclerView(this.f69345);
            this.f69345.addOnScrollListener(this.f69342);
            C16561 c16561 = new C16561();
            this.f69346 = c16561;
            this.f69342.m27370(c16561);
            C14445 c14445 = new C14445(this);
            C1743 c1743 = new C1743(this);
            this.f69346.m38977(c14445);
            this.f69346.m38977(c1743);
            C0850 c0850 = this.f69351;
            C17492 c17492 = this.f69345;
            c0850.getClass();
            c17492.setImportantForAccessibility(2);
            new C22018(c0850);
            C21312 c21312 = c0850.f3495;
            if (c21312.getImportantForAccessibility() == 0) {
                c21312.setImportantForAccessibility(1);
            }
            this.f69346.m38977(this.f69352);
            this.f69346.m38977(new C17266());
            C17492 c17493 = this.f69345;
            attachViewToParent(c17493, 0, c17493.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f69351.getClass();
        this.f69351.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C22724 c22724 = new C22724(super.onSaveInstanceState());
        c22724.f74032 = this.f69345.getId();
        int i = this.f69341;
        if (i == -1) {
            i = this.f69354;
        }
        c22724.f74034 = i;
        Parcelable parcelable = this.f69350;
        if (parcelable != null) {
            c22724.f74033 = parcelable;
            return c22724;
        }
        Object adapter = this.f69345.getAdapter();
        if (adapter instanceof InterfaceC15856) {
            c22724.f74033 = ((InterfaceC15856) adapter).m37744();
        }
        return c22724;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C22724)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22724 c22724 = (C22724) parcelable;
        super.onRestoreInstanceState(c22724.getSuperState());
        this.f69341 = c22724.f74034;
        this.f69350 = c22724.f74033;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        AbstractC0414 adapter;
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C22724) {
            int i = ((C22724) parcelable).f74032;
            sparseArray.put(this.f69345.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        if (this.f69341 == -1 || (adapter = this.f69345.getAdapter()) == 0) {
            return;
        }
        if (this.f69350 != null) {
            if (adapter instanceof InterfaceC15856) {
                ((InterfaceC15856) adapter).m37745();
            }
            this.f69350 = null;
        }
        int iMax = Math.max(0, Math.min(this.f69341, adapter.getItemCount() - 1));
        this.f69354 = iMax;
        this.f69341 = -1;
        this.f69345.scrollToPosition(iMax);
        this.f69351.m3462();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0414 m47797() {
        return this.f69345.getAdapter();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47803(int i, boolean z) {
        AbstractC0414 adapter = this.f69345.getAdapter();
        if (adapter == null) {
            if (this.f69341 != -1) {
                this.f69341 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f69354 && this.f69342.m27371()) {
            return;
        }
        int i2 = this.f69354;
        if (iMin == i2 && z) {
            return;
        }
        double dM27368 = i2;
        this.f69354 = iMin;
        this.f69351.m3462();
        if (!this.f69342.m27371()) {
            dM27368 = this.f69342.m27368();
        }
        this.f69342.m27369(iMin, z);
        if (!z) {
            this.f69345.scrollToPosition(iMin);
            return;
        }
        double d = iMin;
        if (Math.abs(d - dM27368) > 3.0d) {
            this.f69345.scrollToPosition(d > dM27368 ? iMin - 3 : iMin + 3);
            C17492 c17492 = this.f69345;
            c17492.post(new RunnableC14963(c17492, iMin));
            return;
        }
        this.f69345.smoothScrollToPosition(iMin);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f69345, i, i2);
        int measuredWidth = this.f69345.getMeasuredWidth();
        int measuredHeight = this.f69345.getMeasuredHeight();
        int measuredState = this.f69345.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f69345.getMeasuredWidth();
        int measuredHeight = this.f69345.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f69349;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f69343;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f69345.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f69340) {
            m47795();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m47795() {
        C18759 c18759 = this.f69355;
        if (c18759 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = c18759.findSnapView(this.f69353);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f69353.getPosition(viewFindSnapView);
        if (position != this.f69354 && this.f69342.m27372() == 0) {
            this.f69346.onPageSelected(position);
        }
        this.f69340 = false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m47796() {
        return this.f69353.getOrientation() == 1 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47802() {
        return this.f69354;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47798(int i, boolean z) {
        this.f69348.getClass();
        m47803(i, z);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m47800() {
        this.f69348.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m47805() {
        return this.f69347;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m47801() {
        return this.f69344;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f69345.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f69345.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47799(AbstractC11435 abstractC11435) {
        this.f69352.m38977(abstractC11435);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47804(AbstractC11435 abstractC11435) {
        this.f69352.m38978(abstractC11435);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f69351.m3462();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0850 c0850 = this.f69351;
        C22006 c22006M48820 = C22006.m48820(accessibilityNodeInfo);
        C21312 c21312 = c0850.f3495;
        if (c21312.f69345.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (c21312.m47796() == 1) {
            itemCount = c21312.f69345.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = c21312.f69345.getAdapter().getItemCount();
            itemCount = 1;
        }
        c22006M48820.m48849(C11423.m28533(itemCount, itemCount2, 0, false));
        AbstractC0414 adapter = c21312.f69345.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !c21312.f69347) {
            return;
        }
        if (c21312.f69354 > 0) {
            c22006M48820.m48838(8192);
        }
        if (c21312.f69354 < itemCount3 - 1) {
            c22006M48820.m48838(4096);
        }
        c22006M48820.m48878(true);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f69351.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C21312 c21312 = this.f69351.f3495;
        if (i == 8192 || i == 4096) {
            int i2 = i == 8192 ? c21312.f69354 - 1 : c21312.f69354 + 1;
            if (c21312.m47805()) {
                c21312.m47803(i2, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }
}
