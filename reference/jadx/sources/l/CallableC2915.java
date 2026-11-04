package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۖ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC2915 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9528;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9529;

    public /* synthetic */ CallableC2915(int i, Object obj) {
        this.f9528 = i;
        this.f9529 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9528) {
            case 0:
                return Long.valueOf(C20069.m46189(((C22965) this.f9529).f74596.m22013()));
            default:
                return (String) this.f9529;
        }
    }
}
