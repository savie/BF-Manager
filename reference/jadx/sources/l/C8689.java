package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/* JADX INFO: renamed from: l.۠ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8689 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m23381(C7198 c7198, float f, float f2) {
        View viewM23380 = m23380((ViewGroup) c7198, f, f2);
        if (viewM23380 == null) {
            return false;
        }
        if (viewM23380 instanceof C19987) {
            if (((C19987) viewM23380).f64243) {
                return true;
            }
        } else if ((viewM23380 instanceof C5817) && ((C5817) viewM23380).m16971()) {
            return true;
        }
        return viewM23380.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m23380(ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getLeft() <= f && f <= childAt.getRight() && childAt.getTop() <= f2 && f2 <= childAt.getBottom()) {
                if (!(childAt instanceof ViewGroup) || (childAt instanceof C25227) || (childAt instanceof ListView)) {
                    return childAt;
                }
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                return m23380(viewGroup2, (f - viewGroup2.getLeft()) + viewGroup2.getScrollX(), (f2 - viewGroup2.getTop()) + viewGroup2.getScrollY());
            }
        }
        return null;
    }
}
