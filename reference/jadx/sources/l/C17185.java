package l;

/* JADX INFO: renamed from: l.ܺ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75S */
/* JADX INFO: loaded from: classes4.dex */
public final class C17185 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f56010;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f56011;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f56012;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f56013;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f56014;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f56015;

    public C17185(AbstractC22044 abstractC22044, long j, long j2, boolean z, boolean z2) {
        this.f56013 = abstractC22044;
        this.f56010 = abstractC22044.mo4278();
        this.f56015 = j;
        this.f56012 = j2;
        this.f56014 = z;
        this.f56011 = z2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f56014) {
            this.f56013.mo4296();
        }
    }
}
