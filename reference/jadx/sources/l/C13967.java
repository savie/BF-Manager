package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13967 extends InputStream implements InterfaceC8469 {
    @Override // java.io.InputStream
    public final int read() {
        return -1;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }
}
