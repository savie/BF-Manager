package l;

/* JADX INFO: renamed from: l.᩻֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23386 extends AbstractC17035 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f75762;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1512 f75763;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21825 f75764;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22492 f75765;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23386(C1512 c1512, C22492 c22492) {
        super(c1512);
        this.f75763 = c1512;
        this.f75765 = c22492;
        this.f75762 = c22492.f77448;
        this.f75764 = C21825.m48588();
    }

    @Override // l.AbstractC17035
    /* JADX INFO: renamed from: ۙ */
    public final void mo39804(C22492 c22492) {
        C21825 c21825 = (C21825) this.f75763.f6195.get(c22492);
        if (c21825 != null) {
            while (c21825.m48595()) {
                C6263 c6263 = (C6263) c21825.f70876;
                C21825 c21826 = this.f75764;
                while (true) {
                    if (c21826.m48595()) {
                        if (c21826.f70876 == c6263) {
                            break;
                        } else {
                            c21826 = c21826.f70877;
                        }
                    } else {
                        this.f75764 = this.f75764.m48597(c6263);
                        break;
                    }
                }
                c21825 = c21825.f70877;
            }
        }
    }

    @Override // l.AbstractC17035
    /* JADX INFO: renamed from: ۙ */
    public final void mo39805(AbstractC23903 abstractC23903) {
        EnumC10477 enumC10477 = abstractC23903.f77452;
        if (enumC10477 == EnumC10477.f35878 || enumC10477 == EnumC10477.f35879) {
            AbstractC23903 abstractC23904 = abstractC23903.f77448;
            C1512 c1512 = this.f75763;
            AbstractC23903 abstractC23905 = this.f75762;
            AbstractC23903 abstractC23906 = abstractC23904 != abstractC23905 ? (AbstractC23903) c1512.f6191.get(abstractC23903) : abstractC23903;
            if (abstractC23906 != null && abstractC23906.f77448 == abstractC23905) {
                C6263 c6263 = (C6263) abstractC23906;
                if (c6263.m17332() == null) {
                    for (C21825 c21825 = this.f75764; c21825.m48595(); c21825 = c21825.f70877) {
                        if (c21825.f70876 == c6263) {
                            return;
                        }
                    }
                    this.f75764 = this.f75764.m48597(c6263);
                    return;
                }
                return;
            }
            Object obj = c1512.f6167.f70876;
            if (obj == null || obj == abstractC23903) {
                return;
            }
            mo39805((AbstractC23903) obj);
        }
    }

    @Override // l.AbstractC17035, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        Object obj;
        C22492 c22492 = (C22492) c8378.f29097.f77448;
        if (c8378.f29093 == null && c22492.m52727() && (obj = this.f75763.f6167.f70876) != null) {
            mo39805((AbstractC23903) obj);
        }
        super.mo3932(c8378);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        Object obj;
        AbstractC11242 abstractC11242 = c23570.f76356;
        C1512 c1512 = this.f75763;
        if ((abstractC11242 == c1512.f6207.f77533 || c23570.f76356 == c1512.f6207.f77638) && c23570.f76357.f30190.f53222 != this.f75765 && (obj = c1512.f6167.f70876) != null) {
            mo39805((AbstractC23903) obj);
        }
        mo7248(c23570.f76357);
    }

    @Override // l.AbstractC17035, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        Object obj;
        AbstractC11242 abstractC11242M9472 = C3128.m9472(c15434.f50296);
        C1512 c1512 = this.f75763;
        if (abstractC11242M9472 == c1512.f6207.f77638 && ((C22492) C3128.m9471(c15434.f50296).f77448).m52727() && !c15434.f50296.m22847(EnumC18651.f60473) && (obj = c1512.f6167.f70876) != null) {
            mo39805((AbstractC23903) obj);
        }
        super.mo3947(c15434);
    }
}
