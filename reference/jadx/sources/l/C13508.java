package l;

/* JADX INFO: renamed from: l.۬֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8DQ */
/* JADX INFO: loaded from: classes4.dex */
public class C13508 extends C7542 implements InterfaceC12016 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f42953;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double[] f42954;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f42955;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f42956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f42957;

    public C13508(int i, String str, double d) {
        super(i, str, d);
        this.f42955 = 0.0d;
        this.f42956 = 1.0d;
        this.f42953 = false;
        this.f42957 = d;
        this.f42954 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f42954[i2] = d;
        }
    }

    public C13508(String str) {
        this(1, str, 0.0d);
    }

    @Override // l.C7542
    /* JADX INFO: renamed from: ۙ */
    public final void mo20604(int i, double d) {
        this.f24880 = new C6051[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f24880[i2] = new C6051(this, d);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33176(double d, C4930 c4930) {
        this.f24880[0].mo17566();
        m49678(c4930, new C6797(this, d));
    }

    @Override // l.InterfaceC12016
    /* JADX INFO: renamed from: ۙ */
    public final void mo30206(long j) {
        for (C14253 c14253 : this.f24880) {
            ((C6051) c14253).mo30206(j);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33181(double d) {
        this.f24880[0].mo17564(d);
        this.f42954[0] = d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33174(double d) {
        this.f42954[0] = d;
        m49679(new C8288(this, d));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m33180() {
        return this.f42956;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33177(C13508 c13508) {
        m33175(c13508.f42955, c13508.f42957, c13508.f42956);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final double m33179() {
        return this.f42955;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33175(double d, double d2, double d3) {
        this.f42955 = d;
        this.f42956 = d3;
        this.f42957 = d2;
        m33174(d2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m33178() {
        return this.f42953;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33173() {
        this.f42953 = true;
    }
}
