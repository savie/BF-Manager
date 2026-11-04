package l;

import java.util.UUID;

/* JADX INFO: renamed from: l.֡᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: T7U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f2637 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3036(AbstractC2323 abstractC2323) {
        String string = UUID.randomUUID().toString();
        f2637.put(string, abstractC2323);
        C21576.m49077().postDelayed(new RunnableC20330(2, string), ((long) 10) * 1000);
        return string;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m3038(String str) {
        ConcurrentMapC17249 concurrentMapC17249 = f2637;
        Object obj = concurrentMapC17249.get(str);
        if (obj != null) {
            concurrentMapC17249.remove(str);
        }
        return obj;
    }
}
