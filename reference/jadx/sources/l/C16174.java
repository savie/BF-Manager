package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16174 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20407 f52250;

    public C16174(C20407 c20407) {
        this.f52250 = c20407;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C20407 c20407 = this.f52250;
        outline.setRoundRect(0, 0, c20407.getWidth(), c20407.getHeight(), c20407.f66114);
    }
}
