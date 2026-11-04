package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4719 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16638;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16639;

    public /* synthetic */ RunnableC4719(int i, Object obj) {
        this.f16638 = i;
        this.f16639 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16638) {
            case 0:
                ((InterfaceC19777) this.f16639).mo34768();
                return;
            default:
                try {
                    ((C22310) this.f16639).close();
                    return;
                } catch (IOException e) {
                    throw new C3552(e);
                }
        }
    }
}
