package l;

import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.ᩴۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC19592 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15116 f63169;

    public RunnableC19592(C15116 c15116) {
        this.f63169 = c15116;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f63169.f49329;
        if (aVar.f860 != null) {
            aVar.f860.loadUrl(aVar.f875);
        }
    }
}
