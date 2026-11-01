package l;

/* JADX INFO: renamed from: l.ܶᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8CT */
/* JADX INFO: loaded from: classes4.dex */
public class C15421 extends C16126 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13304[] f50267;

    public C15421(int i, String str, double d) {
        super(str);
        mo20213(i, d);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo20213(int i, double d) {
        this.f50267 = new C13304[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f50267[i2] = new C13304(this, d);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double[] m36893() {
        return this.f50267[0].mo15281();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double[] m36892(int i) {
        return this.f50267[i].mo15281();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36891() {
        this.f50267[0].m32791();
    }
}
