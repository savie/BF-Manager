package l;

/* JADX INFO: renamed from: l.۬ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D4MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13037 extends AbstractC6686 implements InterfaceC3917, InterfaceC10062 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f43472;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f43473;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ String mo1142() {
        throw null;
    }

    public C13037(C17684 c17684, EnumC10297 enumC10297, int i) {
        super(c17684, enumC10297, i);
        this.f43473 = null;
        this.f43472 = null;
    }

    @Override // l.InterfaceC13153
    /* JADX INFO: renamed from: ֨ */
    public final int mo2107() {
        return this.f22552.m41166().m42181(this.f22553 + 1);
    }

    @Override // l.InterfaceC11742
    /* JADX INFO: renamed from: ᩴ */
    public final int mo2109() {
        return this.f22552.m41166().m42183(this.f22553 + 4);
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        AbstractC8325 abstractC8325 = this.f43473;
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
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC7446 mo3896() {
        AbstractC8325 abstractC8325 = this.f43472;
        if (abstractC8325 != null) {
            return abstractC8325;
        }
        int i = this.f22551.f35325;
        C17684 c17684 = this.f22552;
        return AbstractC4332.m12166(c17684, i, c17684.m41166().m42183(this.f22553 + 6));
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۟ */
    public final int mo3895() {
        return this.f22551.f35325;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f43473 = (AbstractC8325) c8485.m22156(getReference());
        this.f43472 = (AbstractC8325) c8485.m22156(mo3896());
    }
}
