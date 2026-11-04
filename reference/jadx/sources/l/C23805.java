package l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩹᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E5ZZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23805 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3667 f77109;

    public C23805(C3667 c3667) {
        this.f77109 = c3667;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = C3667.f12586;
        Rect rect = new Rect();
        this.f77109.f12592.roundOut(rect);
        outline.setRoundRect(rect, rect.width() / 2.0f);
    }
}
