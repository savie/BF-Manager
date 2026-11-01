package l;

/* JADX INFO: renamed from: l.᩺ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23055 extends C2592 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21643 f74905;

    public C23055(C21643 c21643) {
        this.f74905 = c21643;
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
        C21643 c21643 = this.f74905;
        c21643.f70174.remove(abstractC11766);
        if (c21643.hasAnimators()) {
            return;
        }
        c21643.notifyListeners(InterfaceC13883.f45754, false);
        c21643.mEnded = true;
        c21643.notifyListeners(InterfaceC13883.f45757, false);
    }
}
