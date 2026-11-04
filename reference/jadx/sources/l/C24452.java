package l;

/* JADX INFO: renamed from: l.᩺ܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes.dex */
public final class C24452 implements InterfaceC24277 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20794 f79381;

    @Override // l.InterfaceC24277
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int mo46455(byte[] bArr) {
        return C6377.m18119(this, bArr);
    }

    public C24452(InterfaceC20794 interfaceC20794) {
        this.f79381 = interfaceC20794;
    }

    @Override // l.InterfaceC24277
    public final int read(byte[] bArr, int i, int i2) {
        return ((C19236) this.f79381).read(bArr, i, i2);
    }

    @Override // l.InterfaceC24277
    public final void seek(long j) {
        ((C19236) this.f79381).seek(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C19236) this.f79381).close();
    }
}
