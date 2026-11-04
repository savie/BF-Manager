package l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.۫ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnTouchListenerC13290 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f42443;

    public /* synthetic */ ViewOnTouchListenerC13290(C2849 c2849) {
        this.f42443 = c2849;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2849.m9371(this.f42443, motionEvent);
        return false;
    }
}
