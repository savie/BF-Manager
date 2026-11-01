package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ۚۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5112 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m14258(C22046 c22046, float f, float f2) {
        View viewM14257 = m14257((ViewGroup) c22046, f, f2);
        if (viewM14257 == null) {
            return false;
        }
        if (viewM14257 instanceof C6606) {
            if (((C6606) viewM14257).f22252) {
                return true;
            }
        } else if ((viewM14257 instanceof C21423) && ((C21423) viewM14257).m47985()) {
            return true;
        }
        return viewM14257.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m14257(ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getLeft() <= f && f <= childAt.getRight() && childAt.getTop() <= f2 && f2 <= childAt.getBottom()) {
                if (!(childAt instanceof ViewGroup) || (childAt instanceof C17492) || (childAt instanceof ListView)) {
                    return childAt;
                }
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                return m14257(viewGroup2, (f - viewGroup2.getLeft()) + viewGroup2.getScrollX(), (f2 - viewGroup2.getTop()) + viewGroup2.getScrollY());
            }
        }
        return null;
    }
}
