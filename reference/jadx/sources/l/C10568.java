package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: l.ۤ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 131S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10568 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Socket f36171;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C10568(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.f36171 = socket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f36171.close();
    }
}
