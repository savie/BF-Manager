package l;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* JADX INFO: renamed from: l.᩺ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes.dex */
public final class C22757 extends C12025 {
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    @Override // l.C12025
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C19229 c19229 = (C19229) view;
        if (c19229.isEnabled()) {
            int height = c19229.getHeight();
            Rect rect = new Rect();
            if (c19229.getMatrix().isIdentity() && c19229.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = Math.min(c19229.getScrollY() + ((height - c19229.getPaddingBottom()) - c19229.getPaddingTop()), c19229.m44175());
                if (iMin != c19229.getScrollY()) {
                    c19229.m44183(iMin);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = Math.max(c19229.getScrollY() - ((height - c19229.getPaddingBottom()) - c19229.getPaddingTop()), 0);
                if (iMax != c19229.getScrollY()) {
                    c19229.m44183(iMax);
                    return true;
                }
            } else if (i == 16908346) {
                iMin = Math.min(c19229.getScrollY() + ((height - c19229.getPaddingBottom()) - c19229.getPaddingTop()), c19229.m44175());
                if (iMin != c19229.getScrollY()) {
                    c19229.m44183(iMin);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
        int iM44175;
        super.onInitializeAccessibilityNodeInfo(view, c22006);
        C19229 c19229 = (C19229) view;
        c22006.m48844((CharSequence) ScrollView.class.getName());
        if (!c19229.isEnabled() || (iM44175 = c19229.m44175()) <= 0) {
            return;
        }
        c22006.m48878(true);
        if (c19229.getScrollY() > 0) {
            c22006.m48848(C9494.f32124);
            c22006.m48848(C9494.f32120);
        }
        if (c19229.getScrollY() < iM44175) {
            c22006.m48848(C9494.f32122);
            c22006.m48848(C9494.f32119);
        }
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        C19229 c19229 = (C19229) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(c19229.m44175() > 0);
        accessibilityEvent.setScrollX(c19229.getScrollX());
        accessibilityEvent.setScrollY(c19229.getScrollY());
        accessibilityEvent.setMaxScrollX(c19229.getScrollX());
        accessibilityEvent.setMaxScrollY(c19229.m44175());
    }
}
