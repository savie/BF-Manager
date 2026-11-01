package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܳ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14733 implements InterfaceC3153 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9246 f48163;

    public C14733(C9246 c9246) {
        this.f48163 = c9246;
    }

    @Override // l.InterfaceC3153
    public final long length() {
        return this.f48163.m23773();
    }

    @Override // l.InterfaceC3153
    /* JADX INFO: renamed from: ܰ */
    public final void mo9547(long j, byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        while (i3 < i2) {
            int iM23776 = this.f48163.m23776(j + ((long) i3), bArr, i + i3, i2 - i3);
            if (iM23776 <= 0) {
                throw new EOFException("Unexpected end of metadata");
            }
            i3 += iM23776;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f48163.close();
    }
}
