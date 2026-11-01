package l;

import android.os.Process;

/* JADX INFO: renamed from: l.۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes3.dex */
public final class C13062 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f43546;

    public C13062(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f43546 = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f43546);
        super.run();
    }
}
