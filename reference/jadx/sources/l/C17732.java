package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17732 extends ByteArrayInputStream implements InterfaceC19407, InterfaceC20818 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC19407, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public final int position() {
        return ((ByteArrayInputStream) this).pos;
    }
}
