package l;

/* JADX INFO: renamed from: l.ۙۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4621 extends AbstractC21775 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC21775 f16374;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C11555 f16375;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f16376;

    public C4621(C22037 c22037) {
        this.f16374 = c22037;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14429(AbstractC21775 abstractC21775) throws Exception {
        if (this.f16376) {
            abstractC21775.close();
            return;
        }
        AbstractC21775 abstractC21776 = this.f16374;
        if (abstractC21776 == abstractC21775) {
            return;
        }
        if (abstractC21776 != null) {
            abstractC21775.f69427 = abstractC21776.f69427;
            abstractC21776.close();
        }
        abstractC21775.mo14427(this.f16375);
        this.f16374 = abstractC21775;
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14427(C11555 c11555) {
        this.f16375 = c11555;
        this.f16374.mo14427(c11555);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f16376 = true;
        this.f16374.close();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC21775 m14430() {
        return this.f16374;
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14428(C20283 c20283, CharSequence charSequence) {
        this.f16374.mo14428(c20283, charSequence);
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14425(int i, int i2, InterfaceC8940 interfaceC8940) {
        this.f16374.mo14425(i, i2, interfaceC8940);
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo14424() {
        return this.f16374.mo14424();
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14426(InterfaceC2974 interfaceC2974) {
        this.f16374.mo14426(interfaceC2974);
    }
}
