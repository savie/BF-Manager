package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19331 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14765 f62353;

    public /* synthetic */ RunnableC19331(C14765 c14765) {
        this.f62353 = c14765;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f62353.close();
        } catch (IOException e) {
            throw new C17013(e);
        }
    }
}
