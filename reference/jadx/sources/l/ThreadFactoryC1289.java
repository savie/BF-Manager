package l;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.֨ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC1289 implements ThreadFactory {
    public ThreadFactoryC1289() {
    }

    public /* synthetic */ ThreadFactoryC1289(int i) {
        this();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        final Thread thread = new Thread(null, runnable, "commons-pool-evictor");
        thread.setDaemon(true);
        AccessController.doPrivileged(new PrivilegedAction() { // from class: l.᩹ᩳ᩵
            @Override // java.security.PrivilegedAction
            public final Object run() {
                thread.setContextClassLoader(ThreadFactoryC1289.class.getClassLoader());
                return null;
            }
        });
        return thread;
    }
}
