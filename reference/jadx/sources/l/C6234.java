package l;

/* JADX INFO: renamed from: l.ۛᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6234 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f21155;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9017 f21156;

    public C6234(byte[] bArr, C9017 c9017) {
        this.f21155 = bArr;
        this.f21156 = c9017;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m17288() {
        byte[] bArr = this.f21155;
        if (bArr != null) {
            return bArr;
        }
        throw new IllegalStateException("Fragment record is closed");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9017 m17289(long j) {
        m17288();
        C9017 c9017 = this.f21156;
        if (c9017 == null) {
            return null;
        }
        return c9017.m23346(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f21155 = null;
        C9017 c9017 = this.f21156;
        this.f21156 = null;
        if (c9017 != null) {
            c9017.close();
        }
    }
}
