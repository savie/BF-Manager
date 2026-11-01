package l;

/* JADX INFO: renamed from: l.᩻ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes.dex */
public final class C23815 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f77005;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f77006;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f77007;

    public C23815() {
        this.f77007 = -9223372036854775807L;
        this.f77006 = -3.4028235E38f;
        this.f77005 = -9223372036854775807L;
    }

    public C23815(C14643 c14643) {
        this.f77007 = c14643.f47886;
        this.f77006 = c14643.f47885;
        this.f77005 = c14643.f47884;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52494(long j) {
        this.f77007 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52492(float f) {
        C2023.m6507(f > 0.0f || f == -3.4028235E38f);
        this.f77006 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52493(long j) {
        C2023.m6507(j >= 0 || j == -9223372036854775807L);
        this.f77005 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14643 m52491() {
        return new C14643(this);
    }
}
