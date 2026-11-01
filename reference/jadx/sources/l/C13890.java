package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ܰܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 22ZU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13890 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Thread f45762 = Looper.getMainLooper().getThread();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m33728() {
        return f45762 == Thread.currentThread();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33727() {
        if (m33728()) {
            throw new IllegalStateException("Blocking UI wait must not be called on the UI thread");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33726() {
        Thread threadCurrentThread = Thread.currentThread();
        return f45762 == threadCurrentThread || threadCurrentThread.getName().startsWith("binder:");
    }
}
