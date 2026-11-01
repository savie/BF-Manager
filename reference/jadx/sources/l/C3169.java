package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۗۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3169 extends AbstractC18609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC14460 f11918;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11554 f11919;

    public C3169(C11554 c11554, EnumC14460 enumC14460) {
        this.f11919 = c11554;
        this.f11918 = enumC14460;
    }

    @Override // l.AbstractC18609
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9567(AbstractC6614 abstractC6614, Object obj) {
        AbstractC4497 abstractC4497 = (AbstractC4497) abstractC6614;
        if (!(abstractC4497 instanceof C1758) || ((C1758) abstractC4497).f6891 == this.f11918) {
            return;
        }
        this.f11919.f38853.remove(abstractC4497.f22269);
    }

    @Override // l.AbstractC18609
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9568(InterfaceC22843 interfaceC22843, AbstractC6614 abstractC6614, AbstractC6614 abstractC6615, Object obj) {
        AbstractC4497 abstractC4497 = (AbstractC4497) abstractC6614;
        AbstractC4497 abstractC4498 = (AbstractC4497) abstractC6615;
        if (!(abstractC4498 instanceof C1758) || ((C1758) abstractC4498).f6891 == this.f11918) {
            return;
        }
        ((List) abstractC4497.f16002.get(interfaceC22843)).remove(abstractC4498);
    }
}
