package l;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ᩴ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19467 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14991 f62896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Handler f62897 = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioTrack.StreamEventCallback f62895 = new C22451(this);

    public C19467(C14991 c14991) {
        this.f62896 = c14991;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45010(AudioTrack audioTrack) {
        Handler handler = this.f62897;
        C17359.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC21243(handler), this.f62895);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45011(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f62895);
        this.f62897.removeCallbacksAndMessages(null);
    }
}
