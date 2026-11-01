package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2933 extends InputStream implements InterfaceC20818 {
    @Override // java.io.InputStream
    public final int read() {
        return -1;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }
}
