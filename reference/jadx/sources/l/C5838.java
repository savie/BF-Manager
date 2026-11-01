package l;

/* JADX INFO: renamed from: l.ۛۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5838 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f19800;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f19801;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f19802;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f19803;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5838 f19804;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f19805;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5838 f19806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] f19807;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f19808;

    public C5838(C5838 c5838, C5838 c5839, long[] jArr, int i, int i2, boolean z, boolean z2) {
        this.f19804 = c5838;
        this.f19806 = c5839;
        this.f19807 = jArr;
        this.f19808 = i;
        this.f19801 = i2;
        this.f19802 = z;
        this.f19803 = z2;
        if (jArr != null) {
            long length = ((long) jArr.length) * 8;
            this.f19805 = length;
            this.f19800 = length + 48;
        } else if (c5838 != null) {
            this.f19805 = C9367.m24038(c5838.f19805, c5839.f19805);
            this.f19800 = C9367.m24038(48L, C9367.m24038(c5838.f19800, c5839.f19800));
        } else {
            this.f19805 = 0L;
            this.f19800 = 48L;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16054() {
        return this.f19804 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16052() {
        return this.f19807 != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16053() {
        return m16054() && this.f19807 == null;
    }
}
