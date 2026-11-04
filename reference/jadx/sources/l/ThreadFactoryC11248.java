package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۧ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC11248 implements ThreadFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35519;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f35519) {
            case 0:
                return new Thread(runnable);
            default:
                Thread thread = new Thread(runnable, "MCP credential metadata");
                thread.setDaemon(true);
                return thread;
        }
    }
}
