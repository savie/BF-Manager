package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.۠۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC8046 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "remote-file-transfer-conflict-timeout");
        thread.setDaemon(true);
        return thread;
    }
}
