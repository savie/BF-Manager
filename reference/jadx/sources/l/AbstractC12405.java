package l;

/* JADX INFO: renamed from: l.۫۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: SAY4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12405 extends AbstractC16887 implements InterfaceC3480 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C16638 f41438 = new C16638(InterfaceC3480.f12775, C0409.f1899);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8623(InterfaceC22386 interfaceC22386, Runnable runnable);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo30859() {
        return !(this instanceof C17862);
    }

    @Override // l.AbstractC16887, l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2629 mo4416(InterfaceC5452 interfaceC5452) {
        return C2069.m6577(this, interfaceC5452);
    }

    @Override // l.AbstractC16887, l.InterfaceC22386
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC22386 mo4418(InterfaceC5452 interfaceC5452) {
        return C2069.m6578(this, interfaceC5452);
    }

    public AbstractC12405() {
        super(InterfaceC3480.f12775);
    }

    @Override // l.InterfaceC3480
    /* JADX INFO: renamed from: ۙ */
    public final C14149 mo10212(AbstractC18858 abstractC18858) {
        return new C14149(this, abstractC18858);
    }

    @Override // l.InterfaceC3480
    /* JADX INFO: renamed from: ۙ */
    public final void mo10213(InterfaceC14771 interfaceC14771) {
        ((C14149) interfaceC14771).m34227();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C13961.m33816(this);
    }
}
