package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩻ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I6M7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC25145 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "GalleryWebpDecode");
    }
}
