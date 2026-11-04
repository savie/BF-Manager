package l;

/* JADX INFO: renamed from: l.ۛۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6214 extends AbstractC21130 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f21135;

    public C6214(int i) {
        super(0);
        this.f21135 = false;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ۙ */
    public final void mo3871() {
        this.f21135 = false;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ܳ */
    public final String mo3872() {
        int i;
        StringBuilder sb = new StringBuilder();
        while (!this.f21135 && (i = this.f67507.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '>' && sb.toString().endsWith("-->")) {
                this.f21135 = true;
            }
        }
        return sb.toString();
    }
}
