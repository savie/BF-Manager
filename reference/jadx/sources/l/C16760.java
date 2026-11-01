package l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16760 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f53647;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f53648;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f53649;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f53650;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f53651;

    public C16760(C12527 c12527, ContextThemeWrapper contextThemeWrapper, int i) {
        this.f53649 = c12527;
        this.f53651 = contextThemeWrapper;
        this.f53650 = i;
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        this.f53647 = dimensionPixelSize;
        View viewM31092 = C12527.m31092(c12527, contextThemeWrapper, (MenuItem) null, i);
        viewM31092.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f53648 = viewM31092;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m39323(MenuItem menuItem, int i, View view) {
        C13638.requireNonNull(menuItem);
        int i2 = this.f53650;
        C12527 c12527 = this.f53649;
        if (view != null) {
            c12527.m31097(view, menuItem, i2, false);
        } else {
            view = C12527.m31092(c12527, this.f53651, menuItem, i2);
            int i3 = this.f53647;
            view.setPadding(i3, 0, i3, 0);
            view.setOnTouchListener(new ViewOnTouchListenerC13938(c12527));
        }
        view.setMinimumWidth(i);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39322(MenuItem menuItem) {
        C12527 c12527 = this.f53649;
        View view = this.f53648;
        c12527.m31097(view, menuItem, this.f53650, false);
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }
}
