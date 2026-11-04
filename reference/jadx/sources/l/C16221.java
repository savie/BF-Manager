package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0941 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16221 extends FileInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52709;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C16221(String str) {
        super(str);
        this.f52709 = false;
    }

    public C16221(File file) {
        super(file);
        this.f52709 = false;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f52709) {
            return;
        }
        try {
            super.close();
            this.f52709 = true;
        } catch (IOException unused) {
        }
    }
}
