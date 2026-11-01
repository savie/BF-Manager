package l;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۡܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8915 extends C12025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f30576 = new Rect();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17381 f30577;

    public C8915(C17381 c17381) {
        this.f30577 = c17381;
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
        if (C17381.f55280) {
            super.onInitializeAccessibilityNodeInfo(view, c22006);
        } else {
            C22006 c22006M48821 = C22006.m48821(c22006);
            super.onInitializeAccessibilityNodeInfo(view, c22006M48821);
            c22006.m48832(view);
            int i = C5031.f17539;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                c22006.m48864((View) parentForAccessibility);
            }
            Rect rect = this.f30576;
            c22006M48821.m48872(rect);
            c22006.m48831(rect);
            c22006.m48882(c22006M48821.m48860());
            c22006.m48833(c22006M48821.m48888());
            c22006.m48844(c22006M48821.m48861());
            c22006.m48874(c22006M48821.m48830());
            c22006.m48890(c22006M48821.m48892());
            c22006.m48867(c22006M48821.m48887());
            c22006.m48850(c22006M48821.m48868());
            c22006.m48886(c22006M48821.m48884());
            c22006.m48838(c22006M48821.m48837());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (C17381.m40467(childAt)) {
                    c22006.m48842(childAt);
                }
            }
        }
        c22006.m48844("androidx.drawerlayout.widget.DrawerLayout");
        c22006.m48829(false);
        c22006.m48867(false);
        c22006.m48876(C9494.f32117);
        c22006.m48876(C9494.f32116);
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // l.C12025
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            C17381 c17381 = this.f30577;
            View viewM40490 = c17381.m40490();
            if (viewM40490 == null) {
                return true;
            }
            int iM40489 = c17381.m40489(viewM40490);
            c17381.getClass();
            int i = C5031.f17539;
            Gravity.getAbsoluteGravity(iM40489, c17381.getLayoutDirection());
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C12025
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (C17381.f55280 || C17381.m40467(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
