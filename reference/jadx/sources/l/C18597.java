package l;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C18597 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43181(C25227 c25227) {
        ViewGroup viewGroup = (ViewGroup) c25227.getParent();
        View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = viewGroup.findViewById(R.id.MT_Protector);
        if (Build.VERSION.SDK_INT >= 23) {
            C22666.m51101(c25227, 3, 3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        c25227.addOnScrollListener(new C6665(viewFindViewById, viewFindViewById2));
        c25227.post(new RunnableC20835(c25227, viewFindViewById, viewFindViewById2, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43179(final ListView listView) {
        ViewGroup viewGroup = (ViewGroup) listView.getParent();
        final View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewGroup.findViewById(R.id.MT_Protector);
        if (Build.VERSION.SDK_INT >= 23) {
            C22666.m51101(listView, 3, 3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        listView.setOnScrollListener(new C24565(viewFindViewById, viewFindViewById2));
        listView.post(new Runnable() { // from class: l.ۨ᩷ܺ
            @Override // java.lang.Runnable
            public final void run() {
                C18597.m43177((View) listView, viewFindViewById, viewFindViewById2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43177(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
