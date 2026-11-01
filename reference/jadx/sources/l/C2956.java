package l;

/* JADX INFO: renamed from: l.ۗۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N75S */
/* JADX INFO: loaded from: classes2.dex */
public final class C2956 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f11079;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f11080;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f11081;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f11082;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f11083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f11084;

    public C2956(AbstractC20745 abstractC20745, long j, long j2, boolean z, boolean z2) {
        this.f11079 = abstractC20745;
        this.f11082 = abstractC20745.mo24643();
        this.f11084 = j;
        this.f11081 = j2;
        this.f11083 = z;
        this.f11080 = z2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f11083) {
            this.f11079.mo24647();
        }
    }
}
