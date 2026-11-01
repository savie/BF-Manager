package l;

/* JADX INFO: renamed from: l.֡֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F58L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0108 extends AbstractC6686 implements InterfaceC16681, InterfaceC10062 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f1079;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String mo1142() {
        throw null;
    }

    public C0108(C17684 c17684, EnumC10297 enumC10297, int i) {
        super(c17684, enumC10297, i);
        this.f1079 = null;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1140() {
        return this.f22552.m41166().mo5855(this.f22553 + 1) & 15;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1144() {
        return AbstractC10872.m27237(this.f22552.m41166().mo5855(this.f22553 + 1));
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        AbstractC8325 abstractC8325 = this.f1079;
        if (abstractC8325 != null) {
            return abstractC8325;
        }
        int i = this.f22551.f35329;
        C17684 c17684 = this.f22552;
        return AbstractC4332.m12166(c17684, i, c17684.m41166().m42183(this.f22553 + 2));
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo1143() {
        return this.f22551.f35329;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1141(C8485 c8485) {
        this.f1079 = (AbstractC8325) c8485.m22156(getReference());
    }
}
