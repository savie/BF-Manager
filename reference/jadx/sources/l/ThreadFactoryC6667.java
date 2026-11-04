package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۛ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC6667 implements ThreadFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22231;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f22231) {
            case 0:
                Thread thread = new Thread(runnable, "Search-Highlight-Timer");
                thread.setDaemon(true);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, "MCP file transfer cleanup");
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
