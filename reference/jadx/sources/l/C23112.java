package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩺ܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes.dex */
public final class C23112 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18878 f75072;

    public C23112(ViewOnTouchListenerC18878 viewOnTouchListenerC18878) {
        this.f75072 = viewOnTouchListenerC18878;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f75072;
        if (viewOnTouchListenerC18878.f61133 != null) {
            viewOnTouchListenerC18878.f61133.onLongClick(viewOnTouchListenerC18878.m43539());
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f75072;
        if (viewOnTouchListenerC18878.m43538() > 1.0f) {
            return false;
        }
        viewOnTouchListenerC18878.getClass();
        return false;
    }
}
