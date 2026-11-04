package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.۠ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC8607 implements ThreadFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28106;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f28106) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            default:
                Thread thread = new Thread(runnable, "remote-file-transfer-conflict-timeout");
                thread.setDaemon(true);
                return thread;
        }
    }
}
