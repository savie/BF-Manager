package l;

/* JADX INFO: renamed from: l.ۛᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LA24 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6240 extends AbstractC12591 implements InterfaceC4913 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f21171;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f21172;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public Long f21173;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f21174;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f21175;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public Exception f21176;

    public AbstractC6240(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5635(InterfaceC3314 interfaceC3314) {
        InterfaceC4913 interfaceC4913 = (InterfaceC4913) getNext();
        if (interfaceC4913 != null) {
            interfaceC4913.mo5635(interfaceC3314);
        }
    }

    @Override // l.AbstractC12591, l.InterfaceC9666, l.InterfaceC9522
    public final void reset() {
        super.reset();
        this.f21175 = false;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo17296() {
        if (m31360() && m31351() == 259) {
            synchronized (this) {
                notifyAll();
            }
        } else {
            this.f21175 = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17298(Exception exc) {
        this.f21172 = true;
        this.f21176 = exc;
        this.f21175 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo17302() {
        this.f21172 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo17301() {
        this.f21175 = false;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean mo17295() {
        return this.f21175;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo17304() {
        return this.f21172;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Long mo17294() {
        return this.f21173;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17299(Long l2) {
        this.f21173 = l2;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17305() {
        return this.f21171;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void m17306() {
        this.f21171 = true;
    }

    @Override // l.InterfaceC9522
    public final Exception getException() {
        return this.f21176;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean mo17300() {
        return this.f21174;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17297(int i, int i2, byte[] bArr) throws C2796 {
        if (m31364()) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            m31358(bArr2);
        }
        if (m17303(i, i2, bArr)) {
            this.f21171 = false;
            mo17296();
            return;
        }
        throw new C2796("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17303(int i, int i2, byte[] bArr) {
        C23880 digest = getDigest();
        if (digest == null || m31360() || !(((C9895) m31354()).m25047() || m31351() == 0)) {
            return true;
        }
        boolean zM52630 = digest.m52630(bArr, i, i2, this);
        this.f21174 = zM52630;
        return !zM52630;
    }
}
