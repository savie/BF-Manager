package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5347 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11312 f18781;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5368 f18782;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5347(C11312 c11312, InputStream inputStream, C5368 c5368) {
        super(inputStream);
        this.f18781 = c11312;
        this.f18782 = c5368;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C11312 c11312 = this.f18781;
        boolean zM20840 = c11312.m20840();
        C5368 c5368 = this.f18782;
        if (zM20840 && c11312.f35651.m47060(c5368)) {
            return;
        }
        C20244.m46520(c5368);
    }
}
