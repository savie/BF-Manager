package l;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* JADX INFO: renamed from: l.֫ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1678 extends C22687 {
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    @Override // l.C22687
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C23307 c23307 = (C23307) view;
        if (c23307.isEnabled()) {
            int height = c23307.getHeight();
            Rect rect = new Rect();
            if (c23307.getMatrix().isIdentity() && c23307.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = Math.min(c23307.getScrollY() + ((height - c23307.getPaddingBottom()) - c23307.getPaddingTop()), c23307.m52435());
                if (iMin != c23307.getScrollY()) {
                    c23307.m52445(iMin);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = Math.max(c23307.getScrollY() - ((height - c23307.getPaddingBottom()) - c23307.getPaddingTop()), 0);
                if (iMax != c23307.getScrollY()) {
                    c23307.m52445(iMax);
                    return true;
                }
            } else if (i == 16908346) {
                iMin = Math.min(c23307.getScrollY() + ((height - c23307.getPaddingBottom()) - c23307.getPaddingTop()), c23307.m52435());
                if (iMin != c23307.getScrollY()) {
                    c23307.m52445(iMin);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        int iM52435;
        super.onInitializeAccessibilityNodeInfo(view, c19835);
        C23307 c23307 = (C23307) view;
        c19835.m45639((CharSequence) ScrollView.class.getName());
        if (!c23307.isEnabled() || (iM52435 = c23307.m52435()) <= 0) {
            return;
        }
        c19835.m45670(true);
        if (c23307.getScrollY() > 0) {
            c19835.m45641(C8451.f27637);
            c19835.m45641(C8451.f27626);
        }
        if (c23307.getScrollY() < iM52435) {
            c19835.m45641(C8451.f27633);
            c19835.m45641(C8451.f27632);
        }
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        C23307 c23307 = (C23307) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(c23307.m52435() > 0);
        accessibilityEvent.setScrollX(c23307.getScrollX());
        accessibilityEvent.setScrollY(c23307.getScrollY());
        accessibilityEvent.setMaxScrollX(c23307.getScrollX());
        accessibilityEvent.setMaxScrollY(c23307.m52435());
    }
}
