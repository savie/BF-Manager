package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3780 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7739 f13648;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C3780(InterfaceC7739 interfaceC7739) {
        this.f13648 = interfaceC7739;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f13648.read();
    }
}
