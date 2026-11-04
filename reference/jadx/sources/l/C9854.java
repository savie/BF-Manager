package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9854 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9108 f31713;

    public C9854(C9108 c9108) {
        this.f31713 = c9108;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C9108 c9108 = this.f31713;
        int width = c9108.getWidth();
        int height = c9108.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c9108.f29582) / 2.0f);
    }
}
