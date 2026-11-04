package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܰ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC14281 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18757 f45111;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45112;

    public /* synthetic */ CallableC14281(C18757 c18757, int i) {
        this.f45111 = c18757;
        this.f45112 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C18757 c18757 = this.f45111;
        return C25294.m56480(new C9431(c18757.f60928.f7581.f3543), this.f45112, new C0112(c18757));
    }
}
