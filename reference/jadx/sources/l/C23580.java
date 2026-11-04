package l;

/* JADX INFO: renamed from: l.᩹۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes.dex */
public final class C23580 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f76546 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16670 m52769() {
        ThreadLocal threadLocal = f76546;
        AbstractC16670 abstractC16670 = (AbstractC16670) threadLocal.get();
        if (abstractC16670 != null) {
            return abstractC16670;
        }
        C12984 c12984 = new C12984(Thread.currentThread());
        threadLocal.set(c12984);
        return c12984;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m52771() {
        f76546.set(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52770(RunnableC10703 runnableC10703) {
        f76546.set(runnableC10703);
    }
}
