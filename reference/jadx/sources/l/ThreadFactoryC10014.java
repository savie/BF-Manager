package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۢۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC10014 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "Remote LAN KeepAlive #" + C2557.f8212.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
