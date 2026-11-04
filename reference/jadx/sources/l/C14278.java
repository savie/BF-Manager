package l;

/* JADX INFO: renamed from: l.ܰ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AR1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14278 extends AbstractC2805 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f45108;

    public C14278(AbstractC2805 abstractC2805, C20348 c20348) {
        super(abstractC2805);
        C17364.m40796(c20348, 20228);
        c20348.readInt();
        this.f45108 = c20348.m46758();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        c6178.mo17812(20228);
        c6178.m17797();
        c6178.m17800(this.f45108);
        c6178.m17780();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
        try {
            C9341.m24592(this.f9223, this.f45108);
        } catch (RuntimeException e) {
            throw new C10833(this.f9224, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34690(String str) {
        this.f45108 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m34691() {
        return this.f45108;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        C14278 c14278 = new C14278(abstractC2805);
        c14278.f9224 = this.f9224;
        c14278.f45108 = this.f45108;
        return c14278;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        sb.append(C24276.m54281(i, "\t"));
        sb.append("{\n");
        sb.append(C24276.m54281(i + 1, "\t"));
        sb.append("builtIn: ");
        sb.append(this.f45108);
        sb.append("\n");
        sb.append(C24276.m54281(i, "\t"));
        sb.append("}\n");
    }
}
