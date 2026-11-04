package l;

import java.io.FilterInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X1S4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7285 extends FilterInputStream implements InterfaceC8469 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }
}
