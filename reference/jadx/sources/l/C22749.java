package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes.dex */
public final class C22749 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19765 f73819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f73820;

    public C22749(C19765 c19765, OutputStream outputStream) {
        this.f73819 = c19765;
        this.f73820 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f73820.write(bArr, i, i2);
        this.f73819.f63610.m36690(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f73820.write(i);
        this.f73819.f63610.m36690(1);
    }
}
