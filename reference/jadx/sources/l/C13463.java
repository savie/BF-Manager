package l;

import bin.mt.term.Exec;

/* JADX INFO: renamed from: l.ܰ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13463 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4995 f44531;

    public C13463(C4995 c4995) {
        this.f44531 = c4995;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C4995 c4995 = this.f44531;
        c4995.f17387.sendMessage(c4995.f17387.obtainMessage(4, Integer.valueOf(Exec.waitFor(c4995.f17395))));
    }
}
