package l;

/* JADX INFO: renamed from: l.ۗ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3037 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f9841;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f9842;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f9843;

    public C3037() {
        this.f9843 = -9223372036854775807L;
        this.f9842 = -3.4028235E38f;
        this.f9841 = -9223372036854775807L;
    }

    public C3037(C20191 c20191) {
        this.f9843 = c20191.f64821;
        this.f9842 = c20191.f64820;
        this.f9841 = c20191.f64819;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9876(long j) {
        this.f9843 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9874(float f) {
        C20782.m47565(f > 0.0f || f == -3.4028235E38f);
        this.f9842 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9875(long j) {
        C20782.m47565(j >= 0 || j == -9223372036854775807L);
        this.f9841 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20191 m9873() {
        return new C20191(this);
    }
}
