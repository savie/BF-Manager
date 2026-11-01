package l;

/* JADX INFO: renamed from: l.ۡ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E4WJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8576 extends AbstractC6686 implements InterfaceC10331, InterfaceC10062 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f29652;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ String mo1142() {
        throw null;
    }

    public C8576(C17684 c17684, EnumC10297 enumC10297, int i) {
        super(c17684, enumC10297, i);
        this.f29652 = null;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f22552.m41166().m42181(this.f22553 + 1);
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        AbstractC8325 abstractC8325 = this.f29652;
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

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f29652 = (AbstractC8325) c8485.m22156(getReference());
    }
}
