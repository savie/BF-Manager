package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5322 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22256 f18368;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f18369;

    public C5322(C22256 c22256, OutputStream outputStream) {
        this.f18368 = c22256;
        this.f18369 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f18369.write(bArr, i, i2);
        this.f18368.f72754.m4089(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f18369.write(i);
        this.f18368.f72754.m4089(1);
    }
}
