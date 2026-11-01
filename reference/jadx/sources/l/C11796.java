package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11796 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5445 f39662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10755 f39663;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11796(C5445 c5445, InputStream inputStream, C10755 c10755) {
        super(inputStream);
        this.f39662 = c5445;
        this.f39663 = c10755;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C5445 c5445 = this.f39662;
        boolean zM24614 = c5445.m24614();
        C10755 c10755 = this.f39663;
        if (zM24614 && c5445.f18774.m45011(c10755)) {
            return;
        }
        C19431.m44468(c10755);
    }
}
