package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0941 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21144 extends FileInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f68865;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C21144(String str) {
        super(str);
        this.f68865 = false;
    }

    public C21144(File file) {
        super(file);
        this.f68865 = false;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f68865) {
            return;
        }
        try {
            super.close();
            this.f68865 = true;
        } catch (IOException unused) {
        }
    }
}
