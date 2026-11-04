package l;

/* JADX INFO: renamed from: l.ܰ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes5.dex */
public final class C14841 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7296 f48534;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f48535;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f48536;

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo22280() {
        return true;
    }

    public C14841(AbstractC7296 abstractC7296) {
        this.f48534 = abstractC7296;
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22278(AbstractC23705 abstractC23705) {
        if (!(abstractC23705 instanceof C14007)) {
            return false;
        }
        if (this.f48536 && this.f48535 == 1) {
            this.f48534.m19964(false);
            this.f48536 = false;
        }
        return true;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f48534;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        if (interfaceC4753.mo14653()) {
            this.f48536 = true;
            this.f48535 = 0;
        } else if (this.f48536) {
            this.f48535++;
        }
        return C7932.m21504(interfaceC4753.getIndex());
    }
}
