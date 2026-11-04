package l;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩵᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20826 extends C22687 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f66695 = new Rect();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8147 f66696;

    public C20826(C8147 c8147) {
        this.f66696 = c8147;
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        if (C8147.f26863) {
            super.onInitializeAccessibilityNodeInfo(view, c19835);
        } else {
            C19835 c19835M45620 = C19835.m45620(c19835);
            super.onInitializeAccessibilityNodeInfo(view, c19835M45620);
            c19835.m45687(view);
            int i = C22666.f73603;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                c19835.m45653((View) parentForAccessibility);
            }
            Rect rect = this.f66695;
            c19835M45620.m45680(rect);
            c19835.m45686(rect);
            c19835.m45629(c19835M45620.m45649());
            c19835.m45674(c19835M45620.m45663());
            c19835.m45639(c19835M45620.m45650());
            c19835.m45682(c19835M45620.m45685());
            c19835.m45661(c19835M45620.m45694());
            c19835.m45627(c19835M45620.m45671());
            c19835.m45645(c19835M45620.m45648());
            c19835.m45666(c19835M45620.m45676());
            c19835.m45633(c19835M45620.m45632());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (C8147.m22033(childAt)) {
                    c19835.m45637(childAt);
                }
            }
        }
        c19835.m45639("androidx.drawerlayout.widget.DrawerLayout");
        c19835.m45647(false);
        c19835.m45627(false);
        c19835.m45683(C8451.f27628);
        c19835.m45683(C8451.f27634);
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // l.C22687
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            C8147 c8147 = this.f66696;
            View viewM22052 = c8147.m22052();
            if (viewM22052 == null) {
                return true;
            }
            int iM22051 = c8147.m22051(viewM22052);
            c8147.getClass();
            int i = C22666.f73603;
            Gravity.getAbsoluteGravity(iM22051, c8147.getLayoutDirection());
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C22687
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (C8147.f26863 || C8147.m22033(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
