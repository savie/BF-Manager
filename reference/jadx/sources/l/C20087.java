package l;

/* JADX INFO: renamed from: l.ᩴ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20087 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f64555;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f64556;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f64557;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f64558;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7956 f64559;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f64560;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f64561;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f64562;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5917 f64563;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19143 f64564;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46220() {
        if (this.f64561 || this.f64555) {
            throw new IllegalStateException("Copy request is already consumed");
        }
        this.f64555 = true;
    }

    public C20087(C5917 c5917, C19143 c19143, long j, int i, int i2, long j2, C7956 c7956) {
        this.f64563 = c5917;
        this.f64564 = c19143;
        this.f64558 = j;
        this.f64556 = i;
        this.f64562 = i2;
        this.f64560 = j2;
        this.f64559 = c7956;
    }

    public final int length() {
        long j = (((long) this.f64562) - ((long) this.f64556)) + 1;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46221() {
        synchronized (this) {
            if (this.f64557) {
                return;
            }
            this.f64557 = true;
            this.f64559.close();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f64561) {
                return;
            }
            this.f64561 = true;
            m46221();
        }
    }
}
