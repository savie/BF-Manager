package l;

/* JADX INFO: renamed from: l.ܽ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public final class C16847 extends AbstractC0618 implements InterfaceC15455 {
    public C16847(long j, AbstractC11242 abstractC11242, C22929 c22929, AbstractC23903 abstractC23903) {
        super(EnumC10477.f35865, j, abstractC11242, c22929, abstractC23903);
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final EnumC1923 mo17325() {
        return EnumC1923.TYPE_PARAMETER;
    }

    @Override // l.AbstractC0618, l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21825 mo2878() {
        C21825<C13278> c21825Mo50009 = this.f77448.mo50009();
        int iIndexOf = this.f77448.mo24652().indexOf(this);
        C21825 c21825M48588 = C21825.m48588();
        for (C13278 c13278 : c21825Mo50009) {
            C10935 c10935 = c13278.f39811;
            EnumC6659 enumC6659 = c10935.f37191;
            if (enumC6659 == EnumC6659.CLASS_TYPE_PARAMETER || enumC6659 == EnumC6659.METHOD_TYPE_PARAMETER) {
                if (c10935.f37193 == iIndexOf) {
                    c21825M48588 = c21825M48588.m48597(c13278);
                }
            }
        }
        return c21825M48588.m48589();
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3841(AbstractC7693 abstractC7693, Object obj) {
        return abstractC7693.mo20328(this, obj);
    }
}
