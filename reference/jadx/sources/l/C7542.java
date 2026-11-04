package l;

/* JADX INFO: renamed from: l.۟֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8CT */
/* JADX INFO: loaded from: classes4.dex */
public class C7542 extends C21953 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14253[] f24880;

    public C7542(int i, String str, double d) {
        super(str);
        mo20604(i, d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20604(int i, double d) {
        this.f24880 = new C14253[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f24880[i2] = new C14253(this, d);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double[] m20606() {
        return this.f24880[0].mo17565();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double[] m20605(int i) {
        return this.f24880[i].mo17565();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20607() {
        this.f24880[0].m34595();
    }
}
