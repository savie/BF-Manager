package l;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B74E */
/* JADX INFO: loaded from: classes2.dex */
public final class C1849 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f6238 = new ThreadPoolExecutor(0, 4, 10, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m6371() {
        return f6238;
    }
}
