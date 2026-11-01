package l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.۬ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13232 extends ArrayAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f43987;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13232(C12527 c12527, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.f43987 = c12527;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C12527 c12527 = this.f43987;
        return c12527.f41903.m39323((MenuItem) getItem(i), c12527.f41929.getWidth(), view);
    }
}
