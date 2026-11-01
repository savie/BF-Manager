package l;

/* JADX INFO: renamed from: l.ܳ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AR1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14189 extends AbstractC6839 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f46542;

    public C14189(AbstractC6839 abstractC6839, C17367 c17367) {
        super(abstractC6839);
        C20190.m45650(c17367, 20228);
        c17367.readInt();
        this.f46542 = c17367.m40458();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        c11018.mo24508(20228);
        c11018.m27799();
        c11018.m27786(this.f46542);
        c11018.m27777();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
        try {
            C12859.m31874(this.f23037, this.f46542);
        } catch (RuntimeException e) {
            throw new C18066(this.f23038, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34280(String str) {
        this.f46542 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34281() {
        return this.f46542;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(AbstractC6839 abstractC6839) {
        C14189 c14189 = new C14189(abstractC6839);
        c14189.f23038 = this.f23038;
        c14189.f46542 = this.f46542;
        return c14189;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        sb.append(C6851.m18455(i, "\t"));
        sb.append("{\n");
        sb.append(C6851.m18455(i + 1, "\t"));
        sb.append("builtIn: ");
        sb.append(this.f46542);
        sb.append("\n");
        sb.append(C6851.m18455(i, "\t"));
        sb.append("}\n");
    }
}
