package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0650 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17584 f2765;

    public C0650(C17584 c17584) {
        this.f2765 = c17584;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C17584 c17584 = this.f2765;
        int width = c17584.getWidth();
        int height = c17584.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c17584.f55891) / 2.0f);
    }
}
