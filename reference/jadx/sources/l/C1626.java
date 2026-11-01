package l;

/* JADX INFO: renamed from: l.֫ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1626 extends AbstractC4946 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f6527;

    public C1626(int i) {
        super(0);
        this.f6527 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ۙ */
    public final void mo4959() {
        this.f6527 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ᩹ */
    public final String mo4961() {
        int i;
        StringBuilder sb = new StringBuilder();
        while (!this.f6527 && (i = this.f17280.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '>') {
                this.f6527 = true;
            }
        }
        return sb.toString();
    }
}
