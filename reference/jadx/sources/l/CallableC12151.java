package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۫ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC12151 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14268 f40658;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40659;

    public /* synthetic */ CallableC12151(C14268 c14268, int i) {
        this.f40658 = c14268;
        this.f40659 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C14268 c14268 = this.f40658;
        return C5446.m15088(new C16881(c14268.f46710.f15885.f32339), this.f40659, new C10740(c14268));
    }
}
