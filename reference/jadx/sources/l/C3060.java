package l;

/* JADX INFO: renamed from: l.ۗ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3060 implements InterfaceC1278 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13961 f9903;

    public C3060(AbstractC22044 abstractC22044) {
        this.f9903 = abstractC22044.m49855("r");
    }

    @Override // l.InterfaceC1278
    public final long length() {
        return this.f9903.length();
    }

    @Override // l.InterfaceC1278
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4667(long j, byte[] bArr, int i, int i2) {
        C13961 c13961 = this.f9903;
        c13961.seek(j);
        c13961.readFully(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9903.close();
    }
}
