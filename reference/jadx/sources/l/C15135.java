package l;

/* JADX INFO: renamed from: l.ܶۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 194T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15135 implements InterfaceC6790 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC6790 f49456;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0584 f49457;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC18245 f49458;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f49459;

    public C15135(AbstractC18245 abstractC18245, InterfaceC6790 interfaceC6790, boolean z) {
        byte[] bArr = C9779.f33478;
        abstractC18245.getClass();
        this.f49458 = abstractC18245;
        this.f49456 = interfaceC6790;
        this.f49459 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36296() {
        this.f49456 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC18245 m36295() {
        if (this.f49458 == null) {
            this.f49458 = (AbstractC18245) this.f49457.buildPartial();
        }
        return this.f49458;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC18245 m36297() {
        this.f49459 = true;
        return m36295();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC0584 m36293() {
        if (this.f49457 == null) {
            AbstractC0584 abstractC0584 = (AbstractC0584) this.f49458.newBuilderForType(this);
            this.f49457 = abstractC0584;
            abstractC0584.mergeFrom((InterfaceC1332) this.f49458);
            this.f49457.markClean();
        }
        return this.f49457;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18266 m36299() {
        AbstractC0584 abstractC0584 = this.f49457;
        return abstractC0584 != null ? abstractC0584 : this.f49458;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36298(AbstractC18245 abstractC18245) {
        byte[] bArr = C9779.f33478;
        abstractC18245.getClass();
        this.f49458 = abstractC18245;
        AbstractC0584 abstractC0584 = this.f49457;
        if (abstractC0584 != null) {
            abstractC0584.dispose();
            this.f49457 = null;
        }
        m36292();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36294(AbstractC18245 abstractC18245) {
        if (this.f49457 == null) {
            InterfaceC1332 interfaceC1332 = this.f49458;
            if (interfaceC1332 == interfaceC1332.getDefaultInstanceForType()) {
                this.f49458 = abstractC18245;
            } else {
                m36293().mergeFrom((InterfaceC1332) abstractC18245);
            }
        } else {
            m36293().mergeFrom((InterfaceC1332) abstractC18245);
        }
        m36292();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m36292() {
        InterfaceC6790 interfaceC6790;
        if (this.f49457 != null) {
            this.f49458 = null;
        }
        if (!this.f49459 || (interfaceC6790 = this.f49456) == null) {
            return;
        }
        interfaceC6790.mo18391();
        this.f49459 = false;
    }

    @Override // l.InterfaceC6790
    /* JADX INFO: renamed from: ۙ */
    public final void mo18391() {
        m36292();
    }
}
