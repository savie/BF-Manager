package l;

import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: l.ܶܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15349 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f50023;

    public ViewOnClickListenerC15349(C12527 c12527) {
        this.f50023 = c12527;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem menuItem;
        C12527 c12527 = this.f50023;
        if (c12527.f41900 == null) {
            return;
        }
        Object tag = view.getTag();
        if ((tag instanceof C20288) && (menuItem = (MenuItem) c12527.f41938.get((C20288) tag)) != null) {
            ((MenuItemOnMenuItemClickListenerC10640) c12527.f41900).onMenuItemClick(menuItem);
        }
    }
}
