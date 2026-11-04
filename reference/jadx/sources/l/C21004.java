package l;

import java.io.FilterInputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;

/* JADX INFO: renamed from: l.᩶ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final class C21004 extends FilterInputStream implements InterfaceC8469 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C21004(DigestInputStream digestInputStream) {
        super(digestInputStream);
    }
}
