package l;

/* JADX INFO: renamed from: l.۟ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8DQ */
/* JADX INFO: loaded from: classes4.dex */
public class C7659 extends C15421 implements InterfaceC2719 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double[] f25313;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f25314;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f25315;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f25316;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f25317;

    public C7659(int i, String str, double d) {
        super(i, str, d);
        this.f25317 = 0.0d;
        this.f25315 = 1.0d;
        this.f25316 = false;
        this.f25314 = d;
        this.f25313 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f25313[i2] = d;
        }
    }

    public C7659(String str) {
        this(1, str, 0.0d);
    }

    @Override // l.C15421
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20213(int i, double d) {
        this.f50267 = new C5542[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f50267[i2] = new C5542(this, d);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20212(double d, C15879 c15879) {
        this.f50267[0].mo15279();
        m38175(c15879, new C10482(this, d));
    }

    @Override // l.InterfaceC2719
    /* JADX INFO: renamed from: ۙ */
    public final void mo8298(long j) {
        for (C13304 c13304 : this.f50267) {
            ((C5542) c13304).mo8298(j);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20216(double d) {
        this.f50267[0].mo15280(d);
        this.f25313[0] = d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20210(double d) {
        this.f25313[0] = d;
        m38174(new C9071(this, d));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double m20217() {
        return this.f25315;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final double m20208() {
        return this.f25317;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20214(C7659 c7659) {
        m20211(c7659.f25317, c7659.f25314, c7659.f25315);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20211(double d, double d2, double d3) {
        this.f25317 = d;
        this.f25315 = d3;
        this.f25314 = d2;
        m20210(d2);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m20215() {
        return this.f25316;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m20209() {
        this.f25316 = true;
    }
}
