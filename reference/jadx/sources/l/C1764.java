package l;

import java.util.List;

/* JADX INFO: renamed from: l.֫۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1764 extends AbstractC18171 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC15187 f6066;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16679 f6067;

    public C1764(C16679 c16679, EnumC15187 enumC15187) {
        this.f6067 = c16679;
        this.f6066 = enumC15187;
    }

    @Override // l.AbstractC18171
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6217(AbstractC6239 abstractC6239, Object obj) {
        AbstractC11458 abstractC11458 = (AbstractC11458) abstractC6239;
        if (!(abstractC11458 instanceof C12950) || ((C12950) abstractC11458).f41510 == this.f6066) {
            return;
        }
        this.f6067.f53881.remove(abstractC11458.f21176);
    }

    @Override // l.AbstractC18171
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6218(InterfaceC24139 interfaceC24139, AbstractC6239 abstractC6239, AbstractC6239 abstractC62310, Object obj) {
        AbstractC11458 abstractC11458 = (AbstractC11458) abstractC6239;
        AbstractC11458 abstractC11459 = (AbstractC11458) abstractC62310;
        if (!(abstractC11459 instanceof C12950) || ((C12950) abstractC11459).f41510 == this.f6066) {
            return;
        }
        ((List) abstractC11458.f36037.get(interfaceC24139)).remove(abstractC11459);
    }
}
