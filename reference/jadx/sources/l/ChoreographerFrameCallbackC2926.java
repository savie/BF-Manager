package l;

import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.ۖ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC2926 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8892 f9585;

    public ChoreographerFrameCallbackC2926(C8892 c8892) {
        this.f9585 = c8892;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C7401 c7401 = this.f9585.f31156.f33018;
        c7401.m20313(SystemClock.uptimeMillis());
        if (c7401.f24381.size() > 0) {
            c7401.m20312().mo23783();
        }
    }
}
