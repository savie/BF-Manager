package l;

/* JADX INFO: renamed from: l.ۡۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9195 extends AbstractC21130 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f30005;

    public C9195(int i) {
        super(0);
        this.f30005 = false;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ۙ */
    public final void mo3871() {
        this.f30005 = false;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo24356() {
        return (m48230().endsWith("/>") || m48230().endsWith("/ >") || m48230().startsWith("</")) ? 0 : 1;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo24355() {
        return m48230().startsWith("</") ? -1 : 0;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ܳ */
    public final String mo3872() {
        int i;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!this.f30005 && (i = this.f67507.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '\"') {
                z = !z;
            }
            if (c == '>' && !z) {
                this.f30005 = true;
            }
        }
        return sb.toString();
    }
}
