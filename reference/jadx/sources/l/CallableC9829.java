package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۢ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC9829 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33602;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33603;

    public /* synthetic */ CallableC9829(int i, Object obj) {
        this.f33602 = i;
        this.f33603 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f33602) {
            case 0:
                return Boolean.valueOf(C1361.m4805(((C22383) this.f33603).f73084.m17383()));
            default:
                C17568 c17568 = (C17568) this.f33603;
                return Integer.valueOf(C7817.m20523(c17568.f55822, c17568.f55825, c17568.f55824, c17568.f55821, c17568.f55823));
        }
    }
}
