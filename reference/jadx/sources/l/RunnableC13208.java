package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۬ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13208 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43949;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43950;

    public /* synthetic */ RunnableC13208(int i, Object obj) {
        this.f43949 = i;
        this.f43950 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43949) {
            case 0:
                if (((C4034) this.f43950).f14919) {
                    throw new CancellationException("Text statistics canceled");
                }
                return;
            default:
                ((C4844) this.f43950).m13457();
                return;
        }
    }
}
