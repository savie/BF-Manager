package l;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.᩻᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class C24021 extends EdgeEffect {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f77829;

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24021(C6111 c6111, Context context) {
        super(context);
        this.f77829 = c6111;
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        canvas.drawColor(this.f77829.f20794.f6403);
        return false;
    }
}
