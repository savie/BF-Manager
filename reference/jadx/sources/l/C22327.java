package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K99K */
/* JADX INFO: loaded from: classes.dex */
public final class C22327 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50389(Throwable th) {
        synchronized (th) {
            Throwable[] suppressed = th.getSuppressed();
            int i = 0;
            for (Throwable th2 : suppressed) {
                if (th2 instanceof C5173) {
                    i++;
                }
            }
            if (i >= 8) {
                return;
            }
            C5173 c5173 = new C5173("Exception received on thread \"" + Thread.currentThread().getName() + "\"");
            for (Throwable th3 : suppressed) {
                if ((th3 instanceof C5173) && Arrays.equals(th3.getStackTrace(), c5173.getStackTrace())) {
                    return;
                }
            }
            th.addSuppressed(c5173);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m50390(Throwable th) {
        String message = th.getMessage();
        return (message == null || message.isEmpty()) ? th.toString() : message;
    }
}
