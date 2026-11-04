package l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.᩹ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23612 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Rect f76640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f76641;

    public RunnableC23612(AbstractC11284 abstractC11284, View view, Rect rect) {
        this.f76641 = view;
        this.f76640 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC11284.m28529(this.f76640, this.f76641);
    }
}
