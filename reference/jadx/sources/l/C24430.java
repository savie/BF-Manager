package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C24430 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3374 f79299;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C24430(InputStream inputStream, C3374 c3374) {
        super(inputStream);
        this.f79299 = c3374;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        C3374 c3374;
        int i = super.read();
        if (i != -1 && (c3374 = this.f79299) != null) {
            c3374.m11079(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C3374 c3374;
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0 && (c3374 = this.f79299) != null) {
            c3374.m11079(i3);
        }
        return i3;
    }
}
