package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۘ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC3841 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18757 f13097;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13098;

    public /* synthetic */ CallableC3841(C18757 c18757, int i) {
        this.f13097 = c18757;
        this.f13098 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C18757 c18757 = this.f13097;
        return C25294.m56480(new C9431(c18757.f60928.f7585.f3543), this.f13098, new C0112(c18757));
    }
}
