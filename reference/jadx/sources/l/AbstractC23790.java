package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23790 {
    public boolean getInsetDodgeRect(C2746 c2746, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(C2746 c2746, View view) {
        return -16777216;
    }

    public float getScrimOpacity(C2746 c2746, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(C2746 c2746, View view, View view2) {
        return false;
    }

    public C15844 onApplyWindowInsets(C2746 c2746, View view, C15844 c15844) {
        return c15844;
    }

    public void onAttachedToLayoutParams(C9679 c9679) {
    }

    public boolean onDependentViewChanged(C2746 c2746, View view, View view2) {
        return false;
    }

    public void onDependentViewRemoved(C2746 c2746, View view, View view2) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(C2746 c2746, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(C2746 c2746, View view, int i) {
        return false;
    }

    public boolean onMeasureChild(C2746 c2746, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(C2746 c2746, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(C2746 c2746, View view, View view2, float f, float f2) {
        return false;
    }

    @Deprecated
    public void onNestedPreScroll(C2746 c2746, View view, View view2, int i, int i2, int[] iArr) {
    }

    @Deprecated
    public void onNestedScroll(C2746 c2746, View view, View view2, int i, int i2, int i3, int i4) {
    }

    @Deprecated
    public void onNestedScrollAccepted(C2746 c2746, View view, View view2, View view3, int i) {
    }

    public boolean onRequestChildRectangleOnScreen(C2746 c2746, View view, Rect rect, boolean z) {
        return false;
    }

    public void onRestoreInstanceState(C2746 c2746, View view, Parcelable parcelable) {
    }

    @Deprecated
    public boolean onStartNestedScroll(C2746 c2746, View view, View view2, View view3, int i) {
        return false;
    }

    @Deprecated
    public void onStopNestedScroll(C2746 c2746, View view, View view2) {
    }

    public boolean onTouchEvent(C2746 c2746, View view, MotionEvent motionEvent) {
        return false;
    }

    public AbstractC23790() {
    }

    public AbstractC23790(Context context, AttributeSet attributeSet) {
    }

    public boolean blocksInteractionBelow(C2746 c2746, View view) {
        return getScrimOpacity(c2746, view) > 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52325(View view, Object obj) {
        ((C9679) view.getLayoutParams()).f32641 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m52324(View view) {
        return ((C9679) view.getLayoutParams()).f32641;
    }

    public boolean onStartNestedScroll(C2746 c2746, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(c2746, view, view2, view3, i);
        }
        return false;
    }

    public void onNestedScrollAccepted(C2746 c2746, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(c2746, view, view2, view3, i);
        }
    }

    public void onStopNestedScroll(C2746 c2746, View view, View view2, int i) {
        if (i == 0) {
            onStopNestedScroll(c2746, view, view2);
        }
    }

    @Deprecated
    public void onNestedScroll(C2746 c2746, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(c2746, view, view2, i, i2, i3, i4);
        }
    }

    public void onNestedScroll(C2746 c2746, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(c2746, view, view2, i, i2, i3, i4, i5);
    }

    public void onNestedPreScroll(C2746 c2746, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(c2746, view, view2, i, i2, iArr);
        }
    }

    public Parcelable onSaveInstanceState(C2746 c2746, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }
}
