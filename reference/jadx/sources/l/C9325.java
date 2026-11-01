package l;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۢۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9325 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f31649 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f31647 = new ArrayList(100);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C16916 f31648 = new C16916(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23972(AbstractC20745 abstractC20745, long j) {
        this.f31647.add(abstractC20745);
        this.f31648.add(j);
        if (this.f31647.size() == 100) {
            C4716.f16636.execute(new RunnableC1562(this, this.f31647, this.f31648));
            this.f31647 = new ArrayList(100);
            this.f31648 = new C16916(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23971() {
        if (this.f31647.isEmpty()) {
            return;
        }
        try {
            C4716.f16636.submit(new RunnableC1562(this, this.f31647, this.f31648)).get();
        } catch (Exception unused) {
        }
    }
}
