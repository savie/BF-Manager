package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.۟ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7792 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17004 f25867;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Handler f25868;

    public C7792(C17004 c17004, Handler handler) {
        this.f25867 = c17004;
        this.f25868 = handler;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21186(C12750 c12750) {
        int i = c12750.f40815;
        Handler handler = this.f25868;
        C17004 c17004 = this.f25867;
        if (i == 0) {
            handler.post(new RunnableC18233(c17004, c12750.f40816));
        } else {
            handler.post(new RunnableC0334(c17004, i));
        }
    }
}
