package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C58G */
/* JADX INFO: loaded from: classes4.dex */
public final class C16816 extends AbstractC4332 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile C16816 f53822;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6232 f53823;

    public C16816() {
        super(1);
        this.f53823 = new C6232();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16816 m39456() {
        if (f53822 != null) {
            return f53822;
        }
        synchronized (C16816.class) {
            if (f53822 == null) {
                f53822 = new C16816();
            }
        }
        return f53822;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39457(Runnable runnable) {
        this.f53823.m17287(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39458() {
        this.f53823.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
