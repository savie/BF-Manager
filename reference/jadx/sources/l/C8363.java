package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8363 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13583 f27428;

    public C8363(C13583 c13583) {
        this.f27428 = c13583;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C13583 c13583 = this.f27428;
        outline.setRoundRect(0, 0, c13583.getWidth(), c13583.getHeight(), c13583.f43139);
    }
}
