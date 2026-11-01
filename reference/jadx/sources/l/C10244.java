package l;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۤۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10244 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7421 f34941;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f34942 = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioTrack.StreamEventCallback f34940 = new C8833(this);

    public C10244(C7421 c7421) {
        this.f34941 = c7421;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26040(AudioTrack audioTrack) {
        Handler handler = this.f34942;
        C13638.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC19416(handler), this.f34940);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26041(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f34940);
        this.f34942.removeCallbacksAndMessages(null);
    }
}
