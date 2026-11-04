package l;

/* JADX INFO: renamed from: l.᩶᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4900 */
/* JADX INFO: loaded from: classes.dex */
public final class C21555 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14007 f68842 = new C14007();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f68843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f68844;

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo22280() {
        return true;
    }

    public C21555(int i) {
        this.f68844 = i;
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22278(AbstractC23705 abstractC23705) {
        if (!this.f68843) {
            return true;
        }
        AbstractC23705 abstractC23705Mo14267 = this.f68842.mo14267();
        if (!(abstractC23705Mo14267 instanceof AbstractC7296)) {
            return true;
        }
        ((AbstractC7296) abstractC23705Mo14267).m19964(false);
        return true;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f68842;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        if (interfaceC4753.mo14653()) {
            if (this.f68842.m14254() == null) {
                return null;
            }
            AbstractC23705 abstractC23705Mo7447 = interfaceC4753.mo14652().mo7447();
            this.f68843 = (abstractC23705Mo7447 instanceof C14974) || (abstractC23705Mo7447 instanceof C14007);
            return C7932.m21504(interfaceC4753.mo14654());
        }
        int iMo14650 = interfaceC4753.mo14650();
        int i = this.f68844;
        if (iMo14650 >= i) {
            return new C7932(-1, interfaceC4753.mo14651() + i, false);
        }
        return null;
    }
}
