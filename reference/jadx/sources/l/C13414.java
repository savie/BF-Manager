package l;

/* JADX INFO: renamed from: l.۬᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13414 extends AbstractC4946 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f44373;

    public C13414(int i) {
        super(0);
        this.f44373 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ۙ */
    public final void mo4959() {
        this.f44373 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ܰ */
    public final int mo13737() {
        return (m13734().endsWith("/>") || m13734().endsWith("/ >") || m13734().startsWith("</")) ? 0 : 1;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ۨ */
    public final int mo13736() {
        return m13734().startsWith("</") ? -1 : 0;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ᩹ */
    public final String mo4961() {
        int i;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!this.f44373 && (i = this.f17280.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '\"') {
                z = !z;
            }
            if (c == '>' && !z) {
                this.f44373 = true;
            }
        }
        return sb.toString();
    }
}
