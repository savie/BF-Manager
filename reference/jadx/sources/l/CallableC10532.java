package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۤ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC10532 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21114 f36059;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f36060;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23232 f36061;

    public /* synthetic */ CallableC10532(C21114 c21114, C23232 c23232, long j) {
        this.f36059 = c21114;
        this.f36061 = c23232;
        this.f36060 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C20409 c20409 = this.f36059.f68779;
        C23232 c23232 = this.f36061;
        if (!c23232.m51268()) {
            return null;
        }
        c23232.m51267();
        if (!c23232.m51268()) {
            return null;
        }
        c20409.m13340(this.f36060);
        c20409.m13350(true);
        return null;
    }
}
