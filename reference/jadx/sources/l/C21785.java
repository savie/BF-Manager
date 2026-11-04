package l;

/* JADX INFO: renamed from: l.᩷ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes.dex */
public final class C21785 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f69472;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18251 f69473;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f69472 != null) {
            this.f69472 = null;
            C18251 c18251 = this.f69473;
            if (c18251 != null) {
                c18251.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m49405() {
        byte[] bArr;
        bArr = this.f69472;
        if (bArr == null) {
            throw new IllegalStateException("Fragment buffer is closed");
        }
        return bArr;
    }

    public C21785(byte[] bArr, C18251 c18251) {
        this.f69472 = bArr;
        this.f69473 = c18251;
    }
}
