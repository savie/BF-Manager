package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2397 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13583 f7708;

    public C2397(C13583 c13583) {
        this.f7708 = c13583;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C13583 c13583 = this.f7708;
        int width = c13583.getWidth();
        int height = c13583.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c13583.f43142) / 2.0f);
    }
}
