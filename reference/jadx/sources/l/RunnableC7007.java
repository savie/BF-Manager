package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۜ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7007 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23100;

    public /* synthetic */ RunnableC7007(int i, Object obj) {
        this.f23099 = i;
        this.f23100 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23099;
        Object obj = this.f23100;
        switch (i) {
            case 0:
                int i2 = ActivityC15913.f51685;
                ((AtomicBoolean) obj).set(true);
                break;
            default:
                ((C9771) obj).m25474();
                break;
        }
    }
}
