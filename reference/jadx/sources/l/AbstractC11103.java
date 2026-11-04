package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۤ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11103 {
    public boolean getInsetDodgeRect(C25276 c25276, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(C25276 c25276, View view) {
        return -16777216;
    }

    public float getScrimOpacity(C25276 c25276, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(C25276 c25276, View view, View view2) {
        return false;
    }

    public C3977 onApplyWindowInsets(C25276 c25276, View view, C3977 c3977) {
        return c3977;
    }

    public void onAttachedToLayoutParams(C15578 c15578) {
    }

    public boolean onDependentViewChanged(C25276 c25276, View view, View view2) {
        return false;
    }

    public void onDependentViewRemoved(C25276 c25276, View view, View view2) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(C25276 c25276, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(C25276 c25276, View view, int i) {
        return false;
    }

    public boolean onMeasureChild(C25276 c25276, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(C25276 c25276, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(C25276 c25276, View view, View view2, float f, float f2) {
        return false;
    }

    @Deprecated
    public void onNestedPreScroll(C25276 c25276, View view, View view2, int i, int i2, int[] iArr) {
    }

    @Deprecated
    public void onNestedScroll(C25276 c25276, View view, View view2, int i, int i2, int i3, int i4) {
    }

    @Deprecated
    public void onNestedScrollAccepted(C25276 c25276, View view, View view2, View view3, int i) {
    }

    public boolean onRequestChildRectangleOnScreen(C25276 c25276, View view, Rect rect, boolean z) {
        return false;
    }

    public void onRestoreInstanceState(C25276 c25276, View view, Parcelable parcelable) {
    }

    @Deprecated
    public boolean onStartNestedScroll(C25276 c25276, View view, View view2, View view3, int i) {
        return false;
    }

    @Deprecated
    public void onStopNestedScroll(C25276 c25276, View view, View view2) {
    }

    public boolean onTouchEvent(C25276 c25276, View view, MotionEvent motionEvent) {
        return false;
    }

    public AbstractC11103() {
    }

    public AbstractC11103(Context context, AttributeSet attributeSet) {
    }

    public boolean blocksInteractionBelow(C25276 c25276, View view) {
        return getScrimOpacity(c25276, view) > 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28054(View view, Object obj) {
        ((C15578) view.getLayoutParams()).f50674 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m28053(View view) {
        return ((C15578) view.getLayoutParams()).f50674;
    }

    public boolean onStartNestedScroll(C25276 c25276, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(c25276, view, view2, view3, i);
        }
        return false;
    }

    public void onNestedScrollAccepted(C25276 c25276, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(c25276, view, view2, view3, i);
        }
    }

    public void onStopNestedScroll(C25276 c25276, View view, View view2, int i) {
        if (i == 0) {
            onStopNestedScroll(c25276, view, view2);
        }
    }

    @Deprecated
    public void onNestedScroll(C25276 c25276, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(c25276, view, view2, i, i2, i3, i4);
        }
    }

    public void onNestedScroll(C25276 c25276, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(c25276, view, view2, i, i2, i3, i4, i5);
    }

    public void onNestedPreScroll(C25276 c25276, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(c25276, view, view2, i, i2, iArr);
        }
    }

    public Parcelable onSaveInstanceState(C25276 c25276, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }
}
