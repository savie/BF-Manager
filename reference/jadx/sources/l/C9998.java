package l;

/* JADX INFO: renamed from: l.ۢ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 194T */
/* JADX INFO: loaded from: classes4.dex */
public final class C9998 implements InterfaceC7937 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC15001 f32109;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC9035 f32110;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f32111;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC7937 f32112;

    public C9998(AbstractC9035 abstractC9035, InterfaceC7937 interfaceC7937, boolean z) {
        byte[] bArr = C23447.f75887;
        abstractC9035.getClass();
        this.f32110 = abstractC9035;
        this.f32112 = interfaceC7937;
        this.f32111 = z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25851() {
        this.f32112 = null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC9035 m25853() {
        if (this.f32110 == null) {
            this.f32110 = (AbstractC9035) this.f32109.buildPartial();
        }
        return this.f32110;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9035 m25854() {
        this.f32111 = true;
        return m25853();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15001 m25856() {
        if (this.f32109 == null) {
            AbstractC15001 abstractC15001 = (AbstractC15001) this.f32110.newBuilderForType(this);
            this.f32109 = abstractC15001;
            abstractC15001.mergeFrom((InterfaceC21013) this.f32110);
            this.f32109.markClean();
        }
        return this.f32109;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9078 m25852() {
        AbstractC15001 abstractC15001 = this.f32109;
        return abstractC15001 != null ? abstractC15001 : this.f32110;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25855(AbstractC9035 abstractC9035) {
        byte[] bArr = C23447.f75887;
        abstractC9035.getClass();
        this.f32110 = abstractC9035;
        AbstractC15001 abstractC15001 = this.f32109;
        if (abstractC15001 != null) {
            abstractC15001.dispose();
            this.f32109 = null;
        }
        m25849();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25850(AbstractC9035 abstractC9035) {
        if (this.f32109 == null) {
            InterfaceC21013 interfaceC21013 = this.f32110;
            if (interfaceC21013 == interfaceC21013.getDefaultInstanceForType()) {
                this.f32110 = abstractC9035;
            } else {
                m25856().mergeFrom((InterfaceC21013) abstractC9035);
            }
        } else {
            m25856().mergeFrom((InterfaceC21013) abstractC9035);
        }
        m25849();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m25849() {
        InterfaceC7937 interfaceC7937;
        if (this.f32109 != null) {
            this.f32110 = null;
        }
        if (!this.f32111 || (interfaceC7937 = this.f32112) == null) {
            return;
        }
        interfaceC7937.mo21509();
        this.f32111 = false;
    }

    @Override // l.InterfaceC7937
    /* JADX INFO: renamed from: ۙ */
    public final void mo21509() {
        m25849();
    }
}
