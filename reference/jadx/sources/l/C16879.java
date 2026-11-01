package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16879 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17584 f53981;

    public C16879(C17584 c17584) {
        this.f53981 = c17584;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C17584 c17584 = this.f53981;
        outline.setRoundRect(0, 0, c17584.getWidth(), c17584.getHeight(), c17584.f55884);
    }
}
