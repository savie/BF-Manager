package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: l.ۤ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 131S */
/* JADX INFO: loaded from: classes4.dex */
public final class C11200 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Socket f35339;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C11200(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.f35339 = socket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f35339.close();
    }
}
