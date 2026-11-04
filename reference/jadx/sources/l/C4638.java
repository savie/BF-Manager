package l;

/* JADX INFO: renamed from: l.ۙۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes3.dex */
public class C4638 extends C10603 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16422;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f16423;

    public C4638(C21637 c21637, char[] cArr, int i) {
        super(c21637, cArr, cArr.length);
        this.f16423 = i;
        this.f16422 = 0;
    }

    @Override // l.C10603
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char mo14465() {
        super.mo14465();
        if (m27060('\n') || m27060('\r') || m27060('\f')) {
            this.f16422 = 0;
        } else if (m27060('\t')) {
            this.f16422 = ((this.f16422 / 8) * 8) + 8;
        } else {
            this.f16422++;
        }
        return m27054();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m14466() {
        return m27053() + this.f16423;
    }
}
