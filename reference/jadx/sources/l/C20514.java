package l;

import bin.mt.term.Exec;

/* JADX INFO: renamed from: l.᩵ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20514 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24244 f65718;

    public C20514(C24244 c24244) {
        this.f65718 = c24244;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C24244 c24244 = this.f65718;
        c24244.f78521.sendMessage(c24244.f78521.obtainMessage(4, Integer.valueOf(Exec.waitFor(c24244.f78535))));
    }
}
