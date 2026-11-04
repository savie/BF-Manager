package l;

/* JADX INFO: renamed from: l.۬ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13752 extends C7787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4608 f43629;

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        C4608 c4608 = this.f43629;
        if (c4608.f16338) {
            return;
        }
        c4608.start();
        c4608.f16338 = true;
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        C4608 c4608 = this.f43629;
        int i = c4608.f16342 - 1;
        c4608.f16342 = i;
        if (i == 0) {
            c4608.f16338 = false;
            c4608.end();
        }
        abstractC0329.removeListener(this);
    }
}
