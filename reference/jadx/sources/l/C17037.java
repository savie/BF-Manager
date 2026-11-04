package l;

/* JADX INFO: renamed from: l.ܺᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17037 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f55670;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f55671;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17037 f55672;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f55673;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f55674;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f55675;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17037 f55676;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] f55677;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f55678;

    public C17037(C17037 c17037, C17037 c17038, long[] jArr, int i, int i2, boolean z, boolean z2) {
        this.f55676 = c17037;
        this.f55672 = c17038;
        this.f55677 = jArr;
        this.f55675 = i;
        this.f55678 = i2;
        this.f55670 = z;
        this.f55671 = z2;
        if (jArr != null) {
            long length = ((long) jArr.length) * 8;
            this.f55673 = length;
            this.f55674 = length + 48;
        } else if (c17037 != null) {
            this.f55673 = C20767.m47503(c17037.f55673, c17038.f55673);
            this.f55674 = C20767.m47503(48L, C20767.m47503(c17037.f55674, c17038.f55674));
        } else {
            this.f55673 = 0L;
            this.f55674 = 48L;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40149() {
        return this.f55676 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40147() {
        return this.f55677 != null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m40148() {
        return m40149() && this.f55677 == null;
    }
}
