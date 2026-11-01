package l;

/* JADX INFO: renamed from: l.ܳ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K2S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14843 extends AbstractC24015 {
    @Override // l.AbstractC24015
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] mo35530() {
        return m52850();
    }

    public C14843() {
        synchronized (this) {
            m52848(1024);
        }
    }

    @Override // l.AbstractC24015, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            m52849(i, i2, bArr);
        }
    }

    @Override // l.AbstractC24015, java.io.OutputStream
    public final synchronized void write(int i) {
        m52851(i);
    }
}
