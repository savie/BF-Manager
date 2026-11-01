package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16849 implements InterfaceC3153 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1388 f53903;

    public C16849(AbstractC20745 abstractC20745) {
        this.f53903 = abstractC20745.m46710("r");
    }

    @Override // l.InterfaceC3153
    public final long length() {
        return this.f53903.length();
    }

    @Override // l.InterfaceC3153
    /* JADX INFO: renamed from: ܰ */
    public final void mo9547(long j, byte[] bArr, int i, int i2) throws EOFException {
        C1388 c1388 = this.f53903;
        c1388.seek(j);
        c1388.m4864(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f53903.close();
    }
}
