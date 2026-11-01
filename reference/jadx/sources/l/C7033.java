package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BJB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7033 extends ByteArrayInputStream implements InterfaceC19407, InterfaceC20818 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC19407, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m18871() {
        return ((ByteArrayInputStream) this).buf;
    }
}
