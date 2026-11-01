package l;

import java.io.FilterInputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;

/* JADX INFO: renamed from: l.ۗۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3174 extends FilterInputStream implements InterfaceC20818 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C3174(DigestInputStream digestInputStream) {
        super(digestInputStream);
    }
}
