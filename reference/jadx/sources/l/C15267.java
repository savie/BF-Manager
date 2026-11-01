package l;

/* JADX INFO: renamed from: l.ܶܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15267 extends AbstractC21616 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f49771;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23229 f49772;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC21616 f49773;

    public C15267(C3645 c3645) {
        this.f49773 = c3645;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36572(AbstractC21616 abstractC21616) throws Exception {
        if (this.f49771) {
            abstractC21616.close();
            return;
        }
        AbstractC21616 abstractC21617 = this.f49773;
        if (abstractC21617 == abstractC21616) {
            return;
        }
        if (abstractC21617 != null) {
            abstractC21616.f70111 = abstractC21617.f70111;
            abstractC21617.close();
        }
        abstractC21616.mo30284(this.f49772);
        this.f49773 = abstractC21616;
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final void mo30284(C23229 c23229) {
        this.f49772 = c23229;
        this.f49773.mo30284(c23229);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f49771 = true;
        this.f49773.close();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC21616 m36573() {
        return this.f49773;
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final void mo10753(C6094 c6094, CharSequence charSequence) {
        this.f49773.mo10753(c6094, charSequence);
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final void mo10752(int i, int i2, InterfaceC3976 interfaceC3976) {
        this.f49773.mo10752(i, i2, interfaceC3976);
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10751() {
        return this.f49773.mo10751();
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36571(InterfaceC13150 interfaceC13150) {
        this.f49773.mo36571(interfaceC13150);
    }
}
