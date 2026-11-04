package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ᩳۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC18793 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8351 f61028;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61030;

    public /* synthetic */ CallableC18793(C8351 c8351, int i, int i2) {
        this.f61028 = c8351;
        this.f61030 = i;
        this.f61029 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C8351.m22463(this.f61028, this.f61030, this.f61029);
    }
}
