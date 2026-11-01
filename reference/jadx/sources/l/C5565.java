package l;

/* JADX INFO: renamed from: l.ۚ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4900 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5565 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8078 f19083 = new C8078();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f19084;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19085;

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo8350() {
        return true;
    }

    public C5565(int i) {
        this.f19085 = i;
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8349(AbstractC14738 abstractC14738) {
        if (!this.f19084) {
            return true;
        }
        AbstractC14738 abstractC14738Mo35319 = this.f19083.mo35319();
        if (!(abstractC14738Mo35319 instanceof AbstractC18661)) {
            return true;
        }
        ((AbstractC18661) abstractC14738Mo35319).m43149(false);
        return true;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC14738 mo1823() {
        return this.f19083;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        if (interfaceC8119.mo21199()) {
            if (this.f19083.m44383() == null) {
                return null;
            }
            AbstractC14738 abstractC14738Mo1823 = interfaceC8119.mo21200().mo1823();
            this.f19084 = (abstractC14738Mo1823 instanceof C15840) || (abstractC14738Mo1823 instanceof C8078);
            return C22168.m49178(interfaceC8119.mo21197());
        }
        int iMo21201 = interfaceC8119.mo21201();
        int i = this.f19085;
        if (iMo21201 >= i) {
            return new C22168(-1, interfaceC8119.mo21202() + i, false);
        }
        return null;
    }
}
