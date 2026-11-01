package l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩺֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22635 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10614 f73752;

    public C22635(Context context, C17695 c17695) {
        C10614 c10614 = new C10614(context, new C3583(c17695));
        this.f73752 = c10614;
        c10614.m26792(new GestureDetectorOnDoubleTapListenerC6406(c17695));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50176(MotionEvent motionEvent) {
        this.f73752.m26793(motionEvent);
    }
}
