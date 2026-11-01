package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܿۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC17089 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14268 f54507;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54508;

    public /* synthetic */ CallableC17089(C14268 c14268, int i) {
        this.f54507 = c14268;
        this.f54508 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C14268 c14268 = this.f54507;
        return C5446.m15088(new C16881(c14268.f46710.f15894.f32339), this.f54508, new C10740(c14268));
    }
}
