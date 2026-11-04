package l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19198 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44469(C18452 c18452, String str, View view) {
        C0950.m3784(c18452.m42995(), str);
        C15009 c15009 = c18452.f60070;
        C20231.m46504(c15009);
        ListView listViewMo39127 = !c15009.m36151() ? null : c15009.m36147().mo39127();
        if (listViewMo39127 == null || m44472(listViewMo39127, view)) {
            return;
        }
        listViewMo39127.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0553(listViewMo39127, view));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m44472(ListView listView, View view) {
        if (listView.getFirstVisiblePosition() == 0) {
            View childAt = listView.getChildAt(0);
            View viewFindViewById = childAt == null ? null : childAt.findViewById(R.id.title);
            if (viewFindViewById != null) {
                ViewParent parent = viewFindViewById.getParent();
                if (parent instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) parent;
                    ViewParent parent2 = view.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    frameLayout.removeAllViews();
                    frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.setForeground(C0385.m2186(frameLayout.getContext(), bin.mt.plus.R.drawable.MT_Protector));
                    frameLayout.setForegroundGravity(87);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15009 m44467(C18452 c18452) {
        return c18452.f60070;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18452 m44468(AbstractActivityC17204 abstractActivityC17204, View view) {
        return new C8011(abstractActivityC17204, view, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44471(C18452 c18452) {
        try {
            AbstractC22469 abstractC22469M36147 = c18452.f60070.m36147();
            abstractC22469M36147.mo39127().setOnItemClickListener(new C3077(abstractC22469M36147));
        } catch (Exception unused) {
        }
    }
}
