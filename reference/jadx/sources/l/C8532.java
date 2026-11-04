package l;

/* JADX INFO: renamed from: l.۠ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8532 extends C7787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0329 f27875;

    public C8532(AbstractC0329 abstractC0329) {
        this.f27875 = abstractC0329;
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        this.f27875.runAnimators();
        abstractC0329.removeListener(this);
    }
}
