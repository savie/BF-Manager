package l;

/* JADX INFO: renamed from: l.ۖ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2742 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18661 f10538;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10539;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f10540;

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo8350() {
        return true;
    }

    public C2742(AbstractC18661 abstractC18661) {
        this.f10538 = abstractC18661;
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8349(AbstractC14738 abstractC14738) {
        if (!(abstractC14738 instanceof C8078)) {
            return false;
        }
        if (this.f10540 && this.f10539 == 1) {
            this.f10538.m43149(false);
            this.f10540 = false;
        }
        return true;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC14738 mo1823() {
        return this.f10538;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        if (interfaceC8119.mo21199()) {
            this.f10540 = true;
            this.f10539 = 0;
        } else if (this.f10540) {
            this.f10539++;
        }
        return C22168.m49178(interfaceC8119.getIndex());
    }
}
