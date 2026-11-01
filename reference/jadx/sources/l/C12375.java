package l;

import java.util.UUID;

/* JADX INFO: renamed from: l.۫ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T7U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f41359 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30784(AbstractC17535 abstractC17535) {
        String string = UUID.randomUUID().toString();
        f41359.put(string, abstractC17535);
        C16737.m39278().postDelayed(new RunnableC12507(1, string), ((long) 10) * 1000);
        return string;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m30786(String str) {
        ConcurrentMapC13783 concurrentMapC13783 = f41359;
        Object obj = concurrentMapC13783.get(str);
        if (obj != null) {
            concurrentMapC13783.remove(str);
        }
        return obj;
    }
}
