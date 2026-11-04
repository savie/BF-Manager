package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩺ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes.dex */
public final class C24218 extends C22687 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f78469 = new Rect();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10045 f78470;

    public C24218(C10045 c10045) {
        this.f78470 = c10045;
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        C19835 c19835M45620 = C19835.m45620(c19835);
        super.onInitializeAccessibilityNodeInfo(view, c19835M45620);
        Rect rect = this.f78469;
        c19835M45620.m45680(rect);
        c19835.m45686(rect);
        c19835.m45629(c19835M45620.m45649());
        c19835.m45674(c19835M45620.m45663());
        c19835.m45639(c19835M45620.m45650());
        c19835.m45682(c19835M45620.m45685());
        c19835.m45661(c19835M45620.m45694());
        c19835.m45689(c19835M45620.m45657());
        c19835.m45647(c19835M45620.m45669());
        c19835.m45627(c19835M45620.m45671());
        c19835.m45645(c19835M45620.m45648());
        c19835.m45666(c19835M45620.m45676());
        c19835.m45693(c19835M45620.m45667());
        c19835.m45633(c19835M45620.m45632());
        c19835.m45651(c19835M45620.m45672());
        c19835.m45639("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        c19835.m45687(view);
        int i = C22666.f73603;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            c19835.m45653((View) parentForAccessibility);
        }
        C10045 c10045 = this.f78470;
        int childCount = c10045.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c10045.getChildAt(i2);
            if (!c10045.m25941(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                c19835.m45637(childAt);
            }
        }
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override // l.C22687
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f78470.m25941(view)) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
