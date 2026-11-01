package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2250 extends FilterInputStream implements InterfaceC20818 {
    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C2250(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C5073 {
        try {
            return super.read();
        } catch (IOException e) {
            throw new C5073(e);
        } catch (RuntimeException e2) {
            if (!C14952.m35848(e2)) {
                throw e2;
            }
            throw new C22007(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C5073 {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            throw new C5073(e);
        } catch (RuntimeException e2) {
            if (!C14952.m35848(e2)) {
                throw e2;
            }
            throw new C22007(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw new C5073(e);
        } catch (RuntimeException e2) {
            if (!C14952.m35848(e2)) {
                throw e2;
            }
            throw new C22007(e2);
        }
    }
}
