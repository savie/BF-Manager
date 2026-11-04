package l;

import android.os.Process;

/* JADX INFO: renamed from: l.ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes4.dex */
public final class C17225 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f56126;

    public C17225(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f56126 = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f56126);
        super.run();
    }
}
