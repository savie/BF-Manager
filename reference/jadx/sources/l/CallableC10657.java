package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۧ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC10657 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9246 f36346;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36347;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36348;

    public /* synthetic */ CallableC10657(C9246 c9246, int i, int i2) {
        this.f36346 = c9246;
        this.f36348 = i;
        this.f36347 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C9246.m23765(this.f36346, this.f36348, this.f36347);
    }
}
