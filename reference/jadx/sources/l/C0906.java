package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0906 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9108 f3395;

    public C0906(C9108 c9108) {
        this.f3395 = c9108;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C9108 c9108 = this.f3395;
        outline.setRoundRect(0, 0, c9108.getWidth(), c9108.getHeight(), c9108.f29579);
    }
}
