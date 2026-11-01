package l;

/* JADX INFO: renamed from: l.ۜܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6826 extends C2592 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11766 f23003;

    public C6826(AbstractC11766 abstractC11766) {
        this.f23003 = abstractC11766;
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        this.f23003.runAnimators();
        abstractC11766.removeListener(this);
    }
}
