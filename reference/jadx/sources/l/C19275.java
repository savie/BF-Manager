package l;

/* JADX INFO: renamed from: l.ᩳᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C19275 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f62328;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44622(long j) {
        if (j < 0) {
            throw C19143.m44341("Negative checkpoint allocation");
        }
        long jM10044 = C3077.m10044(this.f62328, j);
        if (jM10044 > 67108864) {
            throw C19143.m44341("Checkpoint metadata exceeds memory limit");
        }
        this.f62328 = jM10044;
    }
}
