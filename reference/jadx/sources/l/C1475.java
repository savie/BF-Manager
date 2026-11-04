package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C58G */
/* JADX INFO: loaded from: classes3.dex */
public final class C1475 extends AbstractC11528 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile C1475 f5136;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8932 f5137 = new C8932();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1475 m5264() {
        if (f5136 != null) {
            return f5136;
        }
        synchronized (C1475.class) {
            if (f5136 == null) {
                f5136 = new C1475();
            }
        }
        return f5136;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5265(Runnable runnable) {
        this.f5137.m23844(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5266() {
        this.f5137.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
