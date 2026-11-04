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

/* JADX INFO: renamed from: l.ۜۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6976 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C24877 f23013;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C24877 f23014;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Parcelable f23015;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Rect f23016;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C25227 f23017;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16671 f23018;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f23019;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8271 f23020;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f23021;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f23022;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23385 f23023;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18909 f23024;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f23025;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0067 f23026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23027;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f23028;

    public C6976(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23028 = new Rect();
        this.f23016 = new Rect();
        this.f23013 = new C24877();
        this.f23025 = false;
        new C3247(this);
        this.f23019 = -1;
        this.f23022 = true;
        this.f23021 = -1;
        m19279(context, attributeSet);
    }

    public C6976(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23028 = new Rect();
        this.f23016 = new Rect();
        this.f23013 = new C24877();
        this.f23025 = false;
        new C3247(this);
        this.f23019 = -1;
        this.f23022 = true;
        this.f23021 = -1;
        m19279(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19279(Context context, AttributeSet attributeSet) {
        this.f23024 = new C18909(this);
        C1010 c1010 = new C1010(this, context);
        this.f23017 = c1010;
        int i = C22666.f73603;
        c1010.setId(View.generateViewId());
        this.f23017.setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        C14433 c14433 = new C14433(this, context);
        this.f23026 = c14433;
        this.f23017.setLayoutManager(c14433);
        this.f23017.setScrollingTouchSlop(1);
        int[] iArr = C12942.f41496;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C22666.m51088(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            this.f23026.setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            this.f23024.m43893();
            typedArrayObtainStyledAttributes.recycle();
            this.f23017.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f23017.addOnChildAttachStateChangeListener(new C6231());
            this.f23023 = new C23385(this);
            this.f23018 = new C16671();
            C9958 c9958 = new C9958(this);
            this.f23020 = c9958;
            c9958.attachToRecyclerView(this.f23017);
            this.f23017.addOnScrollListener(this.f23023);
            C24877 c24877 = new C24877();
            this.f23014 = c24877;
            this.f23023.m52558(c24877);
            C20401 c20401 = new C20401(this);
            C12196 c12196 = new C12196(this);
            this.f23014.m55406(c20401);
            this.f23014.m55406(c12196);
            C18909 c18909 = this.f23024;
            C25227 c25227 = this.f23017;
            c18909.getClass();
            c25227.setImportantForAccessibility(2);
            new C7722(c18909);
            C6976 c6976 = c18909.f61358;
            if (c6976.getImportantForAccessibility() == 0) {
                c6976.setImportantForAccessibility(1);
            }
            this.f23014.m55406(this.f23013);
            this.f23014.m55406(new C17417());
            C25227 c25228 = this.f23017;
            attachViewToParent(c25228, 0, c25228.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f23024.getClass();
        this.f23024.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2501 c2501 = new C2501(super.onSaveInstanceState());
        c2501.f8009 = this.f23017.getId();
        int i = this.f23019;
        if (i == -1) {
            i = this.f23027;
        }
        c2501.f8010 = i;
        Parcelable parcelable = this.f23015;
        if (parcelable != null) {
            c2501.f8008 = parcelable;
            return c2501;
        }
        Object adapter = this.f23017.getAdapter();
        if (adapter instanceof InterfaceC5485) {
            c2501.f8008 = ((InterfaceC5485) adapter).m16313();
        }
        return c2501;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2501)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2501 c2501 = (C2501) parcelable;
        super.onRestoreInstanceState(c2501.getSuperState());
        this.f23019 = c2501.f8010;
        this.f23015 = c2501.f8008;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        AbstractC12964 adapter;
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C2501) {
            int i = ((C2501) parcelable).f8009;
            sparseArray.put(this.f23017.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        if (this.f23019 == -1 || (adapter = this.f23017.getAdapter()) == 0) {
            return;
        }
        if (this.f23015 != null) {
            if (adapter instanceof InterfaceC5485) {
                ((InterfaceC5485) adapter).m16314();
            }
            this.f23015 = null;
        }
        int iMax = Math.max(0, Math.min(this.f23019, adapter.getItemCount() - 1));
        this.f23027 = iMax;
        this.f23019 = -1;
        this.f23017.scrollToPosition(iMax);
        this.f23024.m43893();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12964 m19280() {
        return this.f23017.getAdapter();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19288(int i, boolean z) {
        AbstractC12964 adapter = this.f23017.getAdapter();
        if (adapter == null) {
            if (this.f23019 != -1) {
                this.f23019 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f23027 && this.f23023.m52559()) {
            return;
        }
        int i2 = this.f23027;
        if (iMin == i2 && z) {
            return;
        }
        double dM52556 = i2;
        this.f23027 = iMin;
        this.f23024.m43893();
        if (!this.f23023.m52559()) {
            dM52556 = this.f23023.m52556();
        }
        this.f23023.m52557(iMin, z);
        if (!z) {
            this.f23017.scrollToPosition(iMin);
            return;
        }
        double d = iMin;
        if (Math.abs(d - dM52556) > 3.0d) {
            this.f23017.scrollToPosition(d > dM52556 ? iMin - 3 : iMin + 3);
            C25227 c25227 = this.f23017;
            c25227.post(new RunnableC8467(c25227, iMin));
            return;
        }
        this.f23017.smoothScrollToPosition(iMin);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f23017, i, i2);
        int measuredWidth = this.f23017.getMeasuredWidth();
        int measuredHeight = this.f23017.getMeasuredHeight();
        int measuredState = this.f23017.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f23017.getMeasuredWidth();
        int measuredHeight = this.f23017.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f23028;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f23016;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f23017.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f23025) {
            m19284();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m19284() {
        C8271 c8271 = this.f23020;
        if (c8271 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = c8271.findSnapView(this.f23026);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f23026.getPosition(viewFindSnapView);
        if (position != this.f23027 && this.f23023.m52560() == 0) {
            this.f23014.onPageSelected(position);
        }
        this.f23025 = false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m19290() {
        return this.f23026.getOrientation() == 1 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m19287() {
        return this.f23027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19281(int i, boolean z) {
        this.f23018.getClass();
        m19288(i, z);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m19286() {
        this.f23018.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m19285() {
        return this.f23022;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m19283() {
        return this.f23021;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f23017.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f23017.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19282(AbstractC21147 abstractC21147) {
        this.f23013.m55406(abstractC21147);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19289(AbstractC21147 abstractC21147) {
        this.f23013.m55407(abstractC21147);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f23024.m43893();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C18909 c18909 = this.f23024;
        C19835 c19835M45619 = C19835.m45619(accessibilityNodeInfo);
        C6976 c6976 = c18909.f61358;
        if (c6976.f23017.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (c6976.m19290() == 1) {
            itemCount = c6976.f23017.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = c6976.f23017.getAdapter().getItemCount();
            itemCount = 1;
        }
        c19835M45619.m45643(C22073.m49904(itemCount, itemCount2, 0, false));
        AbstractC12964 adapter = c6976.f23017.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !c6976.f23022) {
            return;
        }
        if (c6976.f23027 > 0) {
            c19835M45619.m45633(8192);
        }
        if (c6976.f23027 < itemCount3 - 1) {
            c19835M45619.m45633(4096);
        }
        c19835M45619.m45670(true);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f23024.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C6976 c6976 = this.f23024.f61358;
        if (i == 8192 || i == 4096) {
            int i2 = i == 8192 ? c6976.f23027 - 1 : c6976.f23027 + 1;
            if (c6976.m19285()) {
                c6976.m19288(i2, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }
}
