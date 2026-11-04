package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۘܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4212 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21366 f15387;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f15388;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5704 f15389;

    public /* synthetic */ CallableC4212(C21366 c21366, C5704 c5704, long j) {
        this.f15387 = c21366;
        this.f15389 = c5704;
        this.f15388 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C7941 c7941 = this.f15387.f68053;
        C5704 c5704 = this.f15389;
        if (!c5704.m16743()) {
            return null;
        }
        c5704.m16742();
        if (!c5704.m16743()) {
            return null;
        }
        c7941.m19930(this.f15388);
        c7941.m19945(true);
        return null;
    }
}
