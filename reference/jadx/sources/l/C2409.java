package l;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ۖۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2409 extends PipedOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0918 f7728;

    public C2409(PipedInputStream pipedInputStream, boolean z) {
        super(pipedInputStream);
        this.f7728 = null;
        if (z) {
            this.f7728 = (C0918) pipedInputStream;
        }
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C0918 c0918 = this.f7728;
        if (c0918 != null) {
            c0918.m3716(1);
        }
        super.write(i);
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C0918 c0918 = this.f7728;
        if (c0918 != null) {
            c0918.m3716(i2);
        }
        super.write(bArr, i, i2);
    }
}
