package l;

/* JADX INFO: renamed from: l.ܶܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15294 extends C2592 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21643 f49834;

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        C21643 c21643 = this.f49834;
        if (c21643.f70176) {
            return;
        }
        c21643.start();
        c21643.f70176 = true;
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        C21643 c21643 = this.f49834;
        int i = c21643.f70177 - 1;
        c21643.f70177 = i;
        if (i == 0) {
            c21643.f70176 = false;
            c21643.end();
        }
        abstractC11766.removeListener(this);
    }
}
