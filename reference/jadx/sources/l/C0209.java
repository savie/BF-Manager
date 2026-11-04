package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0209 extends ByteArrayInputStream implements InterfaceC9960, InterfaceC8469 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC9960, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public final int position() {
        return ((ByteArrayInputStream) this).pos;
    }
}
