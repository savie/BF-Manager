package l;

/* JADX INFO: renamed from: l.۫ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C12189 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40787;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40788;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5838 f40789;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30295(int i, boolean z) {
        if (this.f40787) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Dirty run length must be positive");
        }
        int i2 = this.f40788;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f40788 = i2 + i;
        this.f40789 = C9367.m24035(this.f40789, C9367.m24039(i, z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30296(int i, long[] jArr) {
        if (this.f40787) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0 || i > 65536 || jArr.length != C9367.m24033(i)) {
            throw new IllegalArgumentException("Invalid dirty bitmap");
        }
        int i2 = i & 63;
        if (i2 != 0 && (jArr[jArr.length - 1] >>> i2) != 0) {
            throw new IllegalArgumentException("Dirty bitmap has trailing bits");
        }
        if (((long) this.f40788) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        C5838 c5838M24034 = C9367.m24034(i, jArr);
        if (!c5838M24034.m16052()) {
            throw new IllegalArgumentException("Uniform dirty bitmap is not canonical");
        }
        this.f40788 += i;
        this.f40789 = C9367.m24035(this.f40789, c5838M24034);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5838 m30294() {
        if (this.f40787) {
            throw new IllegalStateException("Dirty builder already built");
        }
        this.f40787 = true;
        return this.f40789;
    }
}
