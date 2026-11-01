package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9930 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2455 f33908;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19805 f33909;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9930(InputStream inputStream, C19805 c19805, C2455 c2455) {
        super(inputStream);
        this.f33909 = c19805;
        this.f33908 = c2455;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C19805 c19805 = this.f33909;
        C2455 c2455 = this.f33908;
        if (c19805.m45011(c2455)) {
            return;
        }
        C19431.m44468(c2455);
    }
}
