package l;

/* JADX INFO: renamed from: l.۟ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7645 implements InterfaceC10033 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6366 f25235;

    @Override // l.InterfaceC10033
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int mo20198(byte[] bArr) {
        return C8622.m22400(this, bArr);
    }

    public C7645(InterfaceC6366 interfaceC6366) {
        this.f25235 = interfaceC6366;
    }

    @Override // l.InterfaceC10033
    public final int read(byte[] bArr, int i, int i2) {
        return ((C13755) this.f25235).read(bArr, i, i2);
    }

    @Override // l.InterfaceC10033
    public final void seek(long j) {
        ((C13755) this.f25235).seek(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C13755) this.f25235).close();
    }
}
