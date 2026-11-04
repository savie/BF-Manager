package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۖۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC2641 implements ThreadFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f8438;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f8438);
    }
}
