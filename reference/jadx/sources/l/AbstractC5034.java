package l;

/* JADX INFO: renamed from: l.ۙܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5034 extends AbstractC22188 implements InterfaceC11396 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC13679 f17439;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25172 f17440;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5034(C25172 c25172, InterfaceC11396 interfaceC11396) {
        super(c25172, interfaceC11396);
        this.f17440 = c25172;
        this.f17439 = null;
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10824 mo2769() {
        AbstractC13679 abstractC13679 = this.f17439;
        if (abstractC13679 != null) {
            return abstractC13679;
        }
        InterfaceC11396 interfaceC11396 = (InterfaceC11396) this.f71487;
        return C25172.m56092(this.f17440, interfaceC11396.mo2773(), interfaceC11396.mo2769());
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ᩺ */
    public final int mo2773() {
        return ((InterfaceC11396) this.f71487).mo2773();
    }

    @Override // l.AbstractC22188, l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        super.mo2770(c8850);
        this.f17439 = (AbstractC13679) c8850.m23714(mo2769());
    }
}
