package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0663 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2531;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2532;

    public RunnableC0663(Object obj, Object obj2) {
        this.f2531 = obj;
        this.f2532 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C19308.f62389;
            Object obj = this.f2532;
            Object obj2 = this.f2531;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C19308.f62391.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
