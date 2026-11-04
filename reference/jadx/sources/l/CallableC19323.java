package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ᩳ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class CallableC19323 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62419;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62420;

    public /* synthetic */ CallableC19323(int i, Object obj) {
        this.f62419 = i;
        this.f62420 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.f62419) {
            case 0:
                return Boolean.valueOf(C20069.m46197(((C22965) this.f62420).f74596.m22013()));
            default:
                C22069.m49900((InterfaceC2742) this.f62420);
                return null;
        }
    }
}
