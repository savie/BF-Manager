package l;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ᩴ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes4.dex */
public final class C18431 extends PipedOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21253 f58750;

    public C18431(PipedInputStream pipedInputStream, boolean z) {
        super(pipedInputStream);
        this.f58750 = null;
        if (z) {
            this.f58750 = (C21253) pipedInputStream;
        }
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C21253 c21253 = this.f58750;
        if (c21253 != null) {
            c21253.m47728(1);
        }
        super.write(i);
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C21253 c21253 = this.f58750;
        if (c21253 != null) {
            c21253.m47728(i2);
        }
        super.write(bArr, i, i2);
    }
}
