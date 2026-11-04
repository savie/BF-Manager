package l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9560 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f30948;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30949;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f30950;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f30951;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f30952;

    public C9560(C2849 c2849, ContextThemeWrapper contextThemeWrapper, int i) {
        this.f30950 = c2849;
        this.f30951 = contextThemeWrapper;
        this.f30949 = i;
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        this.f30952 = dimensionPixelSize;
        View viewM9363 = C2849.m9363(c2849, contextThemeWrapper, (MenuItem) null, i);
        viewM9363.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f30948 = viewM9363;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m24983(MenuItem menuItem, int i, View view) {
        C17359.requireNonNull(menuItem);
        int i2 = this.f30949;
        C2849 c2849 = this.f30950;
        if (view != null) {
            c2849.m9368(view, menuItem, i2, false);
        } else {
            view = C2849.m9363(c2849, this.f30951, menuItem, i2);
            int i3 = this.f30952;
            view.setPadding(i3, 0, i3, 0);
            view.setOnTouchListener(new ViewOnTouchListenerC13290(c2849));
        }
        view.setMinimumWidth(i);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24982(MenuItem menuItem) {
        C2849 c2849 = this.f30950;
        View view = this.f30948;
        c2849.m9368(view, menuItem, this.f30949, false);
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }
}
