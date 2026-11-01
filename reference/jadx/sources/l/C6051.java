package l;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۛ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8TC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6051 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f20552 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Looper f20551 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HandlerThread f20550 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f20549 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Looper m16449() {
        Looper looper;
        synchronized (this.f20552) {
            if (this.f20551 == null) {
                C2023.m6510(this.f20549 == 0 && this.f20550 == null);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.f20550 = handlerThread;
                handlerThread.start();
                this.f20551 = this.f20550.getLooper();
            }
            this.f20549++;
            looper = this.f20551;
        }
        return looper;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16450() {
        HandlerThread handlerThread;
        synchronized (this.f20552) {
            C2023.m6510(this.f20549 > 0);
            int i = this.f20549 - 1;
            this.f20549 = i;
            if (i == 0 && (handlerThread = this.f20550) != null) {
                handlerThread.quit();
                this.f20550 = null;
                this.f20551 = null;
            }
        }
    }
}
