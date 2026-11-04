package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes3.dex */
public final class C3366 extends FilterInputStream implements InterfaceC8469 {
    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C3366(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C20520 {
        try {
            return super.read();
        } catch (IOException e) {
            throw new C20520(e);
        } catch (RuntimeException e2) {
            if (!C18282.m42576(e2)) {
                throw e2;
            }
            throw new C12315(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C20520 {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            throw new C20520(e);
        } catch (RuntimeException e2) {
            if (!C18282.m42576(e2)) {
                throw e2;
            }
            throw new C12315(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw new C20520(e);
        } catch (RuntimeException e2) {
            if (!C18282.m42576(e2)) {
                throw e2;
            }
            throw new C12315(e2);
        }
    }
}
