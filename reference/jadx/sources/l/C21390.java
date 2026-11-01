package l;

/* JADX INFO: renamed from: l.᩸ۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21390 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f69551 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21721 m47939() {
        ThreadLocal threadLocal = f69551;
        AbstractC21721 abstractC21721 = (AbstractC21721) threadLocal.get();
        if (abstractC21721 != null) {
            return abstractC21721;
        }
        C5348 c5348 = new C5348(Thread.currentThread());
        threadLocal.set(c5348);
        return c5348;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m47941() {
        f69551.set(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47940(RunnableC11844 runnableC11844) {
        f69551.set(runnableC11844);
    }
}
