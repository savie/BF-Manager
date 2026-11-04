package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩺ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes.dex */
public final class C23986 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18018 f77626;

    public C23986(ViewOnTouchListenerC18018 viewOnTouchListenerC18018) {
        this.f77626 = viewOnTouchListenerC18018;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f77626;
        if (viewOnTouchListenerC18018.f58985 != null) {
            viewOnTouchListenerC18018.f58985.onLongClick(viewOnTouchListenerC18018.m42022());
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f77626;
        if (viewOnTouchListenerC18018.m42018() > 1.0f) {
            return false;
        }
        viewOnTouchListenerC18018.getClass();
        return false;
    }
}
