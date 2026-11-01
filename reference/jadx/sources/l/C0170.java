package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U8EV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0170 extends InputStream implements InterfaceC20818 {
    @Override // java.io.InputStream
    public final int read() {
        return 0;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return j;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }
}
