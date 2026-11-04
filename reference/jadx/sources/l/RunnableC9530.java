package l;

import android.content.Intent;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۡܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9530 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30865;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30867;

    public /* synthetic */ RunnableC9530(int i, Object obj, Object obj2) {
        this.f30865 = i;
        this.f30867 = obj;
        this.f30866 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30865) {
            case 0:
                ActivityC3786.m12300((ActivityC3786) this.f30867, (AbstractC14806) this.f30866);
                break;
            case 1:
                C4059 c4059 = (C4059) this.f30867;
                if (((AtomicInteger) this.f30866).decrementAndGet() == 0) {
                    C21576.m49068(new RunnableC1518(1, c4059));
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) this.f30867;
                C24132 c24132 = (C24132) this.f30866;
                if (!zArr[0]) {
                    c24132.m53996();
                    zArr[0] = true;
                }
                break;
            default:
                ServiceC2099.m7267((ServiceC2099) this.f30867, (Intent) this.f30866);
                break;
        }
    }
}
