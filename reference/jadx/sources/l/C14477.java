package l;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.ܰ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14477 extends EdgeEffect {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f45570;

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14477(C24132 c24132, Context context) {
        super(context);
        this.f45570 = c24132;
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        canvas.drawColor(this.f45570.f78066.f45799);
        return false;
    }
}
