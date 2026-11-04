package l;

/* JADX INFO: renamed from: l.᩺ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C24365 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4908 f79062;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21381 f79063;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f79064;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19143 f79065;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f79066;

    public C24365(C19143 c19143, long j, C21381 c21381, C4908 c4908) {
        this.f79065 = c19143;
        this.f79064 = j;
        this.f79063 = c21381;
        this.f79062 = c4908;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4908 m54472() {
        if (this.f79066) {
            throw new IllegalStateException("SaveHandle is not active");
        }
        return this.f79062;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f79065.m44365(this);
    }
}
