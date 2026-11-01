package l;

/* JADX INFO: renamed from: l.ۗۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3037 extends AbstractC4946 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f11348;

    public C3037(int i) {
        super(0);
        this.f11348 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ۙ */
    public final void mo4959() {
        this.f11348 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ᩹ */
    public final String mo4961() {
        int i;
        StringBuilder sb = new StringBuilder();
        while (!this.f11348 && (i = this.f17280.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '>' && sb.toString().endsWith("?>")) {
                this.f11348 = true;
            }
        }
        return sb.toString();
    }
}
