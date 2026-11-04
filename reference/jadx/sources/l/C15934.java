package l;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: l.ܶ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15934 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f51749 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Looper f51748 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HandlerThread f51747 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f51750 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Looper m37957() {
        Looper looper;
        synchronized (this.f51749) {
            if (this.f51748 == null) {
                C20782.m47568(this.f51750 == 0 && this.f51747 == null);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.f51747 = handlerThread;
                handlerThread.start();
                this.f51748 = this.f51747.getLooper();
            }
            this.f51750++;
            looper = this.f51748;
        }
        return looper;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37958() {
        HandlerThread handlerThread;
        synchronized (this.f51749) {
            C20782.m47568(this.f51750 > 0);
            int i = this.f51750 - 1;
            this.f51750 = i;
            if (i == 0 && (handlerThread = this.f51747) != null) {
                handlerThread.quit();
                this.f51747 = null;
                this.f51748 = null;
            }
        }
    }
}
