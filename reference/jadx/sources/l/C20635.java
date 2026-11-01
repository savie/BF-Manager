package l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩷ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E5ZZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20635 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15697 f67194;

    public C20635(C15697 c15697) {
        this.f67194 = c15697;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = C15697.f50955;
        Rect rect = new Rect();
        this.f67194.f50966.roundOut(rect);
        outline.setRoundRect(rect, rect.width() / 2.0f);
    }
}
