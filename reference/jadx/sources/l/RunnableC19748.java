package l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.᩵᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19748 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Rect f63454;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f63455;

    public RunnableC19748(AbstractC14975 abstractC14975, View view, Rect rect) {
        this.f63455 = view;
        this.f63454 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC14975.m35951(this.f63454, this.f63455);
    }
}
