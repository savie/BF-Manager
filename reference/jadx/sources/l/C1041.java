package l;

/* JADX INFO: renamed from: l.֨ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E4MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C1041 extends AbstractC6686 implements InterfaceC13091, InterfaceC10062 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f4841;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f4842;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ String mo1142() {
        throw null;
    }

    public C1041(C17684 c17684, EnumC10297 enumC10297, int i) {
        super(c17684, enumC10297, i);
        this.f4842 = null;
        this.f4841 = null;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return AbstractC10872.m27237(this.f22552.m41166().m42181(this.f22553 + 1));
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۖ */
    public final int mo3085() {
        return this.f22552.m41166().m42181(this.f22553 + 4) & 15;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۨ */
    public final int mo3087() {
        return AbstractC10872.m27237(this.f22552.m41166().m42181(this.f22553 + 4));
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3089() {
        return this.f22552.m41166().m42181(this.f22553 + 5) & 15;
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۚ */
    public final int mo3086() {
        return AbstractC10872.m27237(this.f22552.m41166().m42181(this.f22553 + 5));
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ܰ */
    public final int mo3088() {
        return this.f22552.m41166().m42181(this.f22553 + 1) & 15;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        AbstractC8325 abstractC8325 = this.f4842;
        if (abstractC8325 != null) {
            return abstractC8325;
        }
        int i = this.f22551.f35329;
        C17684 c17684 = this.f22552;
        return AbstractC4332.m12166(c17684, i, c17684.m41166().m42183(this.f22553 + 2));
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f22551.f35329;
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC7446 mo3896() {
        AbstractC8325 abstractC8325 = this.f4841;
        if (abstractC8325 != null) {
            return abstractC8325;
        }
        int i = this.f22551.f35325;
        C17684 c17684 = this.f22552;
        return AbstractC4332.m12166(c17684, i, c17684.m41166().m42183(this.f22553 + 6));
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int mo3895() {
        return this.f22551.f35325;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f4842 = (AbstractC8325) c8485.m22156(getReference());
        this.f4841 = (AbstractC8325) c8485.m22156(mo3896());
    }
}
