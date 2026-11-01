package l;

/* JADX INFO: renamed from: l.ܳۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14328 extends AbstractC4946 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f46943;

    public C14328(int i) {
        super(0);
        this.f46943 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ۙ */
    public final void mo4959() {
        this.f46943 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ᩹ */
    public final String mo4961() {
        int i;
        StringBuilder sb = new StringBuilder();
        while (!this.f46943 && (i = this.f17280.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '>' && sb.toString().endsWith("-->")) {
                this.f46943 = true;
            }
        }
        return sb.toString();
    }
}
