package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩻ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC25105 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = ServiceC6459.f21716;
        Thread thread = new Thread(runnable, "McpHealthMonitor");
        thread.setDaemon(true);
        return thread;
    }
}
