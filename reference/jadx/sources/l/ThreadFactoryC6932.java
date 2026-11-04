package l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۜۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BIYL */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC6932 implements ThreadFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f22939 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "jadx-events-thread-" + this.f22939.incrementAndGet());
    }
}
