package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩸۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC22806 implements ThreadFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73937;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73938;

    public ThreadFactoryC22806(String str, boolean z) {
        this.f73938 = str;
        this.f73937 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f73938);
        thread.setDaemon(this.f73937);
        return thread;
    }
}
