package l;

import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20749 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f66495;

    public ViewOnClickListenerC20749(C2849 c2849) {
        this.f66495 = c2849;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem menuItem;
        C2849 c2849 = this.f66495;
        if (c2849.f9370 == null) {
            return;
        }
        Object tag = view.getTag();
        if ((tag instanceof C10306) && (menuItem = (MenuItem) c2849.f9404.get((C10306) tag)) != null) {
            c2849.f9370.onMenuItemClick(menuItem);
        }
    }
}
