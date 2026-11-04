package l;

/* JADX INFO: renamed from: l.۫ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K2S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13087 extends AbstractC15324 {
    @Override // l.AbstractC15324
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] mo32557() {
        return m36774();
    }

    public C13087() {
        synchronized (this) {
            m36770(1024);
        }
    }

    @Override // l.AbstractC15324, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C5125.m15493(i, i2, bArr);
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            m36772(i, i2, bArr);
        }
    }

    @Override // l.AbstractC15324, java.io.OutputStream
    public final synchronized void write(int i) {
        m36773(i);
    }
}
