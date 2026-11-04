package l;

/* JADX INFO: renamed from: l.ۧᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11816 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38140;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38141;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17037 f38142;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29663(int i, boolean z) {
        if (this.f38140) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Dirty run length must be positive");
        }
        int i2 = this.f38141;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f38141 = i2 + i;
        this.f38142 = C20767.m47498(this.f38142, C20767.m47504(i, z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29664(int i, long[] jArr) {
        if (this.f38140) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0 || i > 65536 || jArr.length != C20767.m47496(i)) {
            throw new IllegalArgumentException("Invalid dirty bitmap");
        }
        int i2 = i & 63;
        if (i2 != 0 && (jArr[jArr.length - 1] >>> i2) != 0) {
            throw new IllegalArgumentException("Dirty bitmap has trailing bits");
        }
        if (((long) this.f38141) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        C17037 c17037M47497 = C20767.m47497(i, jArr);
        if (!c17037M47497.m40147()) {
            throw new IllegalArgumentException("Uniform dirty bitmap is not canonical");
        }
        this.f38141 += i;
        this.f38142 = C20767.m47498(this.f38142, c17037M47497);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17037 m29662() {
        if (this.f38140) {
            throw new IllegalStateException("Dirty builder already built");
        }
        this.f38140 = true;
        return this.f38142;
    }
}
