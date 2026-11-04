package l;

/* JADX INFO: renamed from: l.֫᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2223 extends AbstractC13956 {
    public final /* synthetic */ int h;

    public /* synthetic */ C2223(int i) {
        this.h = i;
    }

    @Override // l.AbstractC13956
    public final InterfaceC18873 e0() {
        switch (this.h) {
            case 0:
                return new C18432();
            case 1:
                return new C23874();
            case 2:
                return new C5030();
            default:
                return new C8211();
        }
    }

    @Override // l.AbstractC13956, l.InterfaceC8605
    public final Object b(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        switch (this.h) {
            case 0:
                return EnumC21614.SIZED.p(abstractC15470.m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.b(abstractC15470, interfaceC8409);
            case 1:
                return EnumC21614.SIZED.p(abstractC15470.m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.b(abstractC15470, interfaceC8409);
            case 2:
                return EnumC21614.SIZED.p(abstractC15470.m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.b(abstractC15470, interfaceC8409);
            default:
                return EnumC21614.SIZED.p(abstractC15470.m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.b(abstractC15470, interfaceC8409);
        }
    }

    @Override // l.AbstractC13956, l.InterfaceC8605
    public final Object e(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        switch (this.h) {
            case 0:
                return EnumC21614.SIZED.p(((AbstractC15470) abstractC13956).m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.e(abstractC13956, interfaceC8409);
            case 1:
                return EnumC21614.SIZED.p(((AbstractC15470) abstractC13956).m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.e(abstractC13956, interfaceC8409);
            case 2:
                return EnumC21614.SIZED.p(((AbstractC15470) abstractC13956).m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.e(abstractC13956, interfaceC8409);
            default:
                return EnumC21614.SIZED.p(((AbstractC15470) abstractC13956).m) ? Long.valueOf(interfaceC8409.getExactSizeIfKnown()) : (Long) super.e(abstractC13956, interfaceC8409);
        }
    }

    @Override // l.AbstractC13956, l.InterfaceC8605
    public final int j() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return EnumC21614.r;
    }
}
