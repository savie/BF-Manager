package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21112 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20407 f68776;

    public C21112(C20407 c20407) {
        this.f68776 = c20407;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C20407 c20407 = this.f68776;
        int width = c20407.getWidth();
        int height = c20407.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c20407.f66121) / 2.0f);
    }
}
