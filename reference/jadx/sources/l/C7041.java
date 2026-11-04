package l;

/* JADX INFO: renamed from: l.ۜۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7041 extends C7787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4608 f23227;

    public C7041(C4608 c4608) {
        this.f23227 = c4608;
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
        C4608 c4608 = this.f23227;
        c4608.f16339.remove(abstractC0329);
        if (c4608.hasAnimators()) {
            return;
        }
        c4608.notifyListeners(InterfaceC18228.f59509, false);
        c4608.mEnded = true;
        c4608.notifyListeners(InterfaceC18228.f59512, false);
    }
}
