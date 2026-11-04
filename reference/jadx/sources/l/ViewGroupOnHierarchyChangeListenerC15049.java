package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܳۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6J6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewGroupOnHierarchyChangeListenerC15049 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f49112;

    public ViewGroupOnHierarchyChangeListenerC15049(C1626 c1626) {
        this.f49112 = c1626;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        boolean z = view2 instanceof C23255;
        C1626 c1626 = this.f49112;
        if (z) {
            C1626.m5729(c1626, (C23255) view2);
        }
        if (c1626.f5626 != null) {
            c1626.f5626.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        C1626 c1626 = this.f49112;
        if (view2 == c1626.f5607) {
            C1626.m5741(c1626);
        }
        if (c1626.f5626 != null) {
            c1626.f5626.onChildViewRemoved(view, view2);
        }
    }
}
