package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۡ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9098 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31016;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31017;

    public RunnableC9098(Object obj, Object obj2) {
        this.f31016 = obj;
        this.f31017 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C7686.f25457;
            Object obj = this.f31017;
            Object obj2 = this.f31016;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C7686.f25455.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
