package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.᩷᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22ZU */
/* JADX INFO: loaded from: classes.dex */
public final class C22415 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Thread f72598 = Looper.getMainLooper().getThread();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m50557() {
        return f72598 == Thread.currentThread();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m50556() {
        if (m50557()) {
            throw new IllegalStateException("Blocking UI wait must not be called on the UI thread");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50555() {
        Thread threadCurrentThread = Thread.currentThread();
        return f72598 == threadCurrentThread || threadCurrentThread.getName().startsWith("binder:");
    }
}
