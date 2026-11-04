package l;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.۟ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8070 extends LinearLayout {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HandlerC0612 f26707;

    public C8070(Context context, HandlerC0612 handlerC0612) {
        super(context);
        this.f26707 = handlerC0612;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HandlerC0612 handlerC0612 = this.f26707;
        if (actionMasked == 7 || actionMasked == 9) {
            handlerC0612.m2735();
        } else if (actionMasked == 10) {
            handlerC0612.m2736();
        }
        return super.dispatchHoverEvent(motionEvent);
    }
}
