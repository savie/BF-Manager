package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.֫ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1639 extends C12025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f6564 = new Rect();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22246 f6565;

    public C1639(C22246 c22246) {
        this.f6565 = c22246;
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
        C22006 c22006M48821 = C22006.m48821(c22006);
        super.onInitializeAccessibilityNodeInfo(view, c22006M48821);
        Rect rect = this.f6564;
        c22006M48821.m48872(rect);
        c22006.m48831(rect);
        c22006.m48882(c22006M48821.m48860());
        c22006.m48833(c22006M48821.m48888());
        c22006.m48844(c22006M48821.m48861());
        c22006.m48874(c22006M48821.m48830());
        c22006.m48890(c22006M48821.m48892());
        c22006.m48834(c22006M48821.m48856());
        c22006.m48829(c22006M48821.m48879());
        c22006.m48867(c22006M48821.m48887());
        c22006.m48850(c22006M48821.m48868());
        c22006.m48886(c22006M48821.m48884());
        c22006.m48855(c22006M48821.m48881());
        c22006.m48838(c22006M48821.m48837());
        c22006.m48862(c22006M48821.m48851());
        c22006.m48844("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        c22006.m48832(view);
        int i = C5031.f17539;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            c22006.m48864((View) parentForAccessibility);
        }
        C22246 c22246 = this.f6565;
        int childCount = c22246.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c22246.getChildAt(i2);
            if (!c22246.m49394(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                c22006.m48842(childAt);
            }
        }
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override // l.C12025
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f6565.m49394(view)) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
