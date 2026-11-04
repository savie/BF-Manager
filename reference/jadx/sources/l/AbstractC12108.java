package l;

/* JADX INFO: renamed from: l.ۨۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA24 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12108 extends AbstractC3159 implements InterfaceC18315 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38964;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f38965;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f38966;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public Long f38967;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f38968;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public Exception f38969;

    public AbstractC12108(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo12767(InterfaceC21299 interfaceC21299) {
        InterfaceC18315 interfaceC18315 = (InterfaceC18315) getNext();
        if (interfaceC18315 != null) {
            interfaceC18315.mo12767(interfaceC21299);
        }
    }

    @Override // l.AbstractC3159, l.InterfaceC14585, l.InterfaceC17965
    public final void reset() {
        super.reset();
        this.f38968 = false;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ֫ */
    public final void mo12752() {
        if (m10303() && m10323() == 259) {
            synchronized (this) {
                notifyAll();
            }
        } else {
            this.f38968 = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۙ */
    public final void mo12764(Exception exc) {
        this.f38965 = true;
        this.f38969 = exc;
        this.f38968 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۟ */
    public final void mo12775() {
        this.f38965 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ֨ */
    public final void mo12751() {
        this.f38968 = false;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo12784() {
        return this.f38968;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo12788() {
        return this.f38965;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۤ */
    public final Long mo12777() {
        return this.f38967;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۙ */
    public final void mo12765(Long l2) {
        this.f38967 = l2;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30279() {
        return this.f38964;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m30281() {
        this.f38964 = true;
    }

    @Override // l.InterfaceC17965
    public final Exception getException() {
        return this.f38969;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo12780() {
        return this.f38966;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ۙ */
    public final void mo10308(int i, int i2, byte[] bArr) throws C19061 {
        if (m10329()) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            m10337(bArr2);
        }
        if (m30280(i, i2, bArr)) {
            this.f38964 = false;
            mo12752();
            return;
        }
        throw new C19061("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30280(int i, int i2, byte[] bArr) {
        C24043 digest = getDigest();
        if (digest == null || m10303() || !(((C14826) m10321()).m35701() || m10323() == 0)) {
            return true;
        }
        boolean zM53595 = digest.m53595(bArr, i, i2, this);
        this.f38966 = zM53595;
        return !zM53595;
    }
}
