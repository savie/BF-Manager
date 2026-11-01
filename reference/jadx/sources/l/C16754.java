package l;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C16754 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39316(final C17492 c17492) {
        ViewGroup viewGroup = (ViewGroup) c17492.getParent();
        final View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewGroup.findViewById(R.id.MT_Protector);
        if (Build.VERSION.SDK_INT >= 23) {
            C5031.m13995(c17492, 3, 3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        c17492.addOnScrollListener(new C7581(viewFindViewById, viewFindViewById2));
        c17492.post(new Runnable() { // from class: l.ۡܺ᩺
            @Override // java.lang.Runnable
            public final void run() {
                C16754.m39312((View) c17492, viewFindViewById, viewFindViewById2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39314(final ListView listView) {
        ViewGroup viewGroup = (ViewGroup) listView.getParent();
        final View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewGroup.findViewById(R.id.MT_Protector);
        if (Build.VERSION.SDK_INT >= 23) {
            C5031.m13995(listView, 3, 3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        listView.setOnScrollListener(new C20987(viewFindViewById, viewFindViewById2));
        listView.post(new Runnable() { // from class: l.ۤܺ᩺
            @Override // java.lang.Runnable
            public final void run() {
                C16754.m39312((View) listView, viewFindViewById, viewFindViewById2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39312(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
