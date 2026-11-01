package l;

import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.֫ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC1858 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9621 f7081;

    public ChoreographerFrameCallbackC1858(C9621 c9621) {
        this.f7081 = c9621;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C3269 c3269 = this.f7081.f47668.f37485;
        c3269.m9749(SystemClock.uptimeMillis());
        if (c3269.f12132.size() > 0) {
            c3269.m9748().mo24530();
        }
    }
}
