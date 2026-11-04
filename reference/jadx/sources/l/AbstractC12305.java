package l;

/* JADX INFO: renamed from: l.ۨۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8IK */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12305 extends AbstractC5420 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC13622 f39569;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C8402 mo30718(C8402 c8402) {
        return c8402;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo30720(AbstractC24755 abstractC24755);

    @Override // l.AbstractC5420
    /* JADX INFO: renamed from: ۙ */
    public final int mo16146(int i, Object obj) {
        return i;
    }

    @Override // l.AbstractC5420
    /* JADX INFO: renamed from: ۙ */
    public final long mo16147(long j, Object obj) {
        return j;
    }

    @Override // l.AbstractC5420
    /* JADX INFO: renamed from: ۙ */
    public final C8402 mo16148(Object obj, C8402 c8402) {
        return mo30718(c8402);
    }

    @Override // l.AbstractC5420
    /* JADX INFO: renamed from: ۙ */
    public final void mo16149(Object obj, AbstractC9395 abstractC9395, AbstractC24755 abstractC24755) {
        mo30720(abstractC24755);
    }

    public AbstractC12305(InterfaceC13622 interfaceC13622) {
        this.f39569 = interfaceC13622;
    }

    @Override // l.AbstractC5420, l.AbstractC9395
    /* JADX INFO: renamed from: ۙ */
    public final void mo16151(InterfaceC4639 interfaceC4639) {
        super.mo16151(interfaceC4639);
        mo30721();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo30721() {
        m30719();
    }

    @Override // l.AbstractC9395, l.InterfaceC13622
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC24755 mo24736() {
        return this.f39569.mo24736();
    }

    @Override // l.AbstractC9395, l.InterfaceC13622
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo24731() {
        return this.f39569.mo24731();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14902 mo30717() {
        return this.f39569.mo30717();
    }

    @Override // l.AbstractC9395, l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public void mo24727(C14902 c14902) {
        this.f39569.mo24727(c14902);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30719() {
        m16150((Object) null, this.f39569);
    }
}
