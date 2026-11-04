package l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.ܽᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17765 extends ArrayAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f58339;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17765(C2849 c2849, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.f58339 = c2849;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C2849 c2849 = this.f58339;
        return c2849.f9382.m24983((MenuItem) getItem(i), c2849.f9384.getWidth(), view);
    }
}
