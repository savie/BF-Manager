package l;

/* JADX INFO: renamed from: l.۟ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7204 extends AbstractC22686 {
    public final /* synthetic */ int h;

    public /* synthetic */ C7204(int i) {
        this.h = i;
    }

    @Override // l.AbstractC22686
    public final InterfaceC2319 e0() {
        switch (this.h) {
            case 0:
                return new C18340();
            case 1:
                return new C12199();
            case 2:
                return new C14925();
            default:
                return new C11991();
        }
    }

    @Override // l.AbstractC22686, l.InterfaceC3647
    public final Object b(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        switch (this.h) {
            case 0:
                return EnumC2970.SIZED.s(abstractC5752.m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.b(abstractC5752, interfaceC20693);
            case 1:
                return EnumC2970.SIZED.s(abstractC5752.m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.b(abstractC5752, interfaceC20693);
            case 2:
                return EnumC2970.SIZED.s(abstractC5752.m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.b(abstractC5752, interfaceC20693);
            default:
                return EnumC2970.SIZED.s(abstractC5752.m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.b(abstractC5752, interfaceC20693);
        }
    }

    @Override // l.AbstractC22686, l.InterfaceC3647
    public final Object e(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        switch (this.h) {
            case 0:
                return EnumC2970.SIZED.s(((AbstractC5752) abstractC22686).m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.e(abstractC22686, interfaceC20693);
            case 1:
                return EnumC2970.SIZED.s(((AbstractC5752) abstractC22686).m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.e(abstractC22686, interfaceC20693);
            case 2:
                return EnumC2970.SIZED.s(((AbstractC5752) abstractC22686).m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.e(abstractC22686, interfaceC20693);
            default:
                return EnumC2970.SIZED.s(((AbstractC5752) abstractC22686).m) ? Long.valueOf(interfaceC20693.getExactSizeIfKnown()) : (Long) super.e(abstractC22686, interfaceC20693);
        }
    }

    @Override // l.AbstractC22686, l.InterfaceC3647
    public final int j() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return EnumC2970.r;
    }
}
