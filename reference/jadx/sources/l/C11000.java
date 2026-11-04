package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BJB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11000 extends ByteArrayInputStream implements InterfaceC9960, InterfaceC8469 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC9960, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m27842() {
        return ((ByteArrayInputStream) this).buf;
    }
}
