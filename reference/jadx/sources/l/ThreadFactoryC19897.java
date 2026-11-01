package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩶ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC19897 implements ThreadFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63788;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63789;

    public ThreadFactoryC19897(String str, boolean z) {
        this.f63789 = str;
        this.f63788 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f63789);
        thread.setDaemon(this.f63788);
        return thread;
    }
}
